import java.util.*;

class Bit {
    private int size;
    private int[] tree;

    public Bit(int n) {
        this.size = n;
        this.tree = new int[n+1];
    }

    public int sum(int i) {
        int s = 0;
        while (i > 0) {
            s += this.tree[i];
            i -= i & -i;
        }
        return s;
    }

    public void add(int i, int x) {
        while (i <= this.size) {
            this.tree[i] += x;
            i += i & -i;
        }
    }
}

public class p03483 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int n = s.length();
        Map<Character, Integer> c = new HashMap<>();
        for (char ch : s.toCharArray()) {
            c.put(ch, c.getOrDefault(ch, 0) + 1);
        }
        boolean flg = false;
        if (n % 2 == 0) {
            for (int i : c.values()) {
                if (i % 2 != 0) {
                    System.out.println(-1);
                    System.exit(0);
                }
            }
        } else {
            for (Map.Entry<Character, Integer> entry : c.entrySet()) {
                if (entry.getValue() % 2 != 0 && flg) {
                    System.out.println(-1);
                    System.exit(0);
                } else if (entry.getValue() % 2 != 0) {
                    flg = true;
                }
            }
        }
        int ans = 0;
        List<Character> fstr = new ArrayList<>();
        List<Character> lstr = new ArrayList<>();
        Map<Character, Integer> dc = new HashMap<>();
        int ptr = 0;
        for (int i = 0; i < n; i++) {
            char si = s.charAt(i);
            dc.put(si, dc.getOrDefault(si, 0) + 1);
            int count = dc.get(si);
            if (c.get(si) % 2 != 0) {
                if (count * 2 - 1 == c.get(si)) {
                    ans += i - ptr;
                    continue;
                }
            }
            if (count <= c.get(si) / 2) {
                ans += i - ptr;
                ptr += 1;
                fstr.add(si);
            } else {
                lstr.add(si);
            }
        }
        lstr = new ArrayList<>(lstr.subList(0, lstr.size() - 1));
        n /= 2;
        int[] perm = new int[n];
        Map<Character, List<Integer>> fdc = new HashMap<>();
        Map<Character, Integer> ldc = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char fi = fstr.get(i);
            fdc.putIfAbsent(fi, new ArrayList<>());
            fdc.get(fi).add(i + 1);
        }
        for (int i = 0; i < n; i++) {
            char li = lstr.get(i);
            perm[i] = fdc.get(li).get(ldc.getOrDefault(li, 0));
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