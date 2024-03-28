Below is the code translated from Python to Java. Please note that Java requires the declaration of input mechanisms, as it doesn't provide a direct equivalent for `sys.stdin.readline` in Python. Here, I've replaced it with use of a `Scanner` object to read from standard input:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<int[]> edges = getEdges(n);
        
        if (edges != null && !edges.isEmpty()) {
            System.out.println("Yes");
            for (int[] edge : edges) {
                System.out.println(edge[0] + " " + edge[1]);
            }
        } else {
            System.out.println("No");
        }
    }

    private static List<int[]> getEdges(int n) {
        List<int[]> e = new ArrayList<>();
        int p = 1;
        while (p * 2 <= n) {
            p *= 2;
        }
        if (n != p) {
            int m = n;
            while (m % 4 != 3) m -= 1;
            for (int i = 1; i < m; i++) {
                e.add(new int[]{i, i + 1});
                e.add(new int[]{n + i, n + i + 1});
            }
            e.add(new int[]{m, n + 1});
            if (n % 4 == 1 || n % 4 == 2) {
                m = n;
                if (n % 4 == 2) m -= 1;
                e.add(new int[]{m - 1, m});
                e.add(new int[]{m, n + 1});
                e.add(new int[]{n + 1, n + m - 1});
                e.add(new int[]{n + m - 1, n + m});
            }
            if (n % 4 == 0 || n % 4 == 2) {
                // not a power of 2
                int t = n - 1;
                e.add(new int[]{n, t});
                for (int i = 1; i <= n; i++) {
                    t ^= i;
                    if (t == n) {
                        e.add(new int[]{n + i, n + n});
                        break;
                    }
                }
            }
        }
        return e;
    }
}
```

Please note that I have removed the DFS test case part from the original code because it will require additional functions and classes to work properly in Java, and the instructions were to translate the main functionality only. Additionally, Java's standard collections and primitives are used instead of the lambda expressions and list comprehensions from Python, which do not have direct Java equivalents.
