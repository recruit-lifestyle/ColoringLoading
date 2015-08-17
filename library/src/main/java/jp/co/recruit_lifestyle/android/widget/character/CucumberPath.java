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
public class CucumberPath {

  public static Path getCucumberPath(float width, float[] centerPoint){
    Path path = new Path();

    path.moveTo(centerPoint[0]  - width / 2 + 0.772f * width, centerPoint[1] - width / 2 + 0.303f * width);
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.721f * width, centerPoint[1] - width / 2 + 0.2f * width,
        centerPoint[0]  - width / 2 + 0.636f * width, centerPoint[1] - width / 2 + 0.2f * width,
        centerPoint[0]  - width / 2 + 0.604f * width, centerPoint[1] - width / 2 + 0.2f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.596f * width, centerPoint[1] - width / 2 + 0.197f * width,
        centerPoint[0]  - width / 2 + 0.587f * width, centerPoint[1] - width / 2 + 0.199f * width,
        centerPoint[0]  - width / 2 + 0.581f * width, centerPoint[1] - width / 2 + 0.203f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.576f * width, centerPoint[1] - width / 2 + 0.201f * width,
        centerPoint[0]  - width / 2 + 0.57f * width, centerPoint[1] - width / 2 + 0.199f * width,
        centerPoint[0]  - width / 2 + 0.566f * width, centerPoint[1] - width / 2 + 0.197f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.544f * width, centerPoint[1] - width / 2 + 0.188f * width,
        centerPoint[0]  - width / 2 + 0.5f * width, centerPoint[1] - width / 2 + 0.158f * width,
        centerPoint[0]  - width / 2 + 0.499f * width, centerPoint[1] - width / 2 + 0.158f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.498f * width, centerPoint[1] - width / 2 + 0.157f * width,
        centerPoint[0]  - width / 2 + 0.494f * width, centerPoint[1] - width / 2 + 0.154f * width,
        centerPoint[0]  - width / 2 + 0.493f * width, centerPoint[1] - width / 2 + 0.151f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.493f * width, centerPoint[1] - width / 2 + 0.148f * width,
        centerPoint[0]  - width / 2 + 0.488f * width, centerPoint[1] - width / 2 + 0.145f * width,
        centerPoint[0]  - width / 2 + 0.486f * width, centerPoint[1] - width / 2 + 0.143f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.485f * width, centerPoint[1] - width / 2 + 0.141f * width,
        centerPoint[0]  - width / 2 + 0.49f * width, centerPoint[1] - width / 2 + 0.118f * width,
        centerPoint[0]  - width / 2 + 0.491f * width, centerPoint[1] - width / 2 + 0.117f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.492f * width, centerPoint[1] - width / 2 + 0.115f * width,
        centerPoint[0]  - width / 2 + 0.5f * width, centerPoint[1] - width / 2 + 0.105f * width,
        centerPoint[0]  - width / 2 + 0.5f * width, centerPoint[1] - width / 2 + 0.105f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.5f * width, centerPoint[1] - width / 2 + 0.105f * width,
        centerPoint[0]  - width / 2 + 0.501f * width, centerPoint[1] - width / 2 + 0.104f * width,
        centerPoint[0]  - width / 2 + 0.501f * width, centerPoint[1] - width / 2 + 0.104f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.501f * width, centerPoint[1] - width / 2 + 0.104f * width,
        centerPoint[0]  - width / 2 + 0.508f * width, centerPoint[1] - width / 2 + 0.118f * width,
        centerPoint[0]  - width / 2 + 0.508f * width, centerPoint[1] - width / 2 + 0.118f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.508f * width, centerPoint[1] - width / 2 + 0.118f * width,
        centerPoint[0]  - width / 2 + 0.507f * width, centerPoint[1] - width / 2 + 0.11f * width,
        centerPoint[0]  - width / 2 + 0.507f * width, centerPoint[1] - width / 2 + 0.11f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.514f * width, centerPoint[1] - width / 2 + 0.119f * width,
        centerPoint[0]  - width / 2 + 0.521f * width, centerPoint[1] - width / 2 + 0.132f * width,
        centerPoint[0]  - width / 2 + 0.522f * width, centerPoint[1] - width / 2 + 0.14f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.525f * width, centerPoint[1] - width / 2 + 0.137f * width,
        centerPoint[0]  - width / 2 + 0.52f * width, centerPoint[1] - width / 2 + 0.12f * width,
        centerPoint[0]  - width / 2 + 0.515f * width, centerPoint[1] - width / 2 + 0.105f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.522f * width, centerPoint[1] - width / 2 + 0.117f * width,
        centerPoint[0]  - width / 2 + 0.526f * width, centerPoint[1] - width / 2 + 0.127f * width,
        centerPoint[0]  - width / 2 + 0.525f * width, centerPoint[1] - width / 2 + 0.114f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.524f * width, centerPoint[1] - width / 2 + 0.111f * width,
        centerPoint[0]  - width / 2 + 0.524f * width, centerPoint[1] - width / 2 + 0.109f * width,
        centerPoint[0]  - width / 2 + 0.523f * width, centerPoint[1] - width / 2 + 0.106f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.523f * width, centerPoint[1] - width / 2 + 0.106f * width,
        centerPoint[0]  - width / 2 + 0.537f * width, centerPoint[1] - width / 2 + 0.112f * width,
        centerPoint[0]  - width / 2 + 0.537f * width, centerPoint[1] - width / 2 + 0.112f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.537f * width, centerPoint[1] - width / 2 + 0.112f * width,
        centerPoint[0]  - width / 2 + 0.521f * width, centerPoint[1] - width / 2 + 0.1f * width,
        centerPoint[0]  - width / 2 + 0.521f * width, centerPoint[1] - width / 2 + 0.1f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.52f * width, centerPoint[1] - width / 2 + 0.097f * width,
        centerPoint[0]  - width / 2 + 0.52f * width, centerPoint[1] - width / 2 + 0.095f * width,
        centerPoint[0]  - width / 2 + 0.519f * width, centerPoint[1] - width / 2 + 0.093f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.529f * width, centerPoint[1] - width / 2 + 0.101f * width,
        centerPoint[0]  - width / 2 + 0.54f * width, centerPoint[1] - width / 2 + 0.11f * width,
        centerPoint[0]  - width / 2 + 0.544f * width, centerPoint[1] - width / 2 + 0.113f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.543f * width, centerPoint[1] - width / 2 + 0.104f * width,
        centerPoint[0]  - width / 2 + 0.529f * width, centerPoint[1] - width / 2 + 0.088f * width,
        centerPoint[0]  - width / 2 + 0.518f * width, centerPoint[1] - width / 2 + 0.075f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.522f * width, centerPoint[1] - width / 2 + 0.077f * width,
        centerPoint[0]  - width / 2 + 0.527f * width, centerPoint[1] - width / 2 + 0.079f * width,
        centerPoint[0]  - width / 2 + 0.529f * width, centerPoint[1] - width / 2 + 0.079f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.528f * width, centerPoint[1] - width / 2 + 0.078f * width,
        centerPoint[0]  - width / 2 + 0.527f * width, centerPoint[1] - width / 2 + 0.076f * width,
        centerPoint[0]  - width / 2 + 0.525f * width, centerPoint[1] - width / 2 + 0.074f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.53f * width, centerPoint[1] - width / 2 + 0.077f * width,
        centerPoint[0]  - width / 2 + 0.535f * width, centerPoint[1] - width / 2 + 0.08f * width,
        centerPoint[0]  - width / 2 + 0.537f * width, centerPoint[1] - width / 2 + 0.082f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.535f * width, centerPoint[1] - width / 2 + 0.075f * width,
        centerPoint[0]  - width / 2 + 0.528f * width, centerPoint[1] - width / 2 + 0.069f * width,
        centerPoint[0]  - width / 2 + 0.52f * width, centerPoint[1] - width / 2 + 0.063f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.522f * width, centerPoint[1] - width / 2 + 0.063f * width,
        centerPoint[0]  - width / 2 + 0.523f * width, centerPoint[1] - width / 2 + 0.063f * width,
        centerPoint[0]  - width / 2 + 0.523f * width, centerPoint[1] - width / 2 + 0.063f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.523f * width, centerPoint[1] - width / 2 + 0.063f * width,
        centerPoint[0]  - width / 2 + 0.521f * width, centerPoint[1] - width / 2 + 0.062f * width,
        centerPoint[0]  - width / 2 + 0.519f * width, centerPoint[1] - width / 2 + 0.062f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.516f * width, centerPoint[1] - width / 2 + 0.06f * width,
        centerPoint[0]  - width / 2 + 0.514f * width, centerPoint[1] - width / 2 + 0.058f * width,
        centerPoint[0]  - width / 2 + 0.511f * width, centerPoint[1] - width / 2 + 0.057f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.511f * width, centerPoint[1] - width / 2 + 0.057f * width,
        centerPoint[0]  - width / 2 + 0.528f * width, centerPoint[1] - width / 2 + 0.056f * width,
        centerPoint[0]  - width / 2 + 0.528f * width, centerPoint[1] - width / 2 + 0.056f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.528f * width, centerPoint[1] - width / 2 + 0.056f * width,
        centerPoint[0]  - width / 2 + 0.503f * width, centerPoint[1] - width / 2 + 0.052f * width,
        centerPoint[0]  - width / 2 + 0.503f * width, centerPoint[1] - width / 2 + 0.052f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.503f * width, centerPoint[1] - width / 2 + 0.052f * width,
        centerPoint[0]  - width / 2 + 0.503f * width, centerPoint[1] - width / 2 + 0.052f * width,
        centerPoint[0]  - width / 2 + 0.503f * width, centerPoint[1] - width / 2 + 0.052f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.503f * width, centerPoint[1] - width / 2 + 0.052f * width,
        centerPoint[0]  - width / 2 + 0.531f * width, centerPoint[1] - width / 2 + 0.049f * width,
        centerPoint[0]  - width / 2 + 0.531f * width, centerPoint[1] - width / 2 + 0.049f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.531f * width, centerPoint[1] - width / 2 + 0.049f * width,
        centerPoint[0]  - width / 2 + 0.498f * width, centerPoint[1] - width / 2 + 0.041f * width,
        centerPoint[0]  - width / 2 + 0.498f * width, centerPoint[1] - width / 2 + 0.041f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.498f * width, centerPoint[1] - width / 2 + 0.041f * width,
        centerPoint[0]  - width / 2 + 0.509f * width, centerPoint[1] - width / 2 + 0.034f * width,
        centerPoint[0]  - width / 2 + 0.509f * width, centerPoint[1] - width / 2 + 0.034f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.509f * width, centerPoint[1] - width / 2 + 0.034f * width,
        centerPoint[0]  - width / 2 + 0.473f * width, centerPoint[1] - width / 2 + 0.027f * width,
        centerPoint[0]  - width / 2 + 0.473f * width, centerPoint[1] - width / 2 + 0.027f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.473f * width, centerPoint[1] - width / 2 + 0.027f * width,
        centerPoint[0]  - width / 2 + 0.448f * width, centerPoint[1] - width / 2 + 0.002f * width,
        centerPoint[0]  - width / 2 + 0.406f * width, centerPoint[1] - width / 2 + 0.007f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.364f * width, centerPoint[1] - width / 2 + 0.011f * width,
        centerPoint[0]  - width / 2 + 0.35f * width, centerPoint[1] - width / 2 + 0.038f * width,
        centerPoint[0]  - width / 2 + 0.35f * width, centerPoint[1] - width / 2 + 0.038f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.35f * width, centerPoint[1] - width / 2 + 0.038f * width,
        centerPoint[0]  - width / 2 + 0.33f * width, centerPoint[1] - width / 2 + 0.044f * width,
        centerPoint[0]  - width / 2 + 0.33f * width, centerPoint[1] - width / 2 + 0.044f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.33f * width, centerPoint[1] - width / 2 + 0.044f * width,
        centerPoint[0]  - width / 2 + 0.345f * width, centerPoint[1] - width / 2 + 0.044f * width,
        centerPoint[0]  - width / 2 + 0.341f * width, centerPoint[1] - width / 2 + 0.046f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.337f * width, centerPoint[1] - width / 2 + 0.048f * width,
        centerPoint[0]  - width / 2 + 0.317f * width, centerPoint[1] - width / 2 + 0.06f * width,
        centerPoint[0]  - width / 2 + 0.317f * width, centerPoint[1] - width / 2 + 0.06f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.317f * width, centerPoint[1] - width / 2 + 0.06f * width,
        centerPoint[0]  - width / 2 + 0.33f * width, centerPoint[1] - width / 2 + 0.06f * width,
        centerPoint[0]  - width / 2 + 0.33f * width, centerPoint[1] - width / 2 + 0.06f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.33f * width, centerPoint[1] - width / 2 + 0.06f * width,
        centerPoint[0]  - width / 2 + 0.305f * width, centerPoint[1] - width / 2 + 0.079f * width,
        centerPoint[0]  - width / 2 + 0.308f * width, centerPoint[1] - width / 2 + 0.08f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.311f * width, centerPoint[1] - width / 2 + 0.081f * width,
        centerPoint[0]  - width / 2 + 0.329f * width, centerPoint[1] - width / 2 + 0.073f * width,
        centerPoint[0]  - width / 2 + 0.329f * width, centerPoint[1] - width / 2 + 0.073f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.329f * width, centerPoint[1] - width / 2 + 0.073f * width,
        centerPoint[0]  - width / 2 + 0.31f * width, centerPoint[1] - width / 2 + 0.094f * width,
        centerPoint[0]  - width / 2 + 0.31f * width, centerPoint[1] - width / 2 + 0.094f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.31f * width, centerPoint[1] - width / 2 + 0.094f * width,
        centerPoint[0]  - width / 2 + 0.332f * width, centerPoint[1] - width / 2 + 0.085f * width,
        centerPoint[0]  - width / 2 + 0.332f * width, centerPoint[1] - width / 2 + 0.085f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.332f * width, centerPoint[1] - width / 2 + 0.085f * width,
        centerPoint[0]  - width / 2 + 0.333f * width, centerPoint[1] - width / 2 + 0.092f * width,
        centerPoint[0]  - width / 2 + 0.331f * width, centerPoint[1] - width / 2 + 0.096f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.329f * width, centerPoint[1] - width / 2 + 0.099f * width,
        centerPoint[0]  - width / 2 + 0.351f * width, centerPoint[1] - width / 2 + 0.079f * width,
        centerPoint[0]  - width / 2 + 0.351f * width, centerPoint[1] - width / 2 + 0.079f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.351f * width, centerPoint[1] - width / 2 + 0.079f * width,
        centerPoint[0]  - width / 2 + 0.349f * width, centerPoint[1] - width / 2 + 0.09f * width,
        centerPoint[0]  - width / 2 + 0.349f * width, centerPoint[1] - width / 2 + 0.09f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.349f * width, centerPoint[1] - width / 2 + 0.09f * width,
        centerPoint[0]  - width / 2 + 0.344f * width, centerPoint[1] - width / 2 + 0.102f * width,
        centerPoint[0]  - width / 2 + 0.344f * width, centerPoint[1] - width / 2 + 0.102f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.344f * width, centerPoint[1] - width / 2 + 0.102f * width,
        centerPoint[0]  - width / 2 + 0.342f * width, centerPoint[1] - width / 2 + 0.116f * width,
        centerPoint[0]  - width / 2 + 0.348f * width, centerPoint[1] - width / 2 + 0.122f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.354f * width, centerPoint[1] - width / 2 + 0.128f * width,
        centerPoint[0]  - width / 2 + 0.325f * width, centerPoint[1] - width / 2 + 0.145f * width,
        centerPoint[0]  - width / 2 + 0.319f * width, centerPoint[1] - width / 2 + 0.154f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.312f * width, centerPoint[1] - width / 2 + 0.162f * width,
        centerPoint[0]  - width / 2 + 0.31f * width, centerPoint[1] - width / 2 + 0.177f * width,
        centerPoint[0]  - width / 2 + 0.309f * width, centerPoint[1] - width / 2 + 0.185f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.308f * width, centerPoint[1] - width / 2 + 0.194f * width,
        centerPoint[0]  - width / 2 + 0.308f * width, centerPoint[1] - width / 2 + 0.209f * width,
        centerPoint[0]  - width / 2 + 0.313f * width, centerPoint[1] - width / 2 + 0.207f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.318f * width, centerPoint[1] - width / 2 + 0.205f * width,
        centerPoint[0]  - width / 2 + 0.336f * width, centerPoint[1] - width / 2 + 0.188f * width,
        centerPoint[0]  - width / 2 + 0.342f * width, centerPoint[1] - width / 2 + 0.186f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.378f * width, centerPoint[1] - width / 2 + 0.176f * width,
        centerPoint[0]  - width / 2 + 0.372f * width, centerPoint[1] - width / 2 + 0.181f * width,
        centerPoint[0]  - width / 2 + 0.367f * width, centerPoint[1] - width / 2 + 0.182f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.348f * width, centerPoint[1] - width / 2 + 0.184f * width,
        centerPoint[0]  - width / 2 + 0.363f * width, centerPoint[1] - width / 2 + 0.176f * width,
        centerPoint[0]  - width / 2 + 0.371f * width, centerPoint[1] - width / 2 + 0.176f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.362f * width, centerPoint[1] - width / 2 + 0.182f * width,
        centerPoint[0]  - width / 2 + 0.359f * width, centerPoint[1] - width / 2 + 0.186f * width,
        centerPoint[0]  - width / 2 + 0.359f * width, centerPoint[1] - width / 2 + 0.186f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.359f * width, centerPoint[1] - width / 2 + 0.186f * width,
        centerPoint[0]  - width / 2 + 0.364f * width, centerPoint[1] - width / 2 + 0.191f * width,
        centerPoint[0]  - width / 2 + 0.371f * width, centerPoint[1] - width / 2 + 0.192f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.378f * width, centerPoint[1] - width / 2 + 0.193f * width,
        centerPoint[0]  - width / 2 + 0.4f * width, centerPoint[1] - width / 2 + 0.192f * width,
        centerPoint[0]  - width / 2 + 0.406f * width, centerPoint[1] - width / 2 + 0.195f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.411f * width, centerPoint[1] - width / 2 + 0.198f * width,
        centerPoint[0]  - width / 2 + 0.409f * width, centerPoint[1] - width / 2 + 0.204f * width,
        centerPoint[0]  - width / 2 + 0.416f * width, centerPoint[1] - width / 2 + 0.205f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.423f * width, centerPoint[1] - width / 2 + 0.206f * width,
        centerPoint[0]  - width / 2 + 0.437f * width, centerPoint[1] - width / 2 + 0.214f * width,
        centerPoint[0]  - width / 2 + 0.434f * width, centerPoint[1] - width / 2 + 0.227f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.43f * width, centerPoint[1] - width / 2 + 0.24f * width,
        centerPoint[0]  - width / 2 + 0.422f * width, centerPoint[1] - width / 2 + 0.248f * width,
        centerPoint[0]  - width / 2 + 0.41f * width, centerPoint[1] - width / 2 + 0.26f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.399f * width, centerPoint[1] - width / 2 + 0.271f * width,
        centerPoint[0]  - width / 2 + 0.394f * width, centerPoint[1] - width / 2 + 0.294f * width,
        centerPoint[0]  - width / 2 + 0.396f * width, centerPoint[1] - width / 2 + 0.312f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.398f * width, centerPoint[1] - width / 2 + 0.329f * width,
        centerPoint[0]  - width / 2 + 0.399f * width, centerPoint[1] - width / 2 + 0.357f * width,
        centerPoint[0]  - width / 2 + 0.396f * width, centerPoint[1] - width / 2 + 0.367f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.393f * width, centerPoint[1] - width / 2 + 0.377f * width,
        centerPoint[0]  - width / 2 + 0.399f * width, centerPoint[1] - width / 2 + 0.413f * width,
        centerPoint[0]  - width / 2 + 0.398f * width, centerPoint[1] - width / 2 + 0.419f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.397f * width, centerPoint[1] - width / 2 + 0.426f * width,
        centerPoint[0]  - width / 2 + 0.397f * width, centerPoint[1] - width / 2 + 0.44f * width,
        centerPoint[0]  - width / 2 + 0.394f * width, centerPoint[1] - width / 2 + 0.446f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.391f * width, centerPoint[1] - width / 2 + 0.452f * width,
        centerPoint[0]  - width / 2 + 0.385f * width, centerPoint[1] - width / 2 + 0.465f * width,
        centerPoint[0]  - width / 2 + 0.358f * width, centerPoint[1] - width / 2 + 0.483f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.338f * width, centerPoint[1] - width / 2 + 0.497f * width,
        centerPoint[0]  - width / 2 + 0.314f * width, centerPoint[1] - width / 2 + 0.514f * width,
        centerPoint[0]  - width / 2 + 0.304f * width, centerPoint[1] - width / 2 + 0.517f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.294f * width, centerPoint[1] - width / 2 + 0.52f * width,
        centerPoint[0]  - width / 2 + 0.276f * width, centerPoint[1] - width / 2 + 0.504f * width,
        centerPoint[0]  - width / 2 + 0.266f * width, centerPoint[1] - width / 2 + 0.504f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.257f * width, centerPoint[1] - width / 2 + 0.504f * width,
        centerPoint[0]  - width / 2 + 0.235f * width, centerPoint[1] - width / 2 + 0.514f * width,
        centerPoint[0]  - width / 2 + 0.226f * width, centerPoint[1] - width / 2 + 0.515f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.216f * width, centerPoint[1] - width / 2 + 0.516f * width,
        centerPoint[0]  - width / 2 + 0.218f * width, centerPoint[1] - width / 2 + 0.523f * width,
        centerPoint[0]  - width / 2 + 0.224f * width, centerPoint[1] - width / 2 + 0.525f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.23f * width, centerPoint[1] - width / 2 + 0.527f * width,
        centerPoint[0]  - width / 2 + 0.241f * width, centerPoint[1] - width / 2 + 0.53f * width,
        centerPoint[0]  - width / 2 + 0.241f * width, centerPoint[1] - width / 2 + 0.53f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.241f * width, centerPoint[1] - width / 2 + 0.53f * width,
        centerPoint[0]  - width / 2 + 0.244f * width, centerPoint[1] - width / 2 + 0.539f * width,
        centerPoint[0]  - width / 2 + 0.237f * width, centerPoint[1] - width / 2 + 0.543f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.231f * width, centerPoint[1] - width / 2 + 0.547f * width,
        centerPoint[0]  - width / 2 + 0.213f * width, centerPoint[1] - width / 2 + 0.558f * width,
        centerPoint[0]  - width / 2 + 0.205f * width, centerPoint[1] - width / 2 + 0.567f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.198f * width, centerPoint[1] - width / 2 + 0.576f * width,
        centerPoint[0]  - width / 2 + 0.193f * width, centerPoint[1] - width / 2 + 0.59f * width,
        centerPoint[0]  - width / 2 + 0.198f * width, centerPoint[1] - width / 2 + 0.588f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.202f * width, centerPoint[1] - width / 2 + 0.586f * width,
        centerPoint[0]  - width / 2 + 0.215f * width, centerPoint[1] - width / 2 + 0.578f * width,
        centerPoint[0]  - width / 2 + 0.222f * width, centerPoint[1] - width / 2 + 0.577f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.229f * width, centerPoint[1] - width / 2 + 0.576f * width,
        centerPoint[0]  - width / 2 + 0.242f * width, centerPoint[1] - width / 2 + 0.579f * width,
        centerPoint[0]  - width / 2 + 0.238f * width, centerPoint[1] - width / 2 + 0.588f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.234f * width, centerPoint[1] - width / 2 + 0.598f * width,
        centerPoint[0]  - width / 2 + 0.229f * width, centerPoint[1] - width / 2 + 0.611f * width,
        centerPoint[0]  - width / 2 + 0.228f * width, centerPoint[1] - width / 2 + 0.616f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.227f * width, centerPoint[1] - width / 2 + 0.622f * width,
        centerPoint[0]  - width / 2 + 0.23f * width, centerPoint[1] - width / 2 + 0.632f * width,
        centerPoint[0]  - width / 2 + 0.232f * width, centerPoint[1] - width / 2 + 0.629f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.235f * width, centerPoint[1] - width / 2 + 0.626f * width,
        centerPoint[0]  - width / 2 + 0.242f * width, centerPoint[1] - width / 2 + 0.614f * width,
        centerPoint[0]  - width / 2 + 0.246f * width, centerPoint[1] - width / 2 + 0.612f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.25f * width, centerPoint[1] - width / 2 + 0.61f * width,
        centerPoint[0]  - width / 2 + 0.262f * width, centerPoint[1] - width / 2 + 0.6f * width,
        centerPoint[0]  - width / 2 + 0.266f * width, centerPoint[1] - width / 2 + 0.604f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.27f * width, centerPoint[1] - width / 2 + 0.608f * width,
        centerPoint[0]  - width / 2 + 0.273f * width, centerPoint[1] - width / 2 + 0.615f * width,
        centerPoint[0]  - width / 2 + 0.273f * width, centerPoint[1] - width / 2 + 0.619f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.273f * width, centerPoint[1] - width / 2 + 0.624f * width,
        centerPoint[0]  - width / 2 + 0.278f * width, centerPoint[1] - width / 2 + 0.64f * width,
        centerPoint[0]  - width / 2 + 0.28f * width, centerPoint[1] - width / 2 + 0.631f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.282f * width, centerPoint[1] - width / 2 + 0.622f * width,
        centerPoint[0]  - width / 2 + 0.288f * width, centerPoint[1] - width / 2 + 0.593f * width,
        centerPoint[0]  - width / 2 + 0.293f * width, centerPoint[1] - width / 2 + 0.587f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.299f * width, centerPoint[1] - width / 2 + 0.582f * width,
        centerPoint[0]  - width / 2 + 0.312f * width, centerPoint[1] - width / 2 + 0.56f * width,
        centerPoint[0]  - width / 2 + 0.317f * width, centerPoint[1] - width / 2 + 0.552f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.321f * width, centerPoint[1] - width / 2 + 0.543f * width,
        centerPoint[0]  - width / 2 + 0.382f * width, centerPoint[1] - width / 2 + 0.529f * width,
        centerPoint[0]  - width / 2 + 0.407f * width, centerPoint[1] - width / 2 + 0.51f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.432f * width, centerPoint[1] - width / 2 + 0.491f * width,
        centerPoint[0]  - width / 2 + 0.439f * width, centerPoint[1] - width / 2 + 0.474f * width,
        centerPoint[0]  - width / 2 + 0.439f * width, centerPoint[1] - width / 2 + 0.474f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.439f * width, centerPoint[1] - width / 2 + 0.474f * width,
        centerPoint[0]  - width / 2 + 0.45f * width, centerPoint[1] - width / 2 + 0.458f * width,
        centerPoint[0]  - width / 2 + 0.449f * width, centerPoint[1] - width / 2 + 0.446f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.453f * width, centerPoint[1] - width / 2 + 0.427f * width,
        centerPoint[0]  - width / 2 + 0.457f * width, centerPoint[1] - width / 2 + 0.37f * width,
        centerPoint[0]  - width / 2 + 0.457f * width, centerPoint[1] - width / 2 + 0.37f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.457f * width, centerPoint[1] - width / 2 + 0.37f * width,
        centerPoint[0]  - width / 2 + 0.476f * width, centerPoint[1] - width / 2 + 0.386f * width,
        centerPoint[0]  - width / 2 + 0.489f * width, centerPoint[1] - width / 2 + 0.391f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.503f * width, centerPoint[1] - width / 2 + 0.396f * width,
        centerPoint[0]  - width / 2 + 0.522f * width, centerPoint[1] - width / 2 + 0.417f * width,
        centerPoint[0]  - width / 2 + 0.522f * width, centerPoint[1] - width / 2 + 0.424f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.523f * width, centerPoint[1] - width / 2 + 0.43f * width,
        centerPoint[0]  - width / 2 + 0.534f * width, centerPoint[1] - width / 2 + 0.445f * width,
        centerPoint[0]  - width / 2 + 0.539f * width, centerPoint[1] - width / 2 + 0.454f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.529f * width, centerPoint[1] - width / 2 + 0.456f * width,
        centerPoint[0]  - width / 2 + 0.511f * width, centerPoint[1] - width / 2 + 0.464f * width,
        centerPoint[0]  - width / 2 + 0.502f * width, centerPoint[1] - width / 2 + 0.464f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.492f * width, centerPoint[1] - width / 2 + 0.465f * width,
        centerPoint[0]  - width / 2 + 0.494f * width, centerPoint[1] - width / 2 + 0.472f * width,
        centerPoint[0]  - width / 2 + 0.5f * width, centerPoint[1] - width / 2 + 0.474f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.506f * width, centerPoint[1] - width / 2 + 0.476f * width,
        centerPoint[0]  - width / 2 + 0.517f * width, centerPoint[1] - width / 2 + 0.48f * width,
        centerPoint[0]  - width / 2 + 0.517f * width, centerPoint[1] - width / 2 + 0.48f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.517f * width, centerPoint[1] - width / 2 + 0.48f * width,
        centerPoint[0]  - width / 2 + 0.52f * width, centerPoint[1] - width / 2 + 0.489f * width,
        centerPoint[0]  - width / 2 + 0.513f * width, centerPoint[1] - width / 2 + 0.492f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.507f * width, centerPoint[1] - width / 2 + 0.496f * width,
        centerPoint[0]  - width / 2 + 0.489f * width, centerPoint[1] - width / 2 + 0.508f * width,
        centerPoint[0]  - width / 2 + 0.481f * width, centerPoint[1] - width / 2 + 0.517f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.474f * width, centerPoint[1] - width / 2 + 0.525f * width,
        centerPoint[0]  - width / 2 + 0.469f * width, centerPoint[1] - width / 2 + 0.54f * width,
        centerPoint[0]  - width / 2 + 0.474f * width, centerPoint[1] - width / 2 + 0.538f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.479f * width, centerPoint[1] - width / 2 + 0.536f * width,
        centerPoint[0]  - width / 2 + 0.491f * width, centerPoint[1] - width / 2 + 0.527f * width,
        centerPoint[0]  - width / 2 + 0.498f * width, centerPoint[1] - width / 2 + 0.526f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.5f * width, centerPoint[1] - width / 2 + 0.526f * width,
        centerPoint[0]  - width / 2 + 0.504f * width, centerPoint[1] - width / 2 + 0.526f * width,
        centerPoint[0]  - width / 2 + 0.507f * width, centerPoint[1] - width / 2 + 0.527f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.504f * width, centerPoint[1] - width / 2 + 0.53f * width,
        centerPoint[0]  - width / 2 + 0.501f * width, centerPoint[1] - width / 2 + 0.533f * width,
        centerPoint[0]  - width / 2 + 0.498f * width, centerPoint[1] - width / 2 + 0.534f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.485f * width, centerPoint[1] - width / 2 + 0.544f * width,
        centerPoint[0]  - width / 2 + 0.452f * width, centerPoint[1] - width / 2 + 0.611f * width,
        centerPoint[0]  - width / 2 + 0.44f * width, centerPoint[1] - width / 2 + 0.617f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.429f * width, centerPoint[1] - width / 2 + 0.624f * width,
        centerPoint[0]  - width / 2 + 0.423f * width, centerPoint[1] - width / 2 + 0.641f * width,
        centerPoint[0]  - width / 2 + 0.424f * width, centerPoint[1] - width / 2 + 0.654f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.425f * width, centerPoint[1] - width / 2 + 0.668f * width,
        centerPoint[0]  - width / 2 + 0.43f * width, centerPoint[1] - width / 2 + 0.671f * width,
        centerPoint[0]  - width / 2 + 0.429f * width, centerPoint[1] - width / 2 + 0.678f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.428f * width, centerPoint[1] - width / 2 + 0.685f * width,
        centerPoint[0]  - width / 2 + 0.423f * width, centerPoint[1] - width / 2 + 0.712f * width,
        centerPoint[0]  - width / 2 + 0.425f * width, centerPoint[1] - width / 2 + 0.722f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.427f * width, centerPoint[1] - width / 2 + 0.731f * width,
        centerPoint[0]  - width / 2 + 0.456f * width, centerPoint[1] - width / 2 + 0.84f * width,
        centerPoint[0]  - width / 2 + 0.455f * width, centerPoint[1] - width / 2 + 0.848f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.454f * width, centerPoint[1] - width / 2 + 0.856f * width,
        centerPoint[0]  - width / 2 + 0.422f * width, centerPoint[1] - width / 2 + 0.882f * width,
        centerPoint[0]  - width / 2 + 0.408f * width, centerPoint[1] - width / 2 + 0.889f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.393f * width, centerPoint[1] - width / 2 + 0.896f * width,
        centerPoint[0]  - width / 2 + 0.391f * width, centerPoint[1] - width / 2 + 0.902f * width,
        centerPoint[0]  - width / 2 + 0.388f * width, centerPoint[1] - width / 2 + 0.904f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.385f * width, centerPoint[1] - width / 2 + 0.906f * width,
        centerPoint[0]  - width / 2 + 0.388f * width, centerPoint[1] - width / 2 + 0.911f * width,
        centerPoint[0]  - width / 2 + 0.394f * width, centerPoint[1] - width / 2 + 0.908f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.4f * width, centerPoint[1] - width / 2 + 0.905f * width,
        centerPoint[0]  - width / 2 + 0.387f * width, centerPoint[1] - width / 2 + 0.918f * width,
        centerPoint[0]  - width / 2 + 0.385f * width, centerPoint[1] - width / 2 + 0.922f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.383f * width, centerPoint[1] - width / 2 + 0.925f * width,
        centerPoint[0]  - width / 2 + 0.377f * width, centerPoint[1] - width / 2 + 0.936f * width,
        centerPoint[0]  - width / 2 + 0.384f * width, centerPoint[1] - width / 2 + 0.936f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.392f * width, centerPoint[1] - width / 2 + 0.936f * width,
        centerPoint[0]  - width / 2 + 0.394f * width, centerPoint[1] - width / 2 + 0.927f * width,
        centerPoint[0]  - width / 2 + 0.399f * width, centerPoint[1] - width / 2 + 0.93f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.404f * width, centerPoint[1] - width / 2 + 0.933f * width,
        centerPoint[0]  - width / 2 + 0.399f * width, centerPoint[1] - width / 2 + 0.938f * width,
        centerPoint[0]  - width / 2 + 0.394f * width, centerPoint[1] - width / 2 + 0.943f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.389f * width, centerPoint[1] - width / 2 + 0.948f * width,
        centerPoint[0]  - width / 2 + 0.399f * width, centerPoint[1] - width / 2 + 0.954f * width,
        centerPoint[0]  - width / 2 + 0.407f * width, centerPoint[1] - width / 2 + 0.948f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.42f * width, centerPoint[1] - width / 2 + 0.937f * width,
        centerPoint[0]  - width / 2 + 0.413f * width, centerPoint[1] - width / 2 + 0.953f * width,
        centerPoint[0]  - width / 2 + 0.413f * width, centerPoint[1] - width / 2 + 0.953f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.413f * width, centerPoint[1] - width / 2 + 0.953f * width,
        centerPoint[0]  - width / 2 + 0.411f * width, centerPoint[1] - width / 2 + 0.971f * width,
        centerPoint[0]  - width / 2 + 0.434f * width, centerPoint[1] - width / 2 + 0.943f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.443f * width, centerPoint[1] - width / 2 + 0.932f * width,
        centerPoint[0]  - width / 2 + 0.467f * width, centerPoint[1] - width / 2 + 0.916f * width,
        centerPoint[0]  - width / 2 + 0.471f * width, centerPoint[1] - width / 2 + 0.91f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.476f * width, centerPoint[1] - width / 2 + 0.904f * width,
        centerPoint[0]  - width / 2 + 0.474f * width, centerPoint[1] - width / 2 + 0.895f * width,
        centerPoint[0]  - width / 2 + 0.493f * width, centerPoint[1] - width / 2 + 0.882f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.51f * width, centerPoint[1] - width / 2 + 0.871f * width,
        centerPoint[0]  - width / 2 + 0.492f * width, centerPoint[1] - width / 2 + 0.837f * width,
        centerPoint[0]  - width / 2 + 0.492f * width, centerPoint[1] - width / 2 + 0.837f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.492f * width, centerPoint[1] - width / 2 + 0.837f * width,
        centerPoint[0]  - width / 2 + 0.497f * width, centerPoint[1] - width / 2 + 0.831f * width,
        centerPoint[0]  - width / 2 + 0.492f * width, centerPoint[1] - width / 2 + 0.829f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.494f * width, centerPoint[1] - width / 2 + 0.817f * width,
        centerPoint[0]  - width / 2 + 0.483f * width, centerPoint[1] - width / 2 + 0.755f * width,
        centerPoint[0]  - width / 2 + 0.483f * width, centerPoint[1] - width / 2 + 0.751f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.483f * width, centerPoint[1] - width / 2 + 0.747f * width,
        centerPoint[0]  - width / 2 + 0.493f * width, centerPoint[1] - width / 2 + 0.738f * width,
        centerPoint[0]  - width / 2 + 0.493f * width, centerPoint[1] - width / 2 + 0.727f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.493f * width, centerPoint[1] - width / 2 + 0.715f * width,
        centerPoint[0]  - width / 2 + 0.493f * width, centerPoint[1] - width / 2 + 0.686f * width,
        centerPoint[0]  - width / 2 + 0.491f * width, centerPoint[1] - width / 2 + 0.682f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.489f * width, centerPoint[1] - width / 2 + 0.678f * width,
        centerPoint[0]  - width / 2 + 0.487f * width, centerPoint[1] - width / 2 + 0.669f * width,
        centerPoint[0]  - width / 2 + 0.507f * width, centerPoint[1] - width / 2 + 0.653f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.527f * width, centerPoint[1] - width / 2 + 0.638f * width,
        centerPoint[0]  - width / 2 + 0.593f * width, centerPoint[1] - width / 2 + 0.585f * width,
        centerPoint[0]  - width / 2 + 0.593f * width, centerPoint[1] - width / 2 + 0.585f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.593f * width, centerPoint[1] - width / 2 + 0.585f * width,
        centerPoint[0]  - width / 2 + 0.603f * width, centerPoint[1] - width / 2 + 0.558f * width,
        centerPoint[0]  - width / 2 + 0.606f * width, centerPoint[1] - width / 2 + 0.561f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.608f * width, centerPoint[1] - width / 2 + 0.564f * width,
        centerPoint[0]  - width / 2 + 0.597f * width, centerPoint[1] - width / 2 + 0.589f * width,
        centerPoint[0]  - width / 2 + 0.597f * width, centerPoint[1] - width / 2 + 0.589f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.597f * width, centerPoint[1] - width / 2 + 0.589f * width,
        centerPoint[0]  - width / 2 + 0.581f * width, centerPoint[1] - width / 2 + 0.669f * width,
        centerPoint[0]  - width / 2 + 0.585f * width, centerPoint[1] - width / 2 + 0.674f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.589f * width, centerPoint[1] - width / 2 + 0.68f * width,
        centerPoint[0]  - width / 2 + 0.592f * width, centerPoint[1] - width / 2 + 0.693f * width,
        centerPoint[0]  - width / 2 + 0.6f * width, centerPoint[1] - width / 2 + 0.701f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.603f * width, centerPoint[1] - width / 2 + 0.704f * width,
        centerPoint[0]  - width / 2 + 0.605f * width, centerPoint[1] - width / 2 + 0.715f * width,
        centerPoint[0]  - width / 2 + 0.605f * width, centerPoint[1] - width / 2 + 0.715f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.605f * width, centerPoint[1] - width / 2 + 0.715f * width,
        centerPoint[0]  - width / 2 + 0.634f * width, centerPoint[1] - width / 2 + 0.761f * width,
        centerPoint[0]  - width / 2 + 0.643f * width, centerPoint[1] - width / 2 + 0.776f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.653f * width, centerPoint[1] - width / 2 + 0.79f * width,
        centerPoint[0]  - width / 2 + 0.687f * width, centerPoint[1] - width / 2 + 0.9f * width,
        centerPoint[0]  - width / 2 + 0.687f * width, centerPoint[1] - width / 2 + 0.9f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.687f * width, centerPoint[1] - width / 2 + 0.9f * width,
        centerPoint[0]  - width / 2 + 0.681f * width, centerPoint[1] - width / 2 + 0.911f * width,
        centerPoint[0]  - width / 2 + 0.688f * width, centerPoint[1] - width / 2 + 0.915f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.685f * width, centerPoint[1] - width / 2 + 0.92f * width,
        centerPoint[0]  - width / 2 + 0.663f * width, centerPoint[1] - width / 2 + 0.94f * width,
        centerPoint[0]  - width / 2 + 0.658f * width, centerPoint[1] - width / 2 + 0.945f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.653f * width, centerPoint[1] - width / 2 + 0.949f * width,
        centerPoint[0]  - width / 2 + 0.639f * width, centerPoint[1] - width / 2 + 0.963f * width,
        centerPoint[0]  - width / 2 + 0.636f * width, centerPoint[1] - width / 2 + 0.966f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.635f * width, centerPoint[1] - width / 2 + 0.971f * width,
        centerPoint[0]  - width / 2 + 0.623f * width, centerPoint[1] - width / 2 + 0.985f * width,
        centerPoint[0]  - width / 2 + 0.64f * width, centerPoint[1] - width / 2 + 0.982f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.647f * width, centerPoint[1] - width / 2 + 0.98f * width,
        centerPoint[0]  - width / 2 + 0.655f * width, centerPoint[1] - width / 2 + 0.976f * width,
        centerPoint[0]  - width / 2 + 0.65f * width, centerPoint[1] - width / 2 + 0.983f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.648f * width, centerPoint[1] - width / 2 + 0.987f * width,
        centerPoint[0]  - width / 2 + 0.656f * width, centerPoint[1] - width / 2 + 0.987f * width,
        centerPoint[0]  - width / 2 + 0.662f * width, centerPoint[1] - width / 2 + 0.986f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.668f * width, centerPoint[1] - width / 2 + 0.985f * width,
        centerPoint[0]  - width / 2 + 0.671f * width, centerPoint[1] - width / 2 + 0.982f * width,
        centerPoint[0]  - width / 2 + 0.671f * width, centerPoint[1] - width / 2 + 0.982f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.671f * width, centerPoint[1] - width / 2 + 0.982f * width,
        centerPoint[0]  - width / 2 + 0.667f * width, centerPoint[1] - width / 2 + 0.998f * width,
        centerPoint[0]  - width / 2 + 0.675f * width, centerPoint[1] - width / 2 + 0.993f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.684f * width, centerPoint[1] - width / 2 + 0.988f * width,
        centerPoint[0]  - width / 2 + 0.688f * width, centerPoint[1] - width / 2 + 0.988f * width,
        centerPoint[0]  - width / 2 + 0.688f * width, centerPoint[1] - width / 2 + 0.988f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.688f * width, centerPoint[1] - width / 2 + 0.988f * width,
        centerPoint[0]  - width / 2 + 0.692f * width, centerPoint[1] - width / 2 + 0.99f * width,
        centerPoint[0]  - width / 2 + 0.702f * width, centerPoint[1] - width / 2 + 0.985f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.712f * width, centerPoint[1] - width / 2 + 0.98f * width,
        centerPoint[0]  - width / 2 + 0.715f * width, centerPoint[1] - width / 2 + 0.965f * width,
        centerPoint[0]  - width / 2 + 0.726f * width, centerPoint[1] - width / 2 + 0.95f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.736f * width, centerPoint[1] - width / 2 + 0.934f * width,
        centerPoint[0]  - width / 2 + 0.735f * width, centerPoint[1] - width / 2 + 0.913f * width,
        centerPoint[0]  - width / 2 + 0.733f * width, centerPoint[1] - width / 2 + 0.904f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.74f * width, centerPoint[1] - width / 2 + 0.9f * width,
        centerPoint[0]  - width / 2 + 0.739f * width, centerPoint[1] - width / 2 + 0.886f * width,
        centerPoint[0]  - width / 2 + 0.734f * width, centerPoint[1] - width / 2 + 0.875f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.729f * width, centerPoint[1] - width / 2 + 0.864f * width,
        centerPoint[0]  - width / 2 + 0.721f * width, centerPoint[1] - width / 2 + 0.861f * width,
        centerPoint[0]  - width / 2 + 0.722f * width, centerPoint[1] - width / 2 + 0.855f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.723f * width, centerPoint[1] - width / 2 + 0.844f * width,
        centerPoint[0]  - width / 2 + 0.687f * width, centerPoint[1] - width / 2 + 0.746f * width,
        centerPoint[0]  - width / 2 + 0.687f * width, centerPoint[1] - width / 2 + 0.746f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.687f * width, centerPoint[1] - width / 2 + 0.746f * width,
        centerPoint[0]  - width / 2 + 0.687f * width, centerPoint[1] - width / 2 + 0.711f * width,
        centerPoint[0]  - width / 2 + 0.681f * width, centerPoint[1] - width / 2 + 0.698f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.675f * width, centerPoint[1] - width / 2 + 0.684f * width,
        centerPoint[0]  - width / 2 + 0.662f * width, centerPoint[1] - width / 2 + 0.65f * width,
        centerPoint[0]  - width / 2 + 0.662f * width, centerPoint[1] - width / 2 + 0.65f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.662f * width, centerPoint[1] - width / 2 + 0.65f * width,
        centerPoint[0]  - width / 2 + 0.662f * width, centerPoint[1] - width / 2 + 0.64f * width,
        centerPoint[0]  - width / 2 + 0.665f * width, centerPoint[1] - width / 2 + 0.633f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.667f * width, centerPoint[1] - width / 2 + 0.626f * width,
        centerPoint[0]  - width / 2 + 0.71f * width, centerPoint[1] - width / 2 + 0.551f * width,
        centerPoint[0]  - width / 2 + 0.713f * width, centerPoint[1] - width / 2 + 0.549f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.714f * width, centerPoint[1] - width / 2 + 0.548f * width,
        centerPoint[0]  - width / 2 + 0.715f * width, centerPoint[1] - width / 2 + 0.54f * width,
        centerPoint[0]  - width / 2 + 0.716f * width, centerPoint[1] - width / 2 + 0.527f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.739f * width, centerPoint[1] - width / 2 + 0.551f * width,
        centerPoint[0]  - width / 2 + 0.768f * width, centerPoint[1] - width / 2 + 0.573f * width,
        centerPoint[0]  - width / 2 + 0.783f * width, centerPoint[1] - width / 2 + 0.563f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.799f * width, centerPoint[1] - width / 2 + 0.553f * width,
        centerPoint[0]  - width / 2 + 0.803f * width, centerPoint[1] - width / 2 + 0.529f * width,
        centerPoint[0]  - width / 2 + 0.798f * width, centerPoint[1] - width / 2 + 0.502f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.807f * width, centerPoint[1] - width / 2 + 0.464f * width,
        centerPoint[0]  - width / 2 + 0.811f * width, centerPoint[1] - width / 2 + 0.382f * width,
        centerPoint[0]  - width / 2 + 0.772f * width, centerPoint[1] - width / 2 + 0.303f * width
    );
    return path;
  }

}
