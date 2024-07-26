package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Student {
    @Autowired // field injection
    private Computer computer;
    
    // public void setLaptop(Laptop laptop){    //setter injection
    //     this.laptop=laptop;
    // }

    // public Student(Laptop laptop){ //constructor injection
    //     this.laptop=laptop;
    // }
    public void Project(){
        

        computer.compile();
       
        // laptop.debug();
        System.out.println("Hello aspirants!!");
    }

}
