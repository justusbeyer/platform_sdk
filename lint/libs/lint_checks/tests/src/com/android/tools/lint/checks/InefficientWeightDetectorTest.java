/*
 * Copyright (C) 2011 The Android Open Source Project
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

package com.android.tools.lint.checks;

import com.android.tools.lint.detector.api.Detector;

@SuppressWarnings("javadoc")
public class InefficientWeightDetectorTest extends AbstractCheckTest {
    @Override
    protected Detector getDetector() {
        return new InefficientWeightDetector();
    }

    public void testWeights() throws Exception {
        assertEquals(
                "inefficient_weight.xml:10: Warning: Use a layout_width of 0dip instead of " +
                        "match_parent for better performance\n" +
                "inefficient_weight.xml:24: Warning: Use a layout_height of 0dip instead of " +
                        "wrap_content for better performance",
                lint("res/layout/inefficient_weight.xml"));
    }
}
