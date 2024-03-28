import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class p03830 {
    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solve(n));
    }

    public static int solve(int n) {
        Map<Integer, Integer> d = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            for (Map.Entry<Integer, Integer> p : factorization(i).entrySet()) {
                d.put(p.getKey(), d.getOrDefault(p.getKey(), 0) + p.getValue());
            }
        }
        long r = 1;
        for (int c : d.values()) {
            r *= c+1;
            r %= MOD;
        }
        return (int)r;
    }

    public static Map<Integer, Integer> factorization(int n) {
        HashMap<Integer, Integer> buff = new HashMap<>();
        Map.Entry<Integer, Integer> entry = factorSub(n, 2);
        int c = entry.getKey();
        n = entry.getValue();
        if (c > 0) buff.put(2, c);

        entry = factorSub(n, 3);
        c = entry.getKey();
        n = entry.getValue();
        if (c > 0) buff.put(3, c);

        int x = 5;
        while (n >= x * x) {
            entry = factorSub(n, x);
            c = entry.getKey();
            n = entry.getValue();
            if (c > 0) buff.put(x, c);
            if (x % 6 == 5) {
                x += 2;
            } else {
                x += 4;
            }
        }
        if (n > 1) buff.put(n, 1);
        return buff;
    }

    public static Map.Entry<Integer, Integer> factorSub(int n, int m) {
        int c = 0;
        while (n % m == 0) {
            c++;
            n /= m;
        }
        return new AbstractMap.SimpleEntry<>(c, n);
    }
}