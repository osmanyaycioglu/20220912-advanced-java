package org.training.advanced.oo;

public class GreetTr implements IGreet {

    @Override
    public String sayHello(String name) {
        return "Selam " + name;
    }

    @Override
    public String sayGoodbye(String name) {
        return "güle güle " + name;
    }


}
