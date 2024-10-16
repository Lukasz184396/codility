package com.codility.recruitment;

public class Tmp {
    public static void main(String[] args) {
        X myObject = new X();
        foo(myObject);
        System.out.println("a: " + myObject.getA());
        System.out.println("b: " + myObject.getB());
    }

    public static void foo(X instance) {
        instance.setA(5);
        instance.setB(2);
        instance = new X();
        instance.setA(3);
        instance.setB(4);
    }

}

class X {
    private int a;
    private int b;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}