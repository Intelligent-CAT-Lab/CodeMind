<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int[] remain = new int[2020];
        int now = 0;
        int ans = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            now += Integer.parseInt(s.charAt(i)) * (int) Math.pow(10, s.length() - i - 1, 2019);
            ans += remain[now % 2019];
            remain[now % 2019] += 1;
        }
        ans += remain[0];
        System.out.println(ans);
    }
}
```
This code uses the same approach as the Python code, but it is written in Java. It first reads the input string from the user, then it initializes an array `remain` to store the number of times each remainder modulo 2019 appears in the input string. It then iterates over the input string from right to left, calculating the remainder of the current number modulo 2019 and adding the corresponding value from the `remain` array to the `ans` variable. Finally, it prints the value of `ans` as the output.</s>
