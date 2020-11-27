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

import static com.paritytrading.philadelphia.coinbase.CoinbaseTags.*;
import static com.paritytrading.philadelphia.fix42.FIX42Enumerations.*;
import static com.paritytrading.philadelphia.fix42.FIX42Tags.*;
import static org.junit.jupiter.api.Assertions.*;

import com.paritytrading.philadelphia.FIXMessage;
import org.junit.jupiter.api.Test;

class CoinbaseTest {

    @Test
    void sign() {
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
