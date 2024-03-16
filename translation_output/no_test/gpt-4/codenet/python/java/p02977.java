Below is the equivalent Java code of the provided Python script. I've tried my best to maintain the original structure and logic, though Java requires more verbose syntax, explicit type definitions, and proper class/method setups.

```java
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class GraphPairs {

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

        // The following commented code is the equivalent of the Python code outside of the main function
        /*
        for (int n = 1; n < 50; n++) {
            ArrayList<ArrayList<Integer>> g = new ArrayList<>();
            for (int i = 0; i < 2 * n + 1; i++) g.add(new ArrayList<>());
            List<List<Integer>> e = get(n);
            if (e.isEmpty()) continue;
            assert e.size() == n * 2 - 1 : "Error in edge count";
            for (List<Integer> pair : e) {
                g.get(pair.get(0)).add(pair.get(1));
                g.get(pair.get(1)).add(pair.get(0));
            }
            for (int i = 1; i <= n; i++) {
                int[] vis = new int[2 * n + 1];
                int[] root = new int[2 * n + 1];
                dfs(i, vis, root, n, g);
                assert root[n + i] == i : "DFS Assertion failed";
            }
        }
        */
    }
}
```
Please note that in the code above, the `assert` statements in Java need to be enabled using the `-ea` switch when running the program, otherwise they will have no effect. Additionally, it's important to catch potential exceptions that could occur with file I/O or other operations, which I have not included here for brevity. The lambda and stream usages are avoided to maintain similarity with the original code. The main method includes the logic that runs for a single test case, but I've included (as comments) the code which iterates over test cases from 1 to 50 as in the original script.
