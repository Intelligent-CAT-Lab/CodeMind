import java.util.*;
import java.io.*;

public class p03010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] base = new int[]{1, 2, 4, 7, 12, 20, 29, 38, 52, 73};
        int[][] ans = new int[n][n];
        ans[1][0] = ans[0][1] = 1;
        for (int vn = 3; vn <= n; vn++) {
            int mx = 0;
            for (int[] path : permutations(vn - 1)) {
                int cur = 0;
                for (int i = 0; i < path.length - 1; i++) {
                    cur += ans[path[i]][path[i + 1]];
                }
                if (cur > mx) mx = cur;
            }
            ans[vn - 1][0] = ans[0][vn - 1] = base[vn - 2] * (mx + 1);
            ans[vn - 1][vn - 2] = ans[vn - 2][vn - 1] = base[vn - 3] * (mx + 1);
            for (int j = 1; j < vn - 2; j++) {
                ans[vn - 1][j] = ans[j][vn - 1] = base[j - 1] * (mx + 1);
            }
        }
        for (int[] row : ans) {
            for (int i : row) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static <T> List<T> permutations(int n) {
        List<T> ans = new ArrayList<>();
        if (n == 0) return ans;
        ans.add(null);
        for (int i = 1; i <= n; i++) {
            List<T> tmp = new ArrayList<>();
            for (T t : ans) {
                for (int j = 0; j <= t.toString().length(); j++) {
                    tmp.add(insert(t, i, j));
                }
            }
            ans = tmp;
        }
        return ans;
    }

    public static <T> T insert(T t, int i, int j) {
        if (t == null) return (T) (new StringBuilder().append(i)).toString();
        StringBuilder sb = new StringBuilder(t.toString());
        sb.insert(j, i);
        return (T) sb.toString();
    }
}