package org.training.advanced.generics;

import org.training.advanced.oo.Employee;

public class ConsoleWriter<T extends Employee> {

    public void writeToConsole(T t){
        t.method1();
        t.method2();
        t.method3();
    }

}
