import java.util.*;

public class p02065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int mod = sc.nextInt();
        Map<List<Integer>, Long>[][] dp = new Map[2*N][K+2];
        for (int i = 0; i < 2*N; i++) {
            for (int j = 0; j <= K+1; j++) {
                dp[i][j] = new HashMap<>();
            }
        }
        dp[0][0].put(Collections.emptyList(), 1L);
        for (int i = 0; i < 2*N-1; i++) {
            for (int j = 0; j <= K+1; j++) {
                for (Map.Entry<List<Integer>, Long> entry : dp[i][j].entrySet()) {
                    List<Integer> top = entry.getKey();
                    long v = entry.getValue();
                    if (top.size() > K+1) {
                        continue;
                    }
                    if (i == 0) {
                        if (top.size() > 0) {
                            continue;
                        }
                        if (i+1 <= K) {
                            List<Integer> newTop = new ArrayList<>();
                            newTop.add(i+1);
                            dp[i+1][j].put(newTop, dp[i+1][j].getOrDefault(newTop, 0L) + v % mod);
                        }
                    } else {
                        if (top.size() > 1 && i+1 - top.get(1) <= K) {
                            List<Integer> newTop = new ArrayList<>(top);
                            newTop.remove(1);
                            dp[i+1][j].put(newTop, dp[i+1][j].getOrDefault(newTop, 0L) + v % mod);
                        }
                        if (i+1 - top.get(0) <= K) {
                            List<Integer> newTop = new ArrayList<>(top);
                            newTop.set(0, i+1);
                            dp[i+1][j+1].put(newTop, dp[i+1][j+1].getOrDefault(newTop, 0L) + v % mod);
                        }
                        if (top.size() > 0 && i+1 - top.get(top.size()-1) <= K) {
                            List<Integer> newTop = new ArrayList<>(top);
                            newTop.add(i+1);
                            dp[i+1][j].put(newTop, dp[i+1][j].getOrDefault(newTop, 0L) + v % mod);
                        }
                    }
                }
            }
        }
        long res = 0;
        for (Map.Entry<List<Integer>, Long> entry : dp[2*N-1][K].entrySet()) {
            if (entry.getKey().size() == 1) {
                res = (res + entry.getValue()) % mod;
            }
        }
        System.out.println(res);
    }
}