import java.util.*;

public class p02938 {
    static long MOD = (long)Math.pow(10,9)+7;
    static Map<String, Long> memo = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        System.out.println(solve(L, R));
    }

    static long solve(int L, int R) {
        if (L > R) return 0;
        String key = L + " " + R;
        if (memo.containsKey(key)) return memo.get(key);
        if (L == 1) {
            memo.put(key, (1 + solve(2, R)) % MOD);
        } else {
            memo.put(key, (solve(L/2,(R-1)/2) + solve((L+1)/2,R/2) + solve((L+1)/2,(R-1)/2)) % MOD);
        }
        return memo.get(key);
    }
}