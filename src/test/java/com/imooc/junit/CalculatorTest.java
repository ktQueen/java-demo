package com.imooc.junit;

import junit.framework.TestCase;
import org.junit.Test;

public class CalculatorTest extends TestCase {
    private Calculator cal = new Calculator();

    @Test
    public void testAdd() {
        int result = cal.add(1, 2);
        System.out.println(result);
    }

    public void testSubtract() {
    }

    public void testMultiply() {
    }

    public void testDivide() {
    }
}