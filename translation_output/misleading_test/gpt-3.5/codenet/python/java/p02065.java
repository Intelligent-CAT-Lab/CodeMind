```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DPCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int mod = scanner.nextInt();

        Map<Pair, Integer>[] dp = new HashMap[2 * N];
        for (int i = 0; i < 2 * N; i++) {
            dp[i] = new HashMap<>();
        }

        dp[0].put(new Pair(null, new int[]{0}), 1);

        for (int i = 0; i < 2 * N - 1; i++) {
            for (Map.Entry<Pair, Integer> entry : dp[i].entrySet()) {
                Pair pair = entry.getKey();
                int[] left = pair.getLeft();
                int[] top = pair.getTop();
                int v = entry.getValue();

                if (top.length > K + 1) {
                    continue;
                }
                
                if (left == null) {
                    if (top.length > 0 && i + 1 - top[0] <= K) {
                        dp[i + 1].put(new Pair(i + 1, top), (dp[i + 1].getOrDefault(new Pair(i + 1, top), 0) + v) % mod);
                    }
                } else if (i + 1 - left[0] <= K && top.length > 1 && i + 1 - top[1] <= K) {
                    dp[i + 1].put(new Pair(i + 1, Arrays.copyOfRange(top, 1, top.length)), (dp[i + 1].getOrDefault(new Pair(i + 1, Arrays.copyOfRange(top, 1, top.length)), 0) + v) % mod);
                }
                
                if (top.length > 0 && i + 1 - top[top.length - 1] <= K) {
                    int[] newTop = new int[top.length + 1];
                    System.arraycopy(top, 0, newTop, 0, top.length);
                    newTop[newTop.length - 1] = i + 1;
                    dp[i + 1].put(new Pair(left, newTop), (dp[i + 1].getOrDefault(new Pair(left, newTop), 0) + v) % mod);
                }
            }
        }

        int res = 0;
        for (Map.Entry<Pair, Integer> entry : dp[2 * N - 1].entrySet()) {
            Pair pair = entry.getKey();
            int[] top = pair.getTop();
            int v = entry.getValue();

            if (top.length == 1) {
                assert pair.getLeft()[0] == 2 * N - 1;
                res = (res + v) % mod;
            }
        }

        System.out.println(res);
    }

    static class Pair {
        private final int[] left;
        private final int[] top;

        Pair(int[] left, int[] top) {
            this.left = left;
            this.top = top;
        }

        int[] getLeft() {
            return left;
        }

        int[] getTop() {
            return top;
        }
    }
}
```
```
