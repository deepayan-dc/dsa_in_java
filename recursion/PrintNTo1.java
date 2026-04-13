package recursion;

public class PrintNTo1 {
    static void print (int i, int N) {
        if (N < i) return;
        System.out.print(N + " ");
        print(i, N - 1);    //function call after line of execution
    }

    public static void main(String[] args) {
        int N = 5;
        print(1, N);
    }
}
