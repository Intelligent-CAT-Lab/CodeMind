import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class Main {
    static class Bit {
        int size;
        int[] tree;

        Bit(int n) {
            size = n;
            tree = new int[n + 1];
        }

        int sum(int i) {
            int s = 0;
            while (i > 0) {
                s += tree[i];
                i -= (i & -i);
            }
            return s;
        }

        void add(int i, int x) {
            while (i <= size) {
                tree[i] += x;
                i += (i & -i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int n = s.length();
        Map<Character, Integer> c = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            c.put(ch, c.getOrDefault(ch, 0) + 1);
        }
        int flg = 0;
        if (n % 2 == 0) {
            for (int i : c.values()) {
                if (i % 2 == 1) {
                    System.out.println(-1);
                    return;
                }
            }
        } else {
            for (Map.Entry<Character, Integer> entry : c.entrySet()) {
                if (entry.getValue() % 2 == 1 && flg == 1) {
                    System.out.println(-1);
                    return;
                } else if (entry.getValue() % 2 == 1) {
                    flg = 1;
                }
            }
        }
        int ans = 0;
        char[] fstr = new char[n];
        char[] lstr = new char[n];
        Map<Character, Integer> dc = new HashMap<>();
        int ptr = 0;
        for (int i = 0; i < n; i++) {
            char si = s.charAt(i);
            dc.put(si, dc.getOrDefault(si, 0) + 1);
            int cnt = dc.get(si);
            if (c.get(si) % 2 == 1) {
                if (cnt * 2 - 1 == c.get(si)) {
                    ans += i - ptr;
                    continue;
                }
            }
            if (cnt <= c.get(si) / 2) {
                ans += i - ptr;
                ptr++;
                fstr[ptr - 1] = si;
            } else {
                lstr[n - 1 - ptr] = si;
            }
        }
        n /= 2;
        int[] perm = new int[n];
        Map<Character, Set<Integer>> fdc = new HashMap<>();
        Map<Character, Integer> ldc = new HashMap<>();
        int lcnt = 0;
        for (int i = 0; i < n; i++) {
            char fi = fstr[i];
            if (!fdc.containsKey(fi)) {
                fdc.put(fi, new HashSet<>());
            }
            fdc.get(fi).add(i + 1);
        }
        for (int i = 0; i < n; i++) {
            char li = lstr[i];
            perm[i] = new ArrayList<>(fdc.get(li)).get(ldc.getOrDefault(li, 0));
            ldc.put(li, ldc.getOrDefault(li, 0) + 1);
        }
        Bit sol = new Bit(n + 2);
        for (int i = 0; i < n; i++) {
            int p = perm[i];
            ans += sol.sum(n + 1) - sol.sum(p);
            sol.add(p, 1);
        }
        System.out.println(ans);
    }
}