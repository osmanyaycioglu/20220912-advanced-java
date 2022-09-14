package org.training.advanced.generics;

public class GenericHolder<A> {
    private A value;
    private Integer value2;

    public A getValue() {
        return value;
    }

    public void setValue(A value) {
        this.value = value;
    }

    public Integer getValue2() {
        return value2;
    }

    public void setValue2(Integer value2) {
        this.value2 = value2;
    }
}
