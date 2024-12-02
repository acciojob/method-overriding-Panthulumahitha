package com.driver.test;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestCases {
    @Test
    public void testMethInClassA() {
        Main.A a = new Main.A();
        String result = a.meth();
        assertEquals("Invoking method from class A", result);
    }

    @Test
    public void testMethInClassB() {
        Main.B b = new Main.B();
        String result = b.meth();
        assertEquals("Method is overridden in Extended class B", result);
    }
}
