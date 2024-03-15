import java.util.*;

public class p03847 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Map<Integer, Integer> memo = new HashMap<>();
        memo.put(0, 1);
        memo.put(1, 2);

        int result = func(N);
        System.out.println(result);
    }

    public static int func(int N) {
        if (memo.containsKey(N)) {
            return memo.get(N);
        }
        int result = (func(N / 2) + func((N - 1) / 2) + func(N / 2 - 1)) % (1000000007);

        memo.put(N, result);
        return result;
    }
}