package patterns;

import java.util.Scanner;

public class pattern7 {
    static void print (int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i + 1; j++) {
                System.out.print("*");
            }
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        print(n);
    }
}
