package org.training.advanced.oo;

public class ConcereteGreet extends AbstractGreet {
    @Override
    public String sayGoodbye(String name) {
        return "Goodbye " + name;
    }

    @Override
    String testMe() {
        return "Tested";
    }
}
