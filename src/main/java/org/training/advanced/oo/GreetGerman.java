package org.training.advanced.oo;

public class GreetGerman implements IGreet {

    @Override
    public String sayHello(String name) {
        return "Halo " + name;
    }

    @Override
    public String sayGoodbye(String name) {
        return "Byebye " + name;
    }


}
