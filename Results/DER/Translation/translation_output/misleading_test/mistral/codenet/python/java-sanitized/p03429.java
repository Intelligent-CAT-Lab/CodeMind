import java.util.*;

public class p03429 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, a, b;
        n = sc.nextInt();
        m = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
        char[][] board = new char[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                board[i][j] = '.';
            }
        }
        if (n * m < 2 * (a + b)) {
            System.out.println("NO");
            return;
        }
        if (n == 1 || m == 1) {
            if (n == 1 && m == 1) {
                if (a == 0 && b == 0) {
                    System.out.println("YES");
                    for (int i = 0; i < m; i++) {
                        System.out.print(board[0][i]);
                    }
                } else {
                    System.out.