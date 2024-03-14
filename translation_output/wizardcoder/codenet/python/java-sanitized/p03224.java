import java.util.*;

public class p03224 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean canBeAns = false;
        for (int k = 1; k <= 100000; k++) {
            if (2 * N == k * (k - 1)) {
                canBeAns = true;
                break;
            } else if (2 * N < k * (k - 1)) {
                break;
            }
        }
        if (!canBeAns) {
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
            int[][] sGrid = new int[k][k];
            for (int i = 1; i <= k; i++) {
                for (int j = 0; j < k - i; j++) {
                    sGrid[i - 1][i - 1 + j] = (i - 1) * k - i * (i - 1) / 2 + 1 + j;
                    sGrid[i + j][i - 1] = (i - 1) * k - i * (i - 1) / 2 + 1 + j;
                }
            }
            for (int i = 0; i < k; i++) {
                for (int j = 0; j < k; j++) {
                    System.out.print(sGrid[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}