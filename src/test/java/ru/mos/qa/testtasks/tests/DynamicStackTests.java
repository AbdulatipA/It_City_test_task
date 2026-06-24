package ru.mos.qa.testtasks.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.mos.qa.testtasks.DynamicStack;

public class DynamicStackTests {
    DynamicStack dynamicStack;

    @BeforeEach
    public void setUp() {
        dynamicStack = new DynamicStack();
    }

    @Test
    public void addElement() {
        dynamicStack.addElement(1);
        dynamicStack.addElement(2);
        Assertions.assertEquals(2, dynamicStack.readTop());
    }

    @Test
    public void deleteElement() {
        dynamicStack.addElement(1);
        dynamicStack.addElement(2);
        dynamicStack.deleteElement();
        Assertions.assertEquals(1, dynamicStack.readTop());
    }

    @Test
    public void readTop() {
        dynamicStack.addElement(1);
        dynamicStack.addElement(2);
        Assertions.assertEquals(2, dynamicStack.readTop());
    }

    @Test
    public void isEmpty() {
        dynamicStack.addElement(1);
        dynamicStack.addElement(2);
        Assertions.assertEquals(false, dynamicStack.isEmpty());
    }

    @Test
    public void getCapacity() {
        dynamicStack.addElement(1);
        dynamicStack.addElement(2);
        Assertions.assertEquals(10, dynamicStack.getCapacity());
    }

    @Test
    public void grow() {
        for (int i = 0; i < 11; i++) {
            dynamicStack.addElement(i);
        }
        Assertions.assertEquals(20, dynamicStack.getCapacity());
    }

    @Test
    public void shrink() {
        for (int i = 0; i < 11; i++) {
            dynamicStack.addElement(i);
        }

        for (int i = 0; i < 5; i++) {
            dynamicStack.deleteElement();
        }
        Assertions.assertEquals(10, dynamicStack.getCapacity());
    }
}
