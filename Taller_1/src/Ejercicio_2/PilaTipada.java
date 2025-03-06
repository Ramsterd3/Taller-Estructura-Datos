package Ejercicio_2;

import java.util.Stack;

public class PilaTipada {
    private Stack<Object> stack;
    private Class<?> topType;

    public PilaTipada() {
        this.stack = new Stack<>();
        this.topType = null;
    }

    public boolean push(Object element) {
        if (stack.isEmpty()) {
            stack.push(element);
            topType = element.getClass();
            return true;
        } else if (element.getClass().equals(topType)) {
            stack.push(element);
            return true;
        }
        return false;
    }

    public Object pop() {
        if (stack.isEmpty()) {
            return null;
        }
        Object removedElement = stack.pop();
        if (stack.isEmpty()) {
            topType = null;
        }
        return removedElement;
    }

    public Object peek() {
        return stack.isEmpty() ? null : stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}