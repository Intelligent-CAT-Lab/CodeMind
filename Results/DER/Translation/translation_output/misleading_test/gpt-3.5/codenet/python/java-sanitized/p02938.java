import java.util.*;

public class p02938 {
    static final long MOD = 1000000007;

    static Map<List<Integer>, Long> cache = new HashMap<>();

    static long solve(int L, int R) {
        List<Integer> key = Arrays.asList(L, R);
        if (cache.containsKey(key)) {
            return cache.get(key);
        }

        long ans;
        if (L > R) {
            ans = 0;
        } else if (L == 1) {
            ans = (1 + solve(2, R)) % MOD;
        } else {
            ans = (solve(L / 2, (R - 1) / 2) + solve((L + 1) / 2, R / 2) + solve((L + 1) / 2, (R - 1) / 2)) % MOD;
        }

        cache.put(key, ans);
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int L = Integer.parseInt(inputs[0]);
        int R = Integer.parseInt(inputs[1]);

        System.out.println(solve(L, R));
    }
}