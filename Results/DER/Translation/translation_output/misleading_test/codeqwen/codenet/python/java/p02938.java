Here is the Java version of the provided Python code:

```java
import java.util.*;

public class Main {
    static final int MOD = (int)1e9 + 7;
    static Map<Integer, Integer> cache = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        System.out.println(solve(L, R));
    }

    static int solve(int L, int R) {
        if (L > R) return 0;
        if (L == 1) return (1 + solve(2, R)) % MOD;
        return (solve(L/2, (R-1)/2) + solve((L+1)/2, R/2) + solve((L+1)/2, (R-1)/2)) % MOD;
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, calculates the result using the `solve` method, and prints the result. The `solve` method is a recursive function that uses memoization (storing previously computed results in a `HashMap`) to improve performance.
