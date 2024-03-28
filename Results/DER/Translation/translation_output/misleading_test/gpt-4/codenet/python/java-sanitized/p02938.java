import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p02938 {
    private static final int MOD = 1_000_000_007;
    private static final Map<Long, Integer> cache = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        scanner.close();

        System.out.println(solve(L, R));
    }

    public static int solve(int L, int R) {
        long key = (((long) L) << 32) | R; // Combine L and R into a single key
        if (cache.containsKey(key)) {
            return cache.get(key);
        }

        if (L > R) return 0;
        if (L == 1) {
            int result = (1 + solve(2, R)) % MOD;
            cache.put(key, result);
            return result;
        }

        int result = (solve(L / 2, (R - 1) / 2) +
                      solve((L + 1) / 2, R / 2) +
                      solve((L + 1) / 2, (R - 1) / 2)) % MOD;

        cache.put(key, result);
        return result;
    }
}