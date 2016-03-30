package com.paritytrading.philadelphia.iex;

/**
 * Enumerations for IEX FIX 2.3.
 *
 * <p>See Section 1.2.1 of the specification.</p>
 */
public class IEXEnumerations {

    /**
     * Values for ExecInst(18).
     */
    public static class IEXExecInstValues {

        public static final char MidpointPeg      = 'M';
        public static final char PrimaryPeg       = 'R';
        public static final char DiscretionaryPeg = 'd';
        public static final char ISO              = 'f';
        public static final char IEXOnly          = 'i';
        public static final char SweepPostPlus    = 'r';
        public static final char RouterPlus       = 's';
        public static final char SweepPost        = 't';
        public static final char Router           = 'u';
        public static final char RouteToRestAway  = 'v';

        private IEXExecInstValues() {
        }

    }

    /**
     * Values for TimeInForce(59).
     */
    public static class IEXTimeInForceValues {

        public static final char Day                = '0';
        public static final char IOC                = '3';
        public static final char FOK                = '4';
        public static final char GoodTilExtendedDay = '5';
        public static final char GoodTilTime        = '6';
        public static final char SystemHours        = 'M';

        private IEXTimeInForceValues() {
        }

    }

    /**
     * Values for LastLiquidityInd(851).
     */
    public static class IEXLastLiquidityIndValues {

        public static final int AddedLiquidity            = 1;
        public static final int RemovedLiquidity          = 2;
        public static final int Routed                    = 3;
        public static final int RemovedLiquidityOnRecheck = 9;

        private IEXLastLiquidityIndValues() {
        }

    }

    /**
     * Values for MinQtyInstruction(9500).
     */
    public static class IEXMinQtyInstructionValues {

        public static final char Composite                               = 'C';
        public static final char MinimumExecutionSizeWithCancelRemaining = 'M';
        public static final char MinimumExecutionSizeWithAONRemaining    = 'A';

        private IEXMinQtyInstructionValues() {
        }

    }

    /**
     * Values for TradeLiquidityIndicator(9730).
     */
    public static class IEXTradeLiquidityIndicatorValues {

        public static final String TradeWithSelfMatchWithoutDisplayedLiquidity    = "S";
        public static final String TradeWithSelfMatchWithDisplayedLiquidity       = "SL";
        public static final String TradeWithoutSelfMatchWithDisplayedLiquidity    = "L";
        public static final String TradeWithoutSelfMatchWithoutDisplayedLiquidity = "I";

        private IEXTradeLiquidityIndicatorValues() {
        }

    }

    private IEXEnumerations() {
    }

}
