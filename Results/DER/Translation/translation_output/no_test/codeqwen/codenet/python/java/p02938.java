Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    static final int MOD = (int)1e9 + 7;

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

This Java code does the same thing as your Python code. It reads two integers from the standard input, calls the `solve` method with these integers, and prints the result. The `solve` method is defined in the same class and is similar to your Python code. It uses recursion to calculate the result. The `@lru_cache` decorator from Python is not available in Java, so we use a simple recursive approach instead.
