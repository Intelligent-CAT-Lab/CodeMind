import java.util.Scanner;

public class p02751 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String[][] ans = new String[1 << n - 1][1 << m - 1];
        for (int i = 0; i < 1 << n - 1; i++) {
            for (int j = 0; j < 1 << m - 1; j++) {
                ans[i][j] = "1";
            }
        }
        for (int k = 1; k <= 10; k++) {
            for (int i = 1 << k - 1; i < 1 << n; i += 1 << k - 1) {
                for (int j = 1 << k - 1; j < 1 << m; j += 1 << k - 1) {
                    if (ans[i - 1][j - 1].equals("1")) {
                        ans[i - 1][j - 1] = "0";
                    } else {
                        ans[i - 1][j - 1] = "1";
                    }
                }
            }
        }
        for (int i = 0; i < 1 << n - 1; i++) {
            for (int j = 0; j < 1 << m - 1; j++) {
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
    }
}