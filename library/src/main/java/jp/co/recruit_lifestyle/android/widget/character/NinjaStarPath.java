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
public class NinjaStarPath {
  public static Path getNinjaStarPath(float width, float[] centerPoint){
    Path path = new Path();

    path.moveTo(centerPoint[0]  - width / 2 + 0.903f * width, centerPoint[1] - width / 2 + 0.374f * width);
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.859f * width, centerPoint[1] - width / 2 + 0.439f * width,
        centerPoint[0]  - width / 2 + 0.688f * width, centerPoint[1] - width / 2 + 0.469f * width,
        centerPoint[0]  - width / 2 + 0.622f * width, centerPoint[1] - width / 2 + 0.394f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.575f * width, centerPoint[1] - width / 2 + 0.34f * width,
        centerPoint[0]  - width / 2 + 0.606f * width, centerPoint[1] - width / 2 + 0.298f * width,
        centerPoint[0]  - width / 2 + 0.567f * width, centerPoint[1] - width / 2 + 0.204f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.527f * width, centerPoint[1] - width / 2 + 0.11f * width,
        centerPoint[0]  - width / 2 + 0.403f * width, centerPoint[1] - width / 2 + 0.088f * width,
        centerPoint[0]  - width / 2 + 0.374f * width, centerPoint[1] - width / 2 + 0.097f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.439f * width, centerPoint[1] - width / 2 + 0.141f * width,
        centerPoint[0]  - width / 2 + 0.469f * width, centerPoint[1] - width / 2 + 0.312f * width,
        centerPoint[0]  - width / 2 + 0.394f * width, centerPoint[1] - width / 2 + 0.378f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.34f * width, centerPoint[1] - width / 2 + 0.425f * width,
        centerPoint[0]  - width / 2 + 0.298f * width, centerPoint[1] - width / 2 + 0.394f * width,
        centerPoint[0]  - width / 2 + 0.204f * width, centerPoint[1] - width / 2 + 0.433f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.11f * width, centerPoint[1] - width / 2 + 0.473f * width,
        centerPoint[0]  - width / 2 + 0.088f * width, centerPoint[1] - width / 2 + 0.597f * width,
        centerPoint[0]  - width / 2 + 0.097f * width, centerPoint[1] - width / 2 + 0.626f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.141f * width, centerPoint[1] - width / 2 + 0.561f * width,
        centerPoint[0]  - width / 2 + 0.307f * width, centerPoint[1] - width / 2 + 0.536f * width,
        centerPoint[0]  - width / 2 + 0.378f * width, centerPoint[1] - width / 2 + 0.606f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.429f * width, centerPoint[1] - width / 2 + 0.656f * width,
        centerPoint[0]  - width / 2 + 0.394f * width, centerPoint[1] - width / 2 + 0.702f * width,
        centerPoint[0]  - width / 2 + 0.433f * width, centerPoint[1] - width / 2 + 0.796f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.473f * width, centerPoint[1] - width / 2 + 0.89f * width,
        centerPoint[0]  - width / 2 + 0.597f * width, centerPoint[1] - width / 2 + 0.912f * width,
        centerPoint[0]  - width / 2 + 0.626f * width, centerPoint[1] - width / 2 + 0.903f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.561f * width, centerPoint[1] - width / 2 + 0.859f * width,
        centerPoint[0]  - width / 2 + 0.531f * width, centerPoint[1] - width / 2 + 0.688f * width,
        centerPoint[0]  - width / 2 + 0.606f * width, centerPoint[1] - width / 2 + 0.622f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.66f * width, centerPoint[1] - width / 2 + 0.575f * width,
        centerPoint[0]  - width / 2 + 0.702f * width, centerPoint[1] - width / 2 + 0.606f * width,
        centerPoint[0]  - width / 2 + 0.796f * width, centerPoint[1] - width / 2 + 0.567f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.89f * width, centerPoint[1] - width / 2 + 0.527f * width,
        centerPoint[0]  - width / 2 + 0.912f * width, centerPoint[1] - width / 2 + 0.403f * width,
        centerPoint[0]  - width / 2 + 0.903f * width, centerPoint[1] - width / 2 + 0.374f * width
    );
    return path;

  }
}
