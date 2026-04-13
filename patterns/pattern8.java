package patterns;

import java.util.Scanner;

public class pattern8 {
    static void print (int n) {
        for (int i = n - 1; i >= 0; i--) {
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
