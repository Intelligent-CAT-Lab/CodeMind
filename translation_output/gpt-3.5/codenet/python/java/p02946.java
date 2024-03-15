```java
import java.util.*;
import java.io.*;

public class Main {    
    static final int INTMAX = 9223372036854775807;
    static final int INTMIN = -9223372036854775808;
    static final int DVSR = 1000000007;

    public static long POW(long x, long y) {
        return fastPow(x, y, DVSR);
    }

    public static long INV(long x, long m) {
        return fastPow(x, m - 2, m);
    }

    public static long DIV(long x, long y, long m) {
        return (x * INV(y, m)) % m;
    }

    public static List<Integer> LI() throws IOException {
        List<Integer> list = new ArrayList<>();
        String[] parts = br.readLine().split(" ");
        for (String part : parts) {
            list.add(Integer.parseInt(part));
        }
        return list;
    }

    public static int II() throws IOException {
        return Integer.parseInt(br.readLine().trim());
    }

    public static List<Long> FLIST(int n) {
        List<Long> res = new ArrayList<>();
        long[] fact = new long[n + 1];
        fact[0] = 1L;
        for (int i = 1; i <= n; i++) {
            fact[i] = (fact[i - 1] * i) % DVSR;
            res.add(fact[i]);
        }
        return res;
    }

    public static long gcd(long x, long y) {
        if (x < y) {
            long temp = x;
            x = y;
            y = temp;
        }
        long div = x % y;
        while (div != 0) {
            long temp = x;
            x = y;
            y = div;
            div = x % y;
        }
        return y;
    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int K, X;
        List<Integer> input = LI();
        K = input.get(0);
        X = input.get(1);

        for (int i = Math.max(X - K + 1, -1000000); i < Math.min(X + K, 1000000); i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static long fastPow(long base, long expo, long mod) {
        long result = 1;
        while (expo > 0) {
            if (expo % 2 == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            expo >>= 1;
        }
        return result;
    }
}
```
