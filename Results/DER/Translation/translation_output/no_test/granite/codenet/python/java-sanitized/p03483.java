import java.util.*;

public class p03483 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        Map<Character, Integer> c = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            c.put(ch, c.getOrDefault(ch, 0) + 1);
        }
        boolean flg = false;
        if (n % 2 == 0) {
            for (int i : c.values()) {
                if (i % 2!= 0) {
                    System.out.println(-1);
                    return;
                }
            }
        } else {
            int cnt = 0;
            for (int i : c.values()) {
                if (i % 2!= 0) {
                    if (flg) {
                        System.out.println(-1);
                        return;
                    }
                    flg = true;
                    cnt++;
                }
            }
            if (cnt!= 1) {
                System.out.println(-1);
                return;
            }
        }
        long ans = 0;
        char[] fstr = new char[n];
        char[] lstr = new char[n];
        int[] dc = new int[256];
        int ptr = 0;
        for (int i = 0; i < n; i++) {
            char si = s.charAt(i);
            dc[si]++;
            int cnt = dc[si];
            if (c.get(si) % 2!= 0) {
                if (cnt * 2 - 1 == c.get(si)) {
                    ans += i - ptr;
                    continue;
                }
            }
            if (cnt <= c.get(si) / 2) {
                ans += i - ptr;
                ptr++;
                fstr[i] = si;
            } else {
                lstr[i] = si;
            }
        }
        lstr = reverse(lstr);
        n /= 2;
        int[] perm = new int[n];
        Map<Character, List<Integer>> fdc = new HashMap<>();
        int[] ldc = new int[256];
        int lcnt = 0;
        for (int i = 0; i < n; i++) {
            char fi = fstr[i];
            fdc.putIfAbsent(fi, new ArrayList<>());
            fdc.get(fi).add(i + 1);
        }
        for (int i = 0; i < n; i++) {
            char li = lstr[i];
            perm[i] = fdc.get(li).get(ldc[li]);
            ldc[li]++;
        }
        FenwickTree sol = new FenwickTree(n + 2);
        for (int i = 0; i < n; i++) {
            int p = perm[i];
            ans += sol.sum(n + 1) - sol.sum(p);
            sol.add(p, 1);
        }
        System.out.println(ans);
    }

    static char[] reverse(char[] s) {
        char[] t = new char[s.length];
        for (int i = 0; i < s.length; i++) {
            t[i] = s[s.length - 1 - i];
        }
        return t;
    }

    static class FenwickTree {
        int n;
        int[] bit;

        public FenwickTree(int n) {
            this.n = n;
            bit = new int[n + 1];
        }

        int sum(int i) {
            int s = 0;
            while (i > 0) {
                s += bit[i];
                i -= i & -i;
            }
            return s;
        }

        void add(int i, int x) {
            while (i <= n) {
                bit[i] += x;
                i += i & -i;
            }
        }
    }
}