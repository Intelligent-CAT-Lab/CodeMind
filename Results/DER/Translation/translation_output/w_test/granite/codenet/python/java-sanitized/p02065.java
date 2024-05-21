import java.util.*;

public class p02065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int mod = sc.nextInt();
        Map<List<Integer>, Long>[][] dp = new Map[2*N][2*N];
        for (int i = 0; i < 2*N; i++) {
            for (int j = 0; j < 2*N; j++) {
                dp[i][j] = new HashMap<>();
            }
        }
        dp[0][0].put(Collections.singletonList(0), 1L);
        for (int i = 0; i < 2*N-1; i++) {
            for (int j = 0; j < 2*N; j++) {
                for (Map.Entry<List<Integer>, Long> entry : dp[i][j].entrySet()) {
                    List<Integer> top = entry.getKey();
                    long v = entry.getValue();
                    if (top.size() > K+1) {
                        continue;
                    }
                    if (j == 2*N-1) {
                        if (top.size() == 1) {
                            assert i == 2*N-2;
                            res = (res + v) % mod;
                        }
                        continue;
                    }
                    if (top.isEmpty()) {
                        if (i+1 - top.get(0) <= K) {
                            List<Integer> newTop = new ArrayList<>(top);
                            newTop.add(i+1);
                            dp[i+1][j+1].put(newTop, (dp[i+1][j+1].getOrDefault(newTop, 0L) + v) % mod);
                        }
                    } else if (i+1 - top.get(0) <= K) {
                        List<Integer> newTop = new ArrayList<>(top.subList(1, top.size()));
                        dp[i+1][j+1].put(newTop, (dp[i+1][j+1].getOrDefault(newTop, 0L) + v) % mod);
                    }
                    if (top.size() > 1 && i+1 - top.get(top.size()-1) <= K) {
                        List<Integer> newTop = new ArrayList<>(top);
                        newTop.remove(top.size()-1);
                        dp[i+1][j+1].put(newTop, (dp[i+1][j+1].getOrDefault(newTop, 0L) + v) % mod);
                    }
                    if (top.size() > 1 && i+1 - top.get(top.size()-2) <= K) {
                        List<Integer> newTop = new ArrayList<>(top);
                        newTop.remove(top.size()-2);
                        newTop.add(i+1);
                        dp[i+1][j+1].put(newTop, (dp[i+1][j+1].getOrDefault(newTop, 0L) + v) % mod);
                    }
                }
            }
        }
        System.out.println(res);
    }
}