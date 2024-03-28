import java.util.Scanner;

public class p03404 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        String[][] ar = new String[100][100];
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                ar[i][j] = "#";
            }
        }

        int count = 0;
        for (int i = 48; i >= 0; i -= 2) {
            if (count == a - 1) {
                break;
            }
            if (i % 2 == 0) {
                for (int j = 0; j < 100; j += 2) {
                    ar[i][j] = ".";
                    count++;
                    if (count == a - 1) {
                        break;
                    }
                }
            } else {
                for (int j = 1; j < 100; j += 2) {
                    ar[i][j] = ".";
                    count++;
                    if (count == a - 1) {
                        break;
                    }
                }
            }
        }

        count = 0;
        for (int i = 99; i >= 50; i -= 2) {
            if (count == b - 1) {
                break;
            }
            if (i % 2 == 0) {
                for (int j = 0; j < 100; j += 2) {
                    ar[i][j] = "#";
                    count++;
                    if (count == b - 1) {
                        break;
                    }
                }
            } else {
                for (int j = 1; j < 100; j += 2) {
                    ar[i][j] = "#";
                    count++;
                    if (count == b - 1) {
                        break;
                    }
                }
            }
        }

        System.out.println(100 + " " + 100);
        for (String[] row : ar) {
            for (String cell : row) {
                System.out.print(cell);
            }
            System.out.println();
        }
    }
}