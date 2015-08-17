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
public class HairStylePath {

  public static Path getHairStylePath(float width, float[] centerPoint){
    Path path = new Path();

    path.moveTo(centerPoint[0]  - width / 2 + 0.784f * width, centerPoint[1] - width / 2 + 0.864f * width);
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.784f * width, centerPoint[1] - width / 2 + 0.864f * width,
        centerPoint[0]  - width / 2 + 0.769f * width, centerPoint[1] - width / 2 + 0.872f * width,
        centerPoint[0]  - width / 2 + 0.752f * width, centerPoint[1] - width / 2 + 0.864f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.735f * width, centerPoint[1] - width / 2 + 0.855f * width,
        centerPoint[0]  - width / 2 + 0.73f * width, centerPoint[1] - width / 2 + 0.84f * width,
        centerPoint[0]  - width / 2 + 0.76f * width, centerPoint[1] - width / 2 + 0.806f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.79f * width, centerPoint[1] - width / 2 + 0.772f * width,
        centerPoint[0]  - width / 2 + 0.788f * width, centerPoint[1] - width / 2 + 0.729f * width,
        centerPoint[0]  - width / 2 + 0.773f * width, centerPoint[1] - width / 2 + 0.704f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.818f * width, centerPoint[1] - width / 2 + 0.544f * width,
        centerPoint[0]  - width / 2 + 0.715f * width, centerPoint[1] - width / 2 + 0.567f * width,
        centerPoint[0]  - width / 2 + 0.722f * width, centerPoint[1] - width / 2 + 0.544f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.728f * width, centerPoint[1] - width / 2 + 0.52f * width,
        centerPoint[0]  - width / 2 + 0.709f * width, centerPoint[1] - width / 2 + 0.488f * width,
        centerPoint[0]  - width / 2 + 0.713f * width, centerPoint[1] - width / 2 + 0.452f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.717f * width, centerPoint[1] - width / 2 + 0.416f * width,
        centerPoint[0]  - width / 2 + 0.735f * width, centerPoint[1] - width / 2 + 0.317f * width,
        centerPoint[0]  - width / 2 + 0.656f * width, centerPoint[1] - width / 2 + 0.196f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.577f * width, centerPoint[1] - width / 2 + 0.074f * width,
        centerPoint[0]  - width / 2 + 0.474f * width, centerPoint[1] - width / 2 + 0.098f * width,
        centerPoint[0]  - width / 2 + 0.414f * width, centerPoint[1] - width / 2 + 0.132f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.312f * width, centerPoint[1] - width / 2 + 0.132f * width,
        centerPoint[0]  - width / 2 + 0.271f * width, centerPoint[1] - width / 2 + 0.292f * width,
        centerPoint[0]  - width / 2 + 0.273f * width, centerPoint[1] - width / 2 + 0.36f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.276f * width, centerPoint[1] - width / 2 + 0.428f * width,
        centerPoint[0]  - width / 2 + 0.26f * width, centerPoint[1] - width / 2 + 0.459f * width,
        centerPoint[0]  - width / 2 + 0.259f * width, centerPoint[1] - width / 2 + 0.534f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.257f * width, centerPoint[1] - width / 2 + 0.592f * width,
        centerPoint[0]  - width / 2 + 0.275f * width, centerPoint[1] - width / 2 + 0.623f * width,
        centerPoint[0]  - width / 2 + 0.294f * width, centerPoint[1] - width / 2 + 0.642f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.29f * width, centerPoint[1] - width / 2 + 0.657f * width,
        centerPoint[0]  - width / 2 + 0.279f * width, centerPoint[1] - width / 2 + 0.674f * width,
        centerPoint[0]  - width / 2 + 0.254f * width, centerPoint[1] - width / 2 + 0.663f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.254f * width, centerPoint[1] - width / 2 + 0.663f * width,
        centerPoint[0]  - width / 2 + 0.286f * width, centerPoint[1] - width / 2 + 0.694f * width,
        centerPoint[0]  - width / 2 + 0.31f * width, centerPoint[1] - width / 2 + 0.657f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.313f * width, centerPoint[1] - width / 2 + 0.659f * width,
        centerPoint[0]  - width / 2 + 0.316f * width, centerPoint[1] - width / 2 + 0.661f * width,
        centerPoint[0]  - width / 2 + 0.318f * width, centerPoint[1] - width / 2 + 0.663f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.34f * width, centerPoint[1] - width / 2 + 0.68f * width,
        centerPoint[0]  - width / 2 + 0.38f * width, centerPoint[1] - width / 2 + 0.704f * width,
        centerPoint[0]  - width / 2 + 0.404f * width, centerPoint[1] - width / 2 + 0.7f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.37f * width, centerPoint[1] - width / 2 + 0.687f * width,
        centerPoint[0]  - width / 2 + 0.367f * width, centerPoint[1] - width / 2 + 0.659f * width,
        centerPoint[0]  - width / 2 + 0.367f * width, centerPoint[1] - width / 2 + 0.659f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.367f * width, centerPoint[1] - width / 2 + 0.659f * width,
        centerPoint[0]  - width / 2 + 0.376f * width, centerPoint[1] - width / 2 + 0.67f * width,
        centerPoint[0]  - width / 2 + 0.391f * width, centerPoint[1] - width / 2 + 0.655f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.367f * width, centerPoint[1] - width / 2 + 0.659f * width,
        centerPoint[0]  - width / 2 + 0.355f * width, centerPoint[1] - width / 2 + 0.636f * width,
        centerPoint[0]  - width / 2 + 0.363f * width, centerPoint[1] - width / 2 + 0.612f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.408f * width, centerPoint[1] - width / 2 + 0.642f * width,
        centerPoint[0]  - width / 2 + 0.416f * width, centerPoint[1] - width / 2 + 0.582f * width,
        centerPoint[0]  - width / 2 + 0.416f * width, centerPoint[1] - width / 2 + 0.582f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.416f * width, centerPoint[1] - width / 2 + 0.582f * width,
        centerPoint[0]  - width / 2 + 0.41f * width, centerPoint[1] - width / 2 + 0.597f * width,
        centerPoint[0]  - width / 2 + 0.402f * width, centerPoint[1] - width / 2 + 0.599f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.359f * width, centerPoint[1] - width / 2 + 0.623f * width,
        centerPoint[0]  - width / 2 + 0.331f * width, centerPoint[1] - width / 2 + 0.448f * width,
        centerPoint[0]  - width / 2 + 0.344f * width, centerPoint[1] - width / 2 + 0.435f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.357f * width, centerPoint[1] - width / 2 + 0.422f * width,
        centerPoint[0]  - width / 2 + 0.391f * width, centerPoint[1] - width / 2 + 0.354f * width,
        centerPoint[0]  - width / 2 + 0.397f * width, centerPoint[1] - width / 2 + 0.32f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.404f * width, centerPoint[1] - width / 2 + 0.285f * width,
        centerPoint[0]  - width / 2 + 0.429f * width, centerPoint[1] - width / 2 + 0.226f * width,
        centerPoint[0]  - width / 2 + 0.429f * width, centerPoint[1] - width / 2 + 0.226f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.429f * width, centerPoint[1] - width / 2 + 0.226f * width,
        centerPoint[0]  - width / 2 + 0.438f * width, centerPoint[1] - width / 2 + 0.315f * width,
        centerPoint[0]  - width / 2 + 0.499f * width, centerPoint[1] - width / 2 + 0.311f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.519f * width, centerPoint[1] - width / 2 + 0.326f * width,
        centerPoint[0]  - width / 2 + 0.524f * width, centerPoint[1] - width / 2 + 0.346f * width,
        centerPoint[0]  - width / 2 + 0.553f * width, centerPoint[1] - width / 2 + 0.354f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.582f * width, centerPoint[1] - width / 2 + 0.361f * width,
        centerPoint[0]  - width / 2 + 0.594f * width, centerPoint[1] - width / 2 + 0.418f * width,
        centerPoint[0]  - width / 2 + 0.622f * width, centerPoint[1] - width / 2 + 0.426f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.622f * width, centerPoint[1] - width / 2 + 0.426f * width,
        centerPoint[0]  - width / 2 + 0.659f * width, centerPoint[1] - width / 2 + 0.648f * width,
        centerPoint[0]  - width / 2 + 0.579f * width, centerPoint[1] - width / 2 + 0.594f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.598f * width, centerPoint[1] - width / 2 + 0.617f * width,
        centerPoint[0]  - width / 2 + 0.595f * width, centerPoint[1] - width / 2 + 0.62f * width,
        centerPoint[0]  - width / 2 + 0.611f * width, centerPoint[1] - width / 2 + 0.621f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.608f * width, centerPoint[1] - width / 2 + 0.627f * width,
        centerPoint[0]  - width / 2 + 0.594f * width, centerPoint[1] - width / 2 + 0.626f * width,
        centerPoint[0]  - width / 2 + 0.594f * width, centerPoint[1] - width / 2 + 0.626f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.594f * width, centerPoint[1] - width / 2 + 0.626f * width,
        centerPoint[0]  - width / 2 + 0.602f * width, centerPoint[1] - width / 2 + 0.641f * width,
        centerPoint[0]  - width / 2 + 0.615f * width, centerPoint[1] - width / 2 + 0.634f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.618f * width, centerPoint[1] - width / 2 + 0.666f * width,
        centerPoint[0]  - width / 2 + 0.631f * width, centerPoint[1] - width / 2 + 0.67f * width,
        centerPoint[0]  - width / 2 + 0.631f * width, centerPoint[1] - width / 2 + 0.67f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.631f * width, centerPoint[1] - width / 2 + 0.67f * width,
        centerPoint[0]  - width / 2 + 0.625f * width, centerPoint[1] - width / 2 + 0.679f * width,
        centerPoint[0]  - width / 2 + 0.597f * width, centerPoint[1] - width / 2 + 0.693f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.632f * width, centerPoint[1] - width / 2 + 0.692f * width,
        centerPoint[0]  - width / 2 + 0.649f * width, centerPoint[1] - width / 2 + 0.687f * width,
        centerPoint[0]  - width / 2 + 0.666f * width, centerPoint[1] - width / 2 + 0.659f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.662f * width, centerPoint[1] - width / 2 + 0.678f * width,
        centerPoint[0]  - width / 2 + 0.675f * width, centerPoint[1] - width / 2 + 0.708f * width,
        centerPoint[0]  - width / 2 + 0.692f * width, centerPoint[1] - width / 2 + 0.721f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.709f * width, centerPoint[1] - width / 2 + 0.734f * width,
        centerPoint[0]  - width / 2 + 0.707f * width, centerPoint[1] - width / 2 + 0.747f * width,
        centerPoint[0]  - width / 2 + 0.698f * width, centerPoint[1] - width / 2 + 0.768f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.69f * width, centerPoint[1] - width / 2 + 0.789f * width,
        centerPoint[0]  - width / 2 + 0.696f * width, centerPoint[1] - width / 2 + 0.811f * width,
        centerPoint[0]  - width / 2 + 0.696f * width, centerPoint[1] - width / 2 + 0.811f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.696f * width, centerPoint[1] - width / 2 + 0.811f * width,
        centerPoint[0]  - width / 2 + 0.679f * width, centerPoint[1] - width / 2 + 0.823f * width,
        centerPoint[0]  - width / 2 + 0.683f * width, centerPoint[1] - width / 2 + 0.862f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.688f * width, centerPoint[1] - width / 2 + 0.9f * width,
        centerPoint[0]  - width / 2 + 0.735f * width, centerPoint[1] - width / 2 + 0.919f * width,
        centerPoint[0]  - width / 2 + 0.735f * width, centerPoint[1] - width / 2 + 0.9f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.756f * width, centerPoint[1] - width / 2 + 0.926f * width,
        centerPoint[0]  - width / 2 + 0.773f * width, centerPoint[1] - width / 2 + 0.902f * width,
        centerPoint[0]  - width / 2 + 0.773f * width, centerPoint[1] - width / 2 + 0.902f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.773f * width, centerPoint[1] - width / 2 + 0.902f * width,
        centerPoint[0]  - width / 2 + 0.756f * width, centerPoint[1] - width / 2 + 0.915f * width,
        centerPoint[0]  - width / 2 + 0.743f * width, centerPoint[1] - width / 2 + 0.892f * width
    );
    path.cubicTo(
        centerPoint[0]  - width / 2 + 0.773f * width, centerPoint[1] - width / 2 + 0.902f * width,
        centerPoint[0]  - width / 2 + 0.784f * width, centerPoint[1] - width / 2 + 0.864f * width,
        centerPoint[0]  - width / 2 + 0.784f * width, centerPoint[1] - width / 2 + 0.864f * width
    );
    return path;
  }

}
