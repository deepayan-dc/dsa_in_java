package basicMaths;

import java.util.ArrayList;

public class PrintAllDivisors {
    static void print (int x) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i*i <= x ; i++) {
            if (x % i == 0) {
                list.add(i);
                if (x/i != i) {
                    list.add(x/i);
                }
            }
        }
        for (int num : list) System.out.println(num);
    }

    public static void main(String[] args) {
        int x = 36;
        print(x);
    }

}