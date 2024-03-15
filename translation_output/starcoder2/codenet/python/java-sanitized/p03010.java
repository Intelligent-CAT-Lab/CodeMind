import java.util.*;
import java.io.*;

public class p03010 {
    static int n;
    static int[][] ans;
    static int[] base = {1, 2, 4, 7, 12, 20, 29, 38, 52, 73};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        ans = new int[n][n];
        ans[1][0] = ans[0][1] = 1;

        for (int vn = 3; vn <= n; vn++) {
            int mx = 0;
            for (int[] path : permutations(vn - 1)) {
                int cur = 0;
                for (int i = 0; i < vn - 1; i++) {
                    cur += ans[path[i]][path[i + 1]];
                }
                if (cur > mx) {
                    mx = cur;
                }
            }
            ans[vn - 1][0] = ans[0][vn - 1] = base[vn - 2] * (mx + 1);
            ans[vn - 1][vn - 2] = ans[vn - 2][vn - 1] = base[vn - 3] * (mx + 1);
            for (int j = 1; j < vn - 2; j++) {
                ans[vn - 1][j] = ans[j][vn - 1] = base[j - 1] * (mx + 1);
            }
        }
        for (int[] row : ans) {
            System.out.println(Arrays.toString(row).replaceAll("[\\[\\],]", ""));
        }
    }

    static List<int[]> permutations(int n) {
        List<int[]> res = new ArrayList<>();
        int[] cur = new int[n];
        for (int i = 0; i < n; i++) {
            cur[i] = i;
        }
        res.add(cur.clone());
        while (true) {
            int i = n - 2;
            while (i >= 0 && cur[i] >= cur[i + 1]) {
                i--;
            }
            if (i < 0) {
                break;
            }
            int j = n - 1;
            while (cur[j] <= cur[i]) {
                j--;
            }
            int tmp = cur[i];
            cur[i] = cur[j];
            cur[j] = tmp;
            for (int k = i + 1, l = n - 1; k < l; k++, l--) {
                tmp = cur[k];
                cur[k] = cur[l];
                cur[l] = tmp;
            }
            res.add(cur.clone());
        }
        return res;
    }
}