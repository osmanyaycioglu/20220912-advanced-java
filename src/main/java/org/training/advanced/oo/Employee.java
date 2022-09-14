package org.training.advanced.oo;

public class Employee extends Object {
    private String nameStr;
    protected String surname;
    Integer height;

    public Employee(){
    }

    public static Employee createEmployee(){
        return new Employee();
    }

    public void method1(){
        System.out.println("Employee method1 çalıştı");
        nameStr = "osman";
    }

    public void method2(){
        System.out.println("Employee method2 çalıştı");
        nameStr = "osman";
    }

    public void method3(){
        System.out.println("Employee method3 çalıştı");
        nameStr = "osman";
    }


    public String getName() {
        return nameStr;
    }

    public void setName(String name) {
        if (name.length() > 5){
            this.nameStr = name;
        }
    }

}
