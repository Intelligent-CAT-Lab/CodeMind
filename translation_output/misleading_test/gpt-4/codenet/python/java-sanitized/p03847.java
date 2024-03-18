import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p03847 {
    
    private static final int MOD = 1_000_000_007;
    private static Map<Integer, Integer> memo = new HashMap<>();

    static {
        memo.put(0, 1);
        memo.put(1, 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();
        System.out.println(func(N));
    }

    private static int func(int N) {
        if (memo.containsKey(N)) {
            return memo.get(N);
        }
        int result = (func(N / 2) + func((N - 1) / 2) + func(N / 2 - 1)) % MOD;
        memo.put(N, result);
        return result;
    }
}