Here is the translated Java code for the provided Python code:

```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AGCTPattern {

    private static final int MOD = 1_000_000_007;
    private static Map<String, Integer>[] memo;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        memo = new HashMap[n + 1];
        for (int i = 0; i <= n; i++) {
            memo[i] = new HashMap<>();
        }
        System.out.println(dfs(0, "TTT"));
        scanner.close();
    }

    private static boolean ok(String last4) {
        for (int i = 0; i < 4; i++) {
            StringBuilder t = new StringBuilder(last4);
            if (i >= 1) {
                char tmp = t.charAt(i);
                t.setCharAt(i, t.charAt(i - 1));
                t.setCharAt(i - 1, tmp);
            }
            if (t.toString().contains("AGC")) {
                return false;
            }
        }
        return true;
    }

    private static int dfs(int cur, String last3) {
        if (memo[cur].containsKey(last3)) {
            return memo[cur].get(last3);
        }
        if (cur == n) {
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
Remember to define the variable `n` as a class-level static variable if you are using the above methods without any changes, since it is used within the `dfs` and `ok` methods. Here's how you can define it:

```java
public class AGCTPattern {
    private static final int MOD = 1_000_000_007;
    private static Map<String, Integer>[] memo;
    private static int n; // Define 'n' as a static variable at class level.

    // ... the rest of the code remains the same ...
}
```

Keep in mind that you need to have an import statement for `java.util.HashMap`, `java.util.Map`, and `java.util.Scanner` at the beginning of your Java file to run the code successfully. Also, this is a straightforward translation, and the Java code could be optimized further based on best practices.
