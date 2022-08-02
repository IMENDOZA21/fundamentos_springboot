package com.fundamentosplatzi.springboot.fundamentos.bean;

public class MyBeanWithPropertiesImplement implements MyBeanWithProperties{
    private String nombre;
    private String apellido;
    //private Integer random;

    public MyBeanWithPropertiesImplement(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
       // this.random = random;
    }

    @Override
    public String funcionPropiedades() {
        return nombre+"--"+apellido;
    }
}
