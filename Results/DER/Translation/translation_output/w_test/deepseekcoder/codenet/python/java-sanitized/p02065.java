import java.util.*;

public class p02065 {
    static class Pair implements Comparable<Pair> {
        Integer first, second;
        Pair(Integer first, Integer second) {
            this.first = first;
            this.second = second;
        }
        @Override
        public int compareTo(Pair p) {
            if (first != p.first)
                return first - p.first;
            if (second != p.second)
                return second - p.second;
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        int mod = in.nextInt();
        Map<Pair, Integer>[] dp = new HashMap[2*N];
        for (int i = 0; i < 2*N; i++)
            dp[i] = new HashMap<>();
        dp[0].put(new Pair(null, new int[]{0}), 1);
        for (int i = 0; i < 2*N-1; i++) {
            for (Map.Entry<Pair, Integer> entry : dp[i].entrySet()) {
                Pair key = entry.getKey();
                int[] top = key.second;
                if (top.length > K+1)
                    continue;
                if (key.first == null) {
                    if (i+1 - top[0] <= K) {
                        dp[i+1].put(new Pair(i+1, top), (dp[i+1].getOrDefault(new Pair(i+1, top), 0) + entry.getValue()) % mod);
                    }
                } else if (i+1 - key.first <= K && top.length > 1 && i+1 - top[1] <= K) {
                    dp[i+1].put(new Pair(key.first, Arrays.copyOfRange(top, 1, top.length)), (dp[i+1].getOrDefault(new Pair(key.first, Arrays.copyOfRange(top, 1, top.length)), 0) + entry.getValue()) % mod);
                }
                if (top.length > 0 && i+1 - top[top.length-1] <= K) {
                    int[] newTop = Arrays.copyOf(top, top.length+1);
                    newTop[newTop.length-1] = i+1;
                    dp[i+1].put(new Pair(key.first, newTop), (dp[i+1].getOrDefault(new Pair(key.first, newTop), 0) + entry.getValue()) % mod);
                }
            }
        }
        int res = 0;
        for (Map.Entry<Pair, Integer> entry : dp[2*N-1].entrySet()) {
            if (entry.getKey().second.length == 1) {
                assert entry.getKey().first == 2*N - 1;
                res = (res + entry.getValue()) % mod;
            }
        }
        System.out.println(res);
    }
}