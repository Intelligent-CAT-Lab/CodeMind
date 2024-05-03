import java.util.HashMap;
import java.util.Map;

public class p03847 {
    public static void main(String[] args) {
        String N = System.console().readLine();
        long n = Long.parseLong(N);

        Map<Long, Long> memo = new HashMap<>();
        memo.put(0L, 1L);
        memo.put(1L, 2L);

        System.out.println(func(n, memo));
    }

    public static long func(long N, Map<Long, Long> memo) {
        if (memo.containsKey(N)) {
            return memo.get(N);
        }
        long result = (func(N / 2, memo) + func((N - 1) / 2, memo) + func(N / 2 - 1, memo)) % (1000000007L);

        memo.put(N, result);
        return result;
    }
}