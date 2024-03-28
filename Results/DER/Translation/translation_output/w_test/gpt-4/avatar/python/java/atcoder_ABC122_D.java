Here is the Python code translated into Java, maintaining as much of the original logic structure and variable naming as possible:

```java
import java.util.HashMap;
import java.util.Scanner;

public class AGCString {
    
    static final int mod = 1000000007;
    public static HashMap<String, Integer>[] memo;
    
    public static boolean ok(String last4) {
        for(int i = 0; i < 4; i++) {
            StringBuilder t = new StringBuilder(last4);
            if(i >= 1) {
                char ch = t.charAt(i);
                t.setCharAt(i, t.charAt(i - 1));
                t.setCharAt(i - 1, ch);
            }
            if(t.toString().contains("AGC")) {
                return false;
            }
        }
        return true;
    }
    
    public static int dfs(int cur, String last3) {
        if(memo[cur].containsKey(last3)) {
            return memo[cur].get(last3);
        }
        if(cur == n) {
            return 1;
        }
        int ret = 0;
        String nextChars = "ACGT";
        for(int i = 0; i < nextChars.length(); i++) {
            String c = String.valueOf(nextChars.charAt(i));
            if(ok(last3 + c)) {
                ret = (ret + dfs(cur + 1, last3.substring(1) + c)) % mod;
            }
        }
        memo[cur].put(last3, ret);
        return ret;
    }
    
    static int n;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        memo = new HashMap[n + 1];
        for(int i = 0; i <= n; i++) {
            memo[i] = new HashMap<>();
        }
        System.out.println(dfs(0, "TTT"));
        scanner.close();
    }
}
```

This Java code includes everything necessary to perform the same functionality as the provided Python code. It reads an integer `n` from the input, initializes a `memo` array of `HashMap` for memoization, and computes the result by calling the `dfs` function. The utility functions `ok` and `dfs` have been translated to Java while preserving their logic. The program then prints the result to the standard output.
