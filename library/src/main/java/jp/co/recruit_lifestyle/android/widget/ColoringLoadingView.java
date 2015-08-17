/*
 * Copyright (C) 2015 RECRUIT LIFESTYLE CO., LTD.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package jp.co.recruit_lifestyle.android.widget;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import jp.co.recruit_lifestyle.android.widget.character.AkPath;
import jp.co.recruit_lifestyle.android.widget.character.ButterflyPath;
import jp.co.recruit_lifestyle.android.widget.character.CatPath;
import jp.co.recruit_lifestyle.android.widget.character.CucumberPath;
import jp.co.recruit_lifestyle.android.widget.character.DogezaPath;
import jp.co.recruit_lifestyle.android.widget.character.HairStylePath;
import jp.co.recruit_lifestyle.android.widget.character.NinjaPath;
import jp.co.recruit_lifestyle.android.widget.character.NinjaStarPath;
import jp.co.recruit_lifestyle.android.widget.character.StormPath;
import jp.co.recruit_lifestyle.android.widget.character.ToothPath;
import jp.co.recruit_lifestyle.android.widget.character.ViolinPath;

/**
 * @author amyu
 */
public class ColoringLoadingView extends View {

  private PencilPath mPencilPath;

  private BackgroundPath mBackgroundPath;

  private Paint mCharacterPaint;

  private Paint mPencilPaint;

  private Paint mColoringPaint;

  private Paint mLoadingPaint;

  private Paint mBackgroundPaint;

  private Paint mShadowPaint;

  private Path mCharacterPath;

  private Path mLoadingPath;

  private PathMeasure mCharacterPathMeasure;

  private PathMeasure mLoadingPathMeasure;

  private int mViewWidth;

  private float[] mCenterPoint = new float[2];

  private float[] mCurrentPoint = new float[2];

  private boolean isHandWriting = false;

  private Handler mCharacterHandler;

  private Handler mLoadingHandler;

  private int mCharacterRunnableCount = 0;

  private int mLoadingRunnableCount = 0;

  private RectF mRectF;

  private Region mRegion;

  private Path mColoringPath;

  private float[] mCurrentTouchPoint = new float[2];

  private boolean isPreDraw = false;

  private Character mCharacter;

  public ColoringLoadingView(Context context) {
    this(context, null, 0);
  }

  public ColoringLoadingView(Context context, AttributeSet attrs) {
    this(context, attrs, 0);
  }

  public ColoringLoadingView(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
    initView();

    mLoadingHandler = new Handler();
    mCharacterHandler = new Handler();
    mRectF = new RectF();
    mRegion = new Region();
    setLayerType(View.LAYER_TYPE_SOFTWARE, null);
  }

  private void initView() {
    initPaint();
  }

  private void initPath() {
    mColoringPath = new Path();

    mLoadingPath = new Path();
    mCharacterPath = new Path();
    mPencilPath = new PencilPath();
    mPencilPath.setWidth(mViewWidth / 6);

    Path loadingPath = LoadingPath.getPath(mViewWidth);
    mLoadingPathMeasure = new PathMeasure(loadingPath, false);
    mBackgroundPath = new BackgroundPath();
    mBackgroundPath.setWidth(mViewWidth);
  }

  private void initPaint() {
    mCharacterPaint = new Paint();
    mCharacterPaint.setColor(Color.BLACK);
    mCharacterPaint.setStyle(Paint.Style.STROKE);
    mCharacterPaint.setStrokeWidth(20);
    mCharacterPaint.setStrokeCap(Paint.Cap.ROUND);
    mCharacterPaint.setPathEffect(new CornerPathEffect(10));
    mCharacterPaint.setAntiAlias(true);

    mLoadingPaint = new Paint();
    mLoadingPaint.setColor(Color.BLACK);
    mLoadingPaint.setStrokeWidth(10);
    mLoadingPaint.setStyle(Paint.Style.STROKE);
    mLoadingPaint.setStrokeCap(Paint.Cap.ROUND);
    mLoadingPaint.setPathEffect(new CornerPathEffect(10));
    mLoadingPaint.setAntiAlias(true);

    mPencilPaint = new Paint();
    mPencilPaint.setStyle(Paint.Style.FILL);
    mPencilPaint.setColor(Color.BLACK);
    mPencilPaint.setAntiAlias(true);

    mColoringPaint = new Paint();
    mColoringPaint.setStyle(Paint.Style.STROKE);
    mColoringPaint.setStrokeWidth(30);
    mColoringPaint.setStrokeCap(Paint.Cap.ROUND);
    mColoringPaint.setAntiAlias(true);
    mColoringPaint.setColor(0xffF8C92C);

    mBackgroundPaint = new Paint();
    mBackgroundPaint.setStyle(Paint.Style.FILL);
    mBackgroundPaint.setAntiAlias(true);
    mBackgroundPaint.setColor(Color.WHITE);

    mShadowPaint = new Paint();
    mShadowPaint.setStyle(Paint.Style.FILL);
    mShadowPaint.setColor(0x70000000);
    mShadowPaint.setMaskFilter(new BlurMaskFilter(16, BlurMaskFilter.Blur.NORMAL));

  }

  @Override protected void onSizeChanged(int w, int h, int oldw, int oldh) {
    mViewWidth = w;
    mCenterPoint[0] = w / 2.f;
    mCenterPoint[1] = h / 2.f;
    initPath();

    isPreDraw = true;
    setCharacter(mCharacter);
    if (isStartAnimationFlag) {
      startDrawAnimation();
      isStartAnimationFlag = false;
    }
    super.onSizeChanged(w, h, oldw, oldh);
  }

  public void startDrawAnimation() {
    if (!isPreDraw) {
      isStartAnimationFlag = true;
      return;
    }
    stopHandler();
    mPencilPaint.setColor(Color.BLACK);
    isHandWriting = true;
    mLoadingPath.reset();
    mCharacterPath.reset();
    mColoringPath.reset();
    mCharacterHandler.post(mCharacterRunnable);
    mCharacterRunnableCount = 0;
  }

  private Runnable mCharacterRunnable = new Runnable() {
    @Override public void run() {
      if ((mCharacterRunnableCount / 200.f) == 1.f) {
        mCharacterHandler.removeCallbacks(this);
        mLoadingHandler.post(mLoadingRunnable);
        mLoadingRunnableCount = 0;
        return;
      }

      float[] point = new float[2];
      mCharacterPathMeasure.getPosTan(
          mCharacterPathMeasure.getLength() * (mCharacterRunnableCount / 200.f), point, null);
      if (mCharacterRunnableCount == 0) {
        mCharacterPath.moveTo(point[0], point[1]);
      } else {
        mCharacterPath.lineTo(point[0], point[1]);
      }
      mCurrentPoint = point;
      ViewCompat.postInvalidateOnAnimation(ColoringLoadingView.this);
      mCharacterHandler.postDelayed(this, 10);
      mCharacterRunnableCount++;
    }
  };

  private Runnable mLoadingRunnable = new Runnable() {
    @Override public void run() {
      if ((mLoadingRunnableCount / 100.f) == 1.f) {
        mLoadingHandler.removeCallbacks(this);
        mLoadingPath.addPath(LoadingPath.getCirclePath(mViewWidth));
        ViewCompat.postInvalidateOnAnimation(ColoringLoadingView.this);
        isHandWriting = false;
        mPencilPaint.setColor(mColoringPaint.getColor());
        return;
      }
      float[] point = new float[2];
      mLoadingPathMeasure.getPosTan(
          mLoadingPathMeasure.getLength() * (mLoadingRunnableCount / 100.f), point, null);

      if (mLoadingRunnableCount == 0) {
        mLoadingPath.moveTo(point[0], point[1]);
      } else {
        mLoadingPath.lineTo(point[0], point[1]);
      }
      mCurrentPoint = point;

      ViewCompat.postInvalidateOnAnimation(ColoringLoadingView.this);
      mLoadingHandler.postDelayed(this, 10);
      mLoadingRunnableCount++;
    }
  };

  @Override protected void onDraw(Canvas canvas) {
    canvas.drawPath(mBackgroundPath.getShadowPath(), mShadowPaint);
    canvas.drawPath(mBackgroundPath.getBackgroundPath(), mBackgroundPaint);

    if (isHandWriting) {
      //Auto
      canvas.drawPath(mCharacterPath, mCharacterPaint);
      canvas.drawPath(mLoadingPath, mLoadingPaint);
      canvas.drawPath(mPencilPath.getPencilPath(mCurrentPoint), mPencilPaint);
    } else {
      //Touch
      canvas.drawPath(mColoringPath, mColoringPaint);
      canvas.drawPath(mCharacterPath, mCharacterPaint);
      canvas.drawPath(mPencilPath.getPencilPath(mCurrentTouchPoint), mPencilPaint);
      canvas.drawPath(mLoadingPath, mLoadingPaint);
    }
  }

  @Override protected void onDetachedFromWindow() {
    stopHandler();
    super.onDetachedFromWindow();
  }

  private void stopHandler() {
    mCharacterHandler.removeCallbacks(mCharacterRunnable);
    mLoadingHandler.removeCallbacks(mLoadingRunnable);
  }

  @Override public boolean onTouchEvent(@NonNull MotionEvent event) {
    if (isHandWriting) {
      return true;
    }

    mCurrentTouchPoint[0] = event.getX();
    mCurrentTouchPoint[1] = event.getY();

    switch (event.getAction()) {
      case MotionEvent.ACTION_DOWN:
        mColoringPath.moveTo(mCurrentTouchPoint[0], mCurrentTouchPoint[1]);
        return true;
      case MotionEvent.ACTION_MOVE:
        if (mRegion.contains((int) mCurrentTouchPoint[0], (int) mCurrentTouchPoint[1])) {
          mColoringPath.lineTo(mCurrentTouchPoint[0], mCurrentTouchPoint[1]);
        } else {
          mColoringPath.moveTo(mCurrentTouchPoint[0], mCurrentTouchPoint[1]);
        }
        ViewCompat.postInvalidateOnAnimation(this);
        break;
    }
    return true;
  }

  public void setColoringColor(int color) {
    mColoringPaint.setColor(color);
    invalidate();
  }

  public void setCnavasColor(int color) {
    mBackgroundPaint.setColor(color);
    invalidate();
  }

  public void setLineColor(int color) {
    mLoadingPaint.setColor(color);
    mCharacterPaint.setColor(color);
  }

  private boolean isStartAnimationFlag = false;

  public void setCharacter(Character character) {
    if (!isPreDraw) {
      mCharacter = character;
      return;
    }
    Path characterPath;
    switch (character) {
      case NINJA:
        characterPath = NinjaPath.getNinjaPath(mViewWidth / 1.5f, mCenterPoint);
        break;
      case BUTTERFLY:
        characterPath = ButterflyPath.getButterflyPath(mViewWidth / 1.5f, mCenterPoint);
        break;
      case AK:
        characterPath = AkPath.getAkPath(mViewWidth / 1.5f, mCenterPoint);
        break;
      case HAIR_STYLE:
        characterPath = HairStylePath.getHairStylePath(mViewWidth / 1.5f, mCenterPoint);
        break;
      case TOOTH:
        characterPath = ToothPath.getToothPath(mViewWidth / 1.5f, mCenterPoint);
        break;
      case STORM:
        characterPath = StormPath.getStormPath(mViewWidth / 1.5f, mCenterPoint);
        break;
      case DOGEZA:
        characterPath = DogezaPath.getDogezaPath(mViewWidth / 1.5f, mCenterPoint);
        break;
      case CAT:
        characterPath = CatPath.getCatPath(mViewWidth / 1.5f, mCenterPoint);
        break;
      case VIOLIN:
        characterPath = ViolinPath.getViolinPath(mViewWidth / 1.5f, mCenterPoint);
        break;
      case CUCUMBER:
        characterPath = CucumberPath.getCucumberPath(mViewWidth / 1.5f, mCenterPoint);
        break;
      case NINJA_STAR:
        characterPath = NinjaStarPath.getNinjaStarPath(mViewWidth / 1.5f, mCenterPoint);
        break;

      default:
        characterPath = NinjaPath.getNinjaPath(mViewWidth / 1.5f, mCenterPoint);
        break;
    }
    mCharacterPathMeasure = new PathMeasure(characterPath, false);
    mRectF.setEmpty();
    characterPath.computeBounds(mRectF, true);
    mRegion.setEmpty();
    mRegion.set((int) mRectF.left, (int) mRectF.top, (int) mRectF.right, (int) mRectF.bottom);
    mRegion.setPath(characterPath, mRegion);
  }

  public enum Character {
    NINJA(1),
    BUTTERFLY(2),
    AK(4),
    HAIR_STYLE(5),
    TOOTH(6),
    STORM(8),
    DOGEZA(9),
    CAT(10),
    VIOLIN(11),
    CUCUMBER(12),
    NINJA_STAR(13),

    '';

    Character(int i) {
      nativeInt = i;
    }

    final int nativeInt;
  }
}