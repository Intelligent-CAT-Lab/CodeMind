Here's the equivalent Java code for the given Python code:

```java
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
    
    private static final int MOD = 1000000007;
    private static Map<String, Long> cache = new HashMap<>();

    public static long solve(int L, int R) {
        if (L > R) return 0;
        if (L == 1) return (1 + solve(2, R)) % MOD;
        
        String key = L + "," + R;
        if (cache.containsKey(key)) {
            return cache.get(key);
        }

        long result = (solve(L / 2, (R - 1) / 2) + solve((L + 1) / 2, R / 2)
                + solve((L + 1) / 2, (R - 1) / 2)) % MOD;
        cache.put(key, result);
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        scanner.close();

        System.out.println(solve(L, R));
    }
}
```

There are several key differences between the two versions:

1. Java doesn't have built-in memoization support like Python does with `lru_cache`, so we manually implement memoization using a `HashMap`.
2. The `input()` function and `map()` functionality are replaced with Java's `Scanner` class to read input.
3. Java requires explicit type declarations, so we need to state types like `Map<String, Long>`.
4. Java is more verbose and requires a class and method structure for the solution.
5. Java does not support default arguments for functions, so the code structure may look a bit different to respect Java's syntax rules.

This code can be compiled and run as a standalone Java application. It will read two integers from the standard input and print the result to the standard output, just like the provided Python code.
