import java.util.Scanner;

public class p02751 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[][] ans = new String[2 ^ n - 1][2 ^ m - 1];
        for (int i = 0; i < 2 ^ n - 1; i++) {
            for (int j = 0; j < 2 ^ m - 1; j++) {
                ans[i][j] = "1";
            }
        }
        for (int k = 1; k < 11; k++) {
            for (int i = 2 ^ k; i < 2 ^ n; i += 2 ^ k) {
                for (int j = 2 ^ k; j < 2 ^ m; j += 2 ^ k) {
                    if (ans[i - 1][j - 1].equals("1")) {
                        ans[i - 1][j - 1] = "0";
                    } else {
                        ans[i - 1][j - 1] = "1";
                    }
                }
            }
        }
        for (int i = 0; i < 2 ^ n - 1; i++) {
            for (int j = 0; j < 2 ^ m - 1; j++) {
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
    }
}

/docs/leetcode/0001-0100/0001-0010.md