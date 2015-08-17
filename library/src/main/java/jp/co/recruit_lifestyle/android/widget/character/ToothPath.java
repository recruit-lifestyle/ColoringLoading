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

package jp.co.recruit_lifestyle.android.widget.character;

import android.graphics.Path;

/**
 * @author amyu
 */
public class ToothPath {

  public static Path getToothPath(float width, float[] centerPoint){
    Path path = new Path();

    path.moveTo(centerPoint[0]  - width / 2 + 0.405f * width, centerPoint[1] - width / 2 + 0.152f * width);
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.447f * width, centerPoint[1] - width / 2 + 0.149f * width,
        centerPoint[0]  - width / 2 + 0.457f * width, centerPoint[1] - width / 2 + 0.085f * width,
        centerPoint[0]  - width / 2 + 0.541f * width, centerPoint[1] - width / 2 + 0.089f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.625f * width, centerPoint[1] - width / 2 + 0.092f * width,
        centerPoint[0]  - width / 2 + 0.608f * width, centerPoint[1] - width / 2 + 0.152f * width,
        centerPoint[0]  - width / 2 + 0.657f * width, centerPoint[1] - width / 2 + 0.155f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.706f * width, centerPoint[1] - width / 2 + 0.159f * width,
        centerPoint[0]  - width / 2 + 0.804f * width, centerPoint[1] - width / 2 + 0.166f * width,
        centerPoint[0]  - width / 2 + 0.811f * width, centerPoint[1] - width / 2 + 0.281f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.818f * width, centerPoint[1] - width / 2 + 0.397f * width,
        centerPoint[0]  - width / 2 + 0.8f * width, centerPoint[1] - width / 2 + 0.477f * width,
        centerPoint[0]  - width / 2 + 0.751f * width, centerPoint[1] - width / 2 + 0.61f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.702f * width, centerPoint[1] - width / 2 + 0.743f * width,
        centerPoint[0]  - width / 2 + 0.713f * width, centerPoint[1] - width / 2 + 0.851f * width,
        centerPoint[0]  - width / 2 + 0.667f * width, centerPoint[1] - width / 2 + 0.862f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.622f * width, centerPoint[1] - width / 2 + 0.872f * width,
        centerPoint[0]  - width / 2 + 0.59f * width, centerPoint[1] - width / 2 + 0.655f * width,
        centerPoint[0]  - width / 2 + 0.566f * width, centerPoint[1] - width / 2 + 0.648f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.541f * width, centerPoint[1] - width / 2 + 0.641f * width,
        centerPoint[0]  - width / 2 + 0.482f * width, centerPoint[1] - width / 2 + 0.585f * width,
        centerPoint[0]  - width / 2 + 0.443f * width, centerPoint[1] - width / 2 + 0.722f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.405f * width, centerPoint[1] - width / 2 + 0.858f * width,
        centerPoint[0]  - width / 2 + 0.401f * width, centerPoint[1] - width / 2 + 0.9f * width,
        centerPoint[0]  - width / 2 + 0.359f * width, centerPoint[1] - width / 2 + 0.911f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.317f * width, centerPoint[1] - width / 2 + 0.921f * width,
        centerPoint[0]  - width / 2 + 0.314f * width, centerPoint[1] - width / 2 + 0.776f * width,
        centerPoint[0]  - width / 2 + 0.283f * width, centerPoint[1] - width / 2 + 0.697f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.241f * width, centerPoint[1] - width / 2 + 0.592f * width,
        centerPoint[0]  - width / 2 + 0.185f * width, centerPoint[1] - width / 2 + 0.509f * width,
        centerPoint[0]  - width / 2 + 0.188f * width, centerPoint[1] - width / 2 + 0.299f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.192f * width, centerPoint[1] - width / 2 + 0.085f * width,
        centerPoint[0]  - width / 2 + 0.349f * width, centerPoint[1] - width / 2 + 0.155f * width,
        centerPoint[0]  - width / 2 + 0.405f * width, centerPoint[1] - width / 2 + 0.152f * width
    );
    return path;

  }

}
