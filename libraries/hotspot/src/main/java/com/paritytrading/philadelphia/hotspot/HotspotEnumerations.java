package com.paritytrading.philadelphia.hotspot;

/**
 * Enumerations for Bats Hotspot FIX Proxy 4.0.
 */
public class HotspotEnumerations {

    /**
     * Values for CxlRejReason(102).
     */
    public static class HotspotCxlRejReasonValues {

        public static final int TooLateToCancel             =  0;
        public static final int UnknownOrder                =  1;
        public static final int OrderAlreadyInPendingStatus =  3;
        public static final int DuplicateClOrdID            =  6;
        public static final int Other                       = 99;

        private HotspotCxlRejReasonValues() {
        }

    }

    /**
     * Values for ExecType(150).
     */
    public static class HotspotExecTypeValues {

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

        private HotspotExecTypeValues() {
        }

    }

    private HotspotEnumerations() {
    }

}
