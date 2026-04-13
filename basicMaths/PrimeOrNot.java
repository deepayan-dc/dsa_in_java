package basicMaths;

public class PrimeOrNot {
    static boolean isPrime (int x) {
        int count = 0;
        for (int i = 1; i*i <= x ; i++) {
            if (x % i == 0) {
                count++;
                if (x/i != i) {
                    count++;
                }
            }
        }
        return count == 2;
    }

    public static void main(String[] args) {
        int x = 4;
        System.out.println(isPrime(x));
    }
}
