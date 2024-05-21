import java.io.*;
import java.util.*;

class Main {
    static int sum(int a, int b) {
        return ((b + a) * (b - a + 1)) >> 1;
    }

    static List<Integer> fact(int n) {
        List<Integer> res = new ArrayList<>();
        res.add(1);
        if (n < 4) {
            res.add(n);
            return res;
        }
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

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(br.readLine());
        if (s == 1) {
            System.out.println(1);
            return;
        }
        List<Integer> lis = fact(s);
        Map<Integer, Integer> f = new HashMap<>();
        Map<String, Integer> p = new HashMap<>();
        lis.sort(null);
        for (int k : lis) {
            for (int a = 1; a <= k; a++) {
                int b = k - a;
                if (a <= b) {
                    String key = a + "," + b;
                    if (p.get(key) == null) {
                        f.put(sum(a, b), f.getOrDefault(sum(a, b), 0) + 1);
                        p.put(key, 1);
                    }
                }
            }
            for (int a = 1; a <= s; a++) {
                int b = k + a - 1;
                String key = a + "," + b;
                if (p.get(key) == null) {
                    f.put(sum(a, b), f.getOrDefault(sum(a, b), 0) + 1);
                    p.put(key, 1);
                }
                if (sum(a, b) > s) {
                    break;
                }
            }
        }
        int ans = 0;
        for (int k : lis) {
            ans += f.get(k) * f.getOrDefault(s / k, 0);
        }
        System.out.println(ans);
    }
}