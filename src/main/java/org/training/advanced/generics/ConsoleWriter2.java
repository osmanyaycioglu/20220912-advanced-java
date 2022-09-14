package org.training.advanced.generics;

import org.training.advanced.oo.Employee;
import org.training.advanced.oo.IDesc;
import org.training.advanced.oo.IGreet;

public class ConsoleWriter2<T extends Employee & IGreet & IDesc> {

    public void writeToConsole(T t){
        t.method1();
        t.method2();
        t.method3();
        t.sayHello("osman");
        t.sayGoodbye("osman");
    }


}
