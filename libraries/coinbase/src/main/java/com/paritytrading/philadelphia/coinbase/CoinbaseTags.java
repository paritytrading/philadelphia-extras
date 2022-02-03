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
 * Tags for Coinbase Pro FIX API.
 */
public class CoinbaseTags {

    public static final int Password                 =  554;
    public static final int TradeID                  = 1003;
    public static final int AggressorIndicator       = 1057;
    public static final int SelfTradePrevention      = 7928;
    public static final int CancelOrdersOnDisconnect = 8013;
    public static final int BatchID                  = 8014;
    public static final int DropCopyFlag             = 9406;

    private CoinbaseTags() {
    }

}
