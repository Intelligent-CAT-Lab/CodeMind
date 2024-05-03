Here is the Java version of your Python code:

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
        int num = (int) 1e9 + 7;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                int m = 0;
                int b = 1;
                if (s.charAt(i) == '?' || s.charAt(i) == string[j].charAt(0)) {
                    b = 3;
                }
                if (j == 0) {
                    if (s.charAt(i) == '?' || s.charAt(i) == string[j].charAt(0)) {
                        dp[i + 1][j] = (dp[i][j] * 3) % num;
                    } else {
                        dp[i + 1][j] = (dp[i][j]) % num;
                    }
                    continue;
                }
                if (s.charAt(i) == string[j - 1].charAt(0) || s.charAt(i) == '?') {
                    m = 1;
                }
                dp[i + 1][j] = (m * dp[i][j - 1] + b * dp[i][j]) % num;
            }
        }
        System.out.println(dp[n][3]);
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, calculates the number of possible strings that can be formed by replacing the '?' characters with 'A', 'B
