import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class p01473 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int lS = S.length();
        List<Integer> d = new ArrayList<>();
        for (int i = 0; i < lS; i++) {
            int count = S.count(S.charAt(i));
            if (d.contains(count)) {
                d.add(count);
            } else {
                d.add(count);
            }
        }
        int dd = 0;
        for (int i : d) {
            dd += i % 2;
        }
        if ((lS % 2 == 0 && dd != 0) || (lS % 2 == 1 && dd != 1)) {
            System.out.println(0);
        } else {
            long dnm = 1;
            for (int i : d) {
                dnm *= factorial(i / 2);
            }
            System.out.println(factorial(lS / 2) / dnm);
        }
    }

    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}