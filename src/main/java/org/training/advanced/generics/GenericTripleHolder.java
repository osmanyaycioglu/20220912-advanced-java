package org.training.advanced.generics;

public class GenericTripleHolder<A,B,C> {
    private A value1;
    private B value2;
    private C value3;

    public void showDemo(A a,B b,C c){
        System.out.println("values : " + a + " " + b + " " + c);
    }

    public A getValue1() {
        return value1;
    }

    public void setValue1(A value1) {
        this.value1 = value1;
    }

    public B getValue2() {
        return value2;
    }

    public void setValue2(B value2) {
        this.value2 = value2;
    }

    public C getValue3() {
        return value3;
    }

    public void setValue3(C value3) {
        this.value3 = value3;
    }
}
