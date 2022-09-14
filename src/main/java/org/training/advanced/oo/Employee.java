package org.training.advanced.oo;

import org.training.advanced.annotations.MyFirstAnno;
import org.training.advanced.annotations.SecondAnno;

@MyFirstAnno(str = "emp", extraStr = "ext")
public class Employee extends Object {
    @MyFirstAnno(str = "name", val = 55)
    private String nameStr;
    protected String surname;
    Integer height;

    public Employee() {
    }

    public static Employee createEmployee() {
        return new Employee();
    }

    @MyFirstAnno(str = "met", extraStr = "deneme", val = 35, lVal = 345L)
    public void method1() {
        System.out.println("Employee method1 çalıştı");
        nameStr = "osman";
    }

    @SecondAnno(value = 10,xyz = "test")
    public void method2() {
        System.out.println("Employee method2 çalıştı");
        nameStr = "osman";
    }

    @SecondAnno(10)
    public void method3() {
        System.out.println("Employee method3 çalıştı");
        nameStr = "osman";
    }

    public void method4(String str,Integer it,int val,Employee other) {
        System.out.println("Employee method3 çalıştı");
        nameStr = "osman";
    }

    public String getName() {
        return nameStr;
    }

    public void setName(String name) {
        if (name.length() > 5) {
            this.nameStr = name;
        }
    }

}
