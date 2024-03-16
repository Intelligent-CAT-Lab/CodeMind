import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongFunction;

public class p02938 {
    private static final long MOD = 1000000007L;

    public static long solve(int L, int R) {
        if (L > R) {
            return 0;
        }
        if (L == 1) {
            return (1 + solve(2, R)) % MOD;
        }
        return (solve(L / 2, (R - 1) / 2) + solve((L + 1) / 2, R / 2) + solve((L + 1) / 2, (R - 1) / 2)) % MOD;
    }

    public static void main(String[] args) {
        int L = Integer.parseInt(args[0]);
        int R = Integer.parseInt(args[1]);
        System.out.println(solve(L, R));
    }
}