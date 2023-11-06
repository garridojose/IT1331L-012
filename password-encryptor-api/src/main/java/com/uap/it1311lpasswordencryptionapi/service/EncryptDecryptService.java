package com.uap.it1311lpasswordencryptionapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uap.it1311lpasswordencryptionapi.models.EncryptionResponse;
import com.uap.it1311lpasswordencryptionapi.webclient.EncryptionApiClient;

@Service
public class EncryptDecryptService {
    @Autowired
    EncryptionApiClient apiClient;
    
    public EncryptionResponse encrypt(String password){
        return apiClient.encrypt("testAlphaBravoCharlie", password, "AES");
    }
}
