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
public class StormPath {

  public static Path getStormPath(float width, float[] centerPoint){
    Path path = new Path();

    path.moveTo(centerPoint[0]  - width / 2 + 0.963f * width, centerPoint[1] - width / 2 + 0.812f * width);
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.955f * width, centerPoint[1] - width / 2 + 0.805f * width,
        centerPoint[0]  - width / 2 + 0.929f * width, centerPoint[1] - width / 2 + 0.79f * width,
        centerPoint[0]  - width / 2 + 0.929f * width, centerPoint[1] - width / 2 + 0.79f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.917f * width, centerPoint[1] - width / 2 + 0.784f * width,
        centerPoint[0]  - width / 2 + 0.893f * width, centerPoint[1] - width / 2 + 0.748f * width,
        centerPoint[0]  - width / 2 + 0.875f * width, centerPoint[1] - width / 2 + 0.734f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.849f * width, centerPoint[1] - width / 2 + 0.714f * width,
        centerPoint[0]  - width / 2 + 0.82f * width, centerPoint[1] - width / 2 + 0.704f * width,
        centerPoint[0]  - width / 2 + 0.817f * width, centerPoint[1] - width / 2 + 0.704f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.814f * width, centerPoint[1] - width / 2 + 0.704f * width,
        centerPoint[0]  - width / 2 + 0.808f * width, centerPoint[1] - width / 2 + 0.701f * width,
        centerPoint[0]  - width / 2 + 0.812f * width, centerPoint[1] - width / 2 + 0.688f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.842f * width, centerPoint[1] - width / 2 + 0.648f * width,
        centerPoint[0]  - width / 2 + 0.844f * width, centerPoint[1] - width / 2 + 0.593f * width,
        centerPoint[0]  - width / 2 + 0.844f * width, centerPoint[1] - width / 2 + 0.586f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.844f * width, centerPoint[1] - width / 2 + 0.526f * width,
        centerPoint[0]  - width / 2 + 0.815f * width, centerPoint[1] - width / 2 + 0.457f * width,
        centerPoint[0]  - width / 2 + 0.814f * width, centerPoint[1] - width / 2 + 0.454f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.812f * width, centerPoint[1] - width / 2 + 0.451f * width,
        centerPoint[0]  - width / 2 + 0.789f * width, centerPoint[1] - width / 2 + 0.357f * width,
        centerPoint[0]  - width / 2 + 0.743f * width, centerPoint[1] - width / 2 + 0.314f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.715f * width, centerPoint[1] - width / 2 + 0.288f * width,
        centerPoint[0]  - width / 2 + 0.681f * width, centerPoint[1] - width / 2 + 0.268f * width,
        centerPoint[0]  - width / 2 + 0.66f * width, centerPoint[1] - width / 2 + 0.264f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.66f * width, centerPoint[1] - width / 2 + 0.263f * width,
        centerPoint[0]  - width / 2 + 0.66f * width, centerPoint[1] - width / 2 + 0.263f * width,
        centerPoint[0]  - width / 2 + 0.659f * width, centerPoint[1] - width / 2 + 0.262f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.671f * width, centerPoint[1] - width / 2 + 0.231f * width,
        centerPoint[0]  - width / 2 + 0.645f * width, centerPoint[1] - width / 2 + 0.178f * width,
        centerPoint[0]  - width / 2 + 0.608f * width, centerPoint[1] - width / 2 + 0.178f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.573f * width, centerPoint[1] - width / 2 + 0.164f * width,
        centerPoint[0]  - width / 2 + 0.536f * width, centerPoint[1] - width / 2 + 0.204f * width,
        centerPoint[0]  - width / 2 + 0.532f * width, centerPoint[1] - width / 2 + 0.217f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.531f * width, centerPoint[1] - width / 2 + 0.221f * width,
        centerPoint[0]  - width / 2 + 0.523f * width, centerPoint[1] - width / 2 + 0.233f * width,
        centerPoint[0]  - width / 2 + 0.519f * width, centerPoint[1] - width / 2 + 0.235f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.519f * width, centerPoint[1] - width / 2 + 0.235f * width,
        centerPoint[0]  - width / 2 + 0.528f * width, centerPoint[1] - width / 2 + 0.24f * width,
        centerPoint[0]  - width / 2 + 0.532f * width, centerPoint[1] - width / 2 + 0.237f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.532f * width, centerPoint[1] - width / 2 + 0.237f * width,
        centerPoint[0]  - width / 2 + 0.535f * width, centerPoint[1] - width / 2 + 0.246f * width,
        centerPoint[0]  - width / 2 + 0.546f * width, centerPoint[1] - width / 2 + 0.246f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.546f * width, centerPoint[1] - width / 2 + 0.246f * width,
        centerPoint[0]  - width / 2 + 0.549f * width, centerPoint[1] - width / 2 + 0.253f * width,
        centerPoint[0]  - width / 2 + 0.548f * width, centerPoint[1] - width / 2 + 0.26f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.548f * width, centerPoint[1] - width / 2 + 0.261f * width,
        centerPoint[0]  - width / 2 + 0.548f * width, centerPoint[1] - width / 2 + 0.262f * width,
        centerPoint[0]  - width / 2 + 0.548f * width, centerPoint[1] - width / 2 + 0.263f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.539f * width, centerPoint[1] - width / 2 + 0.268f * width,
        centerPoint[0]  - width / 2 + 0.526f * width, centerPoint[1] - width / 2 + 0.275f * width,
        centerPoint[0]  - width / 2 + 0.518f * width, centerPoint[1] - width / 2 + 0.273f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.52f * width, centerPoint[1] - width / 2 + 0.277f * width,
        centerPoint[0]  - width / 2 + 0.531f * width, centerPoint[1] - width / 2 + 0.279f * width,
        centerPoint[0]  - width / 2 + 0.544f * width, centerPoint[1] - width / 2 + 0.277f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.544f * width, centerPoint[1] - width / 2 + 0.277f * width,
        centerPoint[0]  - width / 2 + 0.543f * width, centerPoint[1] - width / 2 + 0.28f * width,
        centerPoint[0]  - width / 2 + 0.543f * width, centerPoint[1] - width / 2 + 0.28f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.543f * width, centerPoint[1] - width / 2 + 0.28f * width,
        centerPoint[0]  - width / 2 + 0.54f * width, centerPoint[1] - width / 2 + 0.286f * width,
        centerPoint[0]  - width / 2 + 0.532f * width, centerPoint[1] - width / 2 + 0.288f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.524f * width, centerPoint[1] - width / 2 + 0.291f * width,
        centerPoint[0]  - width / 2 + 0.513f * width, centerPoint[1] - width / 2 + 0.29f * width,
        centerPoint[0]  - width / 2 + 0.513f * width, centerPoint[1] - width / 2 + 0.29f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.513f * width, centerPoint[1] - width / 2 + 0.29f * width,
        centerPoint[0]  - width / 2 + 0.515f * width, centerPoint[1] - width / 2 + 0.298f * width,
        centerPoint[0]  - width / 2 + 0.524f * width, centerPoint[1] - width / 2 + 0.301f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.516f * width, centerPoint[1] - width / 2 + 0.302f * width,
        centerPoint[0]  - width / 2 + 0.502f * width, centerPoint[1] - width / 2 + 0.312f * width,
        centerPoint[0]  - width / 2 + 0.497f * width, centerPoint[1] - width / 2 + 0.317f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.504f * width, centerPoint[1] - width / 2 + 0.313f * width,
        centerPoint[0]  - width / 2 + 0.532f * width, centerPoint[1] - width / 2 + 0.317f * width,
        centerPoint[0]  - width / 2 + 0.565f * width, centerPoint[1] - width / 2 + 0.318f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.542f * width, centerPoint[1] - width / 2 + 0.333f * width,
        centerPoint[0]  - width / 2 + 0.519f * width, centerPoint[1] - width / 2 + 0.347f * width,
        centerPoint[0]  - width / 2 + 0.516f * width, centerPoint[1] - width / 2 + 0.349f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.491f * width, centerPoint[1] - width / 2 + 0.36f * width,
        centerPoint[0]  - width / 2 + 0.414f * width, centerPoint[1] - width / 2 + 0.354f * width,
        centerPoint[0]  - width / 2 + 0.414f * width, centerPoint[1] - width / 2 + 0.354f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.414f * width, centerPoint[1] - width / 2 + 0.354f * width,
        centerPoint[0]  - width / 2 + 0.397f * width, centerPoint[1] - width / 2 + 0.354f * width,
        centerPoint[0]  - width / 2 + 0.391f * width, centerPoint[1] - width / 2 + 0.352f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.367f * width, centerPoint[1] - width / 2 + 0.344f * width,
        centerPoint[0]  - width / 2 + 0.356f * width, centerPoint[1] - width / 2 + 0.357f * width,
        centerPoint[0]  - width / 2 + 0.349f * width, centerPoint[1] - width / 2 + 0.358f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.345f * width, centerPoint[1] - width / 2 + 0.359f * width,
        centerPoint[0]  - width / 2 + 0.343f * width, centerPoint[1] - width / 2 + 0.362f * width,
        centerPoint[0]  - width / 2 + 0.342f * width, centerPoint[1] - width / 2 + 0.365f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.342f * width, centerPoint[1] - width / 2 + 0.365f * width,
        centerPoint[0]  - width / 2 + 0.213f * width, centerPoint[1] - width / 2 + 0.34f * width,
        centerPoint[0]  - width / 2 + 0.213f * width, centerPoint[1] - width / 2 + 0.34f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.213f * width, centerPoint[1] - width / 2 + 0.328f * width,
        centerPoint[0]  - width / 2 + 0.213f * width, centerPoint[1] - width / 2 + 0.316f * width,
        centerPoint[0]  - width / 2 + 0.213f * width, centerPoint[1] - width / 2 + 0.316f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.213f * width, centerPoint[1] - width / 2 + 0.316f * width,
        centerPoint[0]  - width / 2 + 0.211f * width, centerPoint[1] - width / 2 + 0.316f * width,
        centerPoint[0]  - width / 2 + 0.211f * width, centerPoint[1] - width / 2 + 0.316f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.212f * width, centerPoint[1] - width / 2 + 0.3f * width,
        centerPoint[0]  - width / 2 + 0.214f * width, centerPoint[1] - width / 2 + 0.249f * width,
        centerPoint[0]  - width / 2 + 0.196f * width, centerPoint[1] - width / 2 + 0.216f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.196f * width, centerPoint[1] - width / 2 + 0.215f * width,
        centerPoint[0]  - width / 2 + 0.196f * width, centerPoint[1] - width / 2 + 0.215f * width,
        centerPoint[0]  - width / 2 + 0.196f * width, centerPoint[1] - width / 2 + 0.214f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.194f * width, centerPoint[1] - width / 2 + 0.211f * width,
        centerPoint[0]  - width / 2 + 0.157f * width, centerPoint[1] - width / 2 + 0.139f * width,
        centerPoint[0]  - width / 2 + 0.147f * width, centerPoint[1] - width / 2 + 0.12f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.147f * width, centerPoint[1] - width / 2 + 0.12f * width,
        centerPoint[0]  - width / 2 + 0.143f * width, centerPoint[1] - width / 2 + 0.113f * width,
        centerPoint[0]  - width / 2 + 0.143f * width, centerPoint[1] - width / 2 + 0.113f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.143f * width, centerPoint[1] - width / 2 + 0.112f * width,
        centerPoint[0]  - width / 2 + 0.143f * width, centerPoint[1] - width / 2 + 0.112f * width,
        centerPoint[0]  - width / 2 + 0.143f * width, centerPoint[1] - width / 2 + 0.112f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.143f * width, centerPoint[1] - width / 2 + 0.112f * width,
        centerPoint[0]  - width / 2 + 0.142f * width, centerPoint[1] - width / 2 + 0.111f * width,
        centerPoint[0]  - width / 2 + 0.141f * width, centerPoint[1] - width / 2 + 0.112f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.14f * width, centerPoint[1] - width / 2 + 0.112f * width,
        centerPoint[0]  - width / 2 + 0.14f * width, centerPoint[1] - width / 2 + 0.113f * width,
        centerPoint[0]  - width / 2 + 0.14f * width, centerPoint[1] - width / 2 + 0.114f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.14f * width, centerPoint[1] - width / 2 + 0.114f * width,
        centerPoint[0]  - width / 2 + 0.142f * width, centerPoint[1] - width / 2 + 0.118f * width,
        centerPoint[0]  - width / 2 + 0.142f * width, centerPoint[1] - width / 2 + 0.118f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.142f * width, centerPoint[1] - width / 2 + 0.118f * width,
        centerPoint[0]  - width / 2 + 0.088f * width, centerPoint[1] - width / 2 + 0.179f * width,
        centerPoint[0]  - width / 2 + 0.088f * width, centerPoint[1] - width / 2 + 0.179f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.088f * width, centerPoint[1] - width / 2 + 0.179f * width,
        centerPoint[0]  - width / 2 + 0.086f * width, centerPoint[1] - width / 2 + 0.178f * width,
        centerPoint[0]  - width / 2 + 0.086f * width, centerPoint[1] - width / 2 + 0.178f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.085f * width, centerPoint[1] - width / 2 + 0.178f * width,
        centerPoint[0]  - width / 2 + 0.084f * width, centerPoint[1] - width / 2 + 0.178f * width,
        centerPoint[0]  - width / 2 + 0.084f * width, centerPoint[1] - width / 2 + 0.179f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.084f * width, centerPoint[1] - width / 2 + 0.18f * width,
        centerPoint[0]  - width / 2 + 0.084f * width, centerPoint[1] - width / 2 + 0.181f * width,
        centerPoint[0]  - width / 2 + 0.085f * width, centerPoint[1] - width / 2 + 0.181f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.085f * width, centerPoint[1] - width / 2 + 0.181f * width,
        centerPoint[0]  - width / 2 + 0.087f * width, centerPoint[1] - width / 2 + 0.182f * width,
        centerPoint[0]  - width / 2 + 0.087f * width, centerPoint[1] - width / 2 + 0.182f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.087f * width, centerPoint[1] - width / 2 + 0.182f * width,
        centerPoint[0]  - width / 2 + 0.089f * width, centerPoint[1] - width / 2 + 0.232f * width,
        centerPoint[0]  - width / 2 + 0.089f * width, centerPoint[1] - width / 2 + 0.232f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.089f * width, centerPoint[1] - width / 2 + 0.232f * width,
        centerPoint[0]  - width / 2 + 0.066f * width, centerPoint[1] - width / 2 + 0.321f * width,
        centerPoint[0]  - width / 2 + 0.066f * width, centerPoint[1] - width / 2 + 0.321f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.066f * width, centerPoint[1] - width / 2 + 0.321f * width,
        centerPoint[0]  - width / 2 + 0.064f * width, centerPoint[1] - width / 2 + 0.321f * width,
        centerPoint[0]  - width / 2 + 0.064f * width, centerPoint[1] - width / 2 + 0.321f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.063f * width, centerPoint[1] - width / 2 + 0.32f * width,
        centerPoint[0]  - width / 2 + 0.062f * width, centerPoint[1] - width / 2 + 0.321f * width,
        centerPoint[0]  - width / 2 + 0.062f * width, centerPoint[1] - width / 2 + 0.322f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.062f * width, centerPoint[1] - width / 2 + 0.323f * width,
        centerPoint[0]  - width / 2 + 0.062f * width, centerPoint[1] - width / 2 + 0.323f * width,
        centerPoint[0]  - width / 2 + 0.063f * width, centerPoint[1] - width / 2 + 0.324f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.063f * width, centerPoint[1] - width / 2 + 0.324f * width,
        centerPoint[0]  - width / 2 + 0.065f * width, centerPoint[1] - width / 2 + 0.324f * width,
        centerPoint[0]  - width / 2 + 0.065f * width, centerPoint[1] - width / 2 + 0.324f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.065f * width, centerPoint[1] - width / 2 + 0.324f * width,
        centerPoint[0]  - width / 2 + 0.065f * width, centerPoint[1] - width / 2 + 0.325f * width,
        centerPoint[0]  - width / 2 + 0.065f * width, centerPoint[1] - width / 2 + 0.325f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.065f * width, centerPoint[1] - width / 2 + 0.325f * width,
        centerPoint[0]  - width / 2 + 0.065f * width, centerPoint[1] - width / 2 + 0.352f * width,
        centerPoint[0]  - width / 2 + 0.065f * width, centerPoint[1] - width / 2 + 0.359f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.065f * width, centerPoint[1] - width / 2 + 0.36f * width,
        centerPoint[0]  - width / 2 + 0.064f * width, centerPoint[1] - width / 2 + 0.363f * width,
        centerPoint[0]  - width / 2 + 0.063f * width, centerPoint[1] - width / 2 + 0.367f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.063f * width, centerPoint[1] - width / 2 + 0.367f * width,
        centerPoint[0]  - width / 2 + 0.058f * width, centerPoint[1] - width / 2 + 0.367f * width,
        centerPoint[0]  - width / 2 + 0.058f * width, centerPoint[1] - width / 2 + 0.367f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.058f * width, centerPoint[1] - width / 2 + 0.367f * width,
        centerPoint[0]  - width / 2 + 0.057f * width, centerPoint[1] - width / 2 + 0.368f * width,
        centerPoint[0]  - width / 2 + 0.057f * width, centerPoint[1] - width / 2 + 0.369f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.057f * width, centerPoint[1] - width / 2 + 0.37f * width,
        centerPoint[0]  - width / 2 + 0.058f * width, centerPoint[1] - width / 2 + 0.37f * width,
        centerPoint[0]  - width / 2 + 0.059f * width, centerPoint[1] - width / 2 + 0.37f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.059f * width, centerPoint[1] - width / 2 + 0.37f * width,
        centerPoint[0]  - width / 2 + 0.062f * width, centerPoint[1] - width / 2 + 0.37f * width,
        centerPoint[0]  - width / 2 + 0.062f * width, centerPoint[1] - width / 2 + 0.37f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.056f * width, centerPoint[1] - width / 2 + 0.392f * width,
        centerPoint[0]  - width / 2 + 0.042f * width, centerPoint[1] - width / 2 + 0.438f * width,
        centerPoint[0]  - width / 2 + 0.037f * width, centerPoint[1] - width / 2 + 0.453f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.037f * width, centerPoint[1] - width / 2 + 0.453f * width,
        centerPoint[0]  - width / 2 + 0.035f * width, centerPoint[1] - width / 2 + 0.453f * width,
        centerPoint[0]  - width / 2 + 0.035f * width, centerPoint[1] - width / 2 + 0.453f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.034f * width, centerPoint[1] - width / 2 + 0.453f * width,
        centerPoint[0]  - width / 2 + 0.033f * width, centerPoint[1] - width / 2 + 0.453f * width,
        centerPoint[0]  - width / 2 + 0.033f * width, centerPoint[1] - width / 2 + 0.454f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.033f * width, centerPoint[1] - width / 2 + 0.455f * width,
        centerPoint[0]  - width / 2 + 0.034f * width, centerPoint[1] - width / 2 + 0.456f * width,
        centerPoint[0]  - width / 2 + 0.035f * width, centerPoint[1] - width / 2 + 0.456f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.035f * width, centerPoint[1] - width / 2 + 0.456f * width,
        centerPoint[0]  - width / 2 + 0.036f * width, centerPoint[1] - width / 2 + 0.456f * width,
        centerPoint[0]  - width / 2 + 0.036f * width, centerPoint[1] - width / 2 + 0.456f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.035f * width, centerPoint[1] - width / 2 + 0.457f * width,
        centerPoint[0]  - width / 2 + 0.035f * width, centerPoint[1] - width / 2 + 0.457f * width,
        centerPoint[0]  - width / 2 + 0.035f * width, centerPoint[1] - width / 2 + 0.457f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.035f * width, centerPoint[1] - width / 2 + 0.457f * width,
        centerPoint[0]  - width / 2 + 0.138f * width, centerPoint[1] - width / 2 + 0.453f * width,
        centerPoint[0]  - width / 2 + 0.142f * width, centerPoint[1] - width / 2 + 0.452f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.146f * width, centerPoint[1] - width / 2 + 0.452f * width,
        centerPoint[0]  - width / 2 + 0.151f * width, centerPoint[1] - width / 2 + 0.443f * width,
        centerPoint[0]  - width / 2 + 0.151f * width, centerPoint[1] - width / 2 + 0.443f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.151f * width, centerPoint[1] - width / 2 + 0.443f * width,
        centerPoint[0]  - width / 2 + 0.165f * width, centerPoint[1] - width / 2 + 0.429f * width,
        centerPoint[0]  - width / 2 + 0.172f * width, centerPoint[1] - width / 2 + 0.423f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.178f * width, centerPoint[1] - width / 2 + 0.417f * width,
        centerPoint[0]  - width / 2 + 0.188f * width, centerPoint[1] - width / 2 + 0.396f * width,
        centerPoint[0]  - width / 2 + 0.188f * width, centerPoint[1] - width / 2 + 0.396f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.188f * width, centerPoint[1] - width / 2 + 0.396f * width,
        centerPoint[0]  - width / 2 + 0.209f * width, centerPoint[1] - width / 2 + 0.368f * width,
        centerPoint[0]  - width / 2 + 0.212f * width, centerPoint[1] - width / 2 + 0.366f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.213f * width, centerPoint[1] - width / 2 + 0.365f * width,
        centerPoint[0]  - width / 2 + 0.213f * width, centerPoint[1] - width / 2 + 0.357f * width,
        centerPoint[0]  - width / 2 + 0.213f * width, centerPoint[1] - width / 2 + 0.347f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.213f * width, centerPoint[1] - width / 2 + 0.347f * width,
        centerPoint[0]  - width / 2 + 0.342f * width, centerPoint[1] - width / 2 + 0.372f * width,
        centerPoint[0]  - width / 2 + 0.342f * width, centerPoint[1] - width / 2 + 0.372f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.342f * width, centerPoint[1] - width / 2 + 0.373f * width,
        centerPoint[0]  - width / 2 + 0.342f * width, centerPoint[1] - width / 2 + 0.374f * width,
        centerPoint[0]  - width / 2 + 0.342f * width, centerPoint[1] - width / 2 + 0.374f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.338f * width, centerPoint[1] - width / 2 + 0.383f * width,
        centerPoint[0]  - width / 2 + 0.354f * width, centerPoint[1] - width / 2 + 0.395f * width,
        centerPoint[0]  - width / 2 + 0.378f * width, centerPoint[1] - width / 2 + 0.398f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.383f * width, centerPoint[1] - width / 2 + 0.398f * width,
        centerPoint[0]  - width / 2 + 0.404f * width, centerPoint[1] - width / 2 + 0.388f * width,
        centerPoint[0]  - width / 2 + 0.407f * width, centerPoint[1] - width / 2 + 0.388f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.411f * width, centerPoint[1] - width / 2 + 0.388f * width,
        centerPoint[0]  - width / 2 + 0.461f * width, centerPoint[1] - width / 2 + 0.412f * width,
        centerPoint[0]  - width / 2 + 0.468f * width, centerPoint[1] - width / 2 + 0.412f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.475f * width, centerPoint[1] - width / 2 + 0.412f * width,
        centerPoint[0]  - width / 2 + 0.539f * width, centerPoint[1] - width / 2 + 0.409f * width,
        centerPoint[0]  - width / 2 + 0.548f * width, centerPoint[1] - width / 2 + 0.406f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.558f * width, centerPoint[1] - width / 2 + 0.402f * width,
        centerPoint[0]  - width / 2 + 0.6f * width, centerPoint[1] - width / 2 + 0.386f * width,
        centerPoint[0]  - width / 2 + 0.6f * width, centerPoint[1] - width / 2 + 0.386f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.6f * width, centerPoint[1] - width / 2 + 0.386f * width,
        centerPoint[0]  - width / 2 + 0.613f * width, centerPoint[1] - width / 2 + 0.403f * width,
        centerPoint[0]  - width / 2 + 0.635f * width, centerPoint[1] - width / 2 + 0.412f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.653f * width, centerPoint[1] - width / 2 + 0.42f * width,
        centerPoint[0]  - width / 2 + 0.672f * width, centerPoint[1] - width / 2 + 0.453f * width,
        centerPoint[0]  - width / 2 + 0.677f * width, centerPoint[1] - width / 2 + 0.468f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.681f * width, centerPoint[1] - width / 2 + 0.484f * width,
        centerPoint[0]  - width / 2 + 0.63f * width, centerPoint[1] - width / 2 + 0.538f * width,
        centerPoint[0]  - width / 2 + 0.621f * width, centerPoint[1] - width / 2 + 0.544f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.612f * width, centerPoint[1] - width / 2 + 0.549f * width,
        centerPoint[0]  - width / 2 + 0.519f * width, centerPoint[1] - width / 2 + 0.593f * width,
        centerPoint[0]  - width / 2 + 0.524f * width, centerPoint[1] - width / 2 + 0.595f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.528f * width, centerPoint[1] - width / 2 + 0.597f * width,
        centerPoint[0]  - width / 2 + 0.551f * width, centerPoint[1] - width / 2 + 0.602f * width,
        centerPoint[0]  - width / 2 + 0.551f * width, centerPoint[1] - width / 2 + 0.608f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.551f * width, centerPoint[1] - width / 2 + 0.615f * width,
        centerPoint[0]  - width / 2 + 0.578f * width, centerPoint[1] - width / 2 + 0.632f * width,
        centerPoint[0]  - width / 2 + 0.578f * width, centerPoint[1] - width / 2 + 0.632f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.578f * width, centerPoint[1] - width / 2 + 0.632f * width,
        centerPoint[0]  - width / 2 + 0.584f * width, centerPoint[1] - width / 2 + 0.634f * width,
        centerPoint[0]  - width / 2 + 0.594f * width, centerPoint[1] - width / 2 + 0.638f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.582f * width, centerPoint[1] - width / 2 + 0.662f * width,
        centerPoint[0]  - width / 2 + 0.57f * width, centerPoint[1] - width / 2 + 0.691f * width,
        centerPoint[0]  - width / 2 + 0.569f * width, centerPoint[1] - width / 2 + 0.694f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.568f * width, centerPoint[1] - width / 2 + 0.697f * width,
        centerPoint[0]  - width / 2 + 0.55f * width, centerPoint[1] - width / 2 + 0.729f * width,
        centerPoint[0]  - width / 2 + 0.546f * width, centerPoint[1] - width / 2 + 0.73f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.546f * width, centerPoint[1] - width / 2 + 0.73f * width,
        centerPoint[0]  - width / 2 + 0.496f * width, centerPoint[1] - width / 2 + 0.819f * width,
        centerPoint[0]  - width / 2 + 0.496f * width, centerPoint[1] - width / 2 + 0.819f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.496f * width, centerPoint[1] - width / 2 + 0.819f * width,
        centerPoint[0]  - width / 2 + 0.486f * width, centerPoint[1] - width / 2 + 0.831f * width,
        centerPoint[0]  - width / 2 + 0.475f * width, centerPoint[1] - width / 2 + 0.838f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.464f * width, centerPoint[1] - width / 2 + 0.846f * width,
        centerPoint[0]  - width / 2 + 0.443f * width, centerPoint[1] - width / 2 + 0.855f * width,
        centerPoint[0]  - width / 2 + 0.44f * width, centerPoint[1] - width / 2 + 0.857f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.436f * width, centerPoint[1] - width / 2 + 0.859f * width,
        centerPoint[0]  - width / 2 + 0.441f * width, centerPoint[1] - width / 2 + 0.868f * width,
        centerPoint[0]  - width / 2 + 0.441f * width, centerPoint[1] - width / 2 + 0.872f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.441f * width, centerPoint[1] - width / 2 + 0.872f * width,
        centerPoint[0]  - width / 2 + 0.45f * width, centerPoint[1] - width / 2 + 0.875f * width,
        centerPoint[0]  - width / 2 + 0.45f * width, centerPoint[1] - width / 2 + 0.875f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.464f * width, centerPoint[1] - width / 2 + 0.876f * width,
        centerPoint[0]  - width / 2 + 0.492f * width, centerPoint[1] - width / 2 + 0.875f * width,
        centerPoint[0]  - width / 2 + 0.492f * width, centerPoint[1] - width / 2 + 0.875f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.492f * width, centerPoint[1] - width / 2 + 0.875f * width,
        centerPoint[0]  - width / 2 + 0.498f * width, centerPoint[1] - width / 2 + 0.867f * width,
        centerPoint[0]  - width / 2 + 0.498f * width, centerPoint[1] - width / 2 + 0.867f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.498f * width, centerPoint[1] - width / 2 + 0.867f * width,
        centerPoint[0]  - width / 2 + 0.501f * width, centerPoint[1] - width / 2 + 0.875f * width,
        centerPoint[0]  - width / 2 + 0.501f * width, centerPoint[1] - width / 2 + 0.875f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.501f * width, centerPoint[1] - width / 2 + 0.875f * width,
        centerPoint[0]  - width / 2 + 0.53f * width, centerPoint[1] - width / 2 + 0.873f * width,
        centerPoint[0]  - width / 2 + 0.535f * width, centerPoint[1] - width / 2 + 0.871f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.539f * width, centerPoint[1] - width / 2 + 0.869f * width,
        centerPoint[0]  - width / 2 + 0.541f * width, centerPoint[1] - width / 2 + 0.837f * width,
        centerPoint[0]  - width / 2 + 0.549f * width, centerPoint[1] - width / 2 + 0.827f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.557f * width, centerPoint[1] - width / 2 + 0.817f * width,
        centerPoint[0]  - width / 2 + 0.572f * width, centerPoint[1] - width / 2 + 0.788f * width,
        centerPoint[0]  - width / 2 + 0.59f * width, centerPoint[1] - width / 2 + 0.769f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.607f * width, centerPoint[1] - width / 2 + 0.75f * width,
        centerPoint[0]  - width / 2 + 0.613f * width, centerPoint[1] - width / 2 + 0.715f * width,
        centerPoint[0]  - width / 2 + 0.618f * width, centerPoint[1] - width / 2 + 0.709f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.621f * width, centerPoint[1] - width / 2 + 0.707f * width,
        centerPoint[0]  - width / 2 + 0.643f * width, centerPoint[1] - width / 2 + 0.684f * width,
        centerPoint[0]  - width / 2 + 0.666f * width, centerPoint[1] - width / 2 + 0.66f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.698f * width, centerPoint[1] - width / 2 + 0.668f * width,
        centerPoint[0]  - width / 2 + 0.729f * width, centerPoint[1] - width / 2 + 0.671f * width,
        centerPoint[0]  - width / 2 + 0.745f * width, centerPoint[1] - width / 2 + 0.662f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.741f * width, centerPoint[1] - width / 2 + 0.681f * width,
        centerPoint[0]  - width / 2 + 0.736f * width, centerPoint[1] - width / 2 + 0.729f * width,
        centerPoint[0]  - width / 2 + 0.746f * width, centerPoint[1] - width / 2 + 0.738f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.756f * width, centerPoint[1] - width / 2 + 0.748f * width,
        centerPoint[0]  - width / 2 + 0.788f * width, centerPoint[1] - width / 2 + 0.761f * width,
        centerPoint[0]  - width / 2 + 0.804f * width, centerPoint[1] - width / 2 + 0.767f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.819f * width, centerPoint[1] - width / 2 + 0.774f * width,
        centerPoint[0]  - width / 2 + 0.888f * width, centerPoint[1] - width / 2 + 0.806f * width,
        centerPoint[0]  - width / 2 + 0.895f * width, centerPoint[1] - width / 2 + 0.813f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.895f * width, centerPoint[1] - width / 2 + 0.813f * width,
        centerPoint[0]  - width / 2 + 0.909f * width, centerPoint[1] - width / 2 + 0.827f * width,
        centerPoint[0]  - width / 2 + 0.911f * width, centerPoint[1] - width / 2 + 0.831f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.912f * width, centerPoint[1] - width / 2 + 0.835f * width,
        centerPoint[0]  - width / 2 + 0.908f * width, centerPoint[1] - width / 2 + 0.858f * width,
        centerPoint[0]  - width / 2 + 0.9f * width, centerPoint[1] - width / 2 + 0.87f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.891f * width, centerPoint[1] - width / 2 + 0.882f * width,
        centerPoint[0]  - width / 2 + 0.897f * width, centerPoint[1] - width / 2 + 0.888f * width,
        centerPoint[0]  - width / 2 + 0.905f * width, centerPoint[1] - width / 2 + 0.888f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.913f * width, centerPoint[1] - width / 2 + 0.888f * width,
        centerPoint[0]  - width / 2 + 0.946f * width, centerPoint[1] - width / 2 + 0.89f * width,
        centerPoint[0]  - width / 2 + 0.95f * width, centerPoint[1] - width / 2 + 0.856f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.956f * width, centerPoint[1] - width / 2 + 0.831f * width,
        centerPoint[0]  - width / 2 + 0.956f * width, centerPoint[1] - width / 2 + 0.831f * width,
        centerPoint[0]  - width / 2 + 0.956f * width, centerPoint[1] - width / 2 + 0.831f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.956f * width, centerPoint[1] - width / 2 + 0.831f * width,
        centerPoint[0]  - width / 2 + 0.961f * width, centerPoint[1] - width / 2 + 0.838f * width,
        centerPoint[0]  - width / 2 + 0.961f * width, centerPoint[1] - width / 2 + 0.838f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.961f * width, centerPoint[1] - width / 2 + 0.838f * width,
        centerPoint[0]  - width / 2 + 0.972f * width, centerPoint[1] - width / 2 + 0.82f * width,
        centerPoint[0]  - width / 2 + 0.963f * width, centerPoint[1] - width / 2 + 0.812f * width
    );
    return path;

  }

}
