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
public class CatPath {

  public static Path getCatPath(float width, float[] centerPoint){
    Path path = new Path();

    path.moveTo(centerPoint[0]  - width / 2 + 0.058f * width, centerPoint[1] - width / 2 + 0.153f * width);
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.058f * width, centerPoint[1] - width / 2 + 0.141f * width,
        centerPoint[0]  - width / 2 + 0.049f * width, centerPoint[1] - width / 2 + 0.085f * width,
        centerPoint[0]  - width / 2 + 0.058f * width, centerPoint[1] - width / 2 + 0.076f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.066f * width, centerPoint[1] - width / 2 + 0.068f * width,
        centerPoint[0]  - width / 2 + 0.102f * width, centerPoint[1] - width / 2 + 0.125f * width,
        centerPoint[0]  - width / 2 + 0.108f * width, centerPoint[1] - width / 2 + 0.129f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.114f * width, centerPoint[1] - width / 2 + 0.133f * width,
        centerPoint[0]  - width / 2 + 0.197f * width, centerPoint[1] - width / 2 + 0.149f * width,
        centerPoint[0]  - width / 2 + 0.205f * width, centerPoint[1] - width / 2 + 0.149f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.213f * width, centerPoint[1] - width / 2 + 0.149f * width,
        centerPoint[0]  - width / 2 + 0.262f * width, centerPoint[1] - width / 2 + 0.099f * width,
        centerPoint[0]  - width / 2 + 0.278f * width, centerPoint[1] - width / 2 + 0.099f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.294f * width, centerPoint[1] - width / 2 + 0.099f * width,
        centerPoint[0]  - width / 2 + 0.278f * width, centerPoint[1] - width / 2 + 0.178f * width,
        centerPoint[0]  - width / 2 + 0.28f * width, centerPoint[1] - width / 2 + 0.198f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.282f * width, centerPoint[1] - width / 2 + 0.218f * width,
        centerPoint[0]  - width / 2 + 0.308f * width, centerPoint[1] - width / 2 + 0.271f * width,
        centerPoint[0]  - width / 2 + 0.337f * width, centerPoint[1] - width / 2 + 0.293f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.365f * width, centerPoint[1] - width / 2 + 0.315f * width,
        centerPoint[0]  - width / 2 + 0.387f * width, centerPoint[1] - width / 2 + 0.331f * width,
        centerPoint[0]  - width / 2 + 0.387f * width, centerPoint[1] - width / 2 + 0.331f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.387f * width, centerPoint[1] - width / 2 + 0.331f * width,
        centerPoint[0]  - width / 2 + 0.6f * width, centerPoint[1] - width / 2 + 0.414f * width,
        centerPoint[0]  - width / 2 + 0.622f * width, centerPoint[1] - width / 2 + 0.516f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.644f * width, centerPoint[1] - width / 2 + 0.617f * width,
        centerPoint[0]  - width / 2 + 0.677f * width, centerPoint[1] - width / 2 + 0.592f * width,
        centerPoint[0]  - width / 2 + 0.681f * width, centerPoint[1] - width / 2 + 0.584f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.685f * width, centerPoint[1] - width / 2 + 0.576f * width,
        centerPoint[0]  - width / 2 + 0.707f * width, centerPoint[1] - width / 2 + 0.481f * width,
        centerPoint[0]  - width / 2 + 0.786f * width, centerPoint[1] - width / 2 + 0.467f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.865f * width, centerPoint[1] - width / 2 + 0.453f * width,
        centerPoint[0]  - width / 2 + 0.944f * width, centerPoint[1] - width / 2 + 0.439f * width,
        centerPoint[0]  - width / 2 + 0.932f * width, centerPoint[1] - width / 2 + 0.38f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.926f * width, centerPoint[1] - width / 2 + 0.356f * width,
        centerPoint[0]  - width / 2 + 0.952f * width, centerPoint[1] - width / 2 + 0.333f * width,
        centerPoint[0]  - width / 2 + 0.964f * width, centerPoint[1] - width / 2 + 0.36f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.976f * width, centerPoint[1] - width / 2 + 0.386f * width,
        centerPoint[0]  - width / 2 + 0.978f * width, centerPoint[1] - width / 2 + 0.455f * width,
        centerPoint[0]  - width / 2 + 0.92f * width, centerPoint[1] - width / 2 + 0.483f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.861f * width, centerPoint[1] - width / 2 + 0.512f * width,
        centerPoint[0]  - width / 2 + 0.778f * width, centerPoint[1] - width / 2 + 0.493f * width,
        centerPoint[0]  - width / 2 + 0.746f * width, centerPoint[1] - width / 2 + 0.568f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.713f * width, centerPoint[1] - width / 2 + 0.643f * width,
        centerPoint[0]  - width / 2 + 0.685f * width, centerPoint[1] - width / 2 + 0.669f * width,
        centerPoint[0]  - width / 2 + 0.667f * width, centerPoint[1] - width / 2 + 0.686f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.693f * width, centerPoint[1] - width / 2 + 0.718f * width,
        centerPoint[0]  - width / 2 + 0.677f * width, centerPoint[1] - width / 2 + 0.797f * width,
        centerPoint[0]  - width / 2 + 0.622f * width, centerPoint[1] - width / 2 + 0.835f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.567f * width, centerPoint[1] - width / 2 + 0.874f * width,
        centerPoint[0]  - width / 2 + 0.537f * width, centerPoint[1] - width / 2 + 0.856f * width,
        centerPoint[0]  - width / 2 + 0.525f * width, centerPoint[1] - width / 2 + 0.868f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.513f * width, centerPoint[1] - width / 2 + 0.88f * width,
        centerPoint[0]  - width / 2 + 0.46f * width, centerPoint[1] - width / 2 + 0.912f * width,
        centerPoint[0]  - width / 2 + 0.43f * width, centerPoint[1] - width / 2 + 0.896f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.41f * width, centerPoint[1] - width / 2 + 0.896f * width,
        centerPoint[0]  - width / 2 + 0.393f * width, centerPoint[1] - width / 2 + 0.888f * width,
        centerPoint[0]  - width / 2 + 0.402f * width, centerPoint[1] - width / 2 + 0.874f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.402f * width, centerPoint[1] - width / 2 + 0.874f * width,
        centerPoint[0]  - width / 2 + 0.406f * width, centerPoint[1] - width / 2 + 0.862f * width,
        centerPoint[0]  - width / 2 + 0.416f * width, centerPoint[1] - width / 2 + 0.856f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.426f * width, centerPoint[1] - width / 2 + 0.849f * width,
        centerPoint[0]  - width / 2 + 0.432f * width, centerPoint[1] - width / 2 + 0.839f * width,
        centerPoint[0]  - width / 2 + 0.432f * width, centerPoint[1] - width / 2 + 0.839f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.432f * width, centerPoint[1] - width / 2 + 0.839f * width,
        centerPoint[0]  - width / 2 + 0.381f * width, centerPoint[1] - width / 2 + 0.821f * width,
        centerPoint[0]  - width / 2 + 0.365f * width, centerPoint[1] - width / 2 + 0.801f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.365f * width, centerPoint[1] - width / 2 + 0.815f * width,
        centerPoint[0]  - width / 2 + 0.351f * width, centerPoint[1] - width / 2 + 0.845f * width,
        centerPoint[0]  - width / 2 + 0.349f * width, centerPoint[1] - width / 2 + 0.862f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.347f * width, centerPoint[1] - width / 2 + 0.878f * width,
        centerPoint[0]  - width / 2 + 0.321f * width, centerPoint[1] - width / 2 + 0.945f * width,
        centerPoint[0]  - width / 2 + 0.288f * width, centerPoint[1] - width / 2 + 0.918f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.27f * width, centerPoint[1] - width / 2 + 0.926f * width,
        centerPoint[0]  - width / 2 + 0.25f * width, centerPoint[1] - width / 2 + 0.91f * width,
        centerPoint[0]  - width / 2 + 0.25f * width, centerPoint[1] - width / 2 + 0.91f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.236f * width, centerPoint[1] - width / 2 + 0.91f * width,
        centerPoint[0]  - width / 2 + 0.232f * width, centerPoint[1] - width / 2 + 0.89f * width,
        centerPoint[0]  - width / 2 + 0.24f * width, centerPoint[1] - width / 2 + 0.882f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.244f * width, centerPoint[1] - width / 2 + 0.87f * width,
        centerPoint[0]  - width / 2 + 0.256f * width, centerPoint[1] - width / 2 + 0.862f * width,
        centerPoint[0]  - width / 2 + 0.266f * width, centerPoint[1] - width / 2 + 0.862f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.276f * width, centerPoint[1] - width / 2 + 0.862f * width,
        centerPoint[0]  - width / 2 + 0.276f * width, centerPoint[1] - width / 2 + 0.852f * width,
        centerPoint[0]  - width / 2 + 0.276f * width, centerPoint[1] - width / 2 + 0.852f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.276f * width, centerPoint[1] - width / 2 + 0.852f * width,
        centerPoint[0]  - width / 2 + 0.252f * width, centerPoint[1] - width / 2 + 0.852f * width,
        centerPoint[0]  - width / 2 + 0.238f * width, centerPoint[1] - width / 2 + 0.852f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.223f * width, centerPoint[1] - width / 2 + 0.852f * width,
        centerPoint[0]  - width / 2 + 0.209f * width, centerPoint[1] - width / 2 + 0.839f * width,
        centerPoint[0]  - width / 2 + 0.209f * width, centerPoint[1] - width / 2 + 0.839f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.209f * width, centerPoint[1] - width / 2 + 0.839f * width,
        centerPoint[0]  - width / 2 + 0.193f * width, centerPoint[1] - width / 2 + 0.829f * width,
        centerPoint[0]  - width / 2 + 0.203f * width, centerPoint[1] - width / 2 + 0.821f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.211f * width, centerPoint[1] - width / 2 + 0.809f * width,
        centerPoint[0]  - width / 2 + 0.219f * width, centerPoint[1] - width / 2 + 0.807f * width,
        centerPoint[0]  - width / 2 + 0.23f * width, centerPoint[1] - width / 2 + 0.807f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.24f * width, centerPoint[1] - width / 2 + 0.807f * width,
        centerPoint[0]  - width / 2 + 0.242f * width, centerPoint[1] - width / 2 + 0.738f * width,
        centerPoint[0]  - width / 2 + 0.234f * width, centerPoint[1] - width / 2 + 0.714f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.225f * width, centerPoint[1] - width / 2 + 0.69f * width,
        centerPoint[0]  - width / 2 + 0.207f * width, centerPoint[1] - width / 2 + 0.615f * width,
        centerPoint[0]  - width / 2 + 0.197f * width, centerPoint[1] - width / 2 + 0.599f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.187f * width, centerPoint[1] - width / 2 + 0.582f * width,
        centerPoint[0]  - width / 2 + 0.118f * width, centerPoint[1] - width / 2 + 0.499f * width,
        centerPoint[0]  - width / 2 + 0.11f * width, centerPoint[1] - width / 2 + 0.445f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.102f * width, centerPoint[1] - width / 2 + 0.39f * width,
        centerPoint[0]  - width / 2 + 0.098f * width, centerPoint[1] - width / 2 + 0.366f * width,
        centerPoint[0]  - width / 2 + 0.098f * width, centerPoint[1] - width / 2 + 0.366f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.098f * width, centerPoint[1] - width / 2 + 0.366f * width,
        centerPoint[0]  - width / 2 + 0.066f * width, centerPoint[1] - width / 2 + 0.348f * width,
        centerPoint[0]  - width / 2 + 0.062f * width, centerPoint[1] - width / 2 + 0.331f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.045f * width, centerPoint[1] - width / 2 + 0.315f * width,
        centerPoint[0]  - width / 2 + 0.027f * width, centerPoint[1] - width / 2 + 0.289f * width,
        centerPoint[0]  - width / 2 + 0.029f * width, centerPoint[1] - width / 2 + 0.253f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.031f * width, centerPoint[1] - width / 2 + 0.216f * width,
        centerPoint[0]  - width / 2 + 0.039f * width, centerPoint[1] - width / 2 + 0.2f * width,
        centerPoint[0]  - width / 2 + 0.049f * width, centerPoint[1] - width / 2 + 0.182f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.06f * width, centerPoint[1] - width / 2 + 0.163f * width,
        centerPoint[0]  - width / 2 + 0.058f * width, centerPoint[1] - width / 2 + 0.153f * width,
        centerPoint[0]  - width / 2 + 0.058f * width, centerPoint[1] - width / 2 + 0.153f * width
    );
    return path;

  }

}
