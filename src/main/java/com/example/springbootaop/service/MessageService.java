package com.example.springbootaop.service;

import org.springframework.stereotype.Service;

@Service
public class MessageService {

    public String mesajVer(String param){
        System.out.println("metod mesaj verdi param: " + param);
        return param;
    }
}