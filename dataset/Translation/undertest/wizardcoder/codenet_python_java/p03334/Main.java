import java.util.Scanner;

public class p03334 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D1 = sc.nextInt();
        int D2 = sc.nextInt();
        sc.close();

        int n = 1;
        while (D1 % 4 == 0) {
            n *= 2;
            D1 /= 4;
        }
        while (D2 % 4 == 0) {
            n *= 2;
            D2 /= 4;
        }

        boolean[][] h1 = new boolean[n][n];
        boolean[][] h2 = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                h1[i][j] = (i + j) % 2 == 0;
                h2[i][j] = i % 2 == 0;
            }
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (h1[i][j] && h2[i][j]) {
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