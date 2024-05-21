import java.util.Arrays;
import java.util.Scanner;

public class p03334 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int D1 = scanner.nextInt();
        int D2 = scanner.nextInt();
        scanner.close();

        int n = 1;
        while (D1 % 4 == 0) {
            n *= 2;
            D1 /= 4;
        }

        boolean[][] h1 = new boolean[N * 2][N * 2];
        boolean[][] h2 = new boolean[N * 2][N * 2];

        for (int i = 0; i < N * 2; i++) {
            for (int j = 0; j < N * 2; j++) {
                h1[i][j] = ~(i / n + j / n) % 2 == 0;
                h2[i][j] = ~(i / n) % 2 == 0;
            }
        }

        boolean[][] judge = D1 % 2 == 1 ? h1 : h2;

        int cnt = 0;
        for (int i = 0; i < N * 2; i++) {
            for (int j = 0; j < N * 2; j++) {
                if (judge[i][j]) {
                    System.out.println(i + " " + j);
                    cnt++;
                    if (cnt >= N * N) {
                        break;
                    }
                }
            }
        }
    }
}