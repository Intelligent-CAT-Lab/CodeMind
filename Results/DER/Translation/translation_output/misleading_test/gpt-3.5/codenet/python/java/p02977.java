```java
import java.util.*;

public class LineGraph {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n = input.nextInt();
        List<int[]> edges = get(n);
        
        if (edges != null) {
            System.out.println("Yes");
            for (int[] edge : edges) {
                System.out.println(edge[0] + " " + edge[1]);
            }
        } else {
            System.out.println("No");
        }
    }

    static List<int[]> get(int n) {
        List<int[]> edges = new ArrayList<>();
        int p = 1;
        while (p * 2 <= n) {
            p *= 2;
        }
        
        if (n != p) {
            int m = n;
            while (m % 4 != 3) {
                m -= 1;
            }
            
            for (int i = 1; i < m; i++) {
                edges.add(new int[]{i, i + 1});
                edges.add(new int[]{n + i, n + i + 1});
            }
            edges.add(new int[]{m, n + 1});

            if (n % 4 == 1 || n % 4 == 2) {
                m = n;
                if (n % 4 == 2) {
                    m -= 1;
                }
                edges.add(new int[]{m - 1, m});
                edges.add(new int[]{m, n + 1});
                edges.add(new int[]{n + 1, n + m - 1});
                edges.add(new int[]{n + m - 1, n + m});
            }

            if (n % 4 == 0 || n % 4 == 2) {
                int t = n - 1;
                edges.add(new int[]{n, t});
                for (int i = 1; i <= n; i++) {
                    t ^= i;
                    if (t == n) {
                        edges.add(new int[]{n + i, n + n});
                        break;
                    }
                }
            }
        }
        
        return edges.isEmpty() ? null : edges;
    }
}
```
