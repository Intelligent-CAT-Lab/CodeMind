import java.util.*;
import java.io.*;

public class p03830 {
    static int mod = 1000000007;
    static int n;
    static Map<Long, Integer> d = new HashMap<>();

    static void factorization(long n) {
        for (long i = 2; i * i <= n; i++) {
            int c = 0;
            while (n % i == 0) {
                c++;
                n /= i;
            }
            if (c > 0) {
                d.put(i, d.getOrDefault(i, 0) + c);
            }
        }
        if (n > 1) {
            d.put(n, d.getOrDefault(n, 0) + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            factorization(i);
        }
        long r = 1;
        for (int c : d.values()) {
            r *= c + 1;
            r %= mod;
        }
        System.out.println(r);
    }
}