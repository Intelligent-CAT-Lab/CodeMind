```java
import java.util.HashMap;
import java.util.Scanner;

class Bit {
    private final int size;
    private final int[] tree;

    public Bit(int n) {
        this.size = n;
        this.tree = new int[n+1];
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

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n = s.length();

        HashMap<Character, Integer> c = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
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
                lstr.insert(0, si);
            }
        }

        int n2 = n / 2;
        int[] perm = new int[n2];
        HashMap<Character, Integer> ldc = new HashMap<>();
        int lcnt = 0;

        for (int i = 0; i < n2; i++) {
            char fi = fstr.charAt(i);
            ldc.put(fi, ldc.getOrDefault(fi, 0) + 1);
            perm[i] = ldc.get(fi);
        }

        Bit sol = new Bit(n2 + 2);
        for (int i = 0; i < n2; i++) {
            int p = perm[i];
            ans += sol.sum(n2 + 1) - sol.sum(p);
            sol.add(p, 1);
        }

        System.out.println(ans);
    }
}
```
```
