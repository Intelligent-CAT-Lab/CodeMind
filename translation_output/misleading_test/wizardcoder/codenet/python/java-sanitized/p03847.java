import java.util.*;

public class p03847 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        Map<Integer, Integer> memo = new HashMap<>();
        memo.put(0, 1);
        memo.put(1, 2);

        int result = func(N, memo);

        System.out.println(result);
    }

    public static int func(int N, Map<Integer, Integer> memo) {
        if (memo.containsKey(N)) {
            return memo.get(N);
        }
        int result = (func(N / 2, memo) + func((N - 1) / 2, memo) + func(N / 2 - 1, memo)) % (10**9 + 7);
        memo.put(N, result);
        return result;
    }
}