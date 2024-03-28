import java.util.*;
import java.io.*;

public class p02659 {
    static int mod = (int) 1e9 + 7;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] adj = new int[n + 1][mod];
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj[u][v] = 1;
            adj[v][u] = 1;
        }
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += cmb(n, i) * dfs(i, adj, ans);
        }
        System.out.println(ans);
    }

    static int dfs(int u, int[][] adj, int ans) {
        if (adj[u][mod] == 0) return 0;
        ans += dfs(adj[u][mod], adj, ans);
        for (int v : adj[u]) {
            if (v != adj[u][mod]) {
                ans += dfs(v, adj, ans);
            }
        }
        return ans;
    }

    static int cmb(int n, int r) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        long num = fact / (fact / r);
        long den = fact / (fact / (n - r));
        return (int) (num / den);
    }
}