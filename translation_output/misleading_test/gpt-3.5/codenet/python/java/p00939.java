```java
import java.util.HashMap;

public class Solution {
    
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        String D = "20";
        int N = D.length();
        int[] DI = new int[N];
        for (int i = 0; i < N; i++) {
            DI[i] = Character.getNumericValue(D.charAt(i));
        }
        int su = 0;
        for (int d : DI) {
            su += d;
        }
        int pd = 1;
        for (char c : D.toCharArray()) {
            pd *= Character.getNumericValue(c) + 1;
        }
        HashMap<String, Integer>[] memo = new HashMap[N];
        for (int i = 0; i < N; i++) {
            memo[i] = new HashMap<>();
        }
        
        int res1 = dfs0(0, su, 1, pd, memo);
        
        HashMap<String, Integer>[] memo1 = new HashMap[N];
        for (int i = 0; i < N; i++) {
            memo1[i] = new HashMap<>();
        }
        
        int res2 = dfs1(0, su, pd, 0, DI, N, memo1) - 1;
        
        int ans = res1 + res2;
        System.out.println(ans);
    }

    public static int dfs0(int i, int s, int p, int pd, HashMap<String, Integer>[] memo) {
        String key = i + "-" + s + "-" + p;
        int N = memo.length;
        if (i == N) {
            return s > 0 || (s == 0 && p < pd) ? 1 : 0;
        }
        if (memo[i].containsKey(key)) {
            return memo[i].get(key);
        }
        int r = 0;
        for (int v = Math.min(s, 9); v >= 0; v--) {
            r += dfs0(i + 1, s - v, p * (v + 1), pd, memo);
        }
        memo[i].put(key, r);
        return r;
    }

    public static int dfs1(int i, int s, int p, int m, int[] DI, int N, HashMap<String, Integer>[] memo1) {
        String key = i + "-" + s + "-" + p + "-" + m;
        if (i == N) {
            return (s == 0 && p == 1) ? 1 : 0;
        }
        if (memo1[i].containsKey(key)) {
            return memo1[i].get(key);
        }
        int r = 0;
        int b = s - (N - 1 - i) * 9;
        int di = DI[i];
        for (int v = Math.min(s, 9); v >= Math.max(b, 0); v--) {
            if (p % (v + 1) != 0) {
                continue;
            }
            if (m == 0) {
                if (di < v) {
                    break;
                }
                r += dfs1(i + 1, s - v, p / (v + 1), (v < di) ? 1 : 0, DI, N, memo1);
            } else {
                r += dfs1(i + 1, s - v, p / (v + 1), 1, DI, N, memo1);
            }
        }
        memo1[i].put(key, r);
        return r;
    }
}
```
