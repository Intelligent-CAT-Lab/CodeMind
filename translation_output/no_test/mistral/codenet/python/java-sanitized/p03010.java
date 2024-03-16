import java.util.*;

public class p03010 {
    static int[] base = {1, 2, 4, 7, 12, 20, 29, 38, 52, 73};
    static int[][] ans;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ans = new int[n][n];
        ans[1][0] = ans[0][1] = 1;

        for (int vn = 3; vn <= n; vn++) {
            int mx = 0;
            for (int[] path : permutations(Arrays.range(vn - 1))) {
                int cur = 0;
                for (int i = 0; i < path.length; i++) {
                    cur += ans[vn - 1][path[i]];
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
            for (int i : row) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}