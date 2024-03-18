Here's the translation of the provided Python code into Java:

```java
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class PalindromeRearrange {
    static class BIT {
        int[] tree;
        int size;

        public BIT(int n) {
            size = n;
            tree = new int[n + 1];
        }

        public void add(int i, int x) {
            while (i <= size) {
                tree[i] += x;
                i += i & -i;
            }
        }

        public int sum(int i) {
            int s = 0;
            while (i > 0) {
                s += tree[i];
                i -= i & -i;
            }
            return s;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        int n = s.length();
        Map<Character, Integer> c = new HashMap<>();
        for (char si : s.toCharArray()) {
            c.put(si, c.getOrDefault(si, 0) + 1);
        }
        int flg = 0;
        if (n % 2 == 0) {
            for (int count : c.values()) {
                if (count % 2 != 0) {
                    System.out.println(-1);
                    return;
                }
            }
        } else {
            for (Map.Entry<Character, Integer> entry : c.entrySet()) {
                if (entry.getValue() % 2 != 0) {
                    if (flg == 1) {
                        System.out.println(-1);
                        return;
                    }
                    flg = 1;
                }
            }
        }

        int ans = 0;
        char[] fstr = new char[n / 2];
        char[] lstr = new char[n - n / 2];

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
                lstr[n - i - 1] = si;
            }
        }

        n /= 2;
        int[] perm = new int[n];
        Map<Character, Integer> fdcCounter = new HashMap<>();
        Map<Character, Integer> ldcCounter = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char fi = fstr[i];
            fdcCounter.put(fi, fdcCounter.getOrDefault(fi, 0) + 1);
            int index = fdcCounter.get(fi);
            perm[index - 1] = i + 1;
            ldcCounter.putIfAbsent(fstr[i], 0);
        }
        for (int i = 0; i < n; i++) {
            char li = lstr[i];
            int correctIndex = ldcCounter.get(li);
            ldcCounter.put(li, correctIndex + 1);
            perm[i] = perm[correctIndex];
        }
        
        BIT bit = new BIT(n + 2);
        for (int i = 0; i < n; i++) {
            int p = perm[i];
            ans += bit.sum(n + 1) - bit.sum(p);
            bit.add(p, 1);
        }
        
        System.out.println(ans);
    }
}
```
This Java code should give you the same result as the Python code when run with the input "eel". Remember that Java requires a static `main` method as an entry point and uses a different approach for input and output (via `Scanner` and `System.out.println`). The `BIT` class, as well as the data structures for counting (like `HashMap`), are used to mimic the functionality of their Python equivalents.
