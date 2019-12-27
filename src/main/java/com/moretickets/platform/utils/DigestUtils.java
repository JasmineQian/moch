package com.moretickets.platform.utils;


import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class DigestUtils {

    public static String md5Hex(String psw){
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.update(psw.getBytes("UTF-8"));
            byte[] encryption = md5.digest();

            StringBuffer strBuf = new StringBuffer();
            for (int i = 0; i < encryption.length; i++) {
                if (Integer.toHexString(0xff & encryption[i]).length() == 1) {
                    strBuf.append("0").append(Integer.toHexString(0xff & encryption[i]));
                } else {
                    strBuf.append(Integer.toHexString(0xff & encryption[i]));
                }
            }
            return strBuf.toString();
        } catch (NoSuchAlgorithmException e) {
            return "NoSuchAlgorithmException";
        } catch (UnsupportedEncodingException e) {
            return "UnsupportedEncodingException";
        }
    }

}
