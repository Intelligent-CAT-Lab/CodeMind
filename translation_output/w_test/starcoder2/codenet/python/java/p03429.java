

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
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
                    System.out.println(".");
                } else {
                    System.out.println("NO");
                }
                return;
            } else if (n == 1) {
                if (b >= 1) {
                    System.out.println("NO");
                    return;
                } else {
                    if (m / 2 < a) {
                        System.out.println("NO");
                        return;
                    } else {
                        for (int x = 0; x < m / 2; x++) {
                            board[0][2 * x] = '<';
                            board[0][2 * x + 1] = '>';
                        }
                        System.out.println("YES");
                        for (int i = 0; i < n; i++) {
                            for (int j = 0; j < m; j++) {
                                System.out.print(board[i][j]);
                            }
                            System.out.println();
                        }
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
                        for (int y = 0; y < n / 2; y++) {
                            board[2 * y][0] = '^';
                            board[2 * y + 1][0] = 'v';
                        }
                        System.out.println("YES");
                        for (int i = 0; i < n; i++) {
                            for (int j = 0;
