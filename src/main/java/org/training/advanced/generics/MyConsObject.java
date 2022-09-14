package org.training.advanced.generics;

import org.training.advanced.oo.Employee;
import org.training.advanced.oo.IDesc;
import org.training.advanced.oo.IGreet;

public class MyConsObject extends Employee implements IGreet, IDesc {
    @Override
    public String getDesc() {
        return "test";
    }

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }

    @Override
    public String sayGoodbye(String name) {
        return "Goodbye " + name;
    }
}
