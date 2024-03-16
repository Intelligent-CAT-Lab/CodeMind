<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
s = input()

remain = [0]*2020
now = 0
ans = 0
for i in range(len(s)-1, -1, -1):
    now += int(s[i])*pow(10, len(s)-i-1, 2019)
    ans += remain[now%2019]
    remain[now%2019] += 1

ans += remain[0]

print(ans)

```

### Response:
Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        int[] remain = new int[2019];
        int now = 0;
        long ans = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            now += (s.charAt(i) - '0') * pow(10, s.length() - i - 1, 2019);
            now %= 2019;
            ans += remain[now];
            remain[now]++;
        }

        ans += remain[0];

        System.out.println(ans);
    }

    private static int pow(int a, int b, int mod) {
        int result = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                result = (result * a) % mod;
            }
            a = (a * a) % mod;
            b /= 2;
        }
        return result;
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the standard input, calculates the number of substrings that have the same remainder when divided by 2019, and prints the result. The `pow` method is used to calculate the power of a number modulo another number.
<|EOT|>
