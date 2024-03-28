```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = nextInt();
        List<int[]> e = get(n);

        if (!e.isEmpty()) {
            System.out.println("Yes");
            for (int[] edge : e) {
                System.out.println(edge[0] + " " + edge[1]);
            }
        } else {
            System.out.println("No");
        }
    }

    public static List<int[]> get(int n) throws IOException {
        List<int[]> e = new ArrayList<>();
        int p = 1;
        while (p * 2 <= n) {
            p *= 2;
        }

        if (n != p) {
            int m = n;
            while (m % 4 != 3) m--;

            for (int i = 1; i < m; i++) {
                e.add(new int[]{i, i + 1});
                e.add(new int[]{n + i, n + i + 1});
            }
            e.add(new int[]{m, n + 1});

            if (n % 4 == 1 || n % 4 == 2) {
                m = n;
                if (n % 4 == 2) m--;
                e.add(new int[]{m - 1, m});
                e.add(new int[]{m, n + 1});
                e.add(new int[]{n + 1, n + m - 1});
                e.add(new int[]{n + m - 1, n + m});
            }

            if (n % 4 == 0 || n % 4 == 2) {
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

    public static int nextInt() throws IOException {
        if (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return Integer.parseInt(st.nextToken());
    }
}
```
