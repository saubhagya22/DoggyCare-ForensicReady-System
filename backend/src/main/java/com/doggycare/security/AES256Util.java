package com.doggycare.security;

// Placeholder utility - implement secure key management in production
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class AES256Util {
    private static final String ALGO = "AES";
    private static final byte[] key = "0123456789abcdef0123456789abcdef".getBytes();

    public static String encrypt(String plain) throws Exception {
        SecretKeySpec secretKey = new SecretKeySpec(key, ALGO);
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encrypted = cipher.doFinal(plain.getBytes());
        return Base64.getEncoder().encodeToString(encrypted);
    }
    public static String decrypt(String cipherText) throws Exception {
        SecretKeySpec secretKey = new SecretKeySpec(key, ALGO);
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decoded = Base64.getDecoder().decode(cipherText);
        return new String(cipher.doFinal(decoded));
    }
}
