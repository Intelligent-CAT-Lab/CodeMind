import java.util.Scanner;

public class p03402 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        String[][] X = new String[100][100];
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                X[i][j] = (i < 50) ? ((j < 50) ? "#" : ".") : ((j < 50) ? "." : "#");
            }
        }

        int h = (B - 1) / 50;
        int w = (B - 1) % 50;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < 50; j++) {
                X[i * 2][j * 2] = "#";
            }
        }
        for (int i = 0; i < w; i++) {
            X[h * 2][i * 2] = "#";
        }

        h = (A - 1) / 50;
        w = (A - 1) % 50;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < 50; j++) {
                X[i * 2 + 51][j * 2] = ".";
            }
        }
        for (int i = 0; i < w; i++) {
            X[h * 2 + 51][i * 2] = ".";
        }

        System.out.println(100 + " " + 100);
        for (int i = 0; i < 100; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < 100; j++) {
                sb.append(X[i][j]);
            }
            System.out.println(sb.toString());
        }
    }
}