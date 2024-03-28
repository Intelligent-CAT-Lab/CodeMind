```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        String D = sc.nextLine();
        int N = D.length();
        int[] DI = new int[N];
        for (int i = 0; i < N; i++) {
            DI[i] = Integer.parseInt(String.valueOf(D.charAt(i)));
        }
        int su = 0;
        for (int digit : DI) {
            su += digit;
        }
        int pd = 1;
        for (char c : D.toCharArray()) {
            pd *= Character.getNumericValue(c) + 1;
        }

        List<Map<List<Integer>, Integer>> memo = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            memo.add(new HashMap<>());
        }

        int res1 = dfs0(0, su, 1, N, DI, pd, memo);

        List<Map<List<Integer>, Integer>> memo1 = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            memo1.add(new HashMap<>());
        }

        int res2 = dfs1(0, su, pd, 0, N, DI, memo1) - 1;
        int ans = res1 + res2;
        System.out.println(ans);
    }

    public static int dfs0(int i, int s, int p, int N, int[] DI, int pd, List<Map<List<Integer>, Integer>> memo) {
        List<Integer> key = new ArrayList<>();
        key.add(s);
        key.add(p);

        if (i == N) {
            return s > 0 || (s == 0 && p < pd) ? 1 : 0;
        }

        if (memo.get(i).containsKey(key)) {
            return memo.get(i).get(key);
        }

        int r = 0;
        for (int v = Math.min(s, 9); v >= 0; v--) {
            r += dfs0(i + 1, s - v, p * (v + 1), N, DI, pd, memo);
        }

        memo.get(i).put(key, r);
        return r;
    }

    public static int dfs1(int i, int s, int p, int m, int N, int[] DI, List<Map<List<Integer>, Integer>> memo) {
        List<Integer> key = new ArrayList<>();
        key.add(s);
        key.add(p);
        key.add(m);

        if (i == N) {
            return s == 0 && p == 1 ? 1 : 0;
        }

        if (memo.get(i).containsKey(key)) {
            return memo.get(i).get(key);
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
                r += dfs1(i + 1, s - v, p / (v + 1), v < di ? 1 : 0, N, DI, memo);
            } else {
                r += dfs1(i + 1, s - v, p / (v + 1), 1, N, DI, memo);
            }
        }

        memo.get(i).put(key, r);
        return r;
    }
}
```
