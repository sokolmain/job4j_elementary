package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class calculator {

    public static double sumAndMultiply(double first, double second) {
        return ru.job4j.math.MathFunction.sum(first, second)
                + ru.job4j.math.MathFunction.multiply(first, second);
    }

    public static double divideAndSubtract(double first, double second) {
        return  ru.job4j.math.MathFunction.divide(first, second)
                + ru.job4j.math.MathFunction.subtract(first, second);
    }

    public static double sumAndMultiplyAnddivideAndSubtract(double first, double second) {
        return ru.job4j.math.MathFunction.sum(first, second)
                + ru.job4j.math.MathFunction.multiply(first, second)
                + ru.job4j.math.MathFunction.divide(first, second)
                + ru.job4j.math.MathFunction.subtract(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Резултат расчета равен: " + divideAndSubtract(20, 10));
        System.out.println("Резултат расчета равен: " + sumAndMultiplyAnddivideAndSubtract(20, 10));
    }
}
