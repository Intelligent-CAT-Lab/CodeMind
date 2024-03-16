Below is the Java translation of the Python code you provided. The Python code seems to implement a recursive function with memoization to solve a combinatorics problem. In Java, we will have to implement the memoization manually since there's no built-in decorator like `lru_cache`.

```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RecursiveCombinatorics {
    private static final Map<String, Long> memo = new HashMap<>();
    
    private static long rec(int i, boolean isBlack, int k) {
        if (i < 0) return 0;
        if (i == 0) return isBlack ? 0 : 1;
        
        String key = i + "," + isBlack;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        
        long result;
        if (isBlack) {
            result = rec(i - 1, false, k) + rec(i - k, false, k);
        } else {
            result = rec(i - 1, true, k);
        }
        
        memo.put(key, result);
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        long ans = 0;
        for (int i = 1; i <= l; i++) {
            ans += rec(i, true, k);
        }
        
        System.out.println(ans);
    }
}
```

Note that in the Java version, we've added a `memo` hash map to manually keep track of the results of previously determined computations for particular arguments to the `rec` function. This mimics the behavior of the `lru_cache` decorator in Python. The `rec` function takes an additional argument `k`, which is the `k` value from the input (as Java doesn't support default arguments like Python). Also, in Java, we use a `Scanner` object for input, and we are using a `long` type for the answer to handle potentially large numbers.
