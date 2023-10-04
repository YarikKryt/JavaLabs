package com.lab1;

import java.util.Scanner;

/**
 * Програма для пошуку трикутних чисел серед перших M чисел Фібоначчі.
 *
 * @author Yaromyr Kuspis
 * @version 1.0
 */
public class Fibonacci {

    /**
     * Головна функція програми.
     *
     * @param args Аргументи командного рядка.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть кількість чисел:");
        int M = scanner.nextInt();

        // Створюємо об'єкт класу Fibonacci
        Fibonacci fibonacci = new Fibonacci();

        // Знаходимо трикутні числа серед перших M чисел Фібоначчі
        for (int i = 2; i <= M; i++) {
            int value = fibonacci.fibonacci(i);
            if (value > 0) {
                System.out.println(value + " - трикутне число");
            }
        }
    }

    /**
     * Метод для обчислення числа Фібоначчі.
     *
     * @param n Номер числа Фібоначчі.
     * @return Значення числа Фібоначчі.
     */
    private int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}