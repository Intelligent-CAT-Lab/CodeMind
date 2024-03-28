Certainly! Here is the translated Java code from the provided Python script:

```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static final int MOD = 1000000007;
    static Map<String, Integer>[] memo;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        memo = new HashMap[N + 1];
        for (int i = 0; i <= N; i++) {
            memo[i] = new HashMap<>();
        }

        System.out.println(dfs(N, 0, "TTT"));
    }

    static boolean ok(String last4) {
        for (int i = 0; i < 4; i++) {
            char[] t = last4.toCharArray();

            if (i >= 1) {
                // Swap characters
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

    static int dfs(int N, int cur, String last3) {
        if (memo[cur].containsKey(last3)) {
            return memo[cur].get(last3);
        }

        if (cur == N) {
            return 1;
        }

        int ret = 0;
        for (char c : new char[]{'A', 'C', 'G', 'T'}) {
            if (ok(last3 + c)) {
                ret = (ret + dfs(N, cur + 1, last3.substring(1) + c)) % MOD;
            }
        }
        memo[cur].put(last3, ret);

        return ret;
    }
}
```

This Java code performs the same function as the provided Python script. It reads an integer `N` from the standard input, initializes a memoization data structure (`memo`), and computes the answer by recursively exploring all the valid sequences of characters. The `ok` function checks if a sequence of four characters is valid by attempting to swap adjacent characters and searching for the forbidden substring `"AGC"`. The `dfs` function recursively creates different combinations while checking for validity and eventually outputting the total count.
