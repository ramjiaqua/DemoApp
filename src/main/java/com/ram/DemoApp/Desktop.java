package com.ram.DemoApp;

import org.springframework.stereotype.Component;

@Component
//@Primary
public class Desktop implements Computer {

    public void compile(){
        System.out.println("Compilation from Desktop Class.");
    }
}
