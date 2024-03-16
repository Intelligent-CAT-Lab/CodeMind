import java.util.*;

public class p03828 {
    final static int MOD = (int) 1e9 + 7;
    final static int N = Integer.parseInt(System.console().readLine());
    final static List<Integer> num = new ArrayList<>();
    final static Map<Integer, Integer> count = new HashMap<>();
    final static int ans = 1;

    public static void main(String[] args) {
        for (int i = 2; i <= N; i++) {
            for (int n : num) {
                while (i % n == 0) {
                    count.put(n, count.getOrDefault(n, 0) + 1);
                    i /= n;
                }
                if (i == 1)
                    break;
            }
            num.add(i);
            count.put(i, 1);
        }
        for (int n : count.values()) {
            ans = ans * (n + 1) % MOD;
        }
        System.out.println(ans);
    }
}