import java.util.Scanner;
import java.util.HashMap;

public class p03847 {
    private static final int MOD = (int) (1e9 + 7);
    private static HashMap<Integer, Integer> memo = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        memo.put(0, 1);
        memo.put(1, 2);

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