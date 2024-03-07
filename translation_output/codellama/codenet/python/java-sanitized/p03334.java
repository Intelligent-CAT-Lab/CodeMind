import java.util.Scanner;
import java.util.stream.IntStream;

public class p03334 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int D1 = scanner.nextInt();
        int D2 = scanner.nextInt();

        int n = 1;
        while (D1 % 4 == 0) {
            n *= 2;
            D1 /= 4;
        }

        int[][] grid = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                grid[i][j] = (i / n + j / n) % 2;
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (grid[i][j] == 1) {
                    System.out.println(i + " " + j);
                }
            }
        }
    }
}