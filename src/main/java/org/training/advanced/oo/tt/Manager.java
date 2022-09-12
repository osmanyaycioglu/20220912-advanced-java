package org.training.advanced.oo.tt;

import org.training.advanced.oo.Employee;

public class Manager extends Employee {

    public Manager(){
        surname = "pokemon";
    }

    @Override
    public void method1() {
        System.out.println("Manager Method1 çalıştı.");
        super.method1();
        this.method2();
        this.method3();

    }

    @Override
    public void method2() {
        System.out.println("Manager Method2 çalıştı.");
    }
}
