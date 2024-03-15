Here's the translated Java code:

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    static final int MOD = 1000000007;
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = II();
        HashMap<Integer, Integer> d = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            for (int[] kv : factorization(i)) {
                d.put(kv[0], d.getOrDefault(kv[0], 0) + kv[1]);
            }
        }
        long r = 1;
        for (int c : d.values()) {
            r *= (c + 1);
            r %= MOD;
        }
        System.out.println(r);
    }

    public static int II() throws IOException {
        return Integer.parseInt(nextToken());
    }

    public static String nextToken() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }

    // Helper function to perform factorization.
    public static int[][] factorization(int n) {
        HashMap<Integer, Integer> factors = new HashMap<>();

        int count = 0;
        while (n % 2 == 0) {
            n /= 2;
            count++;
        }
        if (count > 0) factors.put(2, count);

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            count = 0;
            while (n % i == 0) {
                n /= i;
                count++;
            }
            if (count > 0) factors.put(i, count);
        }

        if (n > 1) factors.put(n, 1);

        return factors.entrySet().stream().map(e -> new int[]{e.getKey(), e.getValue()}).toArray(int[][]::new);
    }
}
```

A few points to consider:
- The original Python code uses a few package-level functions like `input()` which do not have direct equivalents in Java, so we use `BufferedReader` and `StringTokenizer` to handle input.
- Global variables like `mod` are converted to constants within the class with a static final.
- The function `defaultdict` from the `collections` module in Python is approximately replicated by using Java's `HashMap` with the `getOrDefault` method.
- Python's lack of explicit type declarations means we have to declare types explicitly in the Java version.
- The `factorization` method is translated to a method that returns an `int[][]`, which represents an array of pairs, with each pair containing the factor and its corresponding exponent.
- The usage of the modulo operator and long multiplication ensures we stay within integer limits and comply with the mod calculation requirement.
- Exception handling is made explicit by adding `throws IOException` to the `main` and helper methods.

Please note that the above-converted code assumes that the input will be provided in the following format:

```
n
```

where `n` is an integer value representing the input value for `n` in the Python code's `main` method.
