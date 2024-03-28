<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02555 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long mod = 1000000007;
        long[] dp = new long[n + 1];
        dp[0] = 1;
        for (int i = 3; i <= n; i++) {
            for (int j = 3; j <= i; j++) {
                dp[i] = (dp[i] + dp[i - j]) % mod;
            }
        }
        System.out.println(dp[n]);
    }
}

```

@@ Response
```python
import sys

def main():
    n = int(sys.stdin.readline())
    mod = 1000000007
    dp = [0] * (n + 1)
    dp[0] = 1
    for i in range(3, n + 1):
        for j in range(3, i + 1):
            dp[i] = (dp[i] + dp[i - j]) % mod
    print(dp[n])

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from standard input, initializes an array `dp` with size `n + 1`, and then fills it up in a similar way. Finally, it prints the value at index `n` in the `dp` array.<｜end▁of▁sentence｜>
