package Recursion.Recursion_Practice_Assignment;

import java.util.*;

public class prob3 {
    static void printEven(int n) {
        if (n < 2) return;
        printEven(n - 2);
        System.out.print(n + (n == 2 ? "" : " "));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 2) {
            int largestEven = (n % 2 == 0) ? n : n - 1;
            printEven(largestEven);
        }
    }
}