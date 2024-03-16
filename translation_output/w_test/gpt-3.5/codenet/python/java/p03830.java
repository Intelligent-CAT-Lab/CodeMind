```java
import java.util.*;
import java.io.*;

public class Main {
    static final long mod = (long)1e9 + 7;
    
    static int II() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(br.readLine());
    }

    static Map<Integer, Integer> factorization(int n) {
        Map<Integer, Integer> d = new HashMap<>();
        int m = n;
        int c;
        c = 0;
        while (m % 2 == 0) {
            c++;
            m /= 2;
        }
        if (c > 0) d.put(2, c);

        c = 0;
        while (m % 3 == 0) {
            c++;
            m /= 3;
        }
        if (c > 0) d.put(3, c);

        int x = 5;
        while (m >= x * x) {
            c = 0;
            while (m % x == 0) {
                c++;
                m /= x;
            }
            if (c > 0) d.put(x, c);

            if (x % 6 == 5) {
                x += 2;
            } else {
                x += 4;
            }
        }
        if (m > 1) d.put(m, 1);

        return d;
    }

    static long main() throws IOException {
        int n = II();
        Map<Integer, Integer> d = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            Map<Integer, Integer> factors = factorization(i);
            for (int k : factors.keySet()) {
                int v = factors.get(k);
                d.put(k, d.getOrDefault(k, 0) + v);
            }
        }

        long r = 1;
        for (int c : d.values()) {
            r *= c + 1;
            r %= mod;
        }

        return r;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(main());
    }
}
```
```
