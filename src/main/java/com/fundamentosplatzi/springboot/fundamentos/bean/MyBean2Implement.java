package com.fundamentosplatzi.springboot.fundamentos.bean;

public class MyBean2Implement implements MyBean{
    @Override
    public void print() {
        System.out.println("Hola desde mi Segunda implementacion propia del bean");
    }
}
