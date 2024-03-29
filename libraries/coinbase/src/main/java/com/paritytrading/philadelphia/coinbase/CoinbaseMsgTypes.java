/*
 * Copyright 2019 Philadelphia authors
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
 * Message types for Coinbase Pro FIX API.
 */
public class CoinbaseMsgTypes {

    public static final String OrderCancelBatchRequest = "U4";
    public static final String OrderCancelBatchReject  = "U5";
    public static final String NewOrderBatch           = "U6";
    public static final String NewOrderBatchReject     = "U7";

    private CoinbaseMsgTypes() {
    }

}
