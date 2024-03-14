import java.util.*;
import java.io.*;

public class p03010 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int readInt() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine());
        return Integer.parseInt(st.nextToken());
    }

    static int[][] ans;
    static int[] base = {1, 2, 4, 7, 12, 20, 29, 38, 52, 73};

    static void solve() throws IOException {
        int n = readInt();
        ans = new int[n][n];
        if (n > 1) {
            ans[1][0] = ans[0][1] = 1;
            for (int vn = 3; vn <= n; vn++) {
                int mx = 0;
                for (int[] path : permutations(vn - 1)) {
                    int cur = 0;
                    for (int i = 0; i < path.length - 1; i++)
                        cur += ans[path[i]][path[i + 1]];
                    mx = Math.max(mx, cur);
                }
                ans[vn - 1][0] = ans[0][vn - 1] = base[vn - 2] * (mx + 1);
                ans[vn - 1][vn - 2] = ans[vn - 2][vn - 1] = base[vn - 3] * (mx + 1);
                for (int j = 1; j < vn - 2; j++)
                    ans[vn - 1][j] = ans[j][vn - 1] = base[j - 1] * (mx + 1);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(ans[i][j] + " ");
            System.out.println();
        }
    }

    static List<int[]> permutations(int n) {
        List<int[]> result = new ArrayList<>();
        boolean[] used = new boolean[n];
        generatePermutations(new int[n], used, result);
        return result;
    }

    static void generatePermutations(int[] current, boolean[] used, List<int[]> result) {
        if (current.length == used.length) {
            result.add(current.clone());
            return;
        }
        for (int i = 0; i < used.length; i++) {
            if (used[i]) continue;
            used[i] = true;
            current[current.length - used.length] = i;
            generatePermutations(current, used, result);
            used[i] = false;
        }
    }

    public static void main(String[] args) throws IOException {
        solve();
    }
}