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
package com.paritytrading.philadelphia.cboe.fx;

/**
 * Tags for Cboe FX FIX Proxy 5.1.4.
 */
public class CboeFXTags {

    public static int Username            =  553;
    public static int Password            =  554;
    public static int TradeLinkIDs        =  820;
    public static int NumberInCompetition = 6997;
    public static int ContraQty           = 6998;
    public static int ClientType          = 6999;
    public static int ConfirmDelay        = 7000;
    public static int Persistent          = 7001;
    public static int HSFXQuoteLayer      = 7225;

    private CboeFXTags() {
    }

}
