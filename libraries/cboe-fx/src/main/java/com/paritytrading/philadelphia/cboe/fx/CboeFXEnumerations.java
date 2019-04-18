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
 * Enumerations for Cboe FX FIX Proxy 5.1.4.
 */
public class CboeFXEnumerations {

    /**
     * Values for OrdStatus(39).
     */
    public static class CboeFXOrdStatusValues {

        public static final char New             = '0';
        public static final char PartiallyFilled = '1';
        public static final char Filled          = '2';
        public static final char AverageTrade    = '3';
        public static final char Canceled        = '4';
        public static final char Replaced        = '5';
        public static final char PendingCancel   = '6';
        public static final char Rejected        = '8';
        public static final char Expired         = 'C';
        public static final char PendingReplace  = 'E';

        private CboeFXOrdStatusValues() {
        }

    }

    /**
     * Values for CxlRejReason(102).
     */
    public static class CboeFXCxlRejReasonValues {

        public static final int TooLateToCancel             =  0;
        public static final int UnknownOrder                =  1;
        public static final int OrderAlreadyInPendingStatus =  3;
        public static final int DuplicateClOrdID            =  6;
        public static final int Other                       = 99;

        private CboeFXCxlRejReasonValues() {
        }

    }

    /**
     * Values for ExecType(150).
     */
    public static class CboeFXExecTypeValues {

        public static final char New                = '0';
        public static final char DoneForDay         = '3';
        public static final char Canceled           = '4';
        public static final char Replace            = '5';
        public static final char PendingCancel      = '6';
        public static final char Rejected           = '8';
        public static final char Expired            = 'C';
        public static final char AcceptedForPidding = 'D';
        public static final char PendingReplace     = 'E';
        public static final char Trade              = 'F';
        public static final char Status             = 'I';

        private CboeFXExecTypeValues() {
        }

    }

    /**
     * Values for ClientType(6999).
     */
    public static class CboeFXClientTypeValues {

        public static final int GUI = 1;
        public static final int API = 2;

        private CboeFXClientTypeValues() {
        }

    }

    private CboeFXEnumerations() {
    }

}
