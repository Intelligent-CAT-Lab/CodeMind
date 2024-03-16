Here's the equivalent Java code:

```java
import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
    private static final int MOD = 998244353;
    private static final double EPS = 1.0 / Math.pow(10, 10);
    private static BufferedReader reader;
    private static StringTokenizer tokenizer;

    public static void main(String[] args) throws IOException {
        reader = new BufferedReader(new InputStreamReader(System.in));
        tokenizer = null;
        PrintWriter out = new PrintWriter(System.out, true);
        
        List<Long> rr = new ArrayList<>();
        while (true) {
            long[] pq = nextLongArray();
            long p = pq[0], q = pq[1];
            long g = gcd(p, q);
            long t = q / g;
            long k = 1;
            if (t % 2 == 0) {
                k *= 2;
                while (t % 2 == 0) t /= 2;
            }
            for (long i = 3; i <= Math.sqrt(t) + 2; i += 2) {
                if (t % i > 0) continue;
                k *= i;
                while (t % i == 0) t /= i;
            }
            rr.add(t * k);
            break;
        }

        for (long r : rr) {
            out.println(r);
        }

        out.close();
    }

    static long[] nextLongArray() throws IOException {
        return Arrays.stream(nextString().split("\\s")).mapToLong(Long::parseLong).toArray();
    }

    static String nextString() throws IOException {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(reader.readLine());
        }
        return tokenizer.nextToken();
    }

    static long gcd(long a, long b) {
        BigInteger b1 = BigInteger.valueOf(a);
        BigInteger b2 = BigInteger.valueOf(b);
        BigInteger gcd = b1.gcd(b2);
        return gcd.longValue();
    }
}
```

Note that I used code to read from `BufferedReader` instead of `sys.stdin` which is not available in Java. Similarly, I implemented the `gcd` function using `BigInteger`'s built-in `gcd` method as Java does not have a built-in GCD function for primitive longs. In a real-world context, you would also remove the infinite loop `while (true) {... break;}` or replace it with appropriate logic depending on the rest of the application's structure and requirements.
