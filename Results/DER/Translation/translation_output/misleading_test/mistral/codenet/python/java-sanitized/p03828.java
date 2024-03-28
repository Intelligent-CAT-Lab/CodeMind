import java.util.*;

public class p03828 {
    final static int MOD = (int) (1e9 + 7);
    final static int N = 100000;
    static int[] num = new int[N];
    static int ans = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> count = new HashMap<>();
        for (int i = 2; i <= n; i++) {
            for (int j : num) {
                while (i % j == 0) {
                    count.put(j, count.getOrDefault(j, 0) + 1);
                    i /= j;
                }
                if (i == 1)
                    break;
            }
            num[i] = 1;
            count.put(i, count.getOrDefault(i, 0) + 1);
        }
        for (int k : count.values()) {
            ans = ans * (k + 1) % MOD;
        }
        System.out.println(ans);
    }
}