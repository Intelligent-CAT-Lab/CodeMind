<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1817181712114

Expected output:
3


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

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        int[] remain = new int[2020];
        int now = 0;
        int ans = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            now += (int) (s.charAt(i) - '0') * Math.pow(10, s.length() - i - 1) % 2019;
            ans += remain[now % 2019];
            remain[now % 2019]++;
        }

        ans += remain[0];

        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads a string of digits from the user, then iterates over the string in reverse order, calculating the running total modulo 2019 and incrementing the count in the `remain` array for each total. The final count is the number of substrings in the input string that sum to a multiple of 2019.<｜end▁of▁sentence｜>
