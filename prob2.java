package Recursion.Recursion_Practice_Assignment;

import java.util.*;

public class prob2 {
    static void printDecreasing(int n) {
        if (n <= 0) return;
        System.out.print(n);
        if (n > 1) System.out.print(" ");
        printDecreasing(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDecreasing(n);
    }
}
