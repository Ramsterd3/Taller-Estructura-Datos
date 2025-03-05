package Ejercicio_2;

public class Main {
    public static void main(String[] args) {
        PilaTipada stack = new PilaTipada();
        System.out.println(stack.push(10));  // true
        System.out.println(stack.push(20));  // true
        System.out.println(stack.push("Hello")); // false (tipo diferente)
        System.out.println(stack.pop());    // 20
        System.out.println(stack.push("World")); // false (tipo diferente)
    }
}