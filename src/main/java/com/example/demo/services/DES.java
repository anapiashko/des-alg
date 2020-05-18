package com.example.demo.services;

public interface DES {

     String encryption(String key, String plainText);

     String decryption(String key, String cipherText);
}
