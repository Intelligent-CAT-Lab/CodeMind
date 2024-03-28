```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        solve(sc);
    }

    static void solve(FastScanner sc) {
        int s = sc.nextInt();
        if (s == 1) {
            System.out.println(1);
            return;
        }
        List<Integer> lis = fact(s);
        Map<Integer, Integer> f = new HashMap<>();
        Map<Pair, Integer> p = new HashMap<>();
        lis.sort(null);
        for (int k : lis) {
            for (int a = 1; a <= k; a++) {
                int b = k - a;
                if (a <= b) {
                    if (p.getOrDefault(new Pair(a, b), 1) == 1) {
                        f.put(sum(a, b), f.getOrDefault(sum(a, b), 0) + 1);
                        p.put(new Pair(a, b), 0);
                    }
                }
                for (int aa = 1; aa <= s; aa++) {
                    int bb = k + aa - 1;
                    if (p.getOrDefault(new Pair(aa, bb), 1) == 1) {
                        int ss = sum(aa, bb);
                        if (ss > s) break;
                        f.put(ss, f.getOrDefault(ss, 0) + 1);
                        p.put(new Pair(aa, bb), 0);
                    }
                }
            }
        }
        long ans = 0;
        for (int k : lis) {
            ans += (long) f.get(k) * f.getOrDefault(s / k, 0);
        }
        System.out.println(ans);
    }

    static List<Integer> fact(int n) {
        List<Integer> res = new ArrayList<>();
        if (n < 4) {
            res.add(1);
            res.add(n);
            return res;
        }
        res.add(1);
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
        return res;
    }

    static int sum(int a, int b) {
        return ((b + a) * (b - a + 1)) >> 1;
    }

    static class Pair {
        int first, second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return first == pair.first && second == pair.second;
        }

        @Override
        public int hashCode() {
            return Objects.hash(first, second);
        }
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}
```

