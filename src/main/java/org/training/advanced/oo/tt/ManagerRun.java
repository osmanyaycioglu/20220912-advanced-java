package org.training.advanced.oo.tt;

import org.training.advanced.oo.Employee;

public class ManagerRun {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.method1();
        manager.method2();

        System.out.println("*---------------------------*");
        Employee employee = new Employee();
        employee.method1();
        employee.method2();
    }
}
