import java.util.Scanner;

public class p02751 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        String[][] ans = new String[(int)Math.pow(2, n) - 1][(int)Math.pow(2, m) - 1];
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                ans[i][j] = "1";
            }
        }

        for (int k = 1; k < 11; k++) {
            for (int i = (int)Math.pow(2, k); i < Math.pow(2, n); i+=Math.pow(2, k)) {
                for (int j = (int)Math.pow(2, k); j < Math.pow(2, m); j+=Math.pow(2, k)) {
                    if (ans[i - 1][j - 1].equals("1")) {
                        ans[i - 1][j - 1] = "0";
                    } else {
                        ans[i - 1][j - 1] = "1";
                    }
                }
            }
        }

        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
    }
}