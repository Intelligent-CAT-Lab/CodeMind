import java.util.Scanner;

public class p03594 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int d = scanner.nextInt();
        scanner.close();

        char[][] res = new char[1000][1000];
        for (int i = 0; i < 1000; i++) {
            if (i % d == 0) {
                for (int j = 0; j < 1000; j++) {
                    res[i][j] = 'R';
                }
            } else if (i % d == 1) {
                for (int j = 0; j < 1000; j++) {
                    res[i][j] = 'Y';
                }
            } else if (i % d == 2) {
                for (int j = 0; j < 1000; j++) {
                    res[i][j] = 'G';
                }
            } else {
                for (int j = 0; j < 1000; j++) {
                    res[i][j] = 'B';
                }
            }
        }

        char[][] ans = new char[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                ans[i][j] = res[i + j][h - i - 1 + j];
            }
        }

        for (char[] row : ans) {
            System.out.println(row);
        }
    }
}