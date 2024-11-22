package org.strijewski.problems.encryption;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.Base64;

public class AESEncryption {
    public static String encrypt(String plaintext, SecretKey key) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encodedBytes = cipher.doFinal(plaintext.getBytes());
        return Base64.getEncoder().encodeToString(encodedBytes);
    }

    public static String decrypt(String base64EncodedCiphertext, SecretKey key) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] ciphertext = cipher.doFinal(Base64.getDecoder().decode(base64EncodedCiphertext));
        return new String(ciphertext);
    }

    public static void main(String[] args) throws Exception {
        final String stringToEncrypt = "This is the string to encrypt.";
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(256);
        SecretKey secretKey = keyGenerator.generateKey();

        String ciphertextString = encrypt(stringToEncrypt, secretKey);

        String decodedString = decrypt(ciphertextString, secretKey);

        System.out.println("Original plaintext: "+ stringToEncrypt);
        System.out.println("Encrypted text, base64encoded: " + ciphertextString);
        System.out.println("Decoded text: " + decodedString);
    }
}
