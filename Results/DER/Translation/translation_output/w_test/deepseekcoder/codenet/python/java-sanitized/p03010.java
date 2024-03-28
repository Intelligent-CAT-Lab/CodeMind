import java.util.*;

public class p03010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] base = {1, 2, 4, 7, 12, 20, 29, 38, 52, 73};

        int[][] ans = new int[n][n];
        ans[1][0] = ans[0][1] = 1;

        for (int vn = 3; vn <= n; vn++) {
            int mx = 0;
            List<Integer> path = new ArrayList<>();
            for (int i = 0; i < vn - 1; i++) {
                path.add(i);
            }
            do {
                int cur = 0;
                for (int i = 0; i < path.size() - 1; i++) {
                    cur += ans[path.get(i)][path.get(i + 1)];
                }
                if (cur > mx) {
                    mx = cur;
                }
            } while (nextPermutation(path));

            ans[vn - 1][0] = ans[0][vn - 1] = base[vn - 2] * (mx + 1);
            ans[vn - 1][vn - 2] = ans[vn - 2][vn - 1] = base[vn - 3] * (mx + 1);
            for (int j = 1; j < vn - 2; j++) {
                ans[vn - 1][j] = ans[j][vn - 1] = base[j - 1] * (mx + 1);
            }
        }

        for (int[] row : ans) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    private static boolean nextPermutation(List<Integer> a) {
        int n = a.size();
        int i = n - 2;
        while (i >= 0 && a.get(i) >= a.get(i + 1)) {
            i--;
        }
        if (i < 0) {
            return false;
        }
        int j = n - 1;
        while (j > i && a.get(j) <= a.get(i)) {
            j--;
        }
        Collections.swap(a, i, j);
        Collections.reverse(a.subList(i + 1, n));
        return true;
    }
}