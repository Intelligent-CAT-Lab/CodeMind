import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class p02938 {
    
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