package org.example;
import java.util.Scanner;

public class UVA10614 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) { // for ask many times as we want
            int warriors = sc.nextInt();
            double row = Math.round(-1+ Math.sqrt(1+8*warriors)/2);

            System.out.println(row);
        }
    }
}
