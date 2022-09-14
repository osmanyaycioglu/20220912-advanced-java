package org.training.advanced.generics;

public class IntHolder {

    private Integer value;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public <T extends Number> Integer add(T value){
        return this.value + value.intValue();
    }
}
