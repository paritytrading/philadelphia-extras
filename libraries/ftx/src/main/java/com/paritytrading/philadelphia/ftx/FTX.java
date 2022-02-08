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

import static com.paritytrading.philadelphia.fix42.FIX42MsgTypes.*;
import static com.paritytrading.philadelphia.fix42.FIX42Tags.*;
import static java.nio.charset.StandardCharsets.*;

import com.paritytrading.philadelphia.FIXMessage;
import com.paritytrading.philadelphia.FIXValue;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/**
 * Common definitions for FTX FIX API.
 */
public class FTX {

    private static final char[] HEX_DIGITS = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f',
    };

    private static final char SOH = '\u0001';

    private FTX() {
    }

    /**
     * <p>Sign a Logon(A) message. Before calling this method, the following
     * required fields must already be present in the message:</p>
     *
     * <ul>
     *   <li>SendingTime(52)</li>
     *   <li>MsgSeqNum(34)</li>
     *   <li>SenderCompID(49)</li>
     *   <li>TargetCompID(56)</li>
     * </ul>
     *
     * <p>This method adds a RawData(96) field to the message.</p>
     *
     * @param message a Logon(A) message
     * @param apiSecret the API secret
     * @throws IllegalStateException if one or more of the required fields are
     *     missing
     */
    public static void sign(FIXMessage message, String apiSecret) {
        StringBuilder presign = new StringBuilder();

        appendField(message, SendingTime, "SendingTime(52)", presign);
        presign.append(SOH);
        presign.append(Logon);
        presign.append(SOH);
        appendField(message, MsgSeqNum, "MsgSeqNum(34)", presign);
        presign.append(SOH);
        appendField(message, SenderCompID, "SenderCompID(49)", presign);
        presign.append(SOH);
        appendField(message, TargetCompID, "TargetCompID(56)", presign);

        Key key = new SecretKeySpec(apiSecret.getBytes(US_ASCII), "HmacSHA256");

        try {
            Mac mac = Mac.getInstance("HmacSHA256");

            mac.init(key);
            mac.update(presign.toString().getBytes(US_ASCII));

            String sign = toHexString(mac.doFinal());

            message.addField(RawData).setString(sign);
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    private static void appendField(FIXMessage message, int tag, String fieldName, StringBuilder s) {
        FIXValue value = message.valueOf(tag);
        if (value == null)
            throw new IllegalStateException(fieldName + " not found");

        value.asString(s);
    }

    private static String toHexString(byte[] bytes) {
        StringBuilder hexString = new StringBuilder(bytes.length * 2);

        for (byte b : bytes) {
            hexString.append(HEX_DIGITS[(0xf0 & b) >> 4]);
            hexString.append(HEX_DIGITS[ 0x0f & b      ]);
        }

        return hexString.toString();
    }

}
