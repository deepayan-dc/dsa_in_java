package recursion;

public class PrintNTo1Backtracking {
    static void print (int i, int N) {
        if (i > N) return;
        print(i+1, N);      //function call before line of execution
        System.out.print(i + " ");
    }

    public static void main(String[] args) {
        int N = 5;
        print(1, N);
    }
}
