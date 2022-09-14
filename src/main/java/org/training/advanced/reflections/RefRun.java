package org.training.advanced.reflections;

import org.training.advanced.annotations.SecondAnno;
import org.training.advanced.oo.Employee;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class RefRun {
    public static void main(String[] args) throws Exception {
        // 1. yol
        Class<Employee> employeeClass = Employee.class;

        // 2. yol
        Employee instance = new Employee();
        instance.setName("osmanxyz");
        Class<?> aClass = instance.getClass();

        // 3.yol
        try {
            Class<?> aClass1 = Class.forName("org.training.advanced.oo.Employee");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field f : declaredFields) {
            f.setAccessible(true);
            System.out.println(f.getName() + " : " + f.get(instance));
        }
        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method m : declaredMethods) {
            SecondAnno annotation = m.getAnnotation(SecondAnno.class);
            if (annotation != null){
                System.out.println(m.getName() + " : SeconAnno : " + annotation.value() + " " + annotation.xyz());
            }
            System.out.println(m.getName() + " : " + m.getReturnType()
                                                      .getName() + "->" + params(m.getParameterTypes()));
        }
    }

    public static String params(Class<?>[] classes) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Class<?> cz : classes) {
            stringBuilder.append("class : ");
            stringBuilder.append(cz.getName());
            stringBuilder.append(",");
        }
        return stringBuilder.toString();
    }

}
