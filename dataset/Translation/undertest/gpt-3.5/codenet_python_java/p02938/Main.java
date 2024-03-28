import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p02938 {
    static final int MOD = (int) 1e9 + 7;

    static Map<String, Integer> memoization = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int R = scanner.nextInt();

        System.out.println(solve(L, R));
    }

    static int solve(int L, int R) {
        if (L > R) return 0;
        if (L == 1) return (1 + solve(2, R)) % MOD;

        String key = L + "_" + R;
        if (memoization.containsKey(key)) {
            return memoization.get(key);
        }

        int result = (solve(L / 2, (R - 1) / 2) + solve((L + 1) / 2, R / 2) + solve((L + 1) / 2, (R - 1) / 2)) % MOD;
        memoization.put(key, result);
        return result;
    }
}