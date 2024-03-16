import java.util.Scanner;

public class p03224 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        boolean canBeAns = false;
        int k = 0;
        for (int i = 1; i < 100000; i++) {
            if (2 * N == i * (i - 1)) {
                canBeAns = true;
                k = i;
                break;
            } else if (2 * N < i * (i - 1)) {
                break;
            }
        }

        if (!canBeAns) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
            System.out.println(k);
            int[][] sGrid = new int[k][k - 1];
            for (int i = 1; i <= k; i++) {
                for (int j = 0; j < k - i; j++) {
                    sGrid[i - 1][i - 1 + j] = (i - 1) * k - i * (i - 1) / 2 + 1 + j;
                    sGrid[i + j][i - 1] = (i - 1) * k - i * (i - 1) / 2 + 1 + j;
                }
            }

            for (int[] row : sGrid) {
                System.out.print(k - 1 + " ");
                for (int num : row) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
    }
}