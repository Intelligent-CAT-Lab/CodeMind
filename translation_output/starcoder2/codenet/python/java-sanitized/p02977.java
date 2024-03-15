import java.util.*;
import java.io.*;

public class p02977 {
    static int n;
    static int[] root;
    static boolean[] vis;
    static ArrayList<Integer>[] g;
    static ArrayList<int[]> e;

    static void dfs(int u) {
        vis[u] = true;
        root[u] ^= (u - 1) % n + 1;
        for (int v : g[u]) {
            if (vis[v]) continue;
            root[v] = root[u];
            dfs(v);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        e = get(n);
        if (e == null) {
            System.out.println("No");
            return;
        }
        System.out.println("Yes");
        for (int[] p : e) {
            System.out.println(p[0] + " " + p[1]);
        }
        g = new ArrayList[2 * n + 1];
        for (int i = 1; i <= 2 * n; i++) {
            g[i] = new ArrayList<>();
        }
        for (int[] p : e) {
            g[p[0]].add(p[1]);
            g[p[1]].add(p[0]);
        }
        for (int i = 1; i <= n; i++) {
            vis = new boolean[2 * n + 1];
            root = new int[2 * n + 1];
            dfs(i);
            assert root[n + i] == i;
        }
    }

    static ArrayList<int[]> get(int n) {
        ArrayList<int[]> e = new ArrayList<>();
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
}