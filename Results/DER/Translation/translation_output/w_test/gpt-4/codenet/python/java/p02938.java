Here is the Python code translated to Java. I have encapsulated the logic into a class with a method `solve` that emulates the behavior of the Python code. I used Java's `HashMap` to mimic the memoization done by `functools.lru_cache` in Python.

```java
import java.util.HashMap;
import java.util.Scanner;

public class Solution {
    private static final int MOD = 1000000007;
    private static HashMap<String, Integer> memo = new HashMap<>();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        sc.close();

        System.out.println(solve(L, R));
    }

    public static int solve(int L, int R) {
        if (L > R) return 0;
        if (L == 1) return (1 + solve(2, R)) % MOD;
        
        String key = L + "," + R;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        int result = (solve(L / 2, (R - 1) / 2) + solve((L + 1) / 2, R / 2) + solve((L + 1) / 2, (R - 1) / 2)) % MOD;
        memo.put(key, result);
        return result;
    }
}
```

Here's the test case to use with the above Java code:

Test input (provided to the program via standard input):
```
2 3
```

Expected output:
```
3
```
