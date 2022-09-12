package org.training.advanced.oo;

public class GreetJp implements IGreet {

    @Override
    public String sayHello(String name) {
        return "Ojigi " + name;
    }

    @Override
    public String sayGoodbye(String name) {
        return "Koji " + name;
    }


}
