Here's the Python code translated into Java:

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static final int INF = Integer.MAX_VALUE;
    static final int MOD = 1000000007;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String S = br.readLine().trim();
        int N = S.length();

        int zeroStart = 0;
        int zeroStartCounter = 0;
        for (int i = 0; i < N; i++) {
            if (zeroStart != Character.getNumericValue(S.charAt(i))) {
                zeroStartCounter++;
            }
            zeroStart = (zeroStart + 1) % 2;
        }

        int oneStartCounter = N - zeroStartCounter;

        System.out.println(Math.min(zeroStartCounter, oneStartCounter));
    }
}
```

This Java code achieves the same objectives as the original Python code. It reads a string from the standard input, counts the number of flips needed to get all '0's or all '1's when starting with '0' or '1' respectively, and prints the minimum number of flips required.

To run a test in Java, you might need to simulate the standard input with the test case "000" using a `StringReader` or by directly providing command-line arguments. However, usually, Java programs are executed in an environment where the standard input is provided by the system or the user.

Make sure to have the appropriate `import` statements and handle any exceptions that may occur during input/output operations.
