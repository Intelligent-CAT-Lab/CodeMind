import java.util.*;

public class p03429 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        if (n * m < 2 * (a + b)) {
            System.out.println("NO");
            return;
        }

        if (n == 1 || m == 1) {
            if (n == 1 && m == 1) {
                if (a == 0 && b == 0) {
                    System.out.println("YES");
                    System.out.println(".");
                    return;
                } else {
                    System.out.println("NO");
                    return;
                }
            } else if (n == 1) {
                if (b >= 1) {
                    System.out.println("NO");
                    return;
                } else {
                    if (m / 2 < a) {
                        System.out.println("NO");
                        return;
                    } else {
                        char[][] board = new char[n][m];
                        for (int x = 0; x < m / 2; x++) {
                            board[0][2 * x] = '<';
                            board[0][2 * x + 1] = '>';
                        }
                        System.out.println("YES");
                        for (int i = 0; i < n; i++) {
                            System.out.println(new String(board[i]));
                        }
                        return;
                    }
                }
            } else if (m == 1) {
                if (a >= 1) {
                    System.out.println("NO");
                    return;
                } else {
                    if (n / 2 < b) {
                        System.out.println("NO");
                        return;
                    } else {
                        char[][] board = new char[n][m];
                        for (int y = 0; y < n / 2; y++) {
                            board[2 * y][0] = '^';
                            board[2 * y + 1][0] = 'v';
                        }
                        System.out.println("YES");
                        for (int i = 0; i < n; i++) {
                            System.out.println(new String(board[i]));
                        }
                        return;
                    }
                }
            }
        }

        if ((n * m) %