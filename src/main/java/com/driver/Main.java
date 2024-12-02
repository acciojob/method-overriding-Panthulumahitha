package com.driver;

// Main.java
public class Main {
    // Class A defined inside Main
    static class A {
        public String meth() {
            return "Invoking method from class A";
        }
    }

    // Class B defined inside Main
    static class B extends A {
        @Override
        public String meth() {
            return "Method is overridden in Extended class B";
        }
    }

    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.meth()); // Calls the overridden method in class B
    }
}
