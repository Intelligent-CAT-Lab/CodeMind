Here is the Java version of your Python code:

```java
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String N = System.console().readLine();
        long n = Long.parseLong(N);

        Map<Long, Long> memo = new HashMap<>();
        memo.put(0L, 1L);
        memo.put(1L, 2L);

        System.out.println(func(n, memo));
    }

    public static long func(long N, Map<Long, Long> memo) {
        if (memo.containsKey(N)) {
            return memo.get(N);
        }
        long result = (func(N / 2, memo) + func((N - 1) / 2, memo) + func(N / 2 - 1, memo)) % (1000000007L);

        memo.put(N, result);
        return result;
    }
}
```

This Java code does the same thing as your Python code. It reads a number from the console, calculates the result using the `func` method, and prints the result. The `func` method is a recursive function that calculates the result for a given number `N`. It uses a `HashMap` to store previously calculated results for efficiency.
