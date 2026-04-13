package patterns;

public class pattern15 {
    static void print(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (char j = 'A'; j <= 'A' + i; j++) {
                System.out.print(j);
            }
            for (char j = (char) ('A' + i - 1); j >= 'A'; j--) {
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
