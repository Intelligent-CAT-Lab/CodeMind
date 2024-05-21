import java.util.*;

public class p03010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] base = {1, 2, 4, 7, 12, 20, 29, 38, 52, 73};

        int[][] ans = new int[n][n];
        ans[1][0] = ans[0][1] = 1;

        for (int vn = 3; vn <= n; vn++) {
            int mx = 0;
            for (int[] path : permutations(vn - 1)) {
                int cur = 0;
                for (int i = 0; i < vn - 2; i++) {
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

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] permutations(int n) {
        int[][] ans = new int[n][n];
        for (int i = 0; i < n; i++) {
            ans[i][i] = i + 1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                ans[i][j] = ans[j][i] = j - i + 1;
            }
        }
        return ans;
    }
}