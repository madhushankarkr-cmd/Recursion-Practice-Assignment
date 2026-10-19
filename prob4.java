package Recursion.Recursion_Practice_Assignment;

import java.util.*;

public class prob4 {
    static void printOdd(int n) {
        if (n < 1) return;
        printOdd(n - 2);
        System.out.print(n + (n == 1 ? "" : " "));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 1) {
            int largestOdd = (n % 2 == 1) ? n : n - 1;
            printOdd(largestOdd);
        }
    }
}
