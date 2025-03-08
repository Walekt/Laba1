package org.example;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 500; i++) {
            System.out.println(fizzbuzz(i));
        }
    }
    public static String fizzbuzz(int i){
        if (i % 5 == 0 && i % 7 == 0) {
            return "fizzbuzz";
        } else if (i % 5 == 0) {
            return "fizz";
        } else if (i % 7 == 0) {
            return "buzz";
        } else {
            return Integer.toString(i);
        }
    }



}
