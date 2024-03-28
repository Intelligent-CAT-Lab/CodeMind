import java.util.Scanner;

public class p03429 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
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
                        for (int x = 0; x < m / 2; x++) {
                            board[0][2 * x] = '<';
                            board[0][2 * x + 1] = '>';
                        }
                        System.out.println("YES");
                        for (int i = 0; i < n; i++) {
                            System.out.println(String.valueOf(board[i]));
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
                            System.out.println(String.valueOf(board[i]));
                        }
                    }
                }
            }
        } else {
            if ((n * m) % 2 != 1) {
                if (n % 2 == 1) {
                    int tmp = Math.min(m / 2, a);
                    a -= tmp;
                    for (int i = 0; i < tmp; i++) {
                        board[n - 1][2 * i] = '<';
                        board[n - 1][2 * i + 1] = '>';
                    }
                }
                if (m % 2 == 1) {
                    int tmp = Math.min(n / 2, b);
                    b -= tmp;
                    for (int i = 0; i < tmp; i++) {
                        board[2 * i][m - 1] = '^';
                        board[2 * i + 1][m - 1] = 'v';
                    }
                }
                for (int y = 0; y < n - (n % 2); y += 2) {
                    for (int x = 0; x < m - (m % 2); x += 2) {
                        if (a >= 2) {
                            a -= 2;
                            board[y][x] = '<';
                            board[y][x + 1] = '>';
                            board[y + 1][x] = '<';
                            board[y + 1][x + 1] = '>';
                        } else if (a == 1) {
                            a -= 1;
                            board[y][x] = '<';
                            board[y][x + 1] = '>';
                        } else if (b >= 2) {
                            b -= 2;
                            board[y][x] = '^';
                            board[y + 1][x] = 'v';
                            board[y][x + 1] = '^';
                            board[y + 1][x + 1] = 'v';
                        } else if (b == 1) {
                            b -= 1;
                            board[y][x] = '^';
                            board[y + 1][x] = 'v';
                        }
                    }
                }
                if (a != 0 || b != 0) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                    for (int i = 0; i < n; i++) {
                        System.out.println(String.valueOf(board[i]));
                    }
                }
            } else {
                if (n % 2 == 1) {
                    int tmp = Math.min(m / 2 - 1, a);
                    a -= tmp;
                    for (int i = 0; i < tmp; i++) {
                        board[n - 1][2 * i] = '<';
                        board[n - 1][2 * i + 1] = '>';
                    }
                }
                if (m % 2 == 1) {
                    int tmp = Math.min(n / 2 - 1, b);
                    b -= tmp;
                    for (int i = 0; i < tmp; i++) {
                        board[2 * i][m - 1] = '^';
                        board[2 * i + 1][m - 1] = 'v';
                    }
                }
                for (int y = 0; y < n - 2; y += 2) {
                    for (int x = 0; x < m - 2; x += 2) {
                        if (y == n - 3 && x == m - 3) {
                            continue;
                        }
                        if (a >= b) {
                            if (a >= 2) {
                                a -= 2;
                                board[y][x] = '<';
                                board[y][x + 1] = '>';
                                board[y + 1][x] = '<';
                                board[y + 1][x + 1] = '>';
                            } else if (a == 1) {
                                a -= 1;
                                board[y][x] = '<';
                                board[y][x + 1] = '>';
                            }
                        } else {
                            if (b >= 2) {
                                b -= 2;
                                board[y][x] = '^';
                                board[y + 1][x] = 'v';
                                board[y][x + 1] = '^';
                                board[y + 1][x + 1] = 'v';
                            } else if (b == 1) {
                                b -= 1;
                                board[y][x] = '^';
                                board[y + 1][x] = 'v';
                            }
                        }
                    }
                }
                if (a >= 4 || b >= 4 || a + b >= 5) {
                    System.out.println("NO");
                    return;
                }
                int x = m - 3;
                int y = n - 3;
                if (a == 2 && b == 2) {
                    a -= 2;
                    b -= 2;
                    board[y][x] = '<';
                    board[y][x + 1] = '>';
                    board[y][x + 2] = '^';
                    board[y + 1][x + 2] = 'v';
                    board[y + 1][x] = '^';
                    board[y + 2][x] = 'v';
                    board[y + 2][x + 1] = '<';
                    board[y + 2][x + 2] = '>';
                } else {
                    if (a != 0) {
                        a -= 1;
                        board[y + 2][x] = '<';
                        board[y + 2][x + 1] = '>';
                    }
                    if (b != 0) {
                        b -= 1;
                        board[y][x + 2] = '^';
                        board[y + 1][x + 2] = 'v';
                    }
                    if (a >= 2) {
                        a -= 2;
                        board[y][x] = '<';
                        board[y][x + 1] = '>';
                        board[y + 1][x] = '<';
                        board[y + 1][x + 1] = '>';
                    } else if (a == 1) {
                        a -= 1;
                        board[y][x] = '<';
                        board[y][x + 1] = '>';
                    } else if (b >= 2) {
                        b -= 2;
                        board[y][x] = '^';
                        board[y + 1][x] = 'v';
                        board[y][x + 1] = '^';
                        board[y + 1][x + 1] = 'v';
                    } else if (b == 1) {
                        b -= 1;
                        board[y][x] = '^';
                        board[y + 1][x] = 'v';
                    }
                }
                System.out.println("YES");
                for (int i = 0; i < n; i++) {
                    System.out.println(String.valueOf(board[i]));
                }
            }
        }
    }
}