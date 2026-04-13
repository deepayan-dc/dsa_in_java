package recursion;

public class Print1ToNBacktracking {
    static void print (int i, int N) {
        if (i < 1) return;
        print(i-1, N);      //function call before line of execution
        System.out.print(i + " ");
    }

    public static void main(String[] args) {
        int N = 5;
        print(N, N);
    }
}
