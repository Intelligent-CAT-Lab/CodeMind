<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
s = input();n = len(s)
dp = [[0 for i in range(4)] for j in range(len(s)+1)]
dp[0][0] = 1;string = ["A","B","C"];num = 10**9+7
for i in range(n):
    for j in range(4):
        m = 0;b = 1
        if '?' == s[i]:b = 3
        if j == 0:
            if '?' == s[i]:dp[i+1][j] = (dp[i][j] * 3)%num
            else:dp[i+1][j] = (dp[i][j])%num
            continue
        if s[i] == string[j-1]or s[i] == '?':m = 1
        dp[i+1][j] = (m*dp[i][j-1] + b*dp[i][j])%num
print(dp[-1][3])
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int n = s.length();
        long[][] dp = new long[n+1][4];
        dp[0][0] = 1;
        String[] string = {"A", "B", "C"};
        int num = (int)Math.pow(10, 9) + 7;
        for (int i = 0; i < n; i++) {
            int b = 1;
            if (s.charAt(i) == '?') b = 3;
            for (int j = 0; j < 4; j++) {
                int m = 0;
                if (j == 0) {
                    if (s.charAt(i) == '?') dp[i+1][j] = (dp[i][j] * 3) % num;
                    else dp[i+1][j] = dp[i][j] % num;
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

This Java code does the same thing as the Python code. It reads a string from the input, then it calculates the number of ways to arrange the characters in the string using dynamic programming. The result is printed out at the end.
<|EOT|>
