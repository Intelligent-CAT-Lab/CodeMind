import java.util.*;

public class p02751 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[][] ans = new String[1 << n - 1][1 << m - 1];
        for (int i = 0; i < ans.length; i++) {
            Arrays.fill(ans[i], "1");
        }
        for (int k = 1; k <= 10; k++) {
            for (int i = 1 << k - 1; i < 1 << n; i += 1 << k) {
                for (int j = 1 << k - 1; j < 1 << m; j += 1 << k) {
                    if (ans[i - 1][j - 1].equals("1")) {
                        ans[i - 1][j - 1] = "0";
                    } else {
                        ans[i - 1][j - 1] = "1";
                    }
                }
            }
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.println(String.join("", ans[i]));
        }
    }
}