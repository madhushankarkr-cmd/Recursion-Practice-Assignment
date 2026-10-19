package Recursion.Recursion_Practice_Assignment;

import java.util.Scanner;

public class prob7 {
    static void reverse(String s, int index) {
        if (index < 0) return;
        System.out.print(s.charAt(index));
        reverse(s, index - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        reverse(s, s.length() - 1);
    }
}
