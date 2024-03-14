import java.util.Scanner;

public class p03429 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (n * m < 2 * (a + b)) {
            System.out.println("NO");
            return;
        }

        char[][] board = new char[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                board[i][j] = '.';
            }
        }

        if (n == 1 || m == 1) {
            if (n == 1 && m == 1) {
                if (