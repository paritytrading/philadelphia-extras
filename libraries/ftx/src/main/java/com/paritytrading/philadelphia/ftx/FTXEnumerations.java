/*
 * Copyright 2022 Philadelphia authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.paritytrading.philadelphia.ftx;

/**
 * Enumerations for FTX FIX API.
 */
public class FTXEnumerations {

    /**
     * Values for OrdRejReason(103).
     */
    public static class OrdRejReasonValues {

        public static final int Other              =  0;
        public static final int RiskLimitsExceeded =  3;
        public static final int TooManyRequests    = 99;

        private OrdRejReasonValues() {
        }

    }

    /**
     * Values for FillLiquidityInd(1443).
     */
    public static class FillLiquidityIndValues {

        public static final int AddedLiquidity   = 1;
        public static final int RemovedLiquidity = 2;

        private FillLiquidityIndValues() {
        }

    }

    private FTXEnumerations() {
    }

}
