Below is the translation of the provided Python code to Java. Please note that the Python code utilizes dynamic programming with memoization to avoid redundant computations, a technique equally applicable in Java.

The `ok` function in Python checks the validity of a sequence by ensuring that the last four characters do not contain the substring "AGC", which is a constraint specific to the context of the original Python code. In Java, we use a method with a similar logic.

The `dfs` function is a recursive method that computes the number of valid sequences of length `N` that do not contain the forbidden substring. It uses memoization to cache results that have already been computed.

```java
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static final int MOD = (int)1e9 + 7;
    static HashMap<String, Integer>[] memo;
    static int N;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        memo = new HashMap[N + 1];

        for (int i = 0; i <= N; i++) {
            memo[i] = new HashMap<>();
        }

        System.out.println(dfs(0, "TTT"));
        scanner.close();
    }

    private static boolean ok(String last4) {
        for (int i = 0; i < 4; i++) {
            char[] t = last4.toCharArray();

            if (i >= 1) {
                // Swapping characters
                char temp = t[i - 1];
                t[i - 1] = t[i];
                t[i] = temp;
            }

            if (new String(t).contains("AGC")) {
                return false;
            }
        }

        return true;
    }

    private static int dfs(int cur, String last3) {
        if (memo[cur].containsKey(last3)) {
            return memo[cur].get(last3);
        }

        if (cur == N) {
            return 1;
        }

        int ret = 0;
        for (char c : new char[]{'A', 'C', 'G', 'T'}) {
            if (ok(last3 + c)) {
                ret = (ret + dfs(cur + 1, last3.substring(1) + c)) % MOD;
            }
        }
        memo[cur].put(last3, ret);

        return ret;
    }
}
```

To use this Java code, you would need to run it with a Java development environment or a Java runtime with the `Scanner` class used for input. Make sure the input is provided in the expected format, typically through the standard input stream (e.g., typing in the console or providing an input file).
