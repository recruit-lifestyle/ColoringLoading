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
public class BackgroundPath {

  private Path mBackgroundPath;

  private Path mShadowPath;

  public BackgroundPath() {
    mBackgroundPath = new Path();
    mShadowPath = new Path();
  }

  public void setWidth(float width){
    mBackgroundPath.moveTo(0.038f * width,  0.025f * width);
    mBackgroundPath.cubicTo(0.038f * width, 0.025f * width, 0.993f * width, 0.024f * width,
        0.993f * width, 0.024f * width);
    mBackgroundPath.cubicTo(
        0.994f * width,  0.117f * width,
        1f * width,  0.147f * width,
        0.988f * width,  0.511f * width
    );
    mBackgroundPath.cubicTo(
        0.977f * width,  0.861f * width,
        0.953f * width,  0.898f * width,
        0.948f * width,  0.957f * width
    );
    mBackgroundPath.cubicTo(
        0.948f * width,  0.957f * width,
        0.248f * width,  0.947f * width,
        0.003f * width,  0.932f * width
    );
    mBackgroundPath.cubicTo(
        0.003f * width,  0.932f * width,
        0.023f * width,  0.807f * width,
        0.031f * width,  0.539f * width
    );
    mBackgroundPath.cubicTo(
        0.041f * width,  0.196f * width,
        0.03f * width,  0.136f * width,
        0.038f * width,  0.025f * width
    );

    mShadowPath.moveTo(0.03f * width, 0.03f * width);
    mShadowPath.lineTo(0.03f * width, 0.97f * width);
    mShadowPath.lineTo(0.98f * width, 0.97f * width);
    mShadowPath.lineTo(0.98f * width, 0.03f * width);
    mShadowPath.close();
  }

  public Path getBackgroundPath() {
    return mBackgroundPath;
  }


  public Path getShadowPath() {
    return mShadowPath;
  }

}
