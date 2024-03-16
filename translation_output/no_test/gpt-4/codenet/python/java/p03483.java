Here is the translated code from Python to Java:

```java
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
    static class Bit {
        private int size;
        private int[] tree;

        public Bit(int n) {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        Map<Character, Integer> c = new HashMap<>();
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
            for (Map.Entry<Character, Integer> entry : c.entrySet()) {
                if (entry.getValue() % 2 != 0 && flg != 0) {
                    System.out.println(-1);
                    return;
                } else if (entry.getValue() % 2 != 0) {
                    flg = 1;
                }
            }
        }

        long ans = 0;
        StringBuilder fstr = new StringBuilder();
        StringBuilder lstr = new StringBuilder();
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
                ptr += 1;
                fstr.append(si);
            } else {
                lstr.insert(0, si); // equivalent to python's list append + reverse
            }
        }

        n /= 2;
        int[] perm = new int[n];
        Map<Character, Integer> ldc = new HashMap<>();
        Map<Character, Integer> positionIndex = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char fi = fstr.charAt(i);
            positionIndex.computeIfAbsent(fi, k -> 0);
            positionIndex.put(fi, positionIndex.get(fi) + 1);
        }
        for (int i = 0; i < n; i++) {
            char li = lstr.charAt(i);
            perm[i] = positionIndex.get(li);
            ldc.put(li, ldc.getOrDefault(li, 0) + 1);
            positionIndex.put(li, positionIndex.get(li) - 1);
        }

        Bit sol = new Bit(n + 2);
        for (int i = 0; i < n; i++) {
            int p = perm[i];
            ans += sol.sum(n + 1) - sol.sum(p);
            sol.add(p, 1);
        }

        System.out.println(ans);
        sc.close();
    }
}
```

Please note that some Python functionalities do not have a direct equivalent in Java, and thus the translation has been adapted appropriately to retain the algorithm's logic. For instance, in the Java version, we cannot exit a program simply by calling `exit()` as in Python; instead, we use `return`. Also, building and reversing strings in Java has been handled using `StringBuilder`. Remember that Java's `Scanner` class is used for reading input from the command line, and you need to ensure that the program is correctly handling input, especially when transitioning from Python's `input()` function.
