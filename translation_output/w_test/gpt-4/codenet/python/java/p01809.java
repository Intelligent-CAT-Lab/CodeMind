Here's the translated Java code which does the same thing as the provided Python code. Please note that Java requires a different approach to handle input and output. Additionally, Java does not have a built-in `gcd` function like Python, so we'll need to implement it ourselves:

```java
import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());
            int g = gcd(p, q);
            int t = q / g;
            int k = 1;
            if (t % 2 == 0) {
                k *= 2;
                while (t % 2 == 0) {
                    t /= 2;
                }
            }
            for (int i = 3; i <= Math.sqrt(t) + 1; i += 2) {
                if (t % i > 0) {
                    continue;
                }
                k *= i;
                while (t % i == 0) {
                    t /= i;
                }
            }
            out.println(t * k);
            break;
        }

        out.flush();
        out.close();
    }

    public static int gcd(int a, int b) {
        // Euclidean algorithm for GCD
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
}
```

This Java program should be compiled and then run with the input `1 2`, and it will then print the expected output `2`. Note that Java handles inputs and outputs differently compared to Python, so we're using `BufferedReader` for input and `PrintWriter` for output. The `gcd` function is implemented using the Euclidean algorithm, as Java does not have a built-in function like Python's `fractions.gcd`.
