package recursion;

public class Print1ToN {
    static void print (int i, int N) {
        if (i > N) return;
        System.out.print(i + " ");
        print(i+1, N);     //function call after line of execution
    }

    public static void main(String[] args) {
        int N = 5;
        print(1, N);
    }
}
