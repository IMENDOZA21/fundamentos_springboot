package com.fundamentosplatzi.springboot.fundamentos.component;

import org.springframework.stereotype.Component;

import java.sql.SQLOutput;
@Component
public class ComponentTwoImplement implements ComponentDependency{

    @Override
    public void saludar() {
        System.out.println("Hola inyectando la segunda dependencia");
    }
}
