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
public class ViolinPath {

  public static Path getViolinPath(float width, float[] centerPoint){
    Path path = new Path();

    path.moveTo(centerPoint[0]  - width / 2 + 0.97f * width, centerPoint[1] - width / 2 + 0.193f * width);
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.968f * width, centerPoint[1] - width / 2 + 0.184f * width,
        centerPoint[0]  - width / 2 + 0.962f * width, centerPoint[1] - width / 2 + 0.18f * width,
        centerPoint[0]  - width / 2 + 0.957f * width, centerPoint[1] - width / 2 + 0.18f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.952f * width, centerPoint[1] - width / 2 + 0.179f * width,
        centerPoint[0]  - width / 2 + 0.947f * width, centerPoint[1] - width / 2 + 0.184f * width,
        centerPoint[0]  - width / 2 + 0.945f * width, centerPoint[1] - width / 2 + 0.185f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.942f * width, centerPoint[1] - width / 2 + 0.186f * width,
        centerPoint[0]  - width / 2 + 0.927f * width, centerPoint[1] - width / 2 + 0.172f * width,
        centerPoint[0]  - width / 2 + 0.927f * width, centerPoint[1] - width / 2 + 0.172f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.934f * width, centerPoint[1] - width / 2 + 0.166f * width,
        centerPoint[0]  - width / 2 + 0.941f * width, centerPoint[1] - width / 2 + 0.148f * width,
        centerPoint[0]  - width / 2 + 0.941f * width, centerPoint[1] - width / 2 + 0.148f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.941f * width, centerPoint[1] - width / 2 + 0.148f * width,
        centerPoint[0]  - width / 2 + 0.946f * width, centerPoint[1] - width / 2 + 0.15f * width,
        centerPoint[0]  - width / 2 + 0.952f * width, centerPoint[1] - width / 2 + 0.143f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.959f * width, centerPoint[1] - width / 2 + 0.136f * width,
        centerPoint[0]  - width / 2 + 0.956f * width, centerPoint[1] - width / 2 + 0.131f * width,
        centerPoint[0]  - width / 2 + 0.951f * width, centerPoint[1] - width / 2 + 0.127f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.954f * width, centerPoint[1] - width / 2 + 0.121f * width,
        centerPoint[0]  - width / 2 + 0.956f * width, centerPoint[1] - width / 2 + 0.108f * width,
        centerPoint[0]  - width / 2 + 0.956f * width, centerPoint[1] - width / 2 + 0.104f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.956f * width, centerPoint[1] - width / 2 + 0.1f * width,
        centerPoint[0]  - width / 2 + 0.953f * width, centerPoint[1] - width / 2 + 0.096f * width,
        centerPoint[0]  - width / 2 + 0.951f * width, centerPoint[1] - width / 2 + 0.097f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.948f * width, centerPoint[1] - width / 2 + 0.097f * width,
        centerPoint[0]  - width / 2 + 0.945f * width, centerPoint[1] - width / 2 + 0.093f * width,
        centerPoint[0]  - width / 2 + 0.944f * width, centerPoint[1] - width / 2 + 0.092f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.943f * width, centerPoint[1] - width / 2 + 0.09f * width,
        centerPoint[0]  - width / 2 + 0.94f * width, centerPoint[1] - width / 2 + 0.088f * width,
        centerPoint[0]  - width / 2 + 0.934f * width, centerPoint[1] - width / 2 + 0.088f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.934f * width, centerPoint[1] - width / 2 + 0.085f * width,
        centerPoint[0]  - width / 2 + 0.928f * width, centerPoint[1] - width / 2 + 0.083f * width,
        centerPoint[0]  - width / 2 + 0.922f * width, centerPoint[1] - width / 2 + 0.087f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.917f * width, centerPoint[1] - width / 2 + 0.09f * width,
        centerPoint[0]  - width / 2 + 0.907f * width, centerPoint[1] - width / 2 + 0.1f * width,
        centerPoint[0]  - width / 2 + 0.907f * width, centerPoint[1] - width / 2 + 0.1f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.907f * width, centerPoint[1] - width / 2 + 0.1f * width,
        centerPoint[0]  - width / 2 + 0.903f * width, centerPoint[1] - width / 2 + 0.098f * width,
        centerPoint[0]  - width / 2 + 0.903f * width, centerPoint[1] - width / 2 + 0.098f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.903f * width, centerPoint[1] - width / 2 + 0.098f * width,
        centerPoint[0]  - width / 2 + 0.899f * width, centerPoint[1] - width / 2 + 0.099f * width,
        centerPoint[0]  - width / 2 + 0.895f * width, centerPoint[1] - width / 2 + 0.103f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.892f * width, centerPoint[1] - width / 2 + 0.107f * width,
        centerPoint[0]  - width / 2 + 0.89f * width, centerPoint[1] - width / 2 + 0.112f * width,
        centerPoint[0]  - width / 2 + 0.889f * width, centerPoint[1] - width / 2 + 0.114f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.888f * width, centerPoint[1] - width / 2 + 0.116f * width,
        centerPoint[0]  - width / 2 + 0.891f * width, centerPoint[1] - width / 2 + 0.117f * width,
        centerPoint[0]  - width / 2 + 0.892f * width, centerPoint[1] - width / 2 + 0.118f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.893f * width, centerPoint[1] - width / 2 + 0.12f * width,
        centerPoint[0]  - width / 2 + 0.891f * width, centerPoint[1] - width / 2 + 0.122f * width,
        centerPoint[0]  - width / 2 + 0.89f * width, centerPoint[1] - width / 2 + 0.124f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.888f * width, centerPoint[1] - width / 2 + 0.125f * width,
        centerPoint[0]  - width / 2 + 0.887f * width, centerPoint[1] - width / 2 + 0.127f * width,
        centerPoint[0]  - width / 2 + 0.889f * width, centerPoint[1] - width / 2 + 0.128f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.891f * width, centerPoint[1] - width / 2 + 0.13f * width,
        centerPoint[0]  - width / 2 + 0.899f * width, centerPoint[1] - width / 2 + 0.138f * width,
        centerPoint[0]  - width / 2 + 0.899f * width, centerPoint[1] - width / 2 + 0.138f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.899f * width, centerPoint[1] - width / 2 + 0.138f * width,
        centerPoint[0]  - width / 2 + 0.897f * width, centerPoint[1] - width / 2 + 0.142f * width,
        centerPoint[0]  - width / 2 + 0.896f * width, centerPoint[1] - width / 2 + 0.143f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.894f * width, centerPoint[1] - width / 2 + 0.144f * width,
        centerPoint[0]  - width / 2 + 0.889f * width, centerPoint[1] - width / 2 + 0.141f * width,
        centerPoint[0]  - width / 2 + 0.878f * width, centerPoint[1] - width / 2 + 0.138f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.868f * width, centerPoint[1] - width / 2 + 0.135f * width,
        centerPoint[0]  - width / 2 + 0.852f * width, centerPoint[1] - width / 2 + 0.136f * width,
        centerPoint[0]  - width / 2 + 0.852f * width, centerPoint[1] - width / 2 + 0.136f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.852f * width, centerPoint[1] - width / 2 + 0.136f * width,
        centerPoint[0]  - width / 2 + 0.848f * width, centerPoint[1] - width / 2 + 0.132f * width,
        centerPoint[0]  - width / 2 + 0.847f * width, centerPoint[1] - width / 2 + 0.131f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.845f * width, centerPoint[1] - width / 2 + 0.13f * width,
        centerPoint[0]  - width / 2 + 0.843f * width, centerPoint[1] - width / 2 + 0.126f * width,
        centerPoint[0]  - width / 2 + 0.843f * width, centerPoint[1] - width / 2 + 0.12f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.844f * width, centerPoint[1] - width / 2 + 0.113f * width,
        centerPoint[0]  - width / 2 + 0.834f * width, centerPoint[1] - width / 2 + 0.111f * width,
        centerPoint[0]  - width / 2 + 0.827f * width, centerPoint[1] - width / 2 + 0.112f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.82f * width, centerPoint[1] - width / 2 + 0.113f * width,
        centerPoint[0]  - width / 2 + 0.815f * width, centerPoint[1] - width / 2 + 0.117f * width,
        centerPoint[0]  - width / 2 + 0.812f * width, centerPoint[1] - width / 2 + 0.122f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.808f * width, centerPoint[1] - width / 2 + 0.127f * width,
        centerPoint[0]  - width / 2 + 0.809f * width, centerPoint[1] - width / 2 + 0.138f * width,
        centerPoint[0]  - width / 2 + 0.809f * width, centerPoint[1] - width / 2 + 0.138f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.809f * width, centerPoint[1] - width / 2 + 0.138f * width,
        centerPoint[0]  - width / 2 + 0.807f * width, centerPoint[1] - width / 2 + 0.139f * width,
        centerPoint[0]  - width / 2 + 0.805f * width, centerPoint[1] - width / 2 + 0.137f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.804f * width, centerPoint[1] - width / 2 + 0.135f * width,
        centerPoint[0]  - width / 2 + 0.805f * width, centerPoint[1] - width / 2 + 0.128f * width,
        centerPoint[0]  - width / 2 + 0.805f * width, centerPoint[1] - width / 2 + 0.124f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.805f * width, centerPoint[1] - width / 2 + 0.121f * width,
        centerPoint[0]  - width / 2 + 0.787f * width, centerPoint[1] - width / 2 + 0.114f * width,
        centerPoint[0]  - width / 2 + 0.781f * width, centerPoint[1] - width / 2 + 0.118f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.77f * width, centerPoint[1] - width / 2 + 0.125f * width,
        centerPoint[0]  - width / 2 + 0.774f * width, centerPoint[1] - width / 2 + 0.144f * width,
        centerPoint[0]  - width / 2 + 0.778f * width, centerPoint[1] - width / 2 + 0.147f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.781f * width, centerPoint[1] - width / 2 + 0.15f * width,
        centerPoint[0]  - width / 2 + 0.787f * width, centerPoint[1] - width / 2 + 0.156f * width,
        centerPoint[0]  - width / 2 + 0.792f * width, centerPoint[1] - width / 2 + 0.155f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.797f * width, centerPoint[1] - width / 2 + 0.154f * width,
        centerPoint[0]  - width / 2 + 0.795f * width, centerPoint[1] - width / 2 + 0.151f * width,
        centerPoint[0]  - width / 2 + 0.798f * width, centerPoint[1] - width / 2 + 0.15f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.8f * width, centerPoint[1] - width / 2 + 0.149f * width,
        centerPoint[0]  - width / 2 + 0.8f * width, centerPoint[1] - width / 2 + 0.151f * width,
        centerPoint[0]  - width / 2 + 0.811f * width, centerPoint[1] - width / 2 + 0.156f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.806f * width, centerPoint[1] - width / 2 + 0.16f * width,
        centerPoint[0]  - width / 2 + 0.691f * width, centerPoint[1] - width / 2 + 0.238f * width,
        centerPoint[0]  - width / 2 + 0.628f * width, centerPoint[1] - width / 2 + 0.28f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.574f * width, centerPoint[1] - width / 2 + 0.25f * width,
        centerPoint[0]  - width / 2 + 0.515f * width, centerPoint[1] - width / 2 + 0.256f * width,
        centerPoint[0]  - width / 2 + 0.487f * width, centerPoint[1] - width / 2 + 0.267f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.458f * width, centerPoint[1] - width / 2 + 0.278f * width,
        centerPoint[0]  - width / 2 + 0.425f * width, centerPoint[1] - width / 2 + 0.308f * width,
        centerPoint[0]  - width / 2 + 0.415f * width, centerPoint[1] - width / 2 + 0.322f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.406f * width, centerPoint[1] - width / 2 + 0.336f * width,
        centerPoint[0]  - width / 2 + 0.394f * width, centerPoint[1] - width / 2 + 0.353f * width,
        centerPoint[0]  - width / 2 + 0.385f * width, centerPoint[1] - width / 2 + 0.36f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.377f * width, centerPoint[1] - width / 2 + 0.367f * width,
        centerPoint[0]  - width / 2 + 0.362f * width, centerPoint[1] - width / 2 + 0.364f * width,
        centerPoint[0]  - width / 2 + 0.362f * width, centerPoint[1] - width / 2 + 0.364f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.362f * width, centerPoint[1] - width / 2 + 0.364f * width,
        centerPoint[0]  - width / 2 + 0.359f * width, centerPoint[1] - width / 2 + 0.375f * width,
        centerPoint[0]  - width / 2 + 0.359f * width, centerPoint[1] - width / 2 + 0.375f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.359f * width, centerPoint[1] - width / 2 + 0.375f * width,
        centerPoint[0]  - width / 2 + 0.364f * width, centerPoint[1] - width / 2 + 0.376f * width,
        centerPoint[0]  - width / 2 + 0.367f * width, centerPoint[1] - width / 2 + 0.379f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.37f * width, centerPoint[1] - width / 2 + 0.382f * width,
        centerPoint[0]  - width / 2 + 0.373f * width, centerPoint[1] - width / 2 + 0.394f * width,
        centerPoint[0]  - width / 2 + 0.372f * width, centerPoint[1] - width / 2 + 0.402f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.372f * width, centerPoint[1] - width / 2 + 0.41f * width,
        centerPoint[0]  - width / 2 + 0.371f * width, centerPoint[1] - width / 2 + 0.417f * width,
        centerPoint[0]  - width / 2 + 0.362f * width, centerPoint[1] - width / 2 + 0.426f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.353f * width, centerPoint[1] - width / 2 + 0.436f * width,
        centerPoint[0]  - width / 2 + 0.318f * width, centerPoint[1] - width / 2 + 0.46f * width,
        centerPoint[0]  - width / 2 + 0.296f * width, centerPoint[1] - width / 2 + 0.47f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.273f * width, centerPoint[1] - width / 2 + 0.48f * width,
        centerPoint[0]  - width / 2 + 0.256f * width, centerPoint[1] - width / 2 + 0.478f * width,
        centerPoint[0]  - width / 2 + 0.245f * width, centerPoint[1] - width / 2 + 0.475f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.235f * width, centerPoint[1] - width / 2 + 0.473f * width,
        centerPoint[0]  - width / 2 + 0.23f * width, centerPoint[1] - width / 2 + 0.457f * width,
        centerPoint[0]  - width / 2 + 0.23f * width, centerPoint[1] - width / 2 + 0.457f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.23f * width, centerPoint[1] - width / 2 + 0.457f * width,
        centerPoint[0]  - width / 2 + 0.213f * width, centerPoint[1] - width / 2 + 0.459f * width,
        centerPoint[0]  - width / 2 + 0.213f * width, centerPoint[1] - width / 2 + 0.459f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.213f * width, centerPoint[1] - width / 2 + 0.459f * width,
        centerPoint[0]  - width / 2 + 0.212f * width, centerPoint[1] - width / 2 + 0.463f * width,
        centerPoint[0]  - width / 2 + 0.212f * width, centerPoint[1] - width / 2 + 0.469f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.213f * width, centerPoint[1] - width / 2 + 0.475f * width,
        centerPoint[0]  - width / 2 + 0.195f * width, centerPoint[1] - width / 2 + 0.485f * width,
        centerPoint[0]  - width / 2 + 0.178f * width, centerPoint[1] - width / 2 + 0.493f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.097f * width, centerPoint[1] - width / 2 + 0.531f * width,
        centerPoint[0]  - width / 2 + 0.078f * width, centerPoint[1] - width / 2 + 0.557f * width,
        centerPoint[0]  - width / 2 + 0.069f * width, centerPoint[1] - width / 2 + 0.57f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.069f * width, centerPoint[1] - width / 2 + 0.57f * width,
        centerPoint[0]  - width / 2 + 0.061f * width, centerPoint[1] - width / 2 + 0.568f * width,
        centerPoint[0]  - width / 2 + 0.056f * width, centerPoint[1] - width / 2 + 0.569f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.048f * width, centerPoint[1] - width / 2 + 0.581f * width,
        centerPoint[0]  - width / 2 + 0.029f * width, centerPoint[1] - width / 2 + 0.605f * width,
        centerPoint[0]  - width / 2 + 0.03f * width, centerPoint[1] - width / 2 + 0.66f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.032f * width, centerPoint[1] - width / 2 + 0.714f * width,
        centerPoint[0]  - width / 2 + 0.069f * width, centerPoint[1] - width / 2 + 0.764f * width,
        centerPoint[0]  - width / 2 + 0.069f * width, centerPoint[1] - width / 2 + 0.764f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.069f * width, centerPoint[1] - width / 2 + 0.764f * width,
        centerPoint[0]  - width / 2 + 0.066f * width, centerPoint[1] - width / 2 + 0.767f * width,
        centerPoint[0]  - width / 2 + 0.065f * width, centerPoint[1] - width / 2 + 0.771f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.064f * width, centerPoint[1] - width / 2 + 0.774f * width,
        centerPoint[0]  - width / 2 + 0.085f * width, centerPoint[1] - width / 2 + 0.799f * width,
        centerPoint[0]  - width / 2 + 0.085f * width, centerPoint[1] - width / 2 + 0.799f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.085f * width, centerPoint[1] - width / 2 + 0.799f * width,
        centerPoint[0]  - width / 2 + 0.093f * width, centerPoint[1] - width / 2 + 0.809f * width,
        centerPoint[0]  - width / 2 + 0.093f * width, centerPoint[1] - width / 2 + 0.809f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.093f * width, centerPoint[1] - width / 2 + 0.809f * width,
        centerPoint[0]  - width / 2 + 0.094f * width, centerPoint[1] - width / 2 + 0.813f * width,
        centerPoint[0]  - width / 2 + 0.092f * width, centerPoint[1] - width / 2 + 0.813f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.089f * width, centerPoint[1] - width / 2 + 0.812f * width,
        centerPoint[0]  - width / 2 + 0.088f * width, centerPoint[1] - width / 2 + 0.816f * width,
        centerPoint[0]  - width / 2 + 0.091f * width, centerPoint[1] - width / 2 + 0.821f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.095f * width, centerPoint[1] - width / 2 + 0.826f * width,
        centerPoint[0]  - width / 2 + 0.106f * width, centerPoint[1] - width / 2 + 0.838f * width,
        centerPoint[0]  - width / 2 + 0.11f * width, centerPoint[1] - width / 2 + 0.836f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.114f * width, centerPoint[1] - width / 2 + 0.835f * width,
        centerPoint[0]  - width / 2 + 0.113f * width, centerPoint[1] - width / 2 + 0.828f * width,
        centerPoint[0]  - width / 2 + 0.115f * width, centerPoint[1] - width / 2 + 0.825f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.115f * width, centerPoint[1] - width / 2 + 0.825f * width,
        centerPoint[0]  - width / 2 + 0.121f * width, centerPoint[1] - width / 2 + 0.832f * width,
        centerPoint[0]  - width / 2 + 0.121f * width, centerPoint[1] - width / 2 + 0.832f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.121f * width, centerPoint[1] - width / 2 + 0.832f * width,
        centerPoint[0]  - width / 2 + 0.12f * width, centerPoint[1] - width / 2 + 0.836f * width,
        centerPoint[0]  - width / 2 + 0.12f * width, centerPoint[1] - width / 2 + 0.836f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.12f * width, centerPoint[1] - width / 2 + 0.836f * width,
        centerPoint[0]  - width / 2 + 0.151f * width, centerPoint[1] - width / 2 + 0.867f * width,
        centerPoint[0]  - width / 2 + 0.151f * width, centerPoint[1] - width / 2 + 0.867f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.151f * width, centerPoint[1] - width / 2 + 0.867f * width,
        centerPoint[0]  - width / 2 + 0.152f * width, centerPoint[1] - width / 2 + 0.87f * width,
        centerPoint[0]  - width / 2 + 0.154f * width, centerPoint[1] - width / 2 + 0.865f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.259f * width, centerPoint[1] - width / 2 + 0.941f * width,
        centerPoint[0]  - width / 2 + 0.317f * width, centerPoint[1] - width / 2 + 0.915f * width,
        centerPoint[0]  - width / 2 + 0.372f * width, centerPoint[1] - width / 2 + 0.888f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.426f * width, centerPoint[1] - width / 2 + 0.86f * width,
        centerPoint[0]  - width / 2 + 0.457f * width, centerPoint[1] - width / 2 + 0.781f * width,
        centerPoint[0]  - width / 2 + 0.467f * width, centerPoint[1] - width / 2 + 0.764f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.476f * width, centerPoint[1] - width / 2 + 0.748f * width,
        centerPoint[0]  - width / 2 + 0.493f * width, centerPoint[1] - width / 2 + 0.75f * width,
        centerPoint[0]  - width / 2 + 0.493f * width, centerPoint[1] - width / 2 + 0.75f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.493f * width, centerPoint[1] - width / 2 + 0.75f * width,
        centerPoint[0]  - width / 2 + 0.499f * width, centerPoint[1] - width / 2 + 0.734f * width,
        centerPoint[0]  - width / 2 + 0.499f * width, centerPoint[1] - width / 2 + 0.734f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.499f * width, centerPoint[1] - width / 2 + 0.734f * width,
        centerPoint[0]  - width / 2 + 0.491f * width, centerPoint[1] - width / 2 + 0.735f * width,
        centerPoint[0]  - width / 2 + 0.491f * width, centerPoint[1] - width / 2 + 0.735f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.491f * width, centerPoint[1] - width / 2 + 0.735f * width,
        centerPoint[0]  - width / 2 + 0.49f * width, centerPoint[1] - width / 2 + 0.723f * width,
        centerPoint[0]  - width / 2 + 0.49f * width, centerPoint[1] - width / 2 + 0.723f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.49f * width, centerPoint[1] - width / 2 + 0.723f * width,
        centerPoint[0]  - width / 2 + 0.493f * width, centerPoint[1] - width / 2 + 0.722f * width,
        centerPoint[0]  - width / 2 + 0.493f * width, centerPoint[1] - width / 2 + 0.722f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.493f * width, centerPoint[1] - width / 2 + 0.722f * width,
        centerPoint[0]  - width / 2 + 0.494f * width, centerPoint[1] - width / 2 + 0.712f * width,
        centerPoint[0]  - width / 2 + 0.496f * width, centerPoint[1] - width / 2 + 0.708f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.485f * width, centerPoint[1] - width / 2 + 0.706f * width,
        centerPoint[0]  - width / 2 + 0.477f * width, centerPoint[1] - width / 2 + 0.698f * width,
        centerPoint[0]  - width / 2 + 0.475f * width, centerPoint[1] - width / 2 + 0.695f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.473f * width, centerPoint[1] - width / 2 + 0.692f * width,
        centerPoint[0]  - width / 2 + 0.474f * width, centerPoint[1] - width / 2 + 0.682f * width,
        centerPoint[0]  - width / 2 + 0.48f * width, centerPoint[1] - width / 2 + 0.666f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.487f * width, centerPoint[1] - width / 2 + 0.65f * width,
        centerPoint[0]  - width / 2 + 0.518f * width, centerPoint[1] - width / 2 + 0.62f * width,
        centerPoint[0]  - width / 2 + 0.531f * width, centerPoint[1] - width / 2 + 0.608f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.543f * width, centerPoint[1] - width / 2 + 0.596f * width,
        centerPoint[0]  - width / 2 + 0.567f * width, centerPoint[1] - width / 2 + 0.59f * width,
        centerPoint[0]  - width / 2 + 0.576f * width, centerPoint[1] - width / 2 + 0.594f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.586f * width, centerPoint[1] - width / 2 + 0.599f * width,
        centerPoint[0]  - width / 2 + 0.592f * width, centerPoint[1] - width / 2 + 0.611f * width,
        centerPoint[0]  - width / 2 + 0.592f * width, centerPoint[1] - width / 2 + 0.611f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.592f * width, centerPoint[1] - width / 2 + 0.611f * width,
        centerPoint[0]  - width / 2 + 0.608f * width, centerPoint[1] - width / 2 + 0.605f * width,
        centerPoint[0]  - width / 2 + 0.608f * width, centerPoint[1] - width / 2 + 0.605f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.608f * width, centerPoint[1] - width / 2 + 0.605f * width,
        centerPoint[0]  - width / 2 + 0.607f * width, centerPoint[1] - width / 2 + 0.603f * width,
        centerPoint[0]  - width / 2 + 0.608f * width, centerPoint[1] - width / 2 + 0.596f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.608f * width, centerPoint[1] - width / 2 + 0.589f * width,
        centerPoint[0]  - width / 2 + 0.627f * width, centerPoint[1] - width / 2 + 0.576f * width,
        centerPoint[0]  - width / 2 + 0.659f * width, centerPoint[1] - width / 2 + 0.559f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.725f * width, centerPoint[1] - width / 2 + 0.526f * width,
        centerPoint[0]  - width / 2 + 0.737f * width, centerPoint[1] - width / 2 + 0.463f * width,
        centerPoint[0]  - width / 2 + 0.736f * width, centerPoint[1] - width / 2 + 0.447f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.746f * width, centerPoint[1] - width / 2 + 0.412f * width,
        centerPoint[0]  - width / 2 + 0.734f * width, centerPoint[1] - width / 2 + 0.378f * width,
        centerPoint[0]  - width / 2 + 0.726f * width, centerPoint[1] - width / 2 + 0.366f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.718f * width, centerPoint[1] - width / 2 + 0.354f * width,
        centerPoint[0]  - width / 2 + 0.695f * width, centerPoint[1] - width / 2 + 0.325f * width,
        centerPoint[0]  - width / 2 + 0.695f * width, centerPoint[1] - width / 2 + 0.325f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.695f * width, centerPoint[1] - width / 2 + 0.325f * width,
        centerPoint[0]  - width / 2 + 0.708f * width, centerPoint[1] - width / 2 + 0.306f * width,
        centerPoint[0]  - width / 2 + 0.714f * width, centerPoint[1] - width / 2 + 0.301f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.719f * width, centerPoint[1] - width / 2 + 0.297f * width,
        centerPoint[0]  - width / 2 + 0.803f * width, centerPoint[1] - width / 2 + 0.222f * width,
        centerPoint[0]  - width / 2 + 0.815f * width, centerPoint[1] - width / 2 + 0.214f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.819f * width, centerPoint[1] - width / 2 + 0.224f * width,
        centerPoint[0]  - width / 2 + 0.837f * width, centerPoint[1] - width / 2 + 0.221f * width,
        centerPoint[0]  - width / 2 + 0.843f * width, centerPoint[1] - width / 2 + 0.219f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.85f * width, centerPoint[1] - width / 2 + 0.217f * width,
        centerPoint[0]  - width / 2 + 0.868f * width, centerPoint[1] - width / 2 + 0.202f * width,
        centerPoint[0]  - width / 2 + 0.875f * width, centerPoint[1] - width / 2 + 0.197f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.883f * width, centerPoint[1] - width / 2 + 0.191f * width,
        centerPoint[0]  - width / 2 + 0.89f * width, centerPoint[1] - width / 2 + 0.196f * width,
        centerPoint[0]  - width / 2 + 0.89f * width, centerPoint[1] - width / 2 + 0.196f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.89f * width, centerPoint[1] - width / 2 + 0.196f * width,
        centerPoint[0]  - width / 2 + 0.902f * width, centerPoint[1] - width / 2 + 0.205f * width,
        centerPoint[0]  - width / 2 + 0.902f * width, centerPoint[1] - width / 2 + 0.205f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.902f * width, centerPoint[1] - width / 2 + 0.205f * width,
        centerPoint[0]  - width / 2 + 0.904f * width, centerPoint[1] - width / 2 + 0.21f * width,
        centerPoint[0]  - width / 2 + 0.907f * width, centerPoint[1] - width / 2 + 0.212f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.909f * width, centerPoint[1] - width / 2 + 0.214f * width,
        centerPoint[0]  - width / 2 + 0.927f * width, centerPoint[1] - width / 2 + 0.225f * width,
        centerPoint[0]  - width / 2 + 0.93f * width, centerPoint[1] - width / 2 + 0.224f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.932f * width, centerPoint[1] - width / 2 + 0.224f * width,
        centerPoint[0]  - width / 2 + 0.934f * width, centerPoint[1] - width / 2 + 0.222f * width,
        centerPoint[0]  - width / 2 + 0.938f * width, centerPoint[1] - width / 2 + 0.217f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.967f * width, centerPoint[1] - width / 2 + 0.226f * width,
        centerPoint[0]  - width / 2 + 0.971f * width, centerPoint[1] - width / 2 + 0.202f * width,
        centerPoint[0]  - width / 2 + 0.97f * width, centerPoint[1] - width / 2 + 0.193f * width
    );
    return path;

  }

}
