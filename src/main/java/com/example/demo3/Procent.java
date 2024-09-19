package com.example.demo3;

public class Procent {
    // Метод для расчета процента от суммы
    public double countPr(double sum, int pr) {
        return sum * pr / 100.0;
    }

    // Метод для расчета суммы с учетом процента
    public double countSum(double sum, int pr) {
        return sum + countPr(sum, pr);
    }

    // Метод для округления суммы с чаевыми
    public int countSumTrunc(double sum, int pr) {
        return (int) Math.round(countSum(sum, pr));
    }
}
