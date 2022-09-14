package org.training.advanced.annotations;

import org.training.advanced.oo.Employee;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.METHOD,ElementType.TYPE})
@Documented
public @interface MyFirstAnno {
    String str();
    String extraStr() default "extra";
    int val() default 23;
    long lVal() default 100L;
}
