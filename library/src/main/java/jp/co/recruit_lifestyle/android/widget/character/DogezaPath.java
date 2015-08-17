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
public class DogezaPath {

  public static Path getDogezaPath(float width, float[] centerPoint){
    Path path = new Path();

    path.moveTo(centerPoint[0]  - width / 2 + 0.927f * width, centerPoint[1] - width / 2 + 0.519f * width);
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.906f * width, centerPoint[1] - width / 2 + 0.511f * width,
        centerPoint[0]  - width / 2 + 0.832f * width, centerPoint[1] - width / 2 + 0.476f * width,
        centerPoint[0]  - width / 2 + 0.816f * width, centerPoint[1] - width / 2 + 0.471f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.804f * width, centerPoint[1] - width / 2 + 0.467f * width,
        centerPoint[0]  - width / 2 + 0.784f * width, centerPoint[1] - width / 2 + 0.46f * width,
        centerPoint[0]  - width / 2 + 0.774f * width, centerPoint[1] - width / 2 + 0.456f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.774f * width, centerPoint[1] - width / 2 + 0.445f * width,
        centerPoint[0]  - width / 2 + 0.771f * width, centerPoint[1] - width / 2 + 0.433f * width,
        centerPoint[0]  - width / 2 + 0.764f * width, centerPoint[1] - width / 2 + 0.424f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.739f * width, centerPoint[1] - width / 2 + 0.394f * width,
        centerPoint[0]  - width / 2 + 0.684f * width, centerPoint[1] - width / 2 + 0.306f * width,
        centerPoint[0]  - width / 2 + 0.659f * width, centerPoint[1] - width / 2 + 0.265f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.654f * width, centerPoint[1] - width / 2 + 0.253f * width,
        centerPoint[0]  - width / 2 + 0.646f * width, centerPoint[1] - width / 2 + 0.244f * width,
        centerPoint[0]  - width / 2 + 0.646f * width, centerPoint[1] - width / 2 + 0.244f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.646f * width, centerPoint[1] - width / 2 + 0.244f * width,
        centerPoint[0]  - width / 2 + 0.65f * width, centerPoint[1] - width / 2 + 0.235f * width,
        centerPoint[0]  - width / 2 + 0.65f * width, centerPoint[1] - width / 2 + 0.235f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.65f * width, centerPoint[1] - width / 2 + 0.235f * width,
        centerPoint[0]  - width / 2 + 0.617f * width, centerPoint[1] - width / 2 + 0.174f * width,
        centerPoint[0]  - width / 2 + 0.5f * width, centerPoint[1] - width / 2 + 0.173f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.383f * width, centerPoint[1] - width / 2 + 0.174f * width,
        centerPoint[0]  - width / 2 + 0.35f * width, centerPoint[1] - width / 2 + 0.235f * width,
        centerPoint[0]  - width / 2 + 0.35f * width, centerPoint[1] - width / 2 + 0.235f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.35f * width, centerPoint[1] - width / 2 + 0.235f * width,
        centerPoint[0]  - width / 2 + 0.354f * width, centerPoint[1] - width / 2 + 0.244f * width,
        centerPoint[0]  - width / 2 + 0.354f * width, centerPoint[1] - width / 2 + 0.244f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.354f * width, centerPoint[1] - width / 2 + 0.244f * width,
        centerPoint[0]  - width / 2 + 0.335f * width, centerPoint[1] - width / 2 + 0.265f * width,
        centerPoint[0]  - width / 2 + 0.336f * width, centerPoint[1] - width / 2 + 0.291f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.336f * width, centerPoint[1] - width / 2 + 0.293f * width,
        centerPoint[0]  - width / 2 + 0.336f * width, centerPoint[1] - width / 2 + 0.294f * width,
        centerPoint[0]  - width / 2 + 0.336f * width, centerPoint[1] - width / 2 + 0.296f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.299f * width, centerPoint[1] - width / 2 + 0.338f * width,
        centerPoint[0]  - width / 2 + 0.229f * width, centerPoint[1] - width / 2 + 0.42f * width,
        centerPoint[0]  - width / 2 + 0.218f * width, centerPoint[1] - width / 2 + 0.459f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.208f * width, centerPoint[1] - width / 2 + 0.463f * width,
        centerPoint[0]  - width / 2 + 0.193f * width, centerPoint[1] - width / 2 + 0.467f * width,
        centerPoint[0]  - width / 2 + 0.184f * width, centerPoint[1] - width / 2 + 0.471f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.168f * width, centerPoint[1] - width / 2 + 0.476f * width,
        centerPoint[0]  - width / 2 + 0.094f * width, centerPoint[1] - width / 2 + 0.511f * width,
        centerPoint[0]  - width / 2 + 0.073f * width, centerPoint[1] - width / 2 + 0.519f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.052f * width, centerPoint[1] - width / 2 + 0.526f * width,
        centerPoint[0]  - width / 2 + 0.06f * width, centerPoint[1] - width / 2 + 0.542f * width,
        centerPoint[0]  - width / 2 + 0.061f * width, centerPoint[1] - width / 2 + 0.555f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.062f * width, centerPoint[1] - width / 2 + 0.568f * width,
        centerPoint[0]  - width / 2 + 0.092f * width, centerPoint[1] - width / 2 + 0.622f * width,
        centerPoint[0]  - width / 2 + 0.099f * width, centerPoint[1] - width / 2 + 0.633f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.105f * width, centerPoint[1] - width / 2 + 0.644f * width,
        centerPoint[0]  - width / 2 + 0.134f * width, centerPoint[1] - width / 2 + 0.706f * width,
        centerPoint[0]  - width / 2 + 0.145f * width, centerPoint[1] - width / 2 + 0.725f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.155f * width, centerPoint[1] - width / 2 + 0.744f * width,
        centerPoint[0]  - width / 2 + 0.154f * width, centerPoint[1] - width / 2 + 0.734f * width,
        centerPoint[0]  - width / 2 + 0.169f * width, centerPoint[1] - width / 2 + 0.729f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.172f * width, centerPoint[1] - width / 2 + 0.729f * width,
        centerPoint[0]  - width / 2 + 0.175f * width, centerPoint[1] - width / 2 + 0.727f * width,
        centerPoint[0]  - width / 2 + 0.179f * width, centerPoint[1] - width / 2 + 0.725f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.179f * width, centerPoint[1] - width / 2 + 0.725f * width,
        centerPoint[0]  - width / 2 + 0.186f * width, centerPoint[1] - width / 2 + 0.734f * width,
        centerPoint[0]  - width / 2 + 0.186f * width, centerPoint[1] - width / 2 + 0.734f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.186f * width, centerPoint[1] - width / 2 + 0.734f * width,
        centerPoint[0]  - width / 2 + 0.195f * width, centerPoint[1] - width / 2 + 0.733f * width,
        centerPoint[0]  - width / 2 + 0.204f * width, centerPoint[1] - width / 2 + 0.729f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.206f * width, centerPoint[1] - width / 2 + 0.732f * width,
        centerPoint[0]  - width / 2 + 0.208f * width, centerPoint[1] - width / 2 + 0.734f * width,
        centerPoint[0]  - width / 2 + 0.209f * width, centerPoint[1] - width / 2 + 0.736f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.211f * width, centerPoint[1] - width / 2 + 0.743f * width,
        centerPoint[0]  - width / 2 + 0.212f * width, centerPoint[1] - width / 2 + 0.767f * width,
        centerPoint[0]  - width / 2 + 0.223f * width, centerPoint[1] - width / 2 + 0.78f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.233f * width, centerPoint[1] - width / 2 + 0.792f * width,
        centerPoint[0]  - width / 2 + 0.236f * width, centerPoint[1] - width / 2 + 0.797f * width,
        centerPoint[0]  - width / 2 + 0.246f * width, centerPoint[1] - width / 2 + 0.806f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.256f * width, centerPoint[1] - width / 2 + 0.816f * width,
        centerPoint[0]  - width / 2 + 0.266f * width, centerPoint[1] - width / 2 + 0.816f * width,
        centerPoint[0]  - width / 2 + 0.262f * width, centerPoint[1] - width / 2 + 0.808f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.258f * width, centerPoint[1] - width / 2 + 0.801f * width,
        centerPoint[0]  - width / 2 + 0.242f * width, centerPoint[1] - width / 2 + 0.775f * width,
        centerPoint[0]  - width / 2 + 0.242f * width, centerPoint[1] - width / 2 + 0.775f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.242f * width, centerPoint[1] - width / 2 + 0.775f * width,
        centerPoint[0]  - width / 2 + 0.269f * width, centerPoint[1] - width / 2 + 0.804f * width,
        centerPoint[0]  - width / 2 + 0.281f * width, centerPoint[1] - width / 2 + 0.817f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.294f * width, centerPoint[1] - width / 2 + 0.83f * width,
        centerPoint[0]  - width / 2 + 0.301f * width, centerPoint[1] - width / 2 + 0.829f * width,
        centerPoint[0]  - width / 2 + 0.297f * width, centerPoint[1] - width / 2 + 0.82f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.294f * width, centerPoint[1] - width / 2 + 0.812f * width,
        centerPoint[0]  - width / 2 + 0.277f * width, centerPoint[1] - width / 2 + 0.784f * width,
        centerPoint[0]  - width / 2 + 0.277f * width, centerPoint[1] - width / 2 + 0.784f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.277f * width, centerPoint[1] - width / 2 + 0.784f * width,
        centerPoint[0]  - width / 2 + 0.294f * width, centerPoint[1] - width / 2 + 0.802f * width,
        centerPoint[0]  - width / 2 + 0.31f * width, centerPoint[1] - width / 2 + 0.813f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.326f * width, centerPoint[1] - width / 2 + 0.823f * width,
        centerPoint[0]  - width / 2 + 0.333f * width, centerPoint[1] - width / 2 + 0.813f * width,
        centerPoint[0]  - width / 2 + 0.333f * width, centerPoint[1] - width / 2 + 0.813f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.333f * width, centerPoint[1] - width / 2 + 0.813f * width,
        centerPoint[0]  - width / 2 + 0.333f * width, centerPoint[1] - width / 2 + 0.813f * width,
        centerPoint[0]  - width / 2 + 0.331f * width, centerPoint[1] - width / 2 + 0.807f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.328f * width, centerPoint[1] - width / 2 + 0.802f * width,
        centerPoint[0]  - width / 2 + 0.298f * width, centerPoint[1] - width / 2 + 0.776f * width,
        centerPoint[0]  - width / 2 + 0.292f * width, centerPoint[1] - width / 2 + 0.768f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.286f * width, centerPoint[1] - width / 2 + 0.759f * width,
        centerPoint[0]  - width / 2 + 0.322f * width, centerPoint[1] - width / 2 + 0.789f * width,
        centerPoint[0]  - width / 2 + 0.335f * width, centerPoint[1] - width / 2 + 0.798f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.348f * width, centerPoint[1] - width / 2 + 0.806f * width,
        centerPoint[0]  - width / 2 + 0.358f * width, centerPoint[1] - width / 2 + 0.798f * width,
        centerPoint[0]  - width / 2 + 0.347f * width, centerPoint[1] - width / 2 + 0.788f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.335f * width, centerPoint[1] - width / 2 + 0.778f * width,
        centerPoint[0]  - width / 2 + 0.31f * width, centerPoint[1] - width / 2 + 0.749f * width,
        centerPoint[0]  - width / 2 + 0.305f * width, centerPoint[1] - width / 2 + 0.741f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.3f * width, centerPoint[1] - width / 2 + 0.734f * width,
        centerPoint[0]  - width / 2 + 0.324f * width, centerPoint[1] - width / 2 + 0.749f * width,
        centerPoint[0]  - width / 2 + 0.337f * width, centerPoint[1] - width / 2 + 0.751f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.35f * width, centerPoint[1] - width / 2 + 0.753f * width,
        centerPoint[0]  - width / 2 + 0.352f * width, centerPoint[1] - width / 2 + 0.742f * width,
        centerPoint[0]  - width / 2 + 0.341f * width, centerPoint[1] - width / 2 + 0.739f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.331f * width, centerPoint[1] - width / 2 + 0.736f * width,
        centerPoint[0]  - width / 2 + 0.328f * width, centerPoint[1] - width / 2 + 0.729f * width,
        centerPoint[0]  - width / 2 + 0.316f * width, centerPoint[1] - width / 2 + 0.721f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.303f * width, centerPoint[1] - width / 2 + 0.712f * width,
        centerPoint[0]  - width / 2 + 0.284f * width, centerPoint[1] - width / 2 + 0.713f * width,
        centerPoint[0]  - width / 2 + 0.272f * width, centerPoint[1] - width / 2 + 0.713f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.26f * width, centerPoint[1] - width / 2 + 0.713f * width,
        centerPoint[0]  - width / 2 + 0.247f * width, centerPoint[1] - width / 2 + 0.705f * width,
        centerPoint[0]  - width / 2 + 0.241f * width, centerPoint[1] - width / 2 + 0.696f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.241f * width, centerPoint[1] - width / 2 + 0.696f * width,
        centerPoint[0]  - width / 2 + 0.24f * width, centerPoint[1] - width / 2 + 0.696f * width,
        centerPoint[0]  - width / 2 + 0.24f * width, centerPoint[1] - width / 2 + 0.696f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.242f * width, centerPoint[1] - width / 2 + 0.693f * width,
        centerPoint[0]  - width / 2 + 0.242f * width, centerPoint[1] - width / 2 + 0.692f * width,
        centerPoint[0]  - width / 2 + 0.242f * width, centerPoint[1] - width / 2 + 0.692f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.242f * width, centerPoint[1] - width / 2 + 0.692f * width,
        centerPoint[0]  - width / 2 + 0.238f * width, centerPoint[1] - width / 2 + 0.689f * width,
        centerPoint[0]  - width / 2 + 0.238f * width, centerPoint[1] - width / 2 + 0.689f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.238f * width, centerPoint[1] - width / 2 + 0.689f * width,
        centerPoint[0]  - width / 2 + 0.24f * width, centerPoint[1] - width / 2 + 0.687f * width,
        centerPoint[0]  - width / 2 + 0.24f * width, centerPoint[1] - width / 2 + 0.687f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.24f * width, centerPoint[1] - width / 2 + 0.687f * width,
        centerPoint[0]  - width / 2 + 0.2f * width, centerPoint[1] - width / 2 + 0.622f * width,
        centerPoint[0]  - width / 2 + 0.198f * width, centerPoint[1] - width / 2 + 0.617f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.196f * width, centerPoint[1] - width / 2 + 0.612f * width,
        centerPoint[0]  - width / 2 + 0.187f * width, centerPoint[1] - width / 2 + 0.6f * width,
        centerPoint[0]  - width / 2 + 0.183f * width, centerPoint[1] - width / 2 + 0.596f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.179f * width, centerPoint[1] - width / 2 + 0.591f * width,
        centerPoint[0]  - width / 2 + 0.172f * width, centerPoint[1] - width / 2 + 0.586f * width,
        centerPoint[0]  - width / 2 + 0.185f * width, centerPoint[1] - width / 2 + 0.585f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.198f * width, centerPoint[1] - width / 2 + 0.584f * width,
        centerPoint[0]  - width / 2 + 0.228f * width, centerPoint[1] - width / 2 + 0.579f * width,
        centerPoint[0]  - width / 2 + 0.232f * width, centerPoint[1] - width / 2 + 0.579f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.236f * width, centerPoint[1] - width / 2 + 0.579f * width,
        centerPoint[0]  - width / 2 + 0.251f * width, centerPoint[1] - width / 2 + 0.577f * width,
        centerPoint[0]  - width / 2 + 0.254f * width, centerPoint[1] - width / 2 + 0.571f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.256f * width, centerPoint[1] - width / 2 + 0.565f * width,
        centerPoint[0]  - width / 2 + 0.271f * width, centerPoint[1] - width / 2 + 0.566f * width,
        centerPoint[0]  - width / 2 + 0.273f * width, centerPoint[1] - width / 2 + 0.569f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.275f * width, centerPoint[1] - width / 2 + 0.572f * width,
        centerPoint[0]  - width / 2 + 0.284f * width, centerPoint[1] - width / 2 + 0.601f * width,
        centerPoint[0]  - width / 2 + 0.305f * width, centerPoint[1] - width / 2 + 0.603f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.326f * width, centerPoint[1] - width / 2 + 0.605f * width,
        centerPoint[0]  - width / 2 + 0.365f * width, centerPoint[1] - width / 2 + 0.613f * width,
        centerPoint[0]  - width / 2 + 0.365f * width, centerPoint[1] - width / 2 + 0.613f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.365f * width, centerPoint[1] - width / 2 + 0.613f * width,
        centerPoint[0]  - width / 2 + 0.369f * width, centerPoint[1] - width / 2 + 0.63f * width,
        centerPoint[0]  - width / 2 + 0.386f * width, centerPoint[1] - width / 2 + 0.628f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.403f * width, centerPoint[1] - width / 2 + 0.626f * width,
        centerPoint[0]  - width / 2 + 0.409f * width, centerPoint[1] - width / 2 + 0.629f * width,
        centerPoint[0]  - width / 2 + 0.409f * width, centerPoint[1] - width / 2 + 0.629f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.409f * width, centerPoint[1] - width / 2 + 0.629f * width,
        centerPoint[0]  - width / 2 + 0.395f * width, centerPoint[1] - width / 2 + 0.666f * width,
        centerPoint[0]  - width / 2 + 0.411f * width, centerPoint[1] - width / 2 + 0.711f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.427f * width, centerPoint[1] - width / 2 + 0.758f * width,
        centerPoint[0]  - width / 2 + 0.464f * width, centerPoint[1] - width / 2 + 0.764f * width,
        centerPoint[0]  - width / 2 + 0.479f * width, centerPoint[1] - width / 2 + 0.755f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.538f * width, centerPoint[1] - width / 2 + 0.778f * width,
        centerPoint[0]  - width / 2 + 0.573f * width, centerPoint[1] - width / 2 + 0.754f * width,
        centerPoint[0]  - width / 2 + 0.588f * width, centerPoint[1] - width / 2 + 0.711f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.604f * width, centerPoint[1] - width / 2 + 0.666f * width,
        centerPoint[0]  - width / 2 + 0.591f * width, centerPoint[1] - width / 2 + 0.629f * width,
        centerPoint[0]  - width / 2 + 0.591f * width, centerPoint[1] - width / 2 + 0.629f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.591f * width, centerPoint[1] - width / 2 + 0.629f * width,
        centerPoint[0]  - width / 2 + 0.597f * width, centerPoint[1] - width / 2 + 0.626f * width,
        centerPoint[0]  - width / 2 + 0.614f * width, centerPoint[1] - width / 2 + 0.628f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.631f * width, centerPoint[1] - width / 2 + 0.63f * width,
        centerPoint[0]  - width / 2 + 0.635f * width, centerPoint[1] - width / 2 + 0.613f * width,
        centerPoint[0]  - width / 2 + 0.635f * width, centerPoint[1] - width / 2 + 0.613f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.635f * width, centerPoint[1] - width / 2 + 0.613f * width,
        centerPoint[0]  - width / 2 + 0.674f * width, centerPoint[1] - width / 2 + 0.605f * width,
        centerPoint[0]  - width / 2 + 0.695f * width, centerPoint[1] - width / 2 + 0.603f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.716f * width, centerPoint[1] - width / 2 + 0.601f * width,
        centerPoint[0]  - width / 2 + 0.725f * width, centerPoint[1] - width / 2 + 0.572f * width,
        centerPoint[0]  - width / 2 + 0.727f * width, centerPoint[1] - width / 2 + 0.569f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.729f * width, centerPoint[1] - width / 2 + 0.566f * width,
        centerPoint[0]  - width / 2 + 0.744f * width, centerPoint[1] - width / 2 + 0.565f * width,
        centerPoint[0]  - width / 2 + 0.746f * width, centerPoint[1] - width / 2 + 0.571f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.749f * width, centerPoint[1] - width / 2 + 0.577f * width,
        centerPoint[0]  - width / 2 + 0.764f * width, centerPoint[1] - width / 2 + 0.579f * width,
        centerPoint[0]  - width / 2 + 0.768f * width, centerPoint[1] - width / 2 + 0.579f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.772f * width, centerPoint[1] - width / 2 + 0.579f * width,
        centerPoint[0]  - width / 2 + 0.802f * width, centerPoint[1] - width / 2 + 0.584f * width,
        centerPoint[0]  - width / 2 + 0.815f * width, centerPoint[1] - width / 2 + 0.585f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.828f * width, centerPoint[1] - width / 2 + 0.586f * width,
        centerPoint[0]  - width / 2 + 0.821f * width, centerPoint[1] - width / 2 + 0.591f * width,
        centerPoint[0]  - width / 2 + 0.817f * width, centerPoint[1] - width / 2 + 0.596f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.813f * width, centerPoint[1] - width / 2 + 0.6f * width,
        centerPoint[0]  - width / 2 + 0.804f * width, centerPoint[1] - width / 2 + 0.612f * width,
        centerPoint[0]  - width / 2 + 0.802f * width, centerPoint[1] - width / 2 + 0.617f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.8f * width, centerPoint[1] - width / 2 + 0.622f * width,
        centerPoint[0]  - width / 2 + 0.76f * width, centerPoint[1] - width / 2 + 0.687f * width,
        centerPoint[0]  - width / 2 + 0.76f * width, centerPoint[1] - width / 2 + 0.687f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.76f * width, centerPoint[1] - width / 2 + 0.687f * width,
        centerPoint[0]  - width / 2 + 0.762f * width, centerPoint[1] - width / 2 + 0.689f * width,
        centerPoint[0]  - width / 2 + 0.762f * width, centerPoint[1] - width / 2 + 0.689f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.762f * width, centerPoint[1] - width / 2 + 0.689f * width,
        centerPoint[0]  - width / 2 + 0.758f * width, centerPoint[1] - width / 2 + 0.692f * width,
        centerPoint[0]  - width / 2 + 0.758f * width, centerPoint[1] - width / 2 + 0.692f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.758f * width, centerPoint[1] - width / 2 + 0.692f * width,
        centerPoint[0]  - width / 2 + 0.758f * width, centerPoint[1] - width / 2 + 0.693f * width,
        centerPoint[0]  - width / 2 + 0.76f * width, centerPoint[1] - width / 2 + 0.696f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.76f * width, centerPoint[1] - width / 2 + 0.696f * width,
        centerPoint[0]  - width / 2 + 0.759f * width, centerPoint[1] - width / 2 + 0.696f * width,
        centerPoint[0]  - width / 2 + 0.759f * width, centerPoint[1] - width / 2 + 0.696f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.753f * width, centerPoint[1] - width / 2 + 0.705f * width,
        centerPoint[0]  - width / 2 + 0.74f * width, centerPoint[1] - width / 2 + 0.713f * width,
        centerPoint[0]  - width / 2 + 0.728f * width, centerPoint[1] - width / 2 + 0.713f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.716f * width, centerPoint[1] - width / 2 + 0.713f * width,
        centerPoint[0]  - width / 2 + 0.697f * width, centerPoint[1] - width / 2 + 0.712f * width,
        centerPoint[0]  - width / 2 + 0.684f * width, centerPoint[1] - width / 2 + 0.721f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.672f * width, centerPoint[1] - width / 2 + 0.729f * width,
        centerPoint[0]  - width / 2 + 0.669f * width, centerPoint[1] - width / 2 + 0.736f * width,
        centerPoint[0]  - width / 2 + 0.659f * width, centerPoint[1] - width / 2 + 0.739f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.648f * width, centerPoint[1] - width / 2 + 0.742f * width,
        centerPoint[0]  - width / 2 + 0.65f * width, centerPoint[1] - width / 2 + 0.753f * width,
        centerPoint[0]  - width / 2 + 0.663f * width, centerPoint[1] - width / 2 + 0.751f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.676f * width, centerPoint[1] - width / 2 + 0.749f * width,
        centerPoint[0]  - width / 2 + 0.7f * width, centerPoint[1] - width / 2 + 0.734f * width,
        centerPoint[0]  - width / 2 + 0.695f * width, centerPoint[1] - width / 2 + 0.741f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.69f * width, centerPoint[1] - width / 2 + 0.749f * width,
        centerPoint[0]  - width / 2 + 0.665f * width, centerPoint[1] - width / 2 + 0.778f * width,
        centerPoint[0]  - width / 2 + 0.653f * width, centerPoint[1] - width / 2 + 0.788f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.642f * width, centerPoint[1] - width / 2 + 0.798f * width,
        centerPoint[0]  - width / 2 + 0.652f * width, centerPoint[1] - width / 2 + 0.806f * width,
        centerPoint[0]  - width / 2 + 0.665f * width, centerPoint[1] - width / 2 + 0.798f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.678f * width, centerPoint[1] - width / 2 + 0.789f * width,
        centerPoint[0]  - width / 2 + 0.714f * width, centerPoint[1] - width / 2 + 0.759f * width,
        centerPoint[0]  - width / 2 + 0.708f * width, centerPoint[1] - width / 2 + 0.768f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.702f * width, centerPoint[1] - width / 2 + 0.776f * width,
        centerPoint[0]  - width / 2 + 0.672f * width, centerPoint[1] - width / 2 + 0.802f * width,
        centerPoint[0]  - width / 2 + 0.669f * width, centerPoint[1] - width / 2 + 0.807f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.667f * width, centerPoint[1] - width / 2 + 0.813f * width,
        centerPoint[0]  - width / 2 + 0.667f * width, centerPoint[1] - width / 2 + 0.813f * width,
        centerPoint[0]  - width / 2 + 0.667f * width, centerPoint[1] - width / 2 + 0.813f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.667f * width, centerPoint[1] - width / 2 + 0.813f * width,
        centerPoint[0]  - width / 2 + 0.674f * width, centerPoint[1] - width / 2 + 0.823f * width,
        centerPoint[0]  - width / 2 + 0.69f * width, centerPoint[1] - width / 2 + 0.813f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.706f * width, centerPoint[1] - width / 2 + 0.802f * width,
        centerPoint[0]  - width / 2 + 0.723f * width, centerPoint[1] - width / 2 + 0.784f * width,
        centerPoint[0]  - width / 2 + 0.723f * width, centerPoint[1] - width / 2 + 0.784f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.723f * width, centerPoint[1] - width / 2 + 0.784f * width,
        centerPoint[0]  - width / 2 + 0.706f * width, centerPoint[1] - width / 2 + 0.812f * width,
        centerPoint[0]  - width / 2 + 0.703f * width, centerPoint[1] - width / 2 + 0.82f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.699f * width, centerPoint[1] - width / 2 + 0.829f * width,
        centerPoint[0]  - width / 2 + 0.706f * width, centerPoint[1] - width / 2 + 0.83f * width,
        centerPoint[0]  - width / 2 + 0.719f * width, centerPoint[1] - width / 2 + 0.817f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.731f * width, centerPoint[1] - width / 2 + 0.804f * width,
        centerPoint[0]  - width / 2 + 0.758f * width, centerPoint[1] - width / 2 + 0.775f * width,
        centerPoint[0]  - width / 2 + 0.758f * width, centerPoint[1] - width / 2 + 0.775f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.758f * width, centerPoint[1] - width / 2 + 0.775f * width,
        centerPoint[0]  - width / 2 + 0.742f * width, centerPoint[1] - width / 2 + 0.801f * width,
        centerPoint[0]  - width / 2 + 0.738f * width, centerPoint[1] - width / 2 + 0.808f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.734f * width, centerPoint[1] - width / 2 + 0.816f * width,
        centerPoint[0]  - width / 2 + 0.744f * width, centerPoint[1] - width / 2 + 0.816f * width,
        centerPoint[0]  - width / 2 + 0.754f * width, centerPoint[1] - width / 2 + 0.806f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.764f * width, centerPoint[1] - width / 2 + 0.797f * width,
        centerPoint[0]  - width / 2 + 0.767f * width, centerPoint[1] - width / 2 + 0.792f * width,
        centerPoint[0]  - width / 2 + 0.777f * width, centerPoint[1] - width / 2 + 0.78f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.788f * width, centerPoint[1] - width / 2 + 0.767f * width,
        centerPoint[0]  - width / 2 + 0.789f * width, centerPoint[1] - width / 2 + 0.743f * width,
        centerPoint[0]  - width / 2 + 0.791f * width, centerPoint[1] - width / 2 + 0.736f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.792f * width, centerPoint[1] - width / 2 + 0.734f * width,
        centerPoint[0]  - width / 2 + 0.794f * width, centerPoint[1] - width / 2 + 0.732f * width,
        centerPoint[0]  - width / 2 + 0.796f * width, centerPoint[1] - width / 2 + 0.729f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.805f * width, centerPoint[1] - width / 2 + 0.733f * width,
        centerPoint[0]  - width / 2 + 0.814f * width, centerPoint[1] - width / 2 + 0.734f * width,
        centerPoint[0]  - width / 2 + 0.814f * width, centerPoint[1] - width / 2 + 0.734f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.814f * width, centerPoint[1] - width / 2 + 0.734f * width,
        centerPoint[0]  - width / 2 + 0.821f * width, centerPoint[1] - width / 2 + 0.725f * width,
        centerPoint[0]  - width / 2 + 0.821f * width, centerPoint[1] - width / 2 + 0.725f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.825f * width, centerPoint[1] - width / 2 + 0.727f * width,
        centerPoint[0]  - width / 2 + 0.828f * width, centerPoint[1] - width / 2 + 0.729f * width,
        centerPoint[0]  - width / 2 + 0.831f * width, centerPoint[1] - width / 2 + 0.729f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.846f * width, centerPoint[1] - width / 2 + 0.734f * width,
        centerPoint[0]  - width / 2 + 0.845f * width, centerPoint[1] - width / 2 + 0.744f * width,
        centerPoint[0]  - width / 2 + 0.856f * width, centerPoint[1] - width / 2 + 0.725f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.866f * width, centerPoint[1] - width / 2 + 0.706f * width,
        centerPoint[0]  - width / 2 + 0.895f * width, centerPoint[1] - width / 2 + 0.644f * width,
        centerPoint[0]  - width / 2 + 0.901f * width, centerPoint[1] - width / 2 + 0.633f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.908f * width, centerPoint[1] - width / 2 + 0.622f * width,
        centerPoint[0]  - width / 2 + 0.938f * width, centerPoint[1] - width / 2 + 0.568f * width,
        centerPoint[0]  - width / 2 + 0.939f * width, centerPoint[1] - width / 2 + 0.555f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.94f * width, centerPoint[1] - width / 2 + 0.542f * width,
        centerPoint[0]  - width / 2 + 0.948f * width, centerPoint[1] - width / 2 + 0.526f * width,
        centerPoint[0]  - width / 2 + 0.927f * width, centerPoint[1] - width / 2 + 0.519f * width
    );
    return path;

  }

}
