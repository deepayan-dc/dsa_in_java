package patterns;

public class pattern11 {
    static void print (int n) {
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j);
            }
            for (int j = 0; j < 2*i; j++) {
                System.out.print(" ");
            }
            for (int j = n - i; j >= 1 ; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        print(n);
    }
}
