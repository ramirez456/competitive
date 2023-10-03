package org.example;
import java.util.Scanner;
public class UVA10071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //v=e/t
        //v=e/2t
        //e=2.t.v

        while (sc.hasNext()) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            System.out.println(2 * v * t);
        }
    }
}
