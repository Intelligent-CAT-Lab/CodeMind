import java.util.Scanner;

public class p03224 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        boolean can_be_ans = false;
        int k = 0;
        for (int i = 1; i < 10_000; i++) {
            if (2 * N == i * (i - 1)) {
                can_be_ans = true;
                k = i;
                break;
            } else if (2 * N < i * (i - 1)) {
                break;
            }
        }

        if (!can_be_ans) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
            System.out.println(k);

            int[][] s_grid = new int[k][k - 1];
            for (int i = 1; i <= k; i++) {
                for (int j = 0; j < k - i; j++) {
                    s_grid[i - 1][i - 1 + j] = (i - 1) * k - i * (i - 1) / 2 + 1 + j;
                    s_grid[i + j][i - 1] = (i - 1) * k - i * (i - 1) / 2 + 1 + j;
                }
            }

            for (int[] row : s_grid) {
                System.out.print(k - 1 + " ");
                for (int num : row) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
    }
}