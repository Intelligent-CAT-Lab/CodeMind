```java
import java.util.*;

public class LineGraph {

    public static List<int[]> get(int n) {
        List<int[]> e = new ArrayList<>();
        int p = 1;
        while (p * 2 <= n) {
            p *= 2;
        }
        if (n != p) {
            int m = n;
            while (m % 4 != 3) {
                m--;
            }
            for (int i = 1; i < m; i++) {
                e.add(new int[]{i, i + 1});
                e.add(new int[]{n + i, n + i + 1});
            }
            e.add(new int[]{m, n + 1});
            if (n % 4 == 1 || n % 4 == 2) {
                m = n;
                if (n % 4 == 2) {
                    m--;
                }
                e.add(new int[]{m - 1, m});
                e.add(new int[]{m, n + 1});
                e.add(new int[]{n + 1, n + m - 1});
                e.add(new int[]{n + m - 1, n + m});
            }
            if (n % 4 == 0 || n % 4 == 2) {    // not a power of 2
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<int[]> e = get(n);
        if (e != null && !e.isEmpty()) {
            System.out.println("Yes");
            for (int[] edge : e) {
                System.out.println(edge[0] + " " + edge[1]);
            }
        } else {
            System.out.println("No");
        }
    }
}
```

