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

import android.graphics.Path;

/**
 * @author amyu
 */
public class PencilPath {

  private float mWidth;

  private Path mPath;

  public PencilPath() {
    mPath = new Path();
  }

  public Path getPencilPath(float[] centerPoint) {
    reset();
    mPath.moveTo((0.595f - 0.1925f) * mWidth + centerPoint[0],
        (0.2325f - 0.79125f) * mWidth + centerPoint[1]);
    mPath.lineTo((0.1925f - 0.1925f) * mWidth + centerPoint[0],
        (0.63625f - 0.79125f) * mWidth + centerPoint[1]);
    mPath.lineTo((0.1925f - 0.1925f) * mWidth + centerPoint[0],
        (0.79125f - 0.79125f) * mWidth + centerPoint[1]);
    mPath.lineTo((0.34625f - 0.1925f) * mWidth + centerPoint[0],
        (0.7925f - 0.79125f) * mWidth + centerPoint[1]);
    mPath.lineTo((0.75f - 0.1925f) * mWidth + centerPoint[0],
        (0.38625f - 0.79125f) * mWidth + centerPoint[1]);
    mPath.lineTo((0.595f - 0.1925f) * mWidth + centerPoint[0],
        (0.2325f - 0.79125f) * mWidth + centerPoint[1]);

    mPath.moveTo((0.64f - 0.1925f) * mWidth + centerPoint[0],
        (0.19375f - 0.79125f) * mWidth + centerPoint[1]);
    mPath.lineTo((0.79f - 0.1925f) * mWidth + centerPoint[0],
        (0.3425f - 0.79125f) * mWidth + centerPoint[1]);
    mPath.lineTo((0.8775f - 0.1925f) * mWidth + centerPoint[0],
        (0.25375f - 0.79125f) * mWidth + centerPoint[1]);
    mPath.cubicTo((0.88612f - 0.1925f) * mWidth + centerPoint[0],
        (0.24347f - 0.79125f) * mWidth + centerPoint[1],
        (0.88469f - 0.1925f) * mWidth + centerPoint[0],
        (0.2325f - 0.79125f) * mWidth + centerPoint[1],
        (0.8775f - 0.1925f) * mWidth + centerPoint[0],
        (0.22375f - 0.79125f) * mWidth + centerPoint[1]);
    mPath.lineTo((0.76375f - 0.1925f) * mWidth + centerPoint[0],
        (0.1075f - 0.79125f) * mWidth + centerPoint[1]);
    mPath.cubicTo((0.75219f - 0.1925f) * mWidth + centerPoint[0],
        (0.09531f - 0.79125f) * mWidth + centerPoint[1],
        (0.74063f - 0.1925f) * mWidth + centerPoint[0],
        (0.09719f - 0.79125f) * mWidth + centerPoint[1],
        (0.72875f - 0.1925f) * mWidth + centerPoint[0],
        (0.105f - 0.79125f) * mWidth + centerPoint[1]);
    mPath.lineTo((0.64f - 0.1925f) * mWidth + centerPoint[0],
        (0.19375f - 0.79125f) * mWidth + centerPoint[1]);
    return mPath;
  }

  public void setWidth(float mmWidth) {
    this.mWidth = mmWidth;
  }

  public void reset(){
    mPath.reset();
  }
}
