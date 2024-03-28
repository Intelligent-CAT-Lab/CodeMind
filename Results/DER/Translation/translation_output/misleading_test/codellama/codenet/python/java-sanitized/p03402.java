import java.util.Scanner;

public class p03402 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int[][] X = new int[100][100];

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                X[i][j] = (i < 50 && j < 50) ? 0 : 1;
            }
        }

        int h = (B - 1) / 50;
        int w = (B - 1) % 50;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < 50; j++) {
                X[i * 2][j * 2] = 1;
            }
        }
        for (int i = 0; i < w; i++) {
            X[h * 2][i * 2] = 1;
        }

        int h2 = (A - 1) / 50;
        int w2 = (A - 1) % 50;
        for (int i = 0; i < h2; i++) {
            for (int j = 0; j < 50; j++) {
                X[i * 2 + 51][j * 2] = 0;
            }
        }
        for (int i = 0; i < w2; i++) {
            X[h2 * 2 + 51][i * 2] = 0;
        }

        System.out.println(100 + " " + 100);
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                System.out.print(X[i][j] == 0 ? "." : "#");
            }
            System.out.println();
        }
    }
}