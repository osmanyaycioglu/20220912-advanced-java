package org.training.advanced.lambdas;

public class HelloEng implements IHello {
    private final String prefix;

    public HelloEng(String prefix) {
        this.prefix = prefix;
    }

    @Override
    public String sayHello(String name) {
        return "hello " + prefix + " " + name;
    }
}
