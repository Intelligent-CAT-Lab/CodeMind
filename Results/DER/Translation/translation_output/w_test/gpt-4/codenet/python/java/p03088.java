Here's the Python code translated into Java:

```java
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private static final int MOD = 1000000007;
    private static HashMap<String, Integer>[] memo;

    public static boolean ok(String last4) {
        for (int i = 0; i < 4; i++) {
            char[] t = last4.toCharArray();

            if (i >= 1) {
                // Swap characters
                char temp = t[i - 1];
                t[i - 1] = t[i];
                t[i] = temp;
            }

            if (String.valueOf(t).contains("AGC")) {
                return false;
            }
        }

        return true;
    }

    public static int dfs(int cur, String last3, int N) {
        if (memo[cur].containsKey(last3)) {
            return memo[cur].get(last3);
        }

        if (cur == N) {
            return 1;
        }
        int ret = 0;

        for (char c : new char[]{'A', 'C', 'G', 'T'}) {
            if (ok(last3 + c)) {
                ret = (ret + dfs(cur + 1, last3.substring(1) + c, N)) % MOD;
            }
        }
        memo[cur].put(last3, ret);

        return ret;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        memo = new HashMap[N + 1];

        for (int i = 0; i <= N; i++) {
            memo[i] = new HashMap<>();
        }

        System.out.println(dfs(0, "TTT", N));
        scanner.close();
    }
}
```
In this Java implementation, we've created the `main` method where we accept the `N` variable from user input. We're initializing `memo` as an array of hashmaps to store intermediate results, similar to the dictionary in the Python code. The `ok` method checks whether a given string contains "AGC". The `dfs` method performs the depth-first search and memoization as in the original Python code. Note that, unlike Python, Java strings are immutable, so when we want to modify the string such as in `ok`, we convert it to a character array first. Additionally, Java's substring method is used instead of slicing in Python.
