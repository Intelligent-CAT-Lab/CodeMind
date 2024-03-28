```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n = s.length();
        int[][] dp = new int[n + 1][4];
        dp[0][0] = 1;
        String[] string = {"A", "B", "C"};
        int num = (int) (1e9 + 7);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                int m = 0;
                int b = 1;
                if ('?' == s.charAt(i)) b = 3;
                if (j == 0) {
                    if ('?' == s.charAt(i)) dp[i + 1][j] = (int) ((dp[i][j] * 3L) % num);
                    else dp[i + 1][j] = (dp[i][j]) % num;
                    continue;
                }
                if (s.charAt(i) == string[j - 1] || s.charAt(i) == '?') m = 1;
                dp[i + 1][j] = (int) ((m * dp[i][j - 1] + b * dp[i][j]) % num);
            }
        }

        System.out.println(dp[n][3]);
    }
}
```
```
