import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p03847 {

    private static final long MOD = 1000000007;
    private static Map<Long, Long> memo = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        scanner.close();

        // Initialize memoization
        memo.put(0L, 1L);
        memo.put(1L, 2L);

        System.out.println(func(N));
    }

    public static long func(long N) {
        if (memo.containsKey(N)) {
            return memo.get(N);
        }
        long result = (func(N / 2) + func((N - 1) / 2) + func(N / 2 - 1)) % MOD;
        
        memo.put(N, result);
        return result;
    }
}