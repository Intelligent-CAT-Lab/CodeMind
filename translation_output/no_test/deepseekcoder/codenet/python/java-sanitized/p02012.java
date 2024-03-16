import java.util.*;
import java.io.*;

public class p02012 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int I() throws IOException {
        return Integer.parseInt(br.readLine());
    }

    static long sum(long a, long b) {
        return ((b + a) * (b - a + 1)) >> 1;
    }

    static ArrayList<Integer> fact(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        res.add(1);
        if (n < 4)
            return res;
        int i = 2;
        while (i * i <= n) {
            if (n % i == 0) {
                res.add(i);
                int m = n / i;
                if (i != m)
                    res.add(m);
            }
            i += 1;
        }
        res.add(n);
        return res;
    }

    static void solve() throws IOException {
        int s = I();
        if (s == 1) {
            System.out.println(1);
            return;
        }
        ArrayList<Integer> lis = fact(s);
        HashMap<Integer, Integer> f = new HashMap<>();
        HashMap<String, Boolean> p = new HashMap<>();
        Collections.sort(lis);
        for (int k : lis) {
            for (int a = 1; a <= k; a++) {
                int b = k - a;
                if (a <= b) {
                    if (p.getOrDefault((a + "-" + b), true)) {
                        f.put(sum(a, b), f.getOrDefault(sum(a, b), 0) + 1);
                        p.put((a + "-" + b), false);
                    }
                }
            }
            for (int a = 1; a <= s; a++) {
                int b = k + a - 1;
                if (p.getOrDefault((a + "-" + b), true)) {
                    long s_ = sum(a, b);
                    if (s_ > s)
                        break;
                    f.put((int)s_, f.getOrDefault((int)s_, 0) + 1);
                    p.put((a + "-" + b), false);
                }
            }
        }
        long ans = 0;
        for (int k : lis) {
            ans += f.getOrDefault(k, 0) * f.getOrDefault(s / k, 0);
        }
        System.out.println(ans);
    }

    public static void main(String[] args) throws IOException {
        solve();
    }
}