```java
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {

    static final long inf = (long) Math.pow(10, 20);
    static final double eps = 1.0 / Math.pow(10, 10);
    static final long mod = 998244353;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        List<Long> rr = new ArrayList<>();

        while (true) {
            String[] input = in.readLine().split(" ");
            long p = Long.parseLong(input[0]);
            long q = Long.parseLong(input[1]);
            long g = gcd(p, q);
            long t = q / g;
            long k = 1;

            if (t % 2 == 0) {
                k *= 2;
                while (t % 2 == 0) {
                    t /= 2;
                }
            }

            for (long i = 3; i <= Math.sqrt(t) + 2; i += 2) {
                if (t % i > 0) {
                    continue;
                }
                k *= i;
                while (t % i == 0) {
                    t /= i;
                }
            }

            rr.add(t * k);
            break;
        }

        for (Long num : rr) {
            out.println(num);
        }

        out.flush();
    }

    static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
```
