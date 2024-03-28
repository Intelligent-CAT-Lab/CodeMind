Here is the translated Java code, which mimics the behavior of the Python code including the memoization functionality using a Map:

```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final Map<String, Integer> memo = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        int ans = 0;
        for (int i = 1; i <= l; i++) {
            ans += rec(i, true, k);
        }

        System.out.println(ans);
    }

    private static int rec(int i, boolean isBlack, int k) {
        if (i < 0) return 0;
        if (i == 0) return isBlack ? 0 : 1;  // black at bottom

        String key = i + "," + isBlack;
        if (memo.containsKey(key)) return memo.get(key);

        int result;
        if (isBlack) { // top is black
            result = rec(i - 1, false, k) + rec(i - k, false, k);
        } else { // top is white
            result = rec(i - 1, true, k);
        }

        memo.put(key, result);
        return result;
    }
}
```

This Java code maintains a memoization Map called `memo` to cache the results of the recursive calls, which is analogous to the `lru_cache` in Python. It reads the input `l` and `k`, and then computes the answer by summing the `rec` function results over the range `[1, l]`. The `rec` function itself performs the main logic and stores intermediate results in `memo` to avoid duplicate calculations.
