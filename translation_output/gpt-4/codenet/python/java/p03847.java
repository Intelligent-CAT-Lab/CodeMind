The following is the equivalent Java code for the provided Python script, which appears to perform a recursive computation with memoization:

```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RecursiveCalculation {

    private static final long MOD = 1000000007;
    private static Map<Long, Long> memo = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        scanner.close();

        // Initialize memoization
        memo.put(0L, 1L);
        memo.put(1L, 2L);

        System.out.println(func(N));
    }

    public static long func(long N) {
        if (memo.containsKey(N)) {
            return memo.get(N);
        }
        long result = (func(N / 2) + func((N - 1) / 2) + func(N / 2 - 1)) % MOD;
        
        memo.put(N, result);
        return result;
    }
}
```

Since Java is statically typed, we specify types explicitly for all variables and function return values. Note that I have used `long` as the data type for storing potentially large numbers in the memo map, presuming `N` would be within the bounds of `long`. The recursive function `func` performs integer division as Java automatically floors the result of an integer division.

Please pay special attention to the data types used and adjust them according to the requirements and constraints of your specific use case.
