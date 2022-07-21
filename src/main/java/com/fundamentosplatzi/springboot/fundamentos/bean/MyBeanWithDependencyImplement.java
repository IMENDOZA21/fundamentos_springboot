package com.fundamentosplatzi.springboot.fundamentos.bean;

public class MyBeanWithDependencyImplement implements MyBeanWithDependency{

    private MyOperation myOperation;

    @Override
    public void printWithDependency() {
        System.out.println("Hola desde la impementacion de un bean con dependencia");
        System.out.println(myOperation.suma(4));
    }

    public MyBeanWithDependencyImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }
}
