package org.training.advanced.generics;

import org.training.advanced.oo.Employee;
import org.training.advanced.oo.GreetEsp;
import org.training.advanced.oo.GreetRun;
import org.training.advanced.oo.tt.Manager;

public class GenericRun {
    public static void main(String[] args) {
        IntHolder intHolder = new IntHolder();
        intHolder.setValue(100);
        int data = 100;
        Integer dataInteger = 100;
        intHolder.setValue(data);
        intHolder.setValue(dataInteger);
        Integer value = intHolder.getValue();

        ObjectHolder objectHolder = new ObjectHolder();
        objectHolder.setValue("osman");
        objectHolder.setValue(100);
        objectHolder.setValue(new Employee());
        objectHolder.setValue(new int[10]);
        Object value1 = objectHolder.getValue();
        if (value1 instanceof String) {
            String s = (String) value1;
        } else if (value1 instanceof Employee) {
            Employee employee = (Employee) value1;
        }

        GenericHolder<String> genericHolder = new GenericHolder<>();
        genericHolder.setValue("osman");
        String value2 = genericHolder.getValue();

        GenericTripleHolder<Integer, Long, Double> tr = new GenericTripleHolder<>();
        tr.showDemo(100,232442L,10.3D);

        ConsoleWriter<Employee> cw = new ConsoleWriter<>();
        cw.writeToConsole(new Employee());

        ConsoleWriter2<MyConsObject> consoleWriter2 = new ConsoleWriter2<>();
        showMe(100);
    }

    public static <G extends Number> String showMe(G str){
        return "Gelen tip : " + str.getClass().getName() + " value : " + str;
    }
}
