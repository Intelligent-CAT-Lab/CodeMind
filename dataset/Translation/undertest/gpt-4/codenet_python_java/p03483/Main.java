import java.util.HashMap;
import java.util.Scanner;

public class p03483 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int n = s.length();

        HashMap<Character, Integer> c = new HashMap<>();
        for (char ch : s.toCharArray()) {
            c.put(ch, c.getOrDefault(ch, 0) + 1);
        }

        boolean flg = false;
        if (n % 2 == 0) {
            for (int i : c.values()) {
                if (i % 2 != 0) {
                    System.out.println(-1);
                    return;
                }
            }
        } else {
            for (int i : c.values()) {
                if (i % 2 != 0 && flg) {
                    System.out.println(-1);
                    return;
                } else if (i % 2 != 0) {
                    flg = true;
                }
            }
        }

        int ans = 0;
        StringBuilder fstr = new StringBuilder();
        StringBuilder lstr = new StringBuilder();
        
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
                fstr.append(si);
            } else {
                lstr.append(si);
            }
        }

        lstr.reverse();
        n /= 2;
        int[] perm = new int[n];
        HashMap<Character, Integer> ldc = new HashMap<>();
        
        HashMap<Character, CounterList> fdc = new HashMap<>();

        for (int i = 0; i < n; i++) {
            char fi = fstr.charAt(i);
            fdc.computeIfAbsent(fi, k -> new CounterList()).add(i + 1);
        }

        for (int i = 0; i < n; i++) {
            char li = lstr.charAt(i);
            perm[i] = fdc.get(li).get(ldc.getOrDefault(li, 0));
            ldc.put(li, ldc.getOrDefault(li, 0) + 1);
        }

        BIT sol = new BIT(n + 2);
        for (int i = 0; i < n; i++) {
            int p = perm[i];
            ans += sol.sum(n + 1) - sol.sum(p);
            sol.add(p, 1);
        }

        System.out.println(ans);
        scanner.close(); // Close the scanner at the end
    }
}

class CounterList extends java.util.ArrayList<Integer> { /* Just for clarity. */ }

class BIT {
    int size;
    int[] tree;

    public BIT(int n) {
        this.size = n;
        this.tree = new int[n + 1];
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