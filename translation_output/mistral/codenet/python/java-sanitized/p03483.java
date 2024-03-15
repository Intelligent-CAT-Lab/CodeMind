import java.util.*;

class Bit {
    private int size;
    private int[] tree;

    public Bit(int n) {
        this.size = n;
        this.tree = new int[n + 1];
    }

    public int sum(int i) {
        int s = 0;
        while (i > 0) {
            s += tree[i];
            i -= i & -i;
        }
        return s;
    }

    public void add(int i, int x) {
        while (i <= size) {
            tree[i] += x;
            i += i & -i;
        }
    }
}

public class p03483 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        Map<Character, Integer> c = new HashMap<>();
        for (int i = 0; i < n; i++) {
            c.put(s.charAt(i), c.getOrDefault(s.charAt(i), 0) + 1);
        }
        int flg = 0;
        if (n % 2 == 0) {
            for (Map.Entry<Character, Integer> entry : c.entrySet()) {
                if (entry.getValue() % 2 != 0) {
                    System.out.println(-1);
                    return;
                }
            }
        } else {
            for (Map.Entry<Character, Integer> entry : c.entrySet()) {
                if (entry.getValue() % 2 == 0 && flg != 0) {
                    System.out.println(-1);
                    return;
                } else if (entry.getValue() % 2 == 0) {
                    flg = 1;
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
                fstr.add(si);
            } else {
                lstr.add(si);
            }
        }
        Collections.reverse(lstr);
        int n2 = n / 2;
        int[] perm = new int[n2];
        Map<Character, List<Integer>> fdc = new HashMap<>();
        Map<Character, Integer> ldc = new HashMap<>();
        int lcnt = 0;
        for (int i = 0; i < n2; i++) {
            char fi = fstr.get(i);
            fdc.put(fi, fdc.getOrDefault(fi, new ArrayList<>()).add(perm[i] + 1));
            char li = lstr.get(i);
            perm[i] = fdc.get(li).get(ldc.getOrDefault(li, 0) + 1);
            ldc.put(li, ldc.getOrDefault(li, 0) + 1);
        }
        Bit bit = new Bit(n2 + 2);
        for (int i = 0; i < n2; i++) {
            int p = perm[i];
            ans += bit.sum(n2 + 1) - bit.sum(p);
            bit.add(p, 1);
        }
        System.out.println(ans);
    }
}