package com.kodilla.spring.shape;

import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape {

   public String getShapeName(){
        return "This is circle";
    }
}
