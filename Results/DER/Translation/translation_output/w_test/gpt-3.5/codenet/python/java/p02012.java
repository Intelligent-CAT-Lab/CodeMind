```java
import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        solve();
    }

    public static void solve() throws IOException {
        int s = nextInt();

        if (s == 1) {
            System.out.println(1);
            return;
        }

        List<Integer> lis = fact(s);
        Map<Integer, Integer> f = new HashMap<>();
        Map<List<Integer>, Integer> p = new HashMap<>();
        lis.sort(Collections.reverseOrder());
        
        for (int k : lis) {
            for (int a = 1; a <= k; a++) {
                int b = k - a;
                if (a <= b) {
                    List<Integer> pair = Arrays.asList(a, b);
                    if (!p.containsKey(pair)) {
                        f.put(sum(a, b), f.getOrDefault(sum(a, b), 0) + 1);
                        p.put(pair, 0);
                    }
                }

                for (int a_ = 1; a_ <= s; a_++) {
                    int b_ = k + a_ - 1;
                    List<Integer> pair = Arrays.asList(a_, b_);
                    if (!p.containsKey(pair)) {
                        int s_ = sum(a_, b_);
                        if (s_ > s) {
                            break;
                        }
                        f.put(s_, f.getOrDefault(s_, 0) + 1);
                        p.put(pair, 0);
                    }
                }
            }
        }

        int ans = 0;
        for (int k : lis) {
            ans += f.getOrDefault(k, 0) * f.getOrDefault(s / k, 0);
        }

        System.out.println(ans);
    }

    public static int sum(int a, int b) {
        return ((b + a) * (b - a + 1)) >> 1;
    }

    public static List<Integer> fact(int n) {
        List<Integer> res = new ArrayList<>();
        if (n < 4) {
            res.add(1);
            res.add(n);
        } else {
            int i = 2;
            while (i * i <= n) {
                if (n % i == 0) {
                    res.add(i);
                    int m = n / i;
                    if (i != m) {
                        res.add(m);
                    }
                }
                i++;
            }
            res.add(n);
        }
        return res;
    }

    public static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine());
        return st.nextToken();
    }

    public static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }
}
```
