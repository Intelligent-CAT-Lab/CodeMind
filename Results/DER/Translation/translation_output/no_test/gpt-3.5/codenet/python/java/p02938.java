```java
import java.util.*;

public class Main {
    static Map<String, Integer> cache = new HashMap<>();
    static final int MOD = (int) 1e9 + 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        System.out.println(solve(L, R));
    }

    public static int solve(int L, int R) {
        if (L > R) return 0;
        if (L == 1) return (1 + solve(2, R)) % MOD;
        String key = L + "," + R;
        if (cache.containsKey(key)) {
            return cache.get(key);
        }
        int result = (solve(L / 2, (R - 1) / 2) + solve((L + 1) / 2, R / 2) + solve((L + 1) / 2, (R - 1) / 2)) % MOD;
        cache.put(key, result);
        return result;
    }
}
```
