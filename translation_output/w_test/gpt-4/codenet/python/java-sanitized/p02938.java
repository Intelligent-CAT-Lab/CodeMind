import java.util.HashMap;
import java.util.Scanner;

public class p02938 {
    private static final int MOD = 1000000007;
    private static HashMap<String, Integer> memo = new HashMap<>();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        sc.close();

        System.out.println(solve(L, R));
    }

    public static int solve(int L, int R) {
        if (L > R) return 0;
        if (L == 1) return (1 + solve(2, R)) % MOD;
        
        String key = L + "," + R;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        int result = (solve(L / 2, (R - 1) / 2) + solve((L + 1) / 2, R / 2) + solve((L + 1) / 2, (R - 1) / 2)) % MOD;
        memo.put(key, result);
        return result;
    }
}