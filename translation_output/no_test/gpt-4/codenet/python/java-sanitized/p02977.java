import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class p02977 {

    private static List<List<Integer>> get(int n) {
        ArrayList<List<Integer>> e = new ArrayList<>();
        int p = 1;
        while (p * 2 <= n) {
            p *= 2;
        }
        if (n != p) {
            // make line graph
            int m = n;
            while (m % 4 != 3) m -= 1;
            for (int i = 1; i < m; i++) {
                e.add(Arrays.asList(i, i + 1));
                e.add(Arrays.asList(n + i, n + i + 1));
            }
            e.add(Arrays.asList(m, n + 1));
            if (n % 4 == 1 || n % 4 == 2) {
                m = n;
                if (n % 4 == 2) m -= 1;
                e.add(Arrays.asList(m - 1, m));
                e.add(Arrays.asList(m, n + 1));
                e.add(Arrays.asList(n + 1, n + m - 1));
                e.add(Arrays.asList(n + m - 1, n + m));
            }
            if (n % 4 == 0 || n % 4 == 2) { // not a power of 2
                int t = n - 1;
                e.add(Arrays.asList(n, t));
                for (int i = 1; i <= n; i++) {
                    t ^= i;
                    if (t == n) {
                        e.add(Arrays.asList(n + i, n + n));
                        break;
                    }
                }
            }
        }
        return e;
    }

    private static void dfs(int u, int[] vis, int[] root, int n, List<List<Integer>> g) {
        vis[u] = 1;
        root[u] ^= (u - 1) % n + 1;
        for (int v : g.get(u)) {
            if (vis[v] == 0) {
                root[v] = root[u];
                dfs(v, vis, root, n, g);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        List<List<Integer>> e = get(n);

        if (!e.isEmpty()) {
            System.out.println("Yes");
            for (List<Integer> pair : e) {
                System.out.println(pair.get(0) + " " + pair.get(1));
            }
        } else {
            System.out.println("No");
        }

        input.close();

        //