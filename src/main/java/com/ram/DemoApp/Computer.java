package com.ram.DemoApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@RestController
@Component
public class Computer {
   // @RequestMapping("/")

    //Field Dependency Injection - Not Recommended.
    //@Autowired

    private Laptop laptop;

    //Constructor Dependency Injection (CDI) - Highly Recommended.
  public Computer(Laptop laptop)
  {
      this.laptop = laptop;
   }

    //Setter Dependency Injection
    //    @Autowired
    //   public void setlaptop(Laptop laptop)
    //   {
    //       this.laptop = laptop;
    //   }


    public void greet(){
       System.out.println("Hello World from Computer Class.");
        laptop.compile();
    }



}
