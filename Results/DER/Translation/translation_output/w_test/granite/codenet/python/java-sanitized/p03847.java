import java.util.*;

public class p03847 {
    static int N;
    static long MOD = 100000007;
    static HashMap<Integer, Long> memo = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        memo.put(0, 1L);
        memo.put(1, 2L);
        System.out.println(func(N));
    }

    public static long func(int N) {
        if (memo.containsKey(N)) {
            return memo.get(N);
        }
        long result = (func(N / 2) + func((N - 1) / 2) + func(N / 2 - 1)) % MOD;
        memo.put(N, result);
        return result;
    }
}