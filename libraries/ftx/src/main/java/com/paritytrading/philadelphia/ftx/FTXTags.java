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
 * Tags for FTX FIX API.
 */
public class FTXTags {

    public static final int MassCancelRequestType    =   530;
    public static final int MassCancelResponse       =   531;
    public static final int MassCancelRejectReason   =   532;
    public static final int AggressorIndicator       =  1057;
    public static final int NoFills                  =  1362;
    public static final int FillExecID               =  1363;
    public static final int FillPx                   =  1364;
    public static final int FillQty                  =  1365;
    public static final int FillTradeID              =  1366;
    public static final int FillTime                 =  1367;
    public static final int RejectOnPriceBand        =  1368;
    public static final int RejectAfterTs            =  1369;
    public static final int FillLiquidityInd         =  1443;
    public static final int Liquidation              =  5000;
    public static final int CancelOrdersOnDisconnect =  8013;
    public static final int IncludeFillInfo          = 20000;
    public static final int FeeRate                  = 20100;
    public static final int Fee                      = 20101;

    private FTXTags() {
    }

}
