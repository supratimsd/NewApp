package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop implements Computer {
    public void compile(){
        System.out.println("404 not found");
    }
    // public void debug(){
    //     System.out.println("mind error");
    // }
}
