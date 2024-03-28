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
                for (int i = 0; i < path.length - 1; i++) {
                    cur += ans[path[i]][path[i + 1]];
                }
                mx = Math.max(mx, cur);
            }

            ans[vn - 1][0] = ans[0][vn - 1] = base[vn - 2] * (mx + 1);
            ans[vn - 1][vn - 2] = ans[vn - 2][vn - 1] = base[vn - 3] * (mx + 1);
            for (int j = 1; j < vn - 2; j++) {
                ans[vn - 1][j] = ans[j][vn - 1] = base[j - 1] * (mx + 1);
            }
        }

        for (int[] row : ans) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    private static List<int[]> permutations(int n) {
        List<int[]> result = new ArrayList<>();
        int[] path = new int[n];
        for (int i = 0; i < n; i++) {
            path[i] = i;
        }
        permutationsHelper(path, 0, result);
        return result;
    }

    private static void permutationsHelper(int[] path, int start, List<int[]> result) {
        if (start == path.length - 1) {
            result.add(path.clone());
        } else {
            for (int i = start; i < path.length; i++) {
                swap(path, start, i);
                permutationsHelper(path, start + 1, result);
                swap(path, start, i);
            }
        }
    }

    private static void swap(int[] path, int i, int j) {
        int temp = path[i];
        path[i] = path[j];
        path[j] = temp;
    }
}