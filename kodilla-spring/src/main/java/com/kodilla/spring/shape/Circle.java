package com.kodilla.spring.shape;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Circle implements Shape {

   public String getShapeName(){
        return "This is circle";
    }
}
