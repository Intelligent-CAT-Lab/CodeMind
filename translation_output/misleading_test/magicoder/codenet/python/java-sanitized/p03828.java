import java.util.*;

public class p03828 {
    static final int MOD = (int) Math.pow(10, 9) + 7;
    static int N;
    static Map<Integer, Integer> count = new HashMap<>();
    static int ans = 1;
    static List<Integer> num = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
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
            if (i > 1) {
                num.add(i);
                count.put(i, 1);
            }
        }
        for (int n : count.values()) {
            ans = (int) ((long) ans * (n + 1) % MOD);
        }
        System.out.println(ans);
    }
}