package com.paritytrading.philadelphia.coinbase;

/**
 * Enumerations for Coinbase Pro FIX API and Coinbase Prime FIX API.
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

}
