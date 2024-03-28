Here's the equivalent Java code for the provided Python code:

```java
import java.util.*;
import java.io.*;

public class Main {
    static final int MOD = 1000000007;

    static int nextInt(BufferedReader br) throws IOException {
        return Integer.parseInt(br.readLine().trim());
    }

    static long nextLong(BufferedReader br) throws IOException {
        return Long.parseLong(br.readLine().trim());
    }

    static double nextDouble(BufferedReader br) throws IOException {
        return Double.parseDouble(br.readLine().trim());
    }

    static int[] nextIntArray(BufferedReader br) throws IOException {
        String[] elements = br.readLine().trim().split(" ");
        int[] arr = new int[elements.length];
        for (int i = 0; i < elements.length; i++) {
            arr[i] = Integer.parseInt(elements[i]);
        }
        return arr;
    }

    static long[] nextLongArray(BufferedReader br) throws IOException {
        String[] elements = br.readLine().trim().split(" ");
        long[] arr = new long[elements.length];
        for (int i = 0; i < elements.length; i++) {
            arr[i] = Long.parseLong(elements[i]);
        }
        return arr;
    }

    static String nextString(BufferedReader br) throws IOException {
        return br.readLine().trim();
    }

    static String[] nextStringArray(BufferedReader br) throws IOException {
        return br.readLine().trim().split(" ");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int[] values = nextIntArray(br);
        int n = values[0];
        int k = values[1];

        int[][] dp = new int[n + 1][k + 1];
        dp[0][0] = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                dp[i + 1][j + 1] = (dp[i][j] + (int)((long)(j + 1) * dp[i][j + 1] % MOD)) % MOD;
            }
        }
        
        out.println(dp[n][k]);
        out.flush();
    }
}
```
This Java code uses a BufferedReader to read input from stdin and a PrintWriter to write output to stdout. The program is encapsulated in a `Main` class with a `main` method as per the Java standard. The code imports the required classes and methods, and implements methods for reading different types of inputs.

Run the program with a test input like "4 3" (without quotes) followed by pressing enter, and you should receive "6" as the expected output, just like the Python program. Remember that you need to provide the input through the standard input stream (stdin) when you run the program since it's expecting input from there. This typically means running the Java class from the command line or an integrated development environment (IDE) that supports console input.

Also note that due to integer overflow issues when calculating `(j + 1) * dp[i][j + 1]`, the calculation is cast to `long` type before applying the modulo operation to ensure accuracy. After the modulo operation, it's cast back to `int` to match the type of `dp` array.
