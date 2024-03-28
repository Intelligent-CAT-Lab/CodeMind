import java.util.Scanner;
import java.util.HashMap;

public class p03483 {
    int size;
    int[] tree;

    public Bit(int n) {
        size = n;
        tree = new int[n+1];
    }

    public int sum(int i) {
        int s = 0;
        while (i > 0) {
            s += tree[i];
            i -= (i & -i);
        }
        return s;
    }

    public void add(int i, int x) {
        while (i <= size) {
            tree[i] += x;
            i += (i & -i);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int n = s.length();
        HashMap<Character, Integer> c = new HashMap<>();
        for (char ch : s.toCharArray()) {
            c.put(ch, c.getOrDefault(ch, 0) + 1);
        }

        int flg = 0;
        if (n % 2 == 0) {
            for (int i : c.values()) {
                if (i % 2 != 0) {
                    System.out.println(-1);
                    return;
                }
            }
        } else {
            for (char st : c.keySet()) {
                int i = c.get(st);
                if (i % 2 != 0 && flg == 1) {
                    System.out.println(-1);
                    return;
                } else if (i % 2 != 0) {
                    flg = 1;
                }
            }
        }

        int ans = 0;
        char[] fstr = new char[n];
        char[] lstr = new char[n];
        HashMap<Character, Integer> dc = new HashMap<>();
        int ptr = 0;
        for (int i = 0; i < n; i++) {
            char si = s.charAt(i);
            dc.put(si, dc.getOrDefault(si, 0) + 1);
            int cnt = dc.get(si);
            if (c.get(si) % 2 != 0) {
                if (cnt * 2 - 1 == c.get(si)) {
                    ans += i - ptr;
                    continue;
                }
            }
            if (cnt <= c.get(si) / 2) {
                ans += i - ptr;
                ptr++;
                fstr[ptr-1] = si;
            } else {
                lstr[n - ptr] = si;
            }
        }

        int[] perm = new int[n];
        HashMap<Character, Integer> fdc = new HashMap<>();
        HashMap<Character, Integer> ldc = new HashMap<>();
        int lcnt = 0;
        int tempN = n/2;
        for (int i = 0; i < tempN; i++) {
            char fi = fstr[i];
            fdc.put(fi, fdc.getOrDefault(fi, 0) + 1);
        }
        for (int i = 0; i < tempN; i++) {
            char li = lstr[i];
            perm[i] = fdc.get(li);
            ldc.put(li, ldc.getOrDefault(li, 0) + 1);
        }

        Bit sol = new Bit(n + 2);
        for (int i = 0; i < tempN; i++) {
            int p = perm[i];
            ans += sol.sum(n + 1) - sol.sum(p);
            sol.add(p, 1);
        }

        System.out.println(ans);
    }
}