import java.util.*;
import java.io.*;

public class p02012 {
    static int mod = (int)1e9 + 7;
    static int[] f;
    static boolean[] p;
    static ArrayList<Integer> lis;

    static int sum(int a, int b) {
        return ((b+a)*(b-a+1)) >> 1;
    }

    static ArrayList<Integer> fact(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        if (n < 4) {
            res.add(1);
            for (int i = 2; i <= n; i++)
                res.add(i);
            return res;
        }
        res.add(1);
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

    static void solve(int s) throws IOException {
        if (s == 1) {
            System.out.println(1);
            return;
        }
        lis = fact(s);
        f = new int[s+1];
        p = new boolean[s+1];
        Arrays.fill(p, true);
        Collections.sort(lis);
        for (int k : lis) {
            for (int a = 1; a <= k; a++) {
                int b = k - a;
                if (a <= b && p[a*b]) {
                    f[sum(a, b)] += 1;
                    p[a*b] = false;
                }
            }
            for (int a = 1; a <= s; a++) {
                int b = k + a - 1;
                if (p[a*b]) {
                    int s_ = sum(a, b);
                    if (s_ > s)
                        break;
                    f[s_] += 1;
                    p[a*b] = false;
                }
            }
        }
        int ans = 0;
        for (int k : lis)
            ans += f[k] * f[s / k];
        System.out.println(ans);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(br.readLine());
        solve(s);
    }
}