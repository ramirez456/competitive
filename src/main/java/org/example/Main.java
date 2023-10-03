package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), n = sc.nextInt();
        //a = problem easy = 1 or more
        //b = problem medium = 1 or more
        //c = problem hard = 1 or more
        //n = number of problems = 3 or more
        System.out.println(((a >= 1) && (b >= 1) && (c >= 1) && (a+b+c >= n) && n>3) ? "YES" : "NO");
    }
}