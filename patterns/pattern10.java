package patterns;

import java.util.Scanner;

public class pattern10 {
    static void print(int n) {
        for (int i = 1; i <= n; i++) {
            int start = 0;
            if (i % 2 == 0) {
                start = 0;
            } else {
                start = 1;
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(start + " ");
                start = 1 - start;
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
