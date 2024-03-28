import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class p03830 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        Map<Integer, Integer> d = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            int[] factors = factorization(i);
            for (int j = 0; j < factors.length; j++) {
                int factor = factors[j];
                int count = d.getOrDefault(factor, 0) + 1;
                d.put(factor, count);
            }
        }

        int r = 1;
        for (int c : d.values()) {
            r *= c + 1;
            r %= 1000000007;
        }

        System.out.println(r);
    }

    public static int[] factorization(int n) {
        ArrayList<Integer> buff = new ArrayList<>();
        int c = 0;
        while (n % 2 == 0) {
            c++;
            n /= 2;
        }
        if (c > 0) buff.add(2);
        c = 0;
        while (n % 3 == 0) {
            c++;
            n /= 3;
        }
        if (c > 0) buff.add(3);
        int x = 5;
        while (n >= x * x) {
            c = 0;
            while (n % x == 0) {
                c++;
                n /= x;
            }
            if (c > 0) buff.add(x);
            if (x % 6 == 5) {
                x += 2;
            } else {
                x += 4;
            }
        }
        if (n > 1) buff.add(n);
        int[] result = new int[buff.size()];
        for (int i = 0; i < buff.size(); i++) {
            result[i] = buff.get(i);
        }
        return result;
    }
}