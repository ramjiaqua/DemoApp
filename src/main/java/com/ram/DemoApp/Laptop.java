package com.ram.DemoApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Laptop implements Computer {

    public void compile(){
        System.out.println("Compilation from Laptop Class.");
    }
}
