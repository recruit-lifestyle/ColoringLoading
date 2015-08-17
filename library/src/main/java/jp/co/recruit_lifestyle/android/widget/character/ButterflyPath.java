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
public class ButterflyPath {
  public static Path getButterflyPath(float width, float[] centerPoint){
    Path path = new Path();

    path.moveTo(centerPoint[0]  - width / 2 + 0.501f * width, centerPoint[1] - width / 2 + 0.666f * width);
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.47f * width, centerPoint[1] - width / 2 + 0.668f * width,
        centerPoint[0]  - width / 2 + 0.48f * width, centerPoint[1] - width / 2 + 0.548f * width,
        centerPoint[0]  - width / 2 + 0.479f * width, centerPoint[1] - width / 2 + 0.545f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.478f * width, centerPoint[1] - width / 2 + 0.541f * width,
        centerPoint[0]  - width / 2 + 0.479f * width, centerPoint[1] - width / 2 + 0.534f * width,
        centerPoint[0]  - width / 2 + 0.478f * width, centerPoint[1] - width / 2 + 0.532f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.476f * width, centerPoint[1] - width / 2 + 0.529f * width,
        centerPoint[0]  - width / 2 + 0.467f * width, centerPoint[1] - width / 2 + 0.54f * width,
        centerPoint[0]  - width / 2 + 0.447f * width, centerPoint[1] - width / 2 + 0.572f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.427f * width, centerPoint[1] - width / 2 + 0.605f * width,
        centerPoint[0]  - width / 2 + 0.378f * width, centerPoint[1] - width / 2 + 0.729f * width,
        centerPoint[0]  - width / 2 + 0.369f * width, centerPoint[1] - width / 2 + 0.734f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.361f * width, centerPoint[1] - width / 2 + 0.739f * width,
        centerPoint[0]  - width / 2 + 0.352f * width, centerPoint[1] - width / 2 + 0.733f * width,
        centerPoint[0]  - width / 2 + 0.348f * width, centerPoint[1] - width / 2 + 0.733f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.344f * width, centerPoint[1] - width / 2 + 0.732f * width,
        centerPoint[0]  - width / 2 + 0.341f * width, centerPoint[1] - width / 2 + 0.739f * width,
        centerPoint[0]  - width / 2 + 0.341f * width, centerPoint[1] - width / 2 + 0.755f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.341f * width, centerPoint[1] - width / 2 + 0.77f * width,
        centerPoint[0]  - width / 2 + 0.319f * width, centerPoint[1] - width / 2 + 0.787f * width,
        centerPoint[0]  - width / 2 + 0.31f * width, centerPoint[1] - width / 2 + 0.785f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.302f * width, centerPoint[1] - width / 2 + 0.783f * width,
        centerPoint[0]  - width / 2 + 0.303f * width, centerPoint[1] - width / 2 + 0.757f * width,
        centerPoint[0]  - width / 2 + 0.295f * width, centerPoint[1] - width / 2 + 0.755f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.287f * width, centerPoint[1] - width / 2 + 0.752f * width,
        centerPoint[0]  - width / 2 + 0.275f * width, centerPoint[1] - width / 2 + 0.77f * width,
        centerPoint[0]  - width / 2 + 0.271f * width, centerPoint[1] - width / 2 + 0.77f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.266f * width, centerPoint[1] - width / 2 + 0.77f * width,
        centerPoint[0]  - width / 2 + 0.266f * width, centerPoint[1] - width / 2 + 0.764f * width,
        centerPoint[0]  - width / 2 + 0.264f * width, centerPoint[1] - width / 2 + 0.755f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.263f * width, centerPoint[1] - width / 2 + 0.745f * width,
        centerPoint[0]  - width / 2 + 0.262f * width, centerPoint[1] - width / 2 + 0.744f * width,
        centerPoint[0]  - width / 2 + 0.252f * width, centerPoint[1] - width / 2 + 0.743f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.241f * width, centerPoint[1] - width / 2 + 0.743f * width,
        centerPoint[0]  - width / 2 + 0.206f * width, centerPoint[1] - width / 2 + 0.774f * width,
        centerPoint[0]  - width / 2 + 0.188f * width, centerPoint[1] - width / 2 + 0.803f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.17f * width, centerPoint[1] - width / 2 + 0.832f * width,
        centerPoint[0]  - width / 2 + 0.119f * width, centerPoint[1] - width / 2 + 0.857f * width,
        centerPoint[0]  - width / 2 + 0.109f * width, centerPoint[1] - width / 2 + 0.844f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.098f * width, centerPoint[1] - width / 2 + 0.831f * width,
        centerPoint[0]  - width / 2 + 0.111f * width, centerPoint[1] - width / 2 + 0.82f * width,
        centerPoint[0]  - width / 2 + 0.126f * width, centerPoint[1] - width / 2 + 0.803f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.141f * width, centerPoint[1] - width / 2 + 0.786f * width,
        centerPoint[0]  - width / 2 + 0.175f * width, centerPoint[1] - width / 2 + 0.765f * width,
        centerPoint[0]  - width / 2 + 0.188f * width, centerPoint[1] - width / 2 + 0.757f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.2f * width, centerPoint[1] - width / 2 + 0.749f * width,
        centerPoint[0]  - width / 2 + 0.23f * width, centerPoint[1] - width / 2 + 0.723f * width,
        centerPoint[0]  - width / 2 + 0.241f * width, centerPoint[1] - width / 2 + 0.701f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.252f * width, centerPoint[1] - width / 2 + 0.678f * width,
        centerPoint[0]  - width / 2 + 0.234f * width, centerPoint[1] - width / 2 + 0.669f * width,
        centerPoint[0]  - width / 2 + 0.224f * width, centerPoint[1] - width / 2 + 0.663f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.214f * width, centerPoint[1] - width / 2 + 0.656f * width,
        centerPoint[0]  - width / 2 + 0.225f * width, centerPoint[1] - width / 2 + 0.641f * width,
        centerPoint[0]  - width / 2 + 0.229f * width, centerPoint[1] - width / 2 + 0.634f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.232f * width, centerPoint[1] - width / 2 + 0.628f * width,
        centerPoint[0]  - width / 2 + 0.23f * width, centerPoint[1] - width / 2 + 0.62f * width,
        centerPoint[0]  - width / 2 + 0.223f * width, centerPoint[1] - width / 2 + 0.616f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.215f * width, centerPoint[1] - width / 2 + 0.612f * width,
        centerPoint[0]  - width / 2 + 0.207f * width, centerPoint[1] - width / 2 + 0.599f * width,
        centerPoint[0]  - width / 2 + 0.208f * width, centerPoint[1] - width / 2 + 0.59f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.21f * width, centerPoint[1] - width / 2 + 0.582f * width,
        centerPoint[0]  - width / 2 + 0.213f * width, centerPoint[1] - width / 2 + 0.578f * width,
        centerPoint[0]  - width / 2 + 0.212f * width, centerPoint[1] - width / 2 + 0.574f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.211f * width, centerPoint[1] - width / 2 + 0.569f * width,
        centerPoint[0]  - width / 2 + 0.199f * width, centerPoint[1] - width / 2 + 0.562f * width,
        centerPoint[0]  - width / 2 + 0.196f * width, centerPoint[1] - width / 2 + 0.555f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.193f * width, centerPoint[1] - width / 2 + 0.549f * width,
        centerPoint[0]  - width / 2 + 0.215f * width, centerPoint[1] - width / 2 + 0.531f * width,
        centerPoint[0]  - width / 2 + 0.217f * width, centerPoint[1] - width / 2 + 0.529f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.219f * width, centerPoint[1] - width / 2 + 0.527f * width,
        centerPoint[0]  - width / 2 + 0.22f * width, centerPoint[1] - width / 2 + 0.517f * width,
        centerPoint[0]  - width / 2 + 0.221f * width, centerPoint[1] - width / 2 + 0.511f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.222f * width, centerPoint[1] - width / 2 + 0.505f * width,
        centerPoint[0]  - width / 2 + 0.257f * width, centerPoint[1] - width / 2 + 0.488f * width,
        centerPoint[0]  - width / 2 + 0.259f * width, centerPoint[1] - width / 2 + 0.486f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.262f * width, centerPoint[1] - width / 2 + 0.483f * width,
        centerPoint[0]  - width / 2 + 0.262f * width, centerPoint[1] - width / 2 + 0.478f * width,
        centerPoint[0]  - width / 2 + 0.251f * width, centerPoint[1] - width / 2 + 0.48f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.24f * width, centerPoint[1] - width / 2 + 0.482f * width,
        centerPoint[0]  - width / 2 + 0.216f * width, centerPoint[1] - width / 2 + 0.471f * width,
        centerPoint[0]  - width / 2 + 0.207f * width, centerPoint[1] - width / 2 + 0.463f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.198f * width, centerPoint[1] - width / 2 + 0.456f * width,
        centerPoint[0]  - width / 2 + 0.188f * width, centerPoint[1] - width / 2 + 0.433f * width,
        centerPoint[0]  - width / 2 + 0.186f * width, centerPoint[1] - width / 2 + 0.425f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.184f * width, centerPoint[1] - width / 2 + 0.418f * width,
        centerPoint[0]  - width / 2 + 0.182f * width, centerPoint[1] - width / 2 + 0.414f * width,
        centerPoint[0]  - width / 2 + 0.176f * width, centerPoint[1] - width / 2 + 0.407f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.171f * width, centerPoint[1] - width / 2 + 0.401f * width,
        centerPoint[0]  - width / 2 + 0.17f * width, centerPoint[1] - width / 2 + 0.39f * width,
        centerPoint[0]  - width / 2 + 0.168f * width, centerPoint[1] - width / 2 + 0.385f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.166f * width, centerPoint[1] - width / 2 + 0.38f * width,
        centerPoint[0]  - width / 2 + 0.153f * width, centerPoint[1] - width / 2 + 0.364f * width,
        centerPoint[0]  - width / 2 + 0.149f * width, centerPoint[1] - width / 2 + 0.357f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.144f * width, centerPoint[1] - width / 2 + 0.35f * width,
        centerPoint[0]  - width / 2 + 0.146f * width, centerPoint[1] - width / 2 + 0.345f * width,
        centerPoint[0]  - width / 2 + 0.144f * width, centerPoint[1] - width / 2 + 0.34f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.143f * width, centerPoint[1] - width / 2 + 0.334f * width,
        centerPoint[0]  - width / 2 + 0.132f * width, centerPoint[1] - width / 2 + 0.322f * width,
        centerPoint[0]  - width / 2 + 0.129f * width, centerPoint[1] - width / 2 + 0.317f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.126f * width, centerPoint[1] - width / 2 + 0.311f * width,
        centerPoint[0]  - width / 2 + 0.125f * width, centerPoint[1] - width / 2 + 0.3f * width,
        centerPoint[0]  - width / 2 + 0.123f * width, centerPoint[1] - width / 2 + 0.297f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.121f * width, centerPoint[1] - width / 2 + 0.293f * width,
        centerPoint[0]  - width / 2 + 0.112f * width, centerPoint[1] - width / 2 + 0.277f * width,
        centerPoint[0]  - width / 2 + 0.11f * width, centerPoint[1] - width / 2 + 0.272f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.108f * width, centerPoint[1] - width / 2 + 0.268f * width,
        centerPoint[0]  - width / 2 + 0.104f * width, centerPoint[1] - width / 2 + 0.259f * width,
        centerPoint[0]  - width / 2 + 0.097f * width, centerPoint[1] - width / 2 + 0.251f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.091f * width, centerPoint[1] - width / 2 + 0.244f * width,
        centerPoint[0]  - width / 2 + 0.066f * width, centerPoint[1] - width / 2 + 0.2f * width,
        centerPoint[0]  - width / 2 + 0.061f * width, centerPoint[1] - width / 2 + 0.184f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.056f * width, centerPoint[1] - width / 2 + 0.168f * width,
        centerPoint[0]  - width / 2 + 0.073f * width, centerPoint[1] - width / 2 + 0.157f * width,
        centerPoint[0]  - width / 2 + 0.104f * width, centerPoint[1] - width / 2 + 0.153f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.136f * width, centerPoint[1] - width / 2 + 0.149f * width,
        centerPoint[0]  - width / 2 + 0.173f * width, centerPoint[1] - width / 2 + 0.162f * width,
        centerPoint[0]  - width / 2 + 0.223f * width, centerPoint[1] - width / 2 + 0.184f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.273f * width, centerPoint[1] - width / 2 + 0.206f * width,
        centerPoint[0]  - width / 2 + 0.316f * width, centerPoint[1] - width / 2 + 0.25f * width,
        centerPoint[0]  - width / 2 + 0.367f * width, centerPoint[1] - width / 2 + 0.3f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.418f * width, centerPoint[1] - width / 2 + 0.349f * width,
        centerPoint[0]  - width / 2 + 0.48f * width, centerPoint[1] - width / 2 + 0.462f * width,
        centerPoint[0]  - width / 2 + 0.482f * width, centerPoint[1] - width / 2 + 0.461f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.484f * width, centerPoint[1] - width / 2 + 0.461f * width,
        centerPoint[0]  - width / 2 + 0.482f * width, centerPoint[1] - width / 2 + 0.455f * width,
        centerPoint[0]  - width / 2 + 0.48f * width, centerPoint[1] - width / 2 + 0.449f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.478f * width, centerPoint[1] - width / 2 + 0.444f * width,
        centerPoint[0]  - width / 2 + 0.483f * width, centerPoint[1] - width / 2 + 0.436f * width,
        centerPoint[0]  - width / 2 + 0.483f * width, centerPoint[1] - width / 2 + 0.436f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.483f * width, centerPoint[1] - width / 2 + 0.433f * width,
        centerPoint[0]  - width / 2 + 0.484f * width, centerPoint[1] - width / 2 + 0.433f * width,
        centerPoint[0]  - width / 2 + 0.484f * width, centerPoint[1] - width / 2 + 0.433f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.484f * width, centerPoint[1] - width / 2 + 0.433f * width,
        centerPoint[0]  - width / 2 + 0.481f * width, centerPoint[1] - width / 2 + 0.427f * width,
        centerPoint[0]  - width / 2 + 0.482f * width, centerPoint[1] - width / 2 + 0.421f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.483f * width, centerPoint[1] - width / 2 + 0.416f * width,
        centerPoint[0]  - width / 2 + 0.491f * width, centerPoint[1] - width / 2 + 0.414f * width,
        centerPoint[0]  - width / 2 + 0.491f * width, centerPoint[1] - width / 2 + 0.414f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.485f * width, centerPoint[1] - width / 2 + 0.406f * width,
        centerPoint[0]  - width / 2 + 0.401f * width, centerPoint[1] - width / 2 + 0.307f * width,
        centerPoint[0]  - width / 2 + 0.401f * width, centerPoint[1] - width / 2 + 0.307f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.394f * width, centerPoint[1] - width / 2 + 0.305f * width,
        centerPoint[0]  - width / 2 + 0.385f * width, centerPoint[1] - width / 2 + 0.294f * width,
        centerPoint[0]  - width / 2 + 0.387f * width, centerPoint[1] - width / 2 + 0.293f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.389f * width, centerPoint[1] - width / 2 + 0.292f * width,
        centerPoint[0]  - width / 2 + 0.392f * width, centerPoint[1] - width / 2 + 0.291f * width,
        centerPoint[0]  - width / 2 + 0.405f * width, centerPoint[1] - width / 2 + 0.305f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.418f * width, centerPoint[1] - width / 2 + 0.32f * width,
        centerPoint[0]  - width / 2 + 0.495f * width, centerPoint[1] - width / 2 + 0.413f * width,
        centerPoint[0]  - width / 2 + 0.495f * width, centerPoint[1] - width / 2 + 0.413f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.495f * width, centerPoint[1] - width / 2 + 0.413f * width,
        centerPoint[0]  - width / 2 + 0.498f * width, centerPoint[1] - width / 2 + 0.413f * width,
        centerPoint[0]  - width / 2 + 0.5f * width, centerPoint[1] - width / 2 + 0.413f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.502f * width, centerPoint[1] - width / 2 + 0.413f * width,
        centerPoint[0]  - width / 2 + 0.505f * width, centerPoint[1] - width / 2 + 0.413f * width,
        centerPoint[0]  - width / 2 + 0.505f * width, centerPoint[1] - width / 2 + 0.413f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.505f * width, centerPoint[1] - width / 2 + 0.413f * width,
        centerPoint[0]  - width / 2 + 0.582f * width, centerPoint[1] - width / 2 + 0.32f * width,
        centerPoint[0]  - width / 2 + 0.595f * width, centerPoint[1] - width / 2 + 0.305f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.608f * width, centerPoint[1] - width / 2 + 0.291f * width,
        centerPoint[0]  - width / 2 + 0.611f * width, centerPoint[1] - width / 2 + 0.292f * width,
        centerPoint[0]  - width / 2 + 0.613f * width, centerPoint[1] - width / 2 + 0.293f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.615f * width, centerPoint[1] - width / 2 + 0.294f * width,
        centerPoint[0]  - width / 2 + 0.606f * width, centerPoint[1] - width / 2 + 0.305f * width,
        centerPoint[0]  - width / 2 + 0.599f * width, centerPoint[1] - width / 2 + 0.307f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.599f * width, centerPoint[1] - width / 2 + 0.307f * width,
        centerPoint[0]  - width / 2 + 0.515f * width, centerPoint[1] - width / 2 + 0.406f * width,
        centerPoint[0]  - width / 2 + 0.509f * width, centerPoint[1] - width / 2 + 0.414f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.509f * width, centerPoint[1] - width / 2 + 0.414f * width,
        centerPoint[0]  - width / 2 + 0.517f * width, centerPoint[1] - width / 2 + 0.416f * width,
        centerPoint[0]  - width / 2 + 0.518f * width, centerPoint[1] - width / 2 + 0.421f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.519f * width, centerPoint[1] - width / 2 + 0.427f * width,
        centerPoint[0]  - width / 2 + 0.516f * width, centerPoint[1] - width / 2 + 0.433f * width,
        centerPoint[0]  - width / 2 + 0.516f * width, centerPoint[1] - width / 2 + 0.433f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.516f * width, centerPoint[1] - width / 2 + 0.433f * width,
        centerPoint[0]  - width / 2 + 0.517f * width, centerPoint[1] - width / 2 + 0.433f * width,
        centerPoint[0]  - width / 2 + 0.517f * width, centerPoint[1] - width / 2 + 0.436f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.517f * width, centerPoint[1] - width / 2 + 0.436f * width,
        centerPoint[0]  - width / 2 + 0.522f * width, centerPoint[1] - width / 2 + 0.444f * width,
        centerPoint[0]  - width / 2 + 0.52f * width, centerPoint[1] - width / 2 + 0.449f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.518f * width, centerPoint[1] - width / 2 + 0.455f * width,
        centerPoint[0]  - width / 2 + 0.516f * width, centerPoint[1] - width / 2 + 0.461f * width,
        centerPoint[0]  - width / 2 + 0.518f * width, centerPoint[1] - width / 2 + 0.461f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.52f * width, centerPoint[1] - width / 2 + 0.462f * width,
        centerPoint[0]  - width / 2 + 0.582f * width, centerPoint[1] - width / 2 + 0.349f * width,
        centerPoint[0]  - width / 2 + 0.633f * width, centerPoint[1] - width / 2 + 0.3f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.684f * width, centerPoint[1] - width / 2 + 0.25f * width,
        centerPoint[0]  - width / 2 + 0.727f * width, centerPoint[1] - width / 2 + 0.206f * width,
        centerPoint[0]  - width / 2 + 0.777f * width, centerPoint[1] - width / 2 + 0.184f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.827f * width, centerPoint[1] - width / 2 + 0.162f * width,
        centerPoint[0]  - width / 2 + 0.864f * width, centerPoint[1] - width / 2 + 0.149f * width,
        centerPoint[0]  - width / 2 + 0.896f * width, centerPoint[1] - width / 2 + 0.153f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.927f * width, centerPoint[1] - width / 2 + 0.157f * width,
        centerPoint[0]  - width / 2 + 0.944f * width, centerPoint[1] - width / 2 + 0.168f * width,
        centerPoint[0]  - width / 2 + 0.939f * width, centerPoint[1] - width / 2 + 0.184f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.934f * width, centerPoint[1] - width / 2 + 0.2f * width,
        centerPoint[0]  - width / 2 + 0.909f * width, centerPoint[1] - width / 2 + 0.244f * width,
        centerPoint[0]  - width / 2 + 0.903f * width, centerPoint[1] - width / 2 + 0.251f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.896f * width, centerPoint[1] - width / 2 + 0.259f * width,
        centerPoint[0]  - width / 2 + 0.892f * width, centerPoint[1] - width / 2 + 0.268f * width,
        centerPoint[0]  - width / 2 + 0.89f * width, centerPoint[1] - width / 2 + 0.272f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.888f * width, centerPoint[1] - width / 2 + 0.277f * width,
        centerPoint[0]  - width / 2 + 0.879f * width, centerPoint[1] - width / 2 + 0.293f * width,
        centerPoint[0]  - width / 2 + 0.877f * width, centerPoint[1] - width / 2 + 0.297f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.875f * width, centerPoint[1] - width / 2 + 0.3f * width,
        centerPoint[0]  - width / 2 + 0.874f * width, centerPoint[1] - width / 2 + 0.311f * width,
        centerPoint[0]  - width / 2 + 0.871f * width, centerPoint[1] - width / 2 + 0.317f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.868f * width, centerPoint[1] - width / 2 + 0.322f * width,
        centerPoint[0]  - width / 2 + 0.857f * width, centerPoint[1] - width / 2 + 0.334f * width,
        centerPoint[0]  - width / 2 + 0.856f * width, centerPoint[1] - width / 2 + 0.34f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.854f * width, centerPoint[1] - width / 2 + 0.345f * width,
        centerPoint[0]  - width / 2 + 0.856f * width, centerPoint[1] - width / 2 + 0.35f * width,
        centerPoint[0]  - width / 2 + 0.851f * width, centerPoint[1] - width / 2 + 0.357f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.847f * width, centerPoint[1] - width / 2 + 0.364f * width,
        centerPoint[0]  - width / 2 + 0.834f * width, centerPoint[1] - width / 2 + 0.38f * width,
        centerPoint[0]  - width / 2 + 0.832f * width, centerPoint[1] - width / 2 + 0.385f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.83f * width, centerPoint[1] - width / 2 + 0.39f * width,
        centerPoint[0]  - width / 2 + 0.829f * width, centerPoint[1] - width / 2 + 0.401f * width,
        centerPoint[0]  - width / 2 + 0.824f * width, centerPoint[1] - width / 2 + 0.407f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.818f * width, centerPoint[1] - width / 2 + 0.414f * width,
        centerPoint[0]  - width / 2 + 0.816f * width, centerPoint[1] - width / 2 + 0.418f * width,
        centerPoint[0]  - width / 2 + 0.814f * width, centerPoint[1] - width / 2 + 0.425f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.812f * width, centerPoint[1] - width / 2 + 0.433f * width,
        centerPoint[0]  - width / 2 + 0.802f * width, centerPoint[1] - width / 2 + 0.456f * width,
        centerPoint[0]  - width / 2 + 0.793f * width, centerPoint[1] - width / 2 + 0.463f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.784f * width, centerPoint[1] - width / 2 + 0.471f * width,
        centerPoint[0]  - width / 2 + 0.76f * width, centerPoint[1] - width / 2 + 0.482f * width,
        centerPoint[0]  - width / 2 + 0.749f * width, centerPoint[1] - width / 2 + 0.48f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.738f * width, centerPoint[1] - width / 2 + 0.478f * width,
        centerPoint[0]  - width / 2 + 0.738f * width, centerPoint[1] - width / 2 + 0.483f * width,
        centerPoint[0]  - width / 2 + 0.741f * width, centerPoint[1] - width / 2 + 0.486f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.743f * width, centerPoint[1] - width / 2 + 0.488f * width,
        centerPoint[0]  - width / 2 + 0.778f * width, centerPoint[1] - width / 2 + 0.505f * width,
        centerPoint[0]  - width / 2 + 0.779f * width, centerPoint[1] - width / 2 + 0.511f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.78f * width, centerPoint[1] - width / 2 + 0.517f * width,
        centerPoint[0]  - width / 2 + 0.781f * width, centerPoint[1] - width / 2 + 0.527f * width,
        centerPoint[0]  - width / 2 + 0.783f * width, centerPoint[1] - width / 2 + 0.529f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.785f * width, centerPoint[1] - width / 2 + 0.531f * width,
        centerPoint[0]  - width / 2 + 0.807f * width, centerPoint[1] - width / 2 + 0.549f * width,
        centerPoint[0]  - width / 2 + 0.804f * width, centerPoint[1] - width / 2 + 0.555f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.801f * width, centerPoint[1] - width / 2 + 0.562f * width,
        centerPoint[0]  - width / 2 + 0.789f * width, centerPoint[1] - width / 2 + 0.569f * width,
        centerPoint[0]  - width / 2 + 0.788f * width, centerPoint[1] - width / 2 + 0.574f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.787f * width, centerPoint[1] - width / 2 + 0.578f * width,
        centerPoint[0]  - width / 2 + 0.79f * width, centerPoint[1] - width / 2 + 0.582f * width,
        centerPoint[0]  - width / 2 + 0.792f * width, centerPoint[1] - width / 2 + 0.59f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.793f * width, centerPoint[1] - width / 2 + 0.599f * width,
        centerPoint[0]  - width / 2 + 0.785f * width, centerPoint[1] - width / 2 + 0.612f * width,
        centerPoint[0]  - width / 2 + 0.777f * width, centerPoint[1] - width / 2 + 0.616f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.77f * width, centerPoint[1] - width / 2 + 0.62f * width,
        centerPoint[0]  - width / 2 + 0.768f * width, centerPoint[1] - width / 2 + 0.628f * width,
        centerPoint[0]  - width / 2 + 0.771f * width, centerPoint[1] - width / 2 + 0.634f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.775f * width, centerPoint[1] - width / 2 + 0.641f * width,
        centerPoint[0]  - width / 2 + 0.786f * width, centerPoint[1] - width / 2 + 0.656f * width,
        centerPoint[0]  - width / 2 + 0.776f * width, centerPoint[1] - width / 2 + 0.663f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.766f * width, centerPoint[1] - width / 2 + 0.669f * width,
        centerPoint[0]  - width / 2 + 0.748f * width, centerPoint[1] - width / 2 + 0.678f * width,
        centerPoint[0]  - width / 2 + 0.759f * width, centerPoint[1] - width / 2 + 0.701f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.77f * width, centerPoint[1] - width / 2 + 0.723f * width,
        centerPoint[0]  - width / 2 + 0.8f * width, centerPoint[1] - width / 2 + 0.749f * width,
        centerPoint[0]  - width / 2 + 0.812f * width, centerPoint[1] - width / 2 + 0.757f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.825f * width, centerPoint[1] - width / 2 + 0.765f * width,
        centerPoint[0]  - width / 2 + 0.859f * width, centerPoint[1] - width / 2 + 0.786f * width,
        centerPoint[0]  - width / 2 + 0.874f * width, centerPoint[1] - width / 2 + 0.803f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.889f * width, centerPoint[1] - width / 2 + 0.82f * width,
        centerPoint[0]  - width / 2 + 0.902f * width, centerPoint[1] - width / 2 + 0.831f * width,
        centerPoint[0]  - width / 2 + 0.891f * width, centerPoint[1] - width / 2 + 0.844f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.881f * width, centerPoint[1] - width / 2 + 0.857f * width,
        centerPoint[0]  - width / 2 + 0.83f * width, centerPoint[1] - width / 2 + 0.832f * width,
        centerPoint[0]  - width / 2 + 0.812f * width, centerPoint[1] - width / 2 + 0.803f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.794f * width, centerPoint[1] - width / 2 + 0.774f * width,
        centerPoint[0]  - width / 2 + 0.759f * width, centerPoint[1] - width / 2 + 0.743f * width,
        centerPoint[0]  - width / 2 + 0.748f * width, centerPoint[1] - width / 2 + 0.743f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.738f * width, centerPoint[1] - width / 2 + 0.744f * width,
        centerPoint[0]  - width / 2 + 0.738f * width, centerPoint[1] - width / 2 + 0.745f * width,
        centerPoint[0]  - width / 2 + 0.736f * width, centerPoint[1] - width / 2 + 0.755f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.734f * width, centerPoint[1] - width / 2 + 0.764f * width,
        centerPoint[0]  - width / 2 + 0.734f * width, centerPoint[1] - width / 2 + 0.77f * width,
        centerPoint[0]  - width / 2 + 0.729f * width, centerPoint[1] - width / 2 + 0.77f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.725f * width, centerPoint[1] - width / 2 + 0.77f * width,
        centerPoint[0]  - width / 2 + 0.713f * width, centerPoint[1] - width / 2 + 0.752f * width,
        centerPoint[0]  - width / 2 + 0.705f * width, centerPoint[1] - width / 2 + 0.755f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.697f * width, centerPoint[1] - width / 2 + 0.757f * width,
        centerPoint[0]  - width / 2 + 0.698f * width, centerPoint[1] - width / 2 + 0.783f * width,
        centerPoint[0]  - width / 2 + 0.69f * width, centerPoint[1] - width / 2 + 0.785f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.681f * width, centerPoint[1] - width / 2 + 0.787f * width,
        centerPoint[0]  - width / 2 + 0.659f * width, centerPoint[1] - width / 2 + 0.77f * width,
        centerPoint[0]  - width / 2 + 0.659f * width, centerPoint[1] - width / 2 + 0.755f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.659f * width, centerPoint[1] - width / 2 + 0.739f * width,
        centerPoint[0]  - width / 2 + 0.656f * width, centerPoint[1] - width / 2 + 0.732f * width,
        centerPoint[0]  - width / 2 + 0.652f * width, centerPoint[1] - width / 2 + 0.733f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.648f * width, centerPoint[1] - width / 2 + 0.733f * width,
        centerPoint[0]  - width / 2 + 0.639f * width, centerPoint[1] - width / 2 + 0.739f * width,
        centerPoint[0]  - width / 2 + 0.631f * width, centerPoint[1] - width / 2 + 0.734f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.622f * width, centerPoint[1] - width / 2 + 0.729f * width,
        centerPoint[0]  - width / 2 + 0.573f * width, centerPoint[1] - width / 2 + 0.605f * width,
        centerPoint[0]  - width / 2 + 0.553f * width, centerPoint[1] - width / 2 + 0.572f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.533f * width, centerPoint[1] - width / 2 + 0.54f * width,
        centerPoint[0]  - width / 2 + 0.524f * width, centerPoint[1] - width / 2 + 0.529f * width,
        centerPoint[0]  - width / 2 + 0.522f * width, centerPoint[1] - width / 2 + 0.532f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.521f * width, centerPoint[1] - width / 2 + 0.534f * width,
        centerPoint[0]  - width / 2 + 0.522f * width, centerPoint[1] - width / 2 + 0.541f * width,
        centerPoint[0]  - width / 2 + 0.521f * width, centerPoint[1] - width / 2 + 0.545f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.52f * width, centerPoint[1] - width / 2 + 0.548f * width,
        centerPoint[0]  - width / 2 + 0.532f * width, centerPoint[1] - width / 2 + 0.668f * width,
        centerPoint[0]  - width / 2 + 0.501f * width, centerPoint[1] - width / 2 + 0.666f * width
    );
    return path;
  }
}
