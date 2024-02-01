package com.example.ignoressldemo.controllers;

import com.example.ignoressldemo.models.LoginRequest;
import com.example.ignoressldemo.models.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;

@RestController
public class MainController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/login")
    String login() throws NoSuchAlgorithmException, KeyStoreException, KeyManagementException {
        String url = "https://158.101.229.194/PatientPortalService/api/account/Login";
        LoginRequest loginRequest = new LoginRequest("test.test@outlook.com", "******", true, "Windows 11 Pro", "11.1.0.1", "Concepts Patient Portal", "1.0.0.0-preview 8", "mypage");
        try{
            LoginResponse loginResponse = restTemplate.postForObject(url,loginRequest, LoginResponse.class);
            System.out.println(loginResponse.getToken().getBearer());
            return "Login Success";

        }catch(Exception e) {
            System.out.println(e);
            return "Login Failed";
        }
    }
}
