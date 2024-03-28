import java.util.*;
import java.io.*;

public class p03830 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> d = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            for (int[] kv : factorization(i)) {
                int k = kv[0];
                int v = kv[1];
                d.put(k, d.getOrDefault(k, 0) + v);
            }
        }
        long r = 1;
        for (int c : d.values()) {
            r *= c + 1;
            r %= 1000000007;
        }
        System.out.println(r);
    }

    static List<int[]> factorization(int n) {
        List<int[]> buff = new ArrayList<>();
        int c, m;
        c = m = 0;
        while (n % 2 == 0) {
            c++;
            n /= 2;
        }
        if (c > 0) {
            buff.add(new int[]{2, c});
        }
        c = m = 0;
        while (n % 3 == 0) {
            c++;
            n /= 3;
        }
        if (c > 0) {
            buff.add(new int[]{3, c});
        }
        int x = 5;
        while (n >= x * x) {
            c = m = 0;
            while (n % x == 0) {
                c++;
                n /= x;
            }
            if (c > 0) {
                buff.add(new int[]{x, c});
            }
            if (x % 6 == 5) {
                x += 2;
            } else {
                x += 4;
            }
        }
        if (n > 1) {
            buff.add(new int[]{n, 1});
        }
        return buff;
    }
}