import java.util.*;

public class p02065 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int mod = scanner.nextInt();
        Map<Pair, Integer>[] dp = new HashMap[2*N];
        for (int i = 0; i < 2*N; i++) {
            dp[i] = new HashMap<>();
        }
        dp[0].put(new Pair(null, new int[]{0}), 1);
        for (int i = 0; i < 2*N-1; i++) {
            for (Map.Entry<Pair, Integer> entry : dp[i].entrySet()) {
                Pair pair = entry.getKey();
                int v = entry.getValue();
                if (pair.top.length > K+1) {
                    continue;
                }
                if (pair.left == null) {
                    if (pair.top.length > 0 && i+1 - pair.top[0] <= K) {
                        dp[i+1].put(new Pair(i+1, pair.top), (dp[i+1].getOrDefault(new Pair(i+1, pair.top), 0) + v) % mod);
                    }
                } else if (pair.top.length > 1 && i+1 - pair.top[1] <= K) {
                    int[] newTop = new int[pair.top.length-1];
                    System.arraycopy(pair.top, 1, newTop, 0, pair.top.length-1);
                    dp[i+1].put(new Pair(pair.left, newTop), (dp[i+1].getOrDefault(new Pair(pair.left, newTop), 0) + v) % mod);
                }
                if (pair.top.length > 0 && i+1 - pair.top[pair.top.length-1] <= K) {
                    int[] newTop = Arrays.copyOf(pair.top, pair.top.length+1);
                    newTop[newTop.length-1] = i+1;
                    dp[i+1].put(new Pair(pair.left, newTop), (dp[i+1].getOrDefault(new Pair(pair.left, newTop), 0) + v) % mod);
                }
            }
        }
        int res = 0;
        for (Map.Entry<Pair, Integer> entry : dp[2*N-1].entrySet()) {
            Pair pair = entry.getKey();
            int v = entry.getValue();
            if (pair.top.length == 1) {
                assert pair.left == 2*N - 1;
                res = (res + v) % mod;
            }
        }
        System.out.println(res);
    }

    static class Pair {
        Integer left;
        int[] top;

        Pair(Integer left, int[] top) {
            this.left = left;
            this.top = top;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return Arrays.equals(top, pair.top) && Objects.equals(left, pair.left);
        }

        @Override
        public int hashCode() {
            int result = Objects.hash(left);
            result = 31 * result + Arrays.hashCode(top);
            return result;
        }
    }
}