import java.util.HashMap;
import java.util.Map;

public class p03847 {
    public static void main(String[] args) {
        int N = Integer.parseInt(System.console().readLine());
        Map<Integer, Integer> memo = new HashMap<>();
        memo.put(0, 1);
        memo.put(1, 2);

        System.out.println(func(N, memo));
    }

    public static int func(int N, Map<Integer, Integer> memo) {
        if (memo.containsKey(N)) {
            return memo.get(N);
        }
        int result = (func(N / 2, memo) + func((N - 1) / 2, memo) + func(N / 2 - 1, memo)) % (1000000007);

        memo.put(N, result);
        return result;
    }
}