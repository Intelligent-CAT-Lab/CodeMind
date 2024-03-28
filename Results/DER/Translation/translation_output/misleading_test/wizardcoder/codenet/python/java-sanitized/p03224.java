import java.util.*;

public class p03224 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean can_be_ans = false;
        for (int k = 1; k <= 100000; k++) {
            if (2 * N == k * (k - 1)) {
                can_be_ans = true;
                break;
            } else if (2 * N < k * (k - 1)) {
                break;
            }
        }
        if (!can_be_ans) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
            int k = 0;
            for (int i = 1; i <= 100000; i++) {
                if (2 * N == i * (i - 1)) {
                    k = i;
                    break;
                }
            }
            int[][] s_grid = new int[k][k];
            for (int i = 1; i <= k; i++) {
                for (int j = 0; j < k - i; j++) {
                    s_grid[i - 1][i - 1 + j] = (i - 1) * k - i * (i - 1) / 2 + 1 + j;
                    s_grid[i + j][i - 1] = (i - 1) * k - i * (i - 1) / 2 + 1 + j;
                }
            }
            for (int i = 0; i < k; i++) {
                for (int j = 0; j < k; j++) {
                    System.out.print(s_grid[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}