package com.ram.DemoApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@RestController
@Component
public class Dev {
   // @RequestMapping("/")

    //Field Dependency Injection - Not Recommended.
    @Autowired
    @Qualifier("desktop")
    private Computer comp;

    //Constructor Dependency Injection (CDI) - Highly Recommended.
//  public Dev(Laptop laptop)
//  {
//      this.laptop = laptop;
//   }

    //Setter Dependency Injection
    //    @Autowired
    //   public void setlaptop(Laptop laptop)
    //   {
    //       this.laptop = laptop;
    //   }


    public void greet(){
       System.out.println("Hello World from Computer Class.");
        comp.compile();
    }



}
