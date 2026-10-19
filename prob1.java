package Recursion.Recursion_Practice_Assignment;

import java.util.Scanner;

public class prob1 {
    static void printIncreasing(int n) {
        if (n <= 0) return;
        printIncreasing(n - 1);
        System.out.print(n + (n == 1 ? "" : " "));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printIncreasing(n);
    }


}
