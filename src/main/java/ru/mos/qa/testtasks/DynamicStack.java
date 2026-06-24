package ru.mos.qa.testtasks;

import java.util.Arrays;

public class DynamicStack {
    private int top;
    private int[] stackArray;
    private static final int default_capacity = 10;

    public DynamicStack() {
        this.top = -1;
        this.stackArray = new int[default_capacity];
    }

    public void grow() {
        int newCapacity = stackArray.length * 2;
        stackArray = Arrays.copyOf(stackArray, newCapacity);
    }

    public void shrink() {
        int newCapacity = stackArray.length / 2;
        stackArray = Arrays.copyOf(stackArray, newCapacity);
    }

    public void addElement(int element) {
        if (top == stackArray.length - 1) {
            grow();
        }
        stackArray[++top] = element;
    }

    public int deleteElement() {
        int element =  stackArray[top--];

        int currentSize = top + 1;
        if(stackArray.length > default_capacity && currentSize < stackArray.length / 2) {
            shrink();
        }

        return element;
    }

    public int readTop() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public int getCapacity () {
        return stackArray.length;
    }
}
