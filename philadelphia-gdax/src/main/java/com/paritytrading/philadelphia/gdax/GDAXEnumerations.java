package com.paritytrading.philadelphia.gdax;

/**
 * Enumerations for GDAX FIX API.
 */
public class GDAXEnumerations {

    /**
     * Values for TimeInForce(59).
     */
    public static class GDAXTimeInForceValues {

        public static final char GoodTillCancel    = '1';
        public static final char ImmediateOrCancel = '3';
        public static final char FillOrKill        = '4';
        public static final char PostOnly          = 'P';

        private GDAXTimeInForceValues() {
        }

    }

    /**
     * Values for ExecType(150).
     */
    public static class GDAXExecTypeValues {

        public static final char NewOrder     = '0';
        public static final char Fill         = '1';
        public static final char Done         = '3';
        public static final char Canceled     = '4';
        public static final char Stopped      = '7';
        public static final char Rejected     = '8';
        public static final char OrderChanged = 'D';
        public static final char OrderStatus  = 'I';

        private GDAXExecTypeValues() {
        }

    }

    /**
     * Values for SelfTradePrevention(7928).
     */
    public static class GDAXFIXSelfTradePreventionValues {

        public static final char DecrementAndCancel  = 'D';
        public static final char CancelRestingOrder  = 'O';
        public static final char CancelIncomingOrder = 'N';
        public static final char CancelBothOrders    = 'B';

        private GDAXFIXSelfTradePreventionValues() {
        }

    }

}
