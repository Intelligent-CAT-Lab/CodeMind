import java.util.*;

public class p03847 {
    static long mod = 100000007;
    static HashMap<Long, Long> memo = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        memo.put(0L, 1L);
        memo.put(1L, 2L);
        System.out.println(func(N));
    }

    public static long func(long N) {
        if (memo.containsKey(N)) {
            return memo.get(N);
        }
        long result = (func(N / 2) + func((N - 1) / 2) + func(N / 2 - 1)) % mod;
        memo.put(N, result);
        return result;
    }
}