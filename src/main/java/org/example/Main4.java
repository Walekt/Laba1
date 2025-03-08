package org.example;

public class Main4 {
    public static void main(String[] args) {
        double sum = calculaters();
        System.out.println("Summa ryada: " + sum);
    }
    public static double calculaters() {
        double sum = 0.0;
        int n = 2;

        while (true) {
            double i = 1.0 / (n * n + n - 2);
            if (i < Math.pow(10, -6))
                break;
            sum += i;
            System.out.println("Number " + n + ": " + i);
            n++;
        }

        return sum;
    }
}

