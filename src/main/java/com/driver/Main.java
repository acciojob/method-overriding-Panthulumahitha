package com.driver;

public class Main {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println("Output from class A's method: " + obj.meth());
        System.out.println("Output from overridden method in class B: " + obj.meth());
    }
}
