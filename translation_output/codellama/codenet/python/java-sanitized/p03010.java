import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class p03010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] base = {1, 2, 4, 7, 12, 20, 29, 38, 52, 73};

        int[][] ans = new int[n][n];
        ans[0][0] = ans[1][0] = 1;

        for (int vn = 3; vn <= n; vn++) {
            int mx = 0;
            for (int[] path : permutations(IntStream.range(vn - 1).toArray())) {
                int cur = 0;
                for (int i = 0; i < path.length - 1; i++) {
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
            System.out.println(Arrays.toString(row));
        }
    }

    private static int[][] permutations(int[] arr) {
        int[][] result = new int[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = Arrays.copyOf(arr, arr.length);
            int j = i + 1;
            while (j < arr.length) {
                int temp = result[i][j];
                result[i][j] = result[j][i];
                result[j][i] = temp;
                j++;
            }
        }
        return result;
    }
}