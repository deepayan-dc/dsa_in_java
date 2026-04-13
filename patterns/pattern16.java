package patterns;

public class pattern16 {
    static void print (int n) {
        for (int i = 0; i < n; i++) {
            for (char j = (char)('A' + n - 1 - i); j <= (char)('A' + n - 1) ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        print(n);
    }
}
