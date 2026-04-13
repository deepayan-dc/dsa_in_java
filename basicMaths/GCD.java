package basicMaths;

public class GCD {
    static int gcd(int n1, int n2) {
        int gcd = 1;
        if (n1 == n2) {
            return n1;
        }
        for (int i = 1; i < Math.min(n1,n2); i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        int n1 = 11;
        int n2 = 13;
        System.out.println(gcd(n1, n2));
    }
}
