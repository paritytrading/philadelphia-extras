package com.paritytrading.philadelphia.gdax;

import static com.paritytrading.philadelphia.fix42.FIX42MsgTypes.*;
import static com.paritytrading.philadelphia.fix42.FIX42Tags.*;
import static com.paritytrading.philadelphia.gdax.GDAXTags.*;
import static java.nio.charset.StandardCharsets.*;

import com.paritytrading.philadelphia.FIXMessage;
import com.paritytrading.philadelphia.FIXValue;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/**
 * Common definitions for GDAX FIX API.
 */
public class GDAX {

    private static final char SOH = '\u0001';

    private GDAX() {
    }

    /**
     * Sign a Logon message.
     *
     * @param message a Logon message
     * @param secret the secret
     * @throws IllegalStateException if one or more of the signature tags are
     *   missing
     */
    public static void sign(FIXMessage message, String secret) {
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
        presign.append(SOH);
        appendField(message, Password, "Password(554)", presign);

        Key key = new SecretKeySpec(Base64.getDecoder().decode(secret), "HmacSHA256");

        try {
            Mac mac = Mac.getInstance("HmacSHA256");

            mac.init(key);
            mac.update(presign.toString().getBytes(US_ASCII));

            String sign = Base64.getEncoder().encodeToString(mac.doFinal());

            message.addField(RawData).setString(sign);
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    private static void appendField(FIXMessage message, int tag, String fieldName, StringBuilder s) {
        FIXValue value = message.findField(tag);
        if (value == null)
            throw new IllegalStateException(fieldName + " not found");

        value.asString(s);
    }

}
