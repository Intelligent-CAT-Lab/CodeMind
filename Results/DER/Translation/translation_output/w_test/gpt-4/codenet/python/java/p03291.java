Below is the translated Java code for the provided Python code. The code has been tested with the provided test case to ensure it outputs the correct result.

```java
import java.util.Scanner;

public class ABCString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n = s.length();
        long[][] dp = new long[n+1][4];
        dp[0][0] = 1;
        String[] string = {"A", "B", "C"};
        long num = (long)Math.pow(10, 9) + 7;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                long m = 0;
                long b = 1;
                if ('?' == s.charAt(i)) b = 3;
                if (j == 0) {
                    if ('?' == s.charAt(i)) dp[i+1][j] = (dp[i][j] * 3) % num;
                    else dp[i+1][j] = (dp[i][j]) % num;
                    continue;
                }
                if (s.charAt(i) == string[j-1].charAt(0) || s.charAt(i) == '?') m = 1;
                dp[i+1][j] = (m * dp[i][j-1] + b * dp[i][j]) % num;
            }
        }
        System.out.println(dp[n][3]);
    }
}
```

To test the program with the provided test case "A??C", you should run the program and enter the test input when prompted. The program should then output the expected result which is `8`.
