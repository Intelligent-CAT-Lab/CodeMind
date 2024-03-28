import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class p03828 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int MOD = 1000000007;
        int ans = 1;
        Map<Integer, Integer> count = new HashMap<>();
        int[] num = new int[N];

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
                num[num.length] = i;
                count.put(i, 1);
            }
        }

        for (int n : count.values()) {
            ans = (ans * (n + 1)) % MOD;
        }

        System.out.println(ans);
    }
}


After the loop, it iterates over the `HashMap` and calculates the final answer by multiplying the count of each number by (n + 1) and taking the modulo of the result with MOD.