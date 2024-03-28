```java
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        List<Long> rr = new ArrayList<>();

        while (true) {
            String[] input = br.readLine().split(" ");
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

            for (long i = 3; i < Math.sqrt(t) + 2; i += 2) {
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

        for (long res : rr) {
            out.println(res);
        }

        out.flush();
    }

    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
```
