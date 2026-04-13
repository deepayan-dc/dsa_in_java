package patterns;

public class pattern14 {
    static void print (int n) {
        char ch = 'A';
        for (int i = 0; i < n; i++) {
            if (ch > 'A' + n - 1) {
                return;
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(ch);
            }
            ch++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        print(n);
    }
}
