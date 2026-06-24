package ru.mos.qa.testtasks.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ru.mos.qa.testtasks.Stack;


public class StackTests {

    private Stack stack;

    @BeforeEach
    public void setUp() {
        stack = new Stack(5);
    }


    @Test
    public void addElement() {
        stack.addElement(3);
        Assertions.assertEquals(3, stack.readTop());
    }

    @Test
    public void deleteElement() {
        stack.addElement(3);
        stack.addElement(5);
        stack.deleteElement();
        Assertions.assertEquals(3, stack.readTop());
    }

    @Test
    public void readTop() {
        stack.addElement(7);
        stack.addElement(1);
        stack.deleteElement();
        Assertions.assertEquals(7, stack.readTop());
    }

    @Test
    public void isEmpty() {
        Assertions.assertEquals(true, stack.isEmpty());
    }

    @Test
    public void isFull() {
        stack.addElement(4);
        Assertions.assertEquals(false, stack.isFull());
    }

}


