package recursion;

public class SumOfNNumbers {
    static int sum (int N) {
        if (N == 0) return 0;
        return N + sum(N - 1);    //functional recursion
    }

    public static void main(String[] args) {
        int N = 5;
        System.out.println(sum(N));
    }
}
