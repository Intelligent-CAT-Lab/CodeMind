import java.util.*;

public class p02938 {
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