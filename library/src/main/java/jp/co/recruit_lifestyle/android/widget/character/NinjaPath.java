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
public class NinjaPath {

  public static Path getNinjaPath(float width, float[] centerPoint){
    Path path = new Path();

    path.moveTo(centerPoint[0] - width / 2 + 0.476f * width,
        centerPoint[1] - width / 2 + 0.186f * width);
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.472f * width, centerPoint[1] - width / 2 + 0.186f * width,
        centerPoint[0]  - width / 2 + 0.464f * width, centerPoint[1] - width / 2 + 0.163f * width,
        centerPoint[0]  - width / 2 + 0.463f * width, centerPoint[1] - width / 2 + 0.156f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.462f * width, centerPoint[1] - width / 2 + 0.149f * width,
        centerPoint[0]  - width / 2 + 0.464f * width, centerPoint[1] - width / 2 + 0.118f * width,
        centerPoint[0]  - width / 2 + 0.464f * width, centerPoint[1] - width / 2 + 0.11f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.464f * width, centerPoint[1] - width / 2 + 0.102f * width,
        centerPoint[0]  - width / 2 + 0.472f * width, centerPoint[1] - width / 2 + 0.086f * width,
        centerPoint[0]  - width / 2 + 0.479f * width, centerPoint[1] - width / 2 + 0.081f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.486f * width, centerPoint[1] - width / 2 + 0.075f * width,
        centerPoint[0]  - width / 2 + 0.517f * width, centerPoint[1] - width / 2 + 0.075f * width,
        centerPoint[0]  - width / 2 + 0.53f * width, centerPoint[1] - width / 2 + 0.081f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.542f * width, centerPoint[1] - width / 2 + 0.086f * width,
        centerPoint[0]  - width / 2 + 0.549f * width, centerPoint[1] - width / 2 + 0.097f * width,
        centerPoint[0]  - width / 2 + 0.551f * width, centerPoint[1] - width / 2 + 0.107f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.554f * width, centerPoint[1] - width / 2 + 0.117f * width,
        centerPoint[0]  - width / 2 + 0.554f * width, centerPoint[1] - width / 2 + 0.139f * width,
        centerPoint[0]  - width / 2 + 0.553f * width, centerPoint[1] - width / 2 + 0.146f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.551f * width, centerPoint[1] - width / 2 + 0.153f * width,
        centerPoint[0]  - width / 2 + 0.547f * width, centerPoint[1] - width / 2 + 0.173f * width,
        centerPoint[0]  - width / 2 + 0.543f * width, centerPoint[1] - width / 2 + 0.179f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.54f * width, centerPoint[1] - width / 2 + 0.185f * width,
        centerPoint[0]  - width / 2 + 0.546f * width, centerPoint[1] - width / 2 + 0.194f * width,
        centerPoint[0]  - width / 2 + 0.546f * width, centerPoint[1] - width / 2 + 0.194f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.546f * width, centerPoint[1] - width / 2 + 0.194f * width,
        centerPoint[0]  - width / 2 + 0.559f * width, centerPoint[1] - width / 2 + 0.184f * width,
        centerPoint[0]  - width / 2 + 0.564f * width, centerPoint[1] - width / 2 + 0.19f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.569f * width, centerPoint[1] - width / 2 + 0.197f * width,
        centerPoint[0]  - width / 2 + 0.569f * width, centerPoint[1] - width / 2 + 0.203f * width,
        centerPoint[0]  - width / 2 + 0.575f * width, centerPoint[1] - width / 2 + 0.203f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.582f * width, centerPoint[1] - width / 2 + 0.203f * width,
        centerPoint[0]  - width / 2 + 0.599f * width, centerPoint[1] - width / 2 + 0.195f * width,
        centerPoint[0]  - width / 2 + 0.601f * width, centerPoint[1] - width / 2 + 0.2f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.602f * width, centerPoint[1] - width / 2 + 0.204f * width,
        centerPoint[0]  - width / 2 + 0.618f * width, centerPoint[1] - width / 2 + 0.21f * width,
        centerPoint[0]  - width / 2 + 0.621f * width, centerPoint[1] - width / 2 + 0.213f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.625f * width, centerPoint[1] - width / 2 + 0.217f * width,
        centerPoint[0]  - width / 2 + 0.644f * width, centerPoint[1] - width / 2 + 0.231f * width,
        centerPoint[0]  - width / 2 + 0.646f * width, centerPoint[1] - width / 2 + 0.234f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.649f * width, centerPoint[1] - width / 2 + 0.237f * width,
        centerPoint[0]  - width / 2 + 0.66f * width, centerPoint[1] - width / 2 + 0.253f * width,
        centerPoint[0]  - width / 2 + 0.662f * width, centerPoint[1] - width / 2 + 0.26f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.665f * width, centerPoint[1] - width / 2 + 0.267f * width,
        centerPoint[0]  - width / 2 + 0.661f * width, centerPoint[1] - width / 2 + 0.345f * width,
        centerPoint[0]  - width / 2 + 0.654f * width, centerPoint[1] - width / 2 + 0.35f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.648f * width, centerPoint[1] - width / 2 + 0.354f * width,
        centerPoint[0]  - width / 2 + 0.633f * width, centerPoint[1] - width / 2 + 0.359f * width,
        centerPoint[0]  - width / 2 + 0.633f * width, centerPoint[1] - width / 2 + 0.359f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.633f * width, centerPoint[1] - width / 2 + 0.359f * width,
        centerPoint[0]  - width / 2 + 0.617f * width, centerPoint[1] - width / 2 + 0.346f * width,
        centerPoint[0]  - width / 2 + 0.617f * width, centerPoint[1] - width / 2 + 0.346f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.617f * width, centerPoint[1] - width / 2 + 0.346f * width,
        centerPoint[0]  - width / 2 + 0.604f * width, centerPoint[1] - width / 2 + 0.358f * width,
        centerPoint[0]  - width / 2 + 0.598f * width, centerPoint[1] - width / 2 + 0.358f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.593f * width, centerPoint[1] - width / 2 + 0.358f * width,
        centerPoint[0]  - width / 2 + 0.58f * width, centerPoint[1] - width / 2 + 0.355f * width,
        centerPoint[0]  - width / 2 + 0.58f * width, centerPoint[1] - width / 2 + 0.361f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.58f * width, centerPoint[1] - width / 2 + 0.367f * width,
        centerPoint[0]  - width / 2 + 0.582f * width, centerPoint[1] - width / 2 + 0.393f * width,
        centerPoint[0]  - width / 2 + 0.586f * width, centerPoint[1] - width / 2 + 0.398f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.589f * width, centerPoint[1] - width / 2 + 0.402f * width,
        centerPoint[0]  - width / 2 + 0.62f * width, centerPoint[1] - width / 2 + 0.447f * width,
        centerPoint[0]  - width / 2 + 0.622f * width, centerPoint[1] - width / 2 + 0.458f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.625f * width, centerPoint[1] - width / 2 + 0.47f * width,
        centerPoint[0]  - width / 2 + 0.625f * width, centerPoint[1] - width / 2 + 0.471f * width,
        centerPoint[0]  - width / 2 + 0.621f * width, centerPoint[1] - width / 2 + 0.48f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.618f * width, centerPoint[1] - width / 2 + 0.489f * width,
        centerPoint[0]  - width / 2 + 0.614f * width, centerPoint[1] - width / 2 + 0.536f * width,
        centerPoint[0]  - width / 2 + 0.617f * width, centerPoint[1] - width / 2 + 0.543f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.619f * width, centerPoint[1] - width / 2 + 0.55f * width,
        centerPoint[0]  - width / 2 + 0.62f * width, centerPoint[1] - width / 2 + 0.582f * width,
        centerPoint[0]  - width / 2 + 0.621f * width, centerPoint[1] - width / 2 + 0.59f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.622f * width, centerPoint[1] - width / 2 + 0.598f * width,
        centerPoint[0]  - width / 2 + 0.627f * width, centerPoint[1] - width / 2 + 0.614f * width,
        centerPoint[0]  - width / 2 + 0.625f * width, centerPoint[1] - width / 2 + 0.628f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.622f * width, centerPoint[1] - width / 2 + 0.642f * width,
        centerPoint[0]  - width / 2 + 0.621f * width, centerPoint[1] - width / 2 + 0.666f * width,
        centerPoint[0]  - width / 2 + 0.613f * width, centerPoint[1] - width / 2 + 0.67f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.605f * width, centerPoint[1] - width / 2 + 0.675f * width,
        centerPoint[0]  - width / 2 + 0.603f * width, centerPoint[1] - width / 2 + 0.676f * width,
        centerPoint[0]  - width / 2 + 0.601f * width, centerPoint[1] - width / 2 + 0.681f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.598f * width, centerPoint[1] - width / 2 + 0.685f * width,
        centerPoint[0]  - width / 2 + 0.596f * width, centerPoint[1] - width / 2 + 0.786f * width,
        centerPoint[0]  - width / 2 + 0.595f * width, centerPoint[1] - width / 2 + 0.8f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.594f * width, centerPoint[1] - width / 2 + 0.807f * width,
        centerPoint[0]  - width / 2 + 0.596f * width, centerPoint[1] - width / 2 + 0.833f * width,
        centerPoint[0]  - width / 2 + 0.599f * width, centerPoint[1] - width / 2 + 0.841f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.603f * width, centerPoint[1] - width / 2 + 0.849f * width,
        centerPoint[0]  - width / 2 + 0.617f * width, centerPoint[1] - width / 2 + 0.863f * width,
        centerPoint[0]  - width / 2 + 0.634f * width, centerPoint[1] - width / 2 + 0.866f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.651f * width, centerPoint[1] - width / 2 + 0.87f * width,
        centerPoint[0]  - width / 2 + 0.657f * width, centerPoint[1] - width / 2 + 0.883f * width,
        centerPoint[0]  - width / 2 + 0.651f * width, centerPoint[1] - width / 2 + 0.886f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.645f * width, centerPoint[1] - width / 2 + 0.888f * width,
        centerPoint[0]  - width / 2 + 0.621f * width, centerPoint[1] - width / 2 + 0.89f * width,
        centerPoint[0]  - width / 2 + 0.61f * width, centerPoint[1] - width / 2 + 0.886f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.598f * width, centerPoint[1] - width / 2 + 0.881f * width,
        centerPoint[0]  - width / 2 + 0.568f * width, centerPoint[1] - width / 2 + 0.885f * width,
        centerPoint[0]  - width / 2 + 0.562f * width, centerPoint[1] - width / 2 + 0.88f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.555f * width, centerPoint[1] - width / 2 + 0.874f * width,
        centerPoint[0]  - width / 2 + 0.55f * width, centerPoint[1] - width / 2 + 0.871f * width,
        centerPoint[0]  - width / 2 + 0.556f * width, centerPoint[1] - width / 2 + 0.858f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.559f * width, centerPoint[1] - width / 2 + 0.851f * width,
        centerPoint[0]  - width / 2 + 0.557f * width, centerPoint[1] - width / 2 + 0.833f * width,
        centerPoint[0]  - width / 2 + 0.556f * width, centerPoint[1] - width / 2 + 0.825f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.555f * width, centerPoint[1] - width / 2 + 0.817f * width,
        centerPoint[0]  - width / 2 + 0.542f * width, centerPoint[1] - width / 2 + 0.752f * width,
        centerPoint[0]  - width / 2 + 0.54f * width, centerPoint[1] - width / 2 + 0.724f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.538f * width, centerPoint[1] - width / 2 + 0.697f * width,
        centerPoint[0]  - width / 2 + 0.541f * width, centerPoint[1] - width / 2 + 0.686f * width,
        centerPoint[0]  - width / 2 + 0.541f * width, centerPoint[1] - width / 2 + 0.686f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.541f * width, centerPoint[1] - width / 2 + 0.686f * width,
        centerPoint[0]  - width / 2 + 0.526f * width, centerPoint[1] - width / 2 + 0.663f * width,
        centerPoint[0]  - width / 2 + 0.526f * width, centerPoint[1] - width / 2 + 0.663f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.526f * width, centerPoint[1] - width / 2 + 0.663f * width,
        centerPoint[0]  - width / 2 + 0.516f * width, centerPoint[1] - width / 2 + 0.683f * width,
        centerPoint[0]  - width / 2 + 0.509f * width, centerPoint[1] - width / 2 + 0.682f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.502f * width, centerPoint[1] - width / 2 + 0.681f * width,
        centerPoint[0]  - width / 2 + 0.517f * width, centerPoint[1] - width / 2 + 0.722f * width,
        centerPoint[0]  - width / 2 + 0.511f * width, centerPoint[1] - width / 2 + 0.738f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.506f * width, centerPoint[1] - width / 2 + 0.754f * width,
        centerPoint[0]  - width / 2 + 0.509f * width, centerPoint[1] - width / 2 + 0.826f * width,
        centerPoint[0]  - width / 2 + 0.512f * width, centerPoint[1] - width / 2 + 0.837f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.516f * width, centerPoint[1] - width / 2 + 0.849f * width,
        centerPoint[0]  - width / 2 + 0.527f * width, centerPoint[1] - width / 2 + 0.872f * width,
        centerPoint[0]  - width / 2 + 0.515f * width, centerPoint[1] - width / 2 + 0.878f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.502f * width, centerPoint[1] - width / 2 + 0.883f * width,
        centerPoint[0]  - width / 2 + 0.455f * width, centerPoint[1] - width / 2 + 0.876f * width,
        centerPoint[0]  - width / 2 + 0.445f * width, centerPoint[1] - width / 2 + 0.88f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.435f * width, centerPoint[1] - width / 2 + 0.883f * width,
        centerPoint[0]  - width / 2 + 0.419f * width, centerPoint[1] - width / 2 + 0.884f * width,
        centerPoint[0]  - width / 2 + 0.423f * width, centerPoint[1] - width / 2 + 0.876f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.428f * width, centerPoint[1] - width / 2 + 0.868f * width,
        centerPoint[0]  - width / 2 + 0.44f * width, centerPoint[1] - width / 2 + 0.865f * width,
        centerPoint[0]  - width / 2 + 0.448f * width, centerPoint[1] - width / 2 + 0.859f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.456f * width, centerPoint[1] - width / 2 + 0.853f * width,
        centerPoint[0]  - width / 2 + 0.472f * width, centerPoint[1] - width / 2 + 0.847f * width,
        centerPoint[0]  - width / 2 + 0.473f * width, centerPoint[1] - width / 2 + 0.837f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.475f * width, centerPoint[1] - width / 2 + 0.828f * width,
        centerPoint[0]  - width / 2 + 0.444f * width, centerPoint[1] - width / 2 + 0.71f * width,
        centerPoint[0]  - width / 2 + 0.447f * width, centerPoint[1] - width / 2 + 0.676f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.451f * width, centerPoint[1] - width / 2 + 0.642f * width,
        centerPoint[0]  - width / 2 + 0.431f * width, centerPoint[1] - width / 2 + 0.671f * width,
        centerPoint[0]  - width / 2 + 0.422f * width, centerPoint[1] - width / 2 + 0.655f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.413f * width, centerPoint[1] - width / 2 + 0.639f * width,
        centerPoint[0]  - width / 2 + 0.404f * width, centerPoint[1] - width / 2 + 0.611f * width,
        centerPoint[0]  - width / 2 + 0.403f * width, centerPoint[1] - width / 2 + 0.595f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.401f * width, centerPoint[1] - width / 2 + 0.579f * width,
        centerPoint[0]  - width / 2 + 0.415f * width, centerPoint[1] - width / 2 + 0.512f * width,
        centerPoint[0]  - width / 2 + 0.415f * width, centerPoint[1] - width / 2 + 0.507f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.415f * width, centerPoint[1] - width / 2 + 0.501f * width,
        centerPoint[0]  - width / 2 + 0.407f * width, centerPoint[1] - width / 2 + 0.485f * width,
        centerPoint[0]  - width / 2 + 0.407f * width, centerPoint[1] - width / 2 + 0.471f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.407f * width, centerPoint[1] - width / 2 + 0.457f * width,
        centerPoint[0]  - width / 2 + 0.407f * width, centerPoint[1] - width / 2 + 0.454f * width,
        centerPoint[0]  - width / 2 + 0.414f * width, centerPoint[1] - width / 2 + 0.447f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.421f * width, centerPoint[1] - width / 2 + 0.44f * width,
        centerPoint[0]  - width / 2 + 0.444f * width, centerPoint[1] - width / 2 + 0.414f * width,
        centerPoint[0]  - width / 2 + 0.445f * width, centerPoint[1] - width / 2 + 0.407f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.446f * width, centerPoint[1] - width / 2 + 0.4f * width,
        centerPoint[0]  - width / 2 + 0.446f * width, centerPoint[1] - width / 2 + 0.373f * width,
        centerPoint[0]  - width / 2 + 0.446f * width, centerPoint[1] - width / 2 + 0.373f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.446f * width, centerPoint[1] - width / 2 + 0.373f * width,
        centerPoint[0]  - width / 2 + 0.43f * width, centerPoint[1] - width / 2 + 0.362f * width,
        centerPoint[0]  - width / 2 + 0.427f * width, centerPoint[1] - width / 2 + 0.363f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.423f * width, centerPoint[1] - width / 2 + 0.365f * width,
        centerPoint[0]  - width / 2 + 0.381f * width, centerPoint[1] - width / 2 + 0.381f * width,
        centerPoint[0]  - width / 2 + 0.373f * width, centerPoint[1] - width / 2 + 0.377f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.365f * width, centerPoint[1] - width / 2 + 0.374f * width,
        centerPoint[0]  - width / 2 + 0.343f * width, centerPoint[1] - width / 2 + 0.352f * width,
        centerPoint[0]  - width / 2 + 0.343f * width, centerPoint[1] - width / 2 + 0.347f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.343f * width, centerPoint[1] - width / 2 + 0.343f * width,
        centerPoint[0]  - width / 2 + 0.338f * width, centerPoint[1] - width / 2 + 0.302f * width,
        centerPoint[0]  - width / 2 + 0.341f * width, centerPoint[1] - width / 2 + 0.298f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.343f * width, centerPoint[1] - width / 2 + 0.295f * width,
        centerPoint[0]  - width / 2 + 0.369f * width, centerPoint[1] - width / 2 + 0.279f * width,
        centerPoint[0]  - width / 2 + 0.369f * width, centerPoint[1] - width / 2 + 0.274f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.369f * width, centerPoint[1] - width / 2 + 0.269f * width,
        centerPoint[0]  - width / 2 + 0.361f * width, centerPoint[1] - width / 2 + 0.265f * width,
        centerPoint[0]  - width / 2 + 0.369f * width, centerPoint[1] - width / 2 + 0.26f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.377f * width, centerPoint[1] - width / 2 + 0.256f * width,
        centerPoint[0]  - width / 2 + 0.408f * width, centerPoint[1] - width / 2 + 0.228f * width,
        centerPoint[0]  - width / 2 + 0.408f * width, centerPoint[1] - width / 2 + 0.228f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.408f * width, centerPoint[1] - width / 2 + 0.228f * width,
        centerPoint[0]  - width / 2 + 0.411f * width, centerPoint[1] - width / 2 + 0.221f * width,
        centerPoint[0]  - width / 2 + 0.416f * width, centerPoint[1] - width / 2 + 0.22f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.422f * width, centerPoint[1] - width / 2 + 0.219f * width,
        centerPoint[0]  - width / 2 + 0.444f * width, centerPoint[1] - width / 2 + 0.219f * width,
        centerPoint[0]  - width / 2 + 0.447f * width, centerPoint[1] - width / 2 + 0.219f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.45f * width, centerPoint[1] - width / 2 + 0.219f * width,
        centerPoint[0]  - width / 2 + 0.429f * width, centerPoint[1] - width / 2 + 0.188f * width,
        centerPoint[0]  - width / 2 + 0.417f * width, centerPoint[1] - width / 2 + 0.17f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.413f * width, centerPoint[1] - width / 2 + 0.165f * width,
        centerPoint[0]  - width / 2 + 0.411f * width, centerPoint[1] - width / 2 + 0.16f * width,
        centerPoint[0]  - width / 2 + 0.411f * width, centerPoint[1] - width / 2 + 0.16f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.413f * width, centerPoint[1] - width / 2 + 0.156f * width,
        centerPoint[0]  - width / 2 + 0.417f * width, centerPoint[1] - width / 2 + 0.152f * width,
        centerPoint[0]  - width / 2 + 0.423f * width, centerPoint[1] - width / 2 + 0.153f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.423f * width, centerPoint[1] - width / 2 + 0.153f * width,
        centerPoint[0]  - width / 2 + 0.464f * width, centerPoint[1] - width / 2 + 0.215f * width,
        centerPoint[0]  - width / 2 + 0.464f * width, centerPoint[1] - width / 2 + 0.215f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.464f * width, centerPoint[1] - width / 2 + 0.215f * width,
        centerPoint[0]  - width / 2 + 0.471f * width, centerPoint[1] - width / 2 + 0.203f * width,
        centerPoint[0]  - width / 2 + 0.471f * width, centerPoint[1] - width / 2 + 0.203f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.471f * width, centerPoint[1] - width / 2 + 0.203f * width,
        centerPoint[0]  - width / 2 + 0.463f * width, centerPoint[1] - width / 2 + 0.196f * width,
        centerPoint[0]  - width / 2 + 0.467f * width, centerPoint[1] - width / 2 + 0.193f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.47f * width, centerPoint[1] - width / 2 + 0.189f * width,
        centerPoint[0]  - width / 2 + 0.476f * width, centerPoint[1] - width / 2 + 0.186f * width,
        centerPoint[0]  - width / 2 + 0.476f * width, centerPoint[1] - width / 2 + 0.186f * width
    );

    return path;
  }
}
