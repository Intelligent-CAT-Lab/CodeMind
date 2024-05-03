Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int L = S.length();
        boolean[][] dp = new boolean[L + 1][L + 1];

        // [left, right)
        for (int i = 0; i <= L; i++) {
            dp[i][i] = true;
        }

        for (int w = 3; w <= L; w += 3) {
            for (int left = 0; left <= L - w; left++) {
                int right = left + w;
                if (S.charAt(left) != 'm' || S.charAt(right - 1) != 'w') {
                    continue;
                }
                for (int mid = left + 1; mid < right; mid++) {
                    if (S.charAt(mid) == 'e' && dp[left + 1][mid] && dp[mid + 1][right - 1]) {
                        dp[left][right] = true;
                        break;
                    }
                }
            }
        }
        System.out.println(dp[0][L] ? "Cat" : "Rabbit");
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the user, then uses dynamic programming to determine if the string is a "Cat" or a "Rabbit". The dynamic programming table `dp` is used to store whether a substring is a "Cat" or a "Rabbit". The code then prints out the result.
