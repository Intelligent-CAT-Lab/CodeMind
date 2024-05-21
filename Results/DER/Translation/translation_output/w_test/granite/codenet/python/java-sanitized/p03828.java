import java.util.*;

public class p03828 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MOD = 100000007;
        int N = sc.nextInt();
        Map<Integer, Integer> count = new HashMap<>();
        int ans = 1;
        List<Integer> num = new ArrayList<>();

        for (int i = 2; i <= N; i++) {
            for (int n : num) {
                while (i % n == 0) {
                    count.put(n, count.getOrDefault(n, 0) + 1);
                    i /= n;
                }
                if (i == 1) {
                    break;
                }
            }
            if (i!= 1) {
                num.add(i);
                count.put(i, 1);
            }
        }

        for (int n : count.values()) {
            ans = (ans * (n + 1)) % MOD;
        }
        System.out.println(ans);
    }
}