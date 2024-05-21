import java.util.*;
import java.io.*;

public class p02012 {
    static void solve() {
        int s = in.nextInt();
        if (s == 1) {
            out.println(1);
            return;
        }
        List<Integer> lis = fact(s);
        Map<Integer, Integer> f = new HashMap<>();
        Map<Integer, Integer> p = new HashMap<>();
        for (int k : lis) {
            for (int a = 1; a <= k; a++) {
                int b = k - a;
                if (a <= b) {
                    if (p.getOrDefault(key(a, b), 1) == 1) {
                        f.put(sum(a, b), f.getOrDefault(sum(a, b), 0) + 1);
                        p.put(key(a, b), 0);
                    }
                }
            }
            for (int a = 1; a <= s; a++) {
                int b = k + a - 1;
                if (p.getOrDefault(key(a, b), 1) == 1) {
                    int s_ = sum(a, b);
                    if (s_ > s) {
                        break;
                    }
                    f.put(s_, f.getOrDefault(s_, 0) + 1);
                    p.put(key(a, b), 0);
                }
            }
        }
        int ans = 0;
        for (int k : lis) {
            ans += f.getOrDefault(k, 0) * f.getOrDefault(s / k, 0);
        }
        out.println(ans);
    }

    static int sum(int a, int b) {
        return ((b + a) * (b - a + 1)) / 2;
    }

    static List<Integer> fact(int n) {
        if (n < 4) {
            return Arrays.asList(1, n);
        }
        List<Integer> res = new ArrayList<>();
        res.add(1);
        int i = 2;
        while (i * i <= n) {
            if (n % i == 0) {
                res.add(i);
                int m = n / i;
                if (i!= m) {
                    res.add(m);
                }
            }
            i++;
        }
        res.add(n);
        return res;
    }

    static String key(int a, int b) {
        return a + "_" + b;
    }

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    static final Scanner in = new Scanner(System.in);
    static final PrintWriter out = new PrintWriter(System.out);
}