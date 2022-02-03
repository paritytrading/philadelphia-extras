/*
 * Copyright 2016 Philadelphia authors
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
package com.paritytrading.philadelphia.coinbase;

/**
 * Enumerations for Coinbase Pro FIX API.
 */
public class CoinbaseEnumerations {

    /**
     * Values for TimeInForce(59).
     */
    public static class CoinbaseTimeInForceValues {

        public static final char GoodTillCancel    = '1';
        public static final char ImmediateOrCancel = '3';
        public static final char FillOrKill        = '4';
        public static final char PostOnly          = 'P';

        private CoinbaseTimeInForceValues() {
        }

    }

    /**
     * Values for ExecType(150).
     */
    public static class CoinbaseExecTypeValues {

        public static final char NewOrder     = '0';
        public static final char Fill         = '1';
        public static final char Done         = '3';
        public static final char Canceled     = '4';
        public static final char Stopped      = '7';
        public static final char Rejected     = '8';
        public static final char OrderChanged = 'D';
        public static final char OrderStatus  = 'I';

        private CoinbaseExecTypeValues() {
        }

    }

    /**
     * Values for SelfTradePrevention(7928).
     */
    public static class CoinbaseSelfTradePreventionValues {

        public static final char DecrementAndCancel  = 'D';
        public static final char CancelRestingOrder  = 'O';
        public static final char CancelIncomingOrder = 'N';
        public static final char CancelBothOrders    = 'B';

        private CoinbaseSelfTradePreventionValues() {
        }

    }

    private CoinbaseEnumerations() {
    }

}
