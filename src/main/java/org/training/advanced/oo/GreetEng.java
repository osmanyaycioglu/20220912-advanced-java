package org.training.advanced.oo;

public class GreetEng extends Hello implements IGreet,IDesc {

    @Override
    public String sayHello(String name) {
        return "hello " + name;
    }

    @Override
    public String sayGoodbye(String name) {
        return "goodbye " + name;
    }

    public String anotherHello(String name) {
        return "another hello " + name;
    }

    @Override
    public String getDesc() {
        return "Greet English";
    }

    @Override
    public String toString() {
        return "Greet English process";
    }
}
