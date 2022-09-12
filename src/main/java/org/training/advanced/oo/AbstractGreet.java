package org.training.advanced.oo;

public abstract class AbstractGreet implements IGreet {

    public void method1(){
        System.out.println("Hello");
    }

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }

    abstract String testMe();
}
