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
public class AkPath {

  public static Path getAkPath(float width, float[] centerPoint){
    Path path = new Path();

    path.moveTo(centerPoint[0]  - width / 2 + 0.986f * width, centerPoint[1] - width / 2 + 0.436f * width);
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.985f * width, centerPoint[1] - width / 2 + 0.431f * width,
        centerPoint[0]  - width / 2 + 0.982f * width, centerPoint[1] - width / 2 + 0.429f * width,
        centerPoint[0]  - width / 2 + 0.98f * width, centerPoint[1] - width / 2 + 0.429f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.978f * width, centerPoint[1] - width / 2 + 0.429f * width,
        centerPoint[0]  - width / 2 + 0.843f * width, centerPoint[1] - width / 2 + 0.413f * width,
        centerPoint[0]  - width / 2 + 0.836f * width, centerPoint[1] - width / 2 + 0.412f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.83f * width, centerPoint[1] - width / 2 + 0.411f * width,
        centerPoint[0]  - width / 2 + 0.829f * width, centerPoint[1] - width / 2 + 0.413f * width,
        centerPoint[0]  - width / 2 + 0.826f * width, centerPoint[1] - width / 2 + 0.415f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.823f * width, centerPoint[1] - width / 2 + 0.418f * width,
        centerPoint[0]  - width / 2 + 0.808f * width, centerPoint[1] - width / 2 + 0.421f * width,
        centerPoint[0]  - width / 2 + 0.798f * width, centerPoint[1] - width / 2 + 0.419f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.788f * width, centerPoint[1] - width / 2 + 0.416f * width,
        centerPoint[0]  - width / 2 + 0.734f * width, centerPoint[1] - width / 2 + 0.405f * width,
        centerPoint[0]  - width / 2 + 0.734f * width, centerPoint[1] - width / 2 + 0.405f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.734f * width, centerPoint[1] - width / 2 + 0.405f * width,
        centerPoint[0]  - width / 2 + 0.732f * width, centerPoint[1] - width / 2 + 0.401f * width,
        centerPoint[0]  - width / 2 + 0.732f * width, centerPoint[1] - width / 2 + 0.401f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.732f * width, centerPoint[1] - width / 2 + 0.401f * width,
        centerPoint[0]  - width / 2 + 0.725f * width, centerPoint[1] - width / 2 + 0.401f * width,
        centerPoint[0]  - width / 2 + 0.725f * width, centerPoint[1] - width / 2 + 0.401f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.725f * width, centerPoint[1] - width / 2 + 0.401f * width,
        centerPoint[0]  - width / 2 + 0.725f * width, centerPoint[1] - width / 2 + 0.396f * width,
        centerPoint[0]  - width / 2 + 0.725f * width, centerPoint[1] - width / 2 + 0.396f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.725f * width, centerPoint[1] - width / 2 + 0.396f * width,
        centerPoint[0]  - width / 2 + 0.693f * width, centerPoint[1] - width / 2 + 0.369f * width,
        centerPoint[0]  - width / 2 + 0.693f * width, centerPoint[1] - width / 2 + 0.369f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.693f * width, centerPoint[1] - width / 2 + 0.369f * width,
        centerPoint[0]  - width / 2 + 0.462f * width, centerPoint[1] - width / 2 + 0.369f * width,
        centerPoint[0]  - width / 2 + 0.462f * width, centerPoint[1] - width / 2 + 0.369f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.462f * width, centerPoint[1] - width / 2 + 0.369f * width,
        centerPoint[0]  - width / 2 + 0.459f * width, centerPoint[1] - width / 2 + 0.366f * width,
        centerPoint[0]  - width / 2 + 0.459f * width, centerPoint[1] - width / 2 + 0.366f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.459f * width, centerPoint[1] - width / 2 + 0.366f * width,
        centerPoint[0]  - width / 2 + 0.459f * width, centerPoint[1] - width / 2 + 0.363f * width,
        centerPoint[0]  - width / 2 + 0.459f * width, centerPoint[1] - width / 2 + 0.363f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.459f * width, centerPoint[1] - width / 2 + 0.363f * width,
        centerPoint[0]  - width / 2 + 0.461f * width, centerPoint[1] - width / 2 + 0.362f * width,
        centerPoint[0]  - width / 2 + 0.461f * width, centerPoint[1] - width / 2 + 0.362f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.461f * width, centerPoint[1] - width / 2 + 0.362f * width,
        centerPoint[0]  - width / 2 + 0.461f * width, centerPoint[1] - width / 2 + 0.352f * width,
        centerPoint[0]  - width / 2 + 0.461f * width, centerPoint[1] - width / 2 + 0.352f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.461f * width, centerPoint[1] - width / 2 + 0.352f * width,
        centerPoint[0]  - width / 2 + 0.458f * width, centerPoint[1] - width / 2 + 0.352f * width,
        centerPoint[0]  - width / 2 + 0.458f * width, centerPoint[1] - width / 2 + 0.352f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.458f * width, centerPoint[1] - width / 2 + 0.352f * width,
        centerPoint[0]  - width / 2 + 0.458f * width, centerPoint[1] - width / 2 + 0.356f * width,
        centerPoint[0]  - width / 2 + 0.458f * width, centerPoint[1] - width / 2 + 0.356f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.458f * width, centerPoint[1] - width / 2 + 0.356f * width,
        centerPoint[0]  - width / 2 + 0.454f * width, centerPoint[1] - width / 2 + 0.356f * width,
        centerPoint[0]  - width / 2 + 0.454f * width, centerPoint[1] - width / 2 + 0.356f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.454f * width, centerPoint[1] - width / 2 + 0.356f * width,
        centerPoint[0]  - width / 2 + 0.454f * width, centerPoint[1] - width / 2 + 0.353f * width,
        centerPoint[0]  - width / 2 + 0.454f * width, centerPoint[1] - width / 2 + 0.353f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.454f * width, centerPoint[1] - width / 2 + 0.353f * width,
        centerPoint[0]  - width / 2 + 0.451f * width, centerPoint[1] - width / 2 + 0.353f * width,
        centerPoint[0]  - width / 2 + 0.451f * width, centerPoint[1] - width / 2 + 0.353f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.451f * width, centerPoint[1] - width / 2 + 0.353f * width,
        centerPoint[0]  - width / 2 + 0.449f * width, centerPoint[1] - width / 2 + 0.355f * width,
        centerPoint[0]  - width / 2 + 0.449f * width, centerPoint[1] - width / 2 + 0.355f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.449f * width, centerPoint[1] - width / 2 + 0.355f * width,
        centerPoint[0]  - width / 2 + 0.446f * width, centerPoint[1] - width / 2 + 0.358f * width,
        centerPoint[0]  - width / 2 + 0.446f * width, centerPoint[1] - width / 2 + 0.358f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.446f * width, centerPoint[1] - width / 2 + 0.358f * width,
        centerPoint[0]  - width / 2 + 0.413f * width, centerPoint[1] - width / 2 + 0.358f * width,
        centerPoint[0]  - width / 2 + 0.413f * width, centerPoint[1] - width / 2 + 0.358f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.413f * width, centerPoint[1] - width / 2 + 0.358f * width,
        centerPoint[0]  - width / 2 + 0.39f * width, centerPoint[1] - width / 2 + 0.358f * width,
        centerPoint[0]  - width / 2 + 0.39f * width, centerPoint[1] - width / 2 + 0.358f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.39f * width, centerPoint[1] - width / 2 + 0.358f * width,
        centerPoint[0]  - width / 2 + 0.386f * width, centerPoint[1] - width / 2 + 0.364f * width,
        centerPoint[0]  - width / 2 + 0.386f * width, centerPoint[1] - width / 2 + 0.364f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.386f * width, centerPoint[1] - width / 2 + 0.364f * width,
        centerPoint[0]  - width / 2 + 0.386f * width, centerPoint[1] - width / 2 + 0.366f * width,
        centerPoint[0]  - width / 2 + 0.386f * width, centerPoint[1] - width / 2 + 0.366f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.386f * width, centerPoint[1] - width / 2 + 0.366f * width,
        centerPoint[0]  - width / 2 + 0.38f * width, centerPoint[1] - width / 2 + 0.366f * width,
        centerPoint[0]  - width / 2 + 0.38f * width, centerPoint[1] - width / 2 + 0.366f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.38f * width, centerPoint[1] - width / 2 + 0.366f * width,
        centerPoint[0]  - width / 2 + 0.38f * width, centerPoint[1] - width / 2 + 0.363f * width,
        centerPoint[0]  - width / 2 + 0.38f * width, centerPoint[1] - width / 2 + 0.363f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.38f * width, centerPoint[1] - width / 2 + 0.363f * width,
        centerPoint[0]  - width / 2 + 0.378f * width, centerPoint[1] - width / 2 + 0.357f * width,
        centerPoint[0]  - width / 2 + 0.37f * width, centerPoint[1] - width / 2 + 0.357f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.363f * width, centerPoint[1] - width / 2 + 0.357f * width,
        centerPoint[0]  - width / 2 + 0.269f * width, centerPoint[1] - width / 2 + 0.357f * width,
        centerPoint[0]  - width / 2 + 0.264f * width, centerPoint[1] - width / 2 + 0.357f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.259f * width, centerPoint[1] - width / 2 + 0.357f * width,
        centerPoint[0]  - width / 2 + 0.258f * width, centerPoint[1] - width / 2 + 0.363f * width,
        centerPoint[0]  - width / 2 + 0.258f * width, centerPoint[1] - width / 2 + 0.366f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.256f * width, centerPoint[1] - width / 2 + 0.368f * width,
        centerPoint[0]  - width / 2 + 0.254f * width, centerPoint[1] - width / 2 + 0.369f * width,
        centerPoint[0]  - width / 2 + 0.254f * width, centerPoint[1] - width / 2 + 0.369f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.254f * width, centerPoint[1] - width / 2 + 0.369f * width,
        centerPoint[0]  - width / 2 + 0.25f * width, centerPoint[1] - width / 2 + 0.369f * width,
        centerPoint[0]  - width / 2 + 0.25f * width, centerPoint[1] - width / 2 + 0.369f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.25f * width, centerPoint[1] - width / 2 + 0.369f * width,
        centerPoint[0]  - width / 2 + 0.25f * width, centerPoint[1] - width / 2 + 0.366f * width,
        centerPoint[0]  - width / 2 + 0.25f * width, centerPoint[1] - width / 2 + 0.366f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.25f * width, centerPoint[1] - width / 2 + 0.366f * width,
        centerPoint[0]  - width / 2 + 0.239f * width, centerPoint[1] - width / 2 + 0.366f * width,
        centerPoint[0]  - width / 2 + 0.239f * width, centerPoint[1] - width / 2 + 0.366f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.239f * width, centerPoint[1] - width / 2 + 0.366f * width,
        centerPoint[0]  - width / 2 + 0.239f * width, centerPoint[1] - width / 2 + 0.369f * width,
        centerPoint[0]  - width / 2 + 0.239f * width, centerPoint[1] - width / 2 + 0.369f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.239f * width, centerPoint[1] - width / 2 + 0.369f * width,
        centerPoint[0]  - width / 2 + 0.168f * width, centerPoint[1] - width / 2 + 0.369f * width,
        centerPoint[0]  - width / 2 + 0.168f * width, centerPoint[1] - width / 2 + 0.369f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.168f * width, centerPoint[1] - width / 2 + 0.369f * width,
        centerPoint[0]  - width / 2 + 0.157f * width, centerPoint[1] - width / 2 + 0.395f * width,
        centerPoint[0]  - width / 2 + 0.134f * width, centerPoint[1] - width / 2 + 0.396f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.134f * width, centerPoint[1] - width / 2 + 0.398f * width,
        centerPoint[0]  - width / 2 + 0.134f * width, centerPoint[1] - width / 2 + 0.398f * width,
        centerPoint[0]  - width / 2 + 0.134f * width, centerPoint[1] - width / 2 + 0.398f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.134f * width, centerPoint[1] - width / 2 + 0.398f * width,
        centerPoint[0]  - width / 2 + 0.066f * width, centerPoint[1] - width / 2 + 0.398f * width,
        centerPoint[0]  - width / 2 + 0.066f * width, centerPoint[1] - width / 2 + 0.398f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.066f * width, centerPoint[1] - width / 2 + 0.398f * width,
        centerPoint[0]  - width / 2 + 0.051f * width, centerPoint[1] - width / 2 + 0.36f * width,
        centerPoint[0]  - width / 2 + 0.051f * width, centerPoint[1] - width / 2 + 0.36f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.051f * width, centerPoint[1] - width / 2 + 0.36f * width,
        centerPoint[0]  - width / 2 + 0.048f * width, centerPoint[1] - width / 2 + 0.35f * width,
        centerPoint[0]  - width / 2 + 0.04f * width, centerPoint[1] - width / 2 + 0.35f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.032f * width, centerPoint[1] - width / 2 + 0.35f * width,
        centerPoint[0]  - width / 2 + 0.03f * width, centerPoint[1] - width / 2 + 0.353f * width,
        centerPoint[0]  - width / 2 + 0.03f * width, centerPoint[1] - width / 2 + 0.358f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.03f * width, centerPoint[1] - width / 2 + 0.363f * width,
        centerPoint[0]  - width / 2 + 0.03f * width, centerPoint[1] - width / 2 + 0.392f * width,
        centerPoint[0]  - width / 2 + 0.03f * width, centerPoint[1] - width / 2 + 0.392f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.03f * width, centerPoint[1] - width / 2 + 0.392f * width,
        centerPoint[0]  - width / 2 + 0.025f * width, centerPoint[1] - width / 2 + 0.392f * width,
        centerPoint[0]  - width / 2 + 0.025f * width, centerPoint[1] - width / 2 + 0.392f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.025f * width, centerPoint[1] - width / 2 + 0.392f * width,
        centerPoint[0]  - width / 2 + 0.025f * width, centerPoint[1] - width / 2 + 0.395f * width,
        centerPoint[0]  - width / 2 + 0.025f * width, centerPoint[1] - width / 2 + 0.395f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.025f * width, centerPoint[1] - width / 2 + 0.395f * width,
        centerPoint[0]  - width / 2 + 0.014f * width, centerPoint[1] - width / 2 + 0.395f * width,
        centerPoint[0]  - width / 2 + 0.014f * width, centerPoint[1] - width / 2 + 0.395f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.014f * width, centerPoint[1] - width / 2 + 0.395f * width,
        centerPoint[0]  - width / 2 + 0.014f * width, centerPoint[1] - width / 2 + 0.412f * width,
        centerPoint[0]  - width / 2 + 0.014f * width, centerPoint[1] - width / 2 + 0.412f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.014f * width, centerPoint[1] - width / 2 + 0.412f * width,
        centerPoint[0]  - width / 2 + 0.028f * width, centerPoint[1] - width / 2 + 0.412f * width,
        centerPoint[0]  - width / 2 + 0.028f * width, centerPoint[1] - width / 2 + 0.412f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.028f * width, centerPoint[1] - width / 2 + 0.412f * width,
        centerPoint[0]  - width / 2 + 0.028f * width, centerPoint[1] - width / 2 + 0.415f * width,
        centerPoint[0]  - width / 2 + 0.028f * width, centerPoint[1] - width / 2 + 0.415f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.028f * width, centerPoint[1] - width / 2 + 0.415f * width,
        centerPoint[0]  - width / 2 + 0.03f * width, centerPoint[1] - width / 2 + 0.415f * width,
        centerPoint[0]  - width / 2 + 0.03f * width, centerPoint[1] - width / 2 + 0.415f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.03f * width, centerPoint[1] - width / 2 + 0.415f * width,
        centerPoint[0]  - width / 2 + 0.032f * width, centerPoint[1] - width / 2 + 0.417f * width,
        centerPoint[0]  - width / 2 + 0.032f * width, centerPoint[1] - width / 2 + 0.417f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.032f * width, centerPoint[1] - width / 2 + 0.417f * width,
        centerPoint[0]  - width / 2 + 0.032f * width, centerPoint[1] - width / 2 + 0.425f * width,
        centerPoint[0]  - width / 2 + 0.032f * width, centerPoint[1] - width / 2 + 0.425f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.032f * width, centerPoint[1] - width / 2 + 0.425f * width,
        centerPoint[0]  - width / 2 + 0.035f * width, centerPoint[1] - width / 2 + 0.425f * width,
        centerPoint[0]  - width / 2 + 0.035f * width, centerPoint[1] - width / 2 + 0.425f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.035f * width, centerPoint[1] - width / 2 + 0.425f * width,
        centerPoint[0]  - width / 2 + 0.039f * width, centerPoint[1] - width / 2 + 0.422f * width,
        centerPoint[0]  - width / 2 + 0.039f * width, centerPoint[1] - width / 2 + 0.422f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.039f * width, centerPoint[1] - width / 2 + 0.422f * width,
        centerPoint[0]  - width / 2 + 0.161f * width, centerPoint[1] - width / 2 + 0.422f * width,
        centerPoint[0]  - width / 2 + 0.161f * width, centerPoint[1] - width / 2 + 0.422f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.161f * width, centerPoint[1] - width / 2 + 0.422f * width,
        centerPoint[0]  - width / 2 + 0.164f * width, centerPoint[1] - width / 2 + 0.426f * width,
        centerPoint[0]  - width / 2 + 0.164f * width, centerPoint[1] - width / 2 + 0.426f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.164f * width, centerPoint[1] - width / 2 + 0.426f * width,
        centerPoint[0]  - width / 2 + 0.171f * width, centerPoint[1] - width / 2 + 0.426f * width,
        centerPoint[0]  - width / 2 + 0.171f * width, centerPoint[1] - width / 2 + 0.426f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.171f * width, centerPoint[1] - width / 2 + 0.426f * width,
        centerPoint[0]  - width / 2 + 0.173f * width, centerPoint[1] - width / 2 + 0.422f * width,
        centerPoint[0]  - width / 2 + 0.173f * width, centerPoint[1] - width / 2 + 0.422f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.173f * width, centerPoint[1] - width / 2 + 0.422f * width,
        centerPoint[0]  - width / 2 + 0.251f * width, centerPoint[1] - width / 2 + 0.422f * width,
        centerPoint[0]  - width / 2 + 0.251f * width, centerPoint[1] - width / 2 + 0.422f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.251f * width, centerPoint[1] - width / 2 + 0.422f * width,
        centerPoint[0]  - width / 2 + 0.251f * width, centerPoint[1] - width / 2 + 0.425f * width,
        centerPoint[0]  - width / 2 + 0.251f * width, centerPoint[1] - width / 2 + 0.427f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.251f * width, centerPoint[1] - width / 2 + 0.43f * width,
        centerPoint[0]  - width / 2 + 0.256f * width, centerPoint[1] - width / 2 + 0.433f * width,
        centerPoint[0]  - width / 2 + 0.259f * width, centerPoint[1] - width / 2 + 0.433f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.262f * width, centerPoint[1] - width / 2 + 0.436f * width,
        centerPoint[0]  - width / 2 + 0.262f * width, centerPoint[1] - width / 2 + 0.437f * width,
        centerPoint[0]  - width / 2 + 0.278f * width, centerPoint[1] - width / 2 + 0.437f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.294f * width, centerPoint[1] - width / 2 + 0.437f * width,
        centerPoint[0]  - width / 2 + 0.366f * width, centerPoint[1] - width / 2 + 0.435f * width,
        centerPoint[0]  - width / 2 + 0.373f * width, centerPoint[1] - width / 2 + 0.435f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.38f * width, centerPoint[1] - width / 2 + 0.435f * width,
        centerPoint[0]  - width / 2 + 0.388f * width, centerPoint[1] - width / 2 + 0.436f * width,
        centerPoint[0]  - width / 2 + 0.396f * width, centerPoint[1] - width / 2 + 0.441f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.404f * width, centerPoint[1] - width / 2 + 0.446f * width,
        centerPoint[0]  - width / 2 + 0.411f * width, centerPoint[1] - width / 2 + 0.449f * width,
        centerPoint[0]  - width / 2 + 0.42f * width, centerPoint[1] - width / 2 + 0.449f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.428f * width, centerPoint[1] - width / 2 + 0.449f * width,
        centerPoint[0]  - width / 2 + 0.43f * width, centerPoint[1] - width / 2 + 0.441f * width,
        centerPoint[0]  - width / 2 + 0.433f * width, centerPoint[1] - width / 2 + 0.441f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.437f * width, centerPoint[1] - width / 2 + 0.441f * width,
        centerPoint[0]  - width / 2 + 0.487f * width, centerPoint[1] - width / 2 + 0.441f * width,
        centerPoint[0]  - width / 2 + 0.487f * width, centerPoint[1] - width / 2 + 0.441f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.487f * width, centerPoint[1] - width / 2 + 0.441f * width,
        centerPoint[0]  - width / 2 + 0.487f * width, centerPoint[1] - width / 2 + 0.454f * width,
        centerPoint[0]  - width / 2 + 0.487f * width, centerPoint[1] - width / 2 + 0.454f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.487f * width, centerPoint[1] - width / 2 + 0.454f * width,
        centerPoint[0]  - width / 2 + 0.494f * width, centerPoint[1] - width / 2 + 0.454f * width,
        centerPoint[0]  - width / 2 + 0.494f * width, centerPoint[1] - width / 2 + 0.454f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.494f * width, centerPoint[1] - width / 2 + 0.454f * width,
        centerPoint[0]  - width / 2 + 0.476f * width, centerPoint[1] - width / 2 + 0.552f * width,
        centerPoint[0]  - width / 2 + 0.408f * width, centerPoint[1] - width / 2 + 0.592f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.417f * width, centerPoint[1] - width / 2 + 0.608f * width,
        centerPoint[0]  - width / 2 + 0.448f * width, centerPoint[1] - width / 2 + 0.649f * width,
        centerPoint[0]  - width / 2 + 0.448f * width, centerPoint[1] - width / 2 + 0.649f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.448f * width, centerPoint[1] - width / 2 + 0.649f * width,
        centerPoint[0]  - width / 2 + 0.455f * width, centerPoint[1] - width / 2 + 0.65f * width,
        centerPoint[0]  - width / 2 + 0.458f * width, centerPoint[1] - width / 2 + 0.65f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.461f * width, centerPoint[1] - width / 2 + 0.649f * width,
        centerPoint[0]  - width / 2 + 0.544f * width, centerPoint[1] - width / 2 + 0.58f * width,
        centerPoint[0]  - width / 2 + 0.566f * width, centerPoint[1] - width / 2 + 0.47f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.571f * width, centerPoint[1] - width / 2 + 0.477f * width,
        centerPoint[0]  - width / 2 + 0.57f * width, centerPoint[1] - width / 2 + 0.477f * width,
        centerPoint[0]  - width / 2 + 0.57f * width, centerPoint[1] - width / 2 + 0.477f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.57f * width, centerPoint[1] - width / 2 + 0.477f * width,
        centerPoint[0]  - width / 2 + 0.57f * width, centerPoint[1] - width / 2 + 0.488f * width,
        centerPoint[0]  - width / 2 + 0.57f * width, centerPoint[1] - width / 2 + 0.488f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.57f * width, centerPoint[1] - width / 2 + 0.488f * width,
        centerPoint[0]  - width / 2 + 0.572f * width, centerPoint[1] - width / 2 + 0.49f * width,
        centerPoint[0]  - width / 2 + 0.572f * width, centerPoint[1] - width / 2 + 0.49f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.572f * width, centerPoint[1] - width / 2 + 0.49f * width,
        centerPoint[0]  - width / 2 + 0.573f * width, centerPoint[1] - width / 2 + 0.493f * width,
        centerPoint[0]  - width / 2 + 0.573f * width, centerPoint[1] - width / 2 + 0.493f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.575f * width, centerPoint[1] - width / 2 + 0.493f * width,
        centerPoint[0]  - width / 2 + 0.575f * width, centerPoint[1] - width / 2 + 0.493f * width,
        centerPoint[0]  - width / 2 + 0.575f * width, centerPoint[1] - width / 2 + 0.493f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.575f * width, centerPoint[1] - width / 2 + 0.493f * width,
        centerPoint[0]  - width / 2 + 0.575f * width, centerPoint[1] - width / 2 + 0.48f * width,
        centerPoint[0]  - width / 2 + 0.575f * width, centerPoint[1] - width / 2 + 0.48f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.575f * width, centerPoint[1] - width / 2 + 0.48f * width,
        centerPoint[0]  - width / 2 + 0.58f * width, centerPoint[1] - width / 2 + 0.477f * width,
        centerPoint[0]  - width / 2 + 0.58f * width, centerPoint[1] - width / 2 + 0.477f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.58f * width, centerPoint[1] - width / 2 + 0.477f * width,
        centerPoint[0]  - width / 2 + 0.584f * width, centerPoint[1] - width / 2 + 0.477f * width,
        centerPoint[0]  - width / 2 + 0.584f * width, centerPoint[1] - width / 2 + 0.477f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.584f * width, centerPoint[1] - width / 2 + 0.479f * width,
        centerPoint[0]  - width / 2 + 0.584f * width, centerPoint[1] - width / 2 + 0.48f * width,
        centerPoint[0]  - width / 2 + 0.584f * width, centerPoint[1] - width / 2 + 0.481f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.584f * width, centerPoint[1] - width / 2 + 0.481f * width,
        centerPoint[0]  - width / 2 + 0.584f * width, centerPoint[1] - width / 2 + 0.482f * width,
        centerPoint[0]  - width / 2 + 0.584f * width, centerPoint[1] - width / 2 + 0.482f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.584f * width, centerPoint[1] - width / 2 + 0.482f * width,
        centerPoint[0]  - width / 2 + 0.591f * width, centerPoint[1] - width / 2 + 0.488f * width,
        centerPoint[0]  - width / 2 + 0.591f * width, centerPoint[1] - width / 2 + 0.488f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.591f * width, centerPoint[1] - width / 2 + 0.488f * width,
        centerPoint[0]  - width / 2 + 0.64f * width, centerPoint[1] - width / 2 + 0.488f * width,
        centerPoint[0]  - width / 2 + 0.64f * width, centerPoint[1] - width / 2 + 0.488f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.64f * width, centerPoint[1] - width / 2 + 0.488f * width,
        centerPoint[0]  - width / 2 + 0.649f * width, centerPoint[1] - width / 2 + 0.481f * width,
        centerPoint[0]  - width / 2 + 0.649f * width, centerPoint[1] - width / 2 + 0.481f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.649f * width, centerPoint[1] - width / 2 + 0.481f * width,
        centerPoint[0]  - width / 2 + 0.649f * width, centerPoint[1] - width / 2 + 0.473f * width,
        centerPoint[0]  - width / 2 + 0.649f * width, centerPoint[1] - width / 2 + 0.473f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.649f * width, centerPoint[1] - width / 2 + 0.473f * width,
        centerPoint[0]  - width / 2 + 0.653f * width, centerPoint[1] - width / 2 + 0.473f * width,
        centerPoint[0]  - width / 2 + 0.653f * width, centerPoint[1] - width / 2 + 0.473f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.653f * width, centerPoint[1] - width / 2 + 0.473f * width,
        centerPoint[0]  - width / 2 + 0.657f * width, centerPoint[1] - width / 2 + 0.474f * width,
        centerPoint[0]  - width / 2 + 0.66f * width, centerPoint[1] - width / 2 + 0.481f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.663f * width, centerPoint[1] - width / 2 + 0.487f * width,
        centerPoint[0]  - width / 2 + 0.687f * width, centerPoint[1] - width / 2 + 0.54f * width,
        centerPoint[0]  - width / 2 + 0.688f * width, centerPoint[1] - width / 2 + 0.543f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.689f * width, centerPoint[1] - width / 2 + 0.545f * width,
        centerPoint[0]  - width / 2 + 0.688f * width, centerPoint[1] - width / 2 + 0.55f * width,
        centerPoint[0]  - width / 2 + 0.688f * width, centerPoint[1] - width / 2 + 0.554f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.688f * width, centerPoint[1] - width / 2 + 0.557f * width,
        centerPoint[0]  - width / 2 + 0.688f * width, centerPoint[1] - width / 2 + 0.565f * width,
        centerPoint[0]  - width / 2 + 0.697f * width, centerPoint[1] - width / 2 + 0.566f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.706f * width, centerPoint[1] - width / 2 + 0.566f * width,
        centerPoint[0]  - width / 2 + 0.715f * width, centerPoint[1] - width / 2 + 0.565f * width,
        centerPoint[0]  - width / 2 + 0.724f * width, centerPoint[1] - width / 2 + 0.556f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.733f * width, centerPoint[1] - width / 2 + 0.548f * width,
        centerPoint[0]  - width / 2 + 0.736f * width, centerPoint[1] - width / 2 + 0.542f * width,
        centerPoint[0]  - width / 2 + 0.732f * width, centerPoint[1] - width / 2 + 0.535f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.728f * width, centerPoint[1] - width / 2 + 0.527f * width,
        centerPoint[0]  - width / 2 + 0.713f * width, centerPoint[1] - width / 2 + 0.491f * width,
        centerPoint[0]  - width / 2 + 0.711f * width, centerPoint[1] - width / 2 + 0.487f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.709f * width, centerPoint[1] - width / 2 + 0.482f * width,
        centerPoint[0]  - width / 2 + 0.707f * width, centerPoint[1] - width / 2 + 0.476f * width,
        centerPoint[0]  - width / 2 + 0.71f * width, centerPoint[1] - width / 2 + 0.473f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.714f * width, centerPoint[1] - width / 2 + 0.469f * width,
        centerPoint[0]  - width / 2 + 0.717f * width, centerPoint[1] - width / 2 + 0.465f * width,
        centerPoint[0]  - width / 2 + 0.716f * width, centerPoint[1] - width / 2 + 0.462f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.716f * width, centerPoint[1] - width / 2 + 0.46f * width,
        centerPoint[0]  - width / 2 + 0.716f * width, centerPoint[1] - width / 2 + 0.452f * width,
        centerPoint[0]  - width / 2 + 0.716f * width, centerPoint[1] - width / 2 + 0.452f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.716f * width, centerPoint[1] - width / 2 + 0.452f * width,
        centerPoint[0]  - width / 2 + 0.728f * width, centerPoint[1] - width / 2 + 0.452f * width,
        centerPoint[0]  - width / 2 + 0.728f * width, centerPoint[1] - width / 2 + 0.452f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.728f * width, centerPoint[1] - width / 2 + 0.452f * width,
        centerPoint[0]  - width / 2 + 0.794f * width, centerPoint[1] - width / 2 + 0.473f * width,
        centerPoint[0]  - width / 2 + 0.831f * width, centerPoint[1] - width / 2 + 0.484f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.868f * width, centerPoint[1] - width / 2 + 0.495f * width,
        centerPoint[0]  - width / 2 + 0.943f * width, centerPoint[1] - width / 2 + 0.521f * width,
        centerPoint[0]  - width / 2 + 0.95f * width, centerPoint[1] - width / 2 + 0.524f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.957f * width, centerPoint[1] - width / 2 + 0.527f * width,
        centerPoint[0]  - width / 2 + 0.97f * width, centerPoint[1] - width / 2 + 0.529f * width,
        centerPoint[0]  - width / 2 + 0.974f * width, centerPoint[1] - width / 2 + 0.522f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.978f * width, centerPoint[1] - width / 2 + 0.516f * width,
        centerPoint[0]  - width / 2 + 0.986f * width, centerPoint[1] - width / 2 + 0.441f * width,
        centerPoint[0]  - width / 2 + 0.986f * width, centerPoint[1] - width / 2 + 0.436f * width
    );
    return path;

  }

}
