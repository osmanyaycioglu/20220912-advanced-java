package org.training.advanced.oo;

public class GreetEsp implements IGreet {

    @Override
    public String sayHello(String name) {
        return "Ola " + name;
    }

    @Override
    public String sayGoodbye(String name) {
        return "Adios " + name;
    }


}
