package com.driver;

  public class A {
    public String meth() {
        return "Invoking method from class A";
    }
    public class B extends A {
    // Task 4: Override meth in class B
    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}
public class Main {
   public static void main(String[] args) {
        // Task 3: Create an object of class B and call meth from class A
        B obj = new B();

        // Before overriding
        System.out.println("Output from class A's method: " + obj.meth());

        // After overriding
        System.out.println("Output from overridden method in class B: " + obj.meth());
    }

}
