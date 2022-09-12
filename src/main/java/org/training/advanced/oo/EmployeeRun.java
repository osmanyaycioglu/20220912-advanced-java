package org.training.advanced.oo;

public class EmployeeRun {

    public static void main(String[] args) {
        ConcereteGreet greet = new ConcereteGreet();
        Employee employee = Employee.createEmployee();
        String s = "test";
        employee.setName("test");
        employee.surname = "abc";
        employee.height = 120;
    }

}
