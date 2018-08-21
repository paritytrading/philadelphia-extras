package com.paritytrading.philadelphia.coinbase;

import static com.paritytrading.philadelphia.coinbase.CoinbaseTags.*;
import static com.paritytrading.philadelphia.fix42.FIX42Enumerations.*;
import static com.paritytrading.philadelphia.fix42.FIX42Tags.*;
import static org.junit.Assert.*;

import com.paritytrading.philadelphia.FIXMessage;
import org.junit.Before;
import org.junit.Test;

public class CoinbaseTest {

    @Test
    public void sign() {
        FIXMessage message = new FIXMessage(64, 64);

        message.addField(SenderCompID).setString("foo");
        message.addField(TargetCompID).setString("Coinbase");
        message.addField(MsgSeqNum).setInt(1);
        message.addField(SendingTime).setString("20160118-09:30:00.000");
        message.addField(EncryptMethod).setInt(EncryptMethodValues.None);
        message.addField(HeartBtInt).setInt(30);
        message.addField(Password).setString("bar");

        String secret = "baz";

        Coinbase.sign(message, secret);

        assertNotNull(message.valueOf(RawData));
    }

}
