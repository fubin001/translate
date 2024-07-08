package com.example.apaar97.translate;

import java.math.BigInteger;
import java.security.MessageDigest;

public class Md5Util {
    /**
     * md5加密一（Java自身包实现-32位小写加密）
     * @param str
     * @return
     */
    public static String md5(String str) {
        byte[] secretBytes = null;
        try {
            secretBytes = MessageDigest.getInstance("md5").digest(
                    str.getBytes());
        } catch (Exception e) {
            throw new RuntimeException("没有这个md5算法！");
        }
        String md5code = new BigInteger(1, secretBytes).toString(16);
        for (int i = 0; i < 32 - md5code.length(); i++) {
            md5code = "0" + md5code;
        }
        return md5code;
    }
}
