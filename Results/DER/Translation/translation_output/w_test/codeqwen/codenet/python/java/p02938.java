Here is the Java version of the provided Python code:

```java
import java.util.*;

public class Main {
    static final int MOD = (int)1e9 + 7;
    static Map<Integer, Integer> cache = new HashMap<>();

    static int solve(int L, int R) {
        if (L > R) return 0;
        if (L == 1) return (1 + solve(2, R)) % MOD;
        if (!cache.containsKey(L)) {
            cache.put(L, (solve(L/2, (R-1)/2) + solve((L+1)/2, R/2) + solve((L+1)/2, (R-1)/2)) % MOD);
        }
        return cache.get(L);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        System.out.println(solve(L, R));
    }
}
```

This Java code does the same thing as the Python code. It uses a HashMap to cache the results of the solve function, which significantly improves the performance for large inputs. The solve function calculates the number of ways to partition the range [L, R] into two non-empty subsets such that the sum of the elements in each subset is odd. The main function reads the input from the user and prints the result of the solve function.
