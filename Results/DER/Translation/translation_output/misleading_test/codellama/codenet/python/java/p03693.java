<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 3 2

Expected output:
YE

```
r, g, b = map(int, input().split())

if (g * 10 + b) % 4 == 0:
    print("YES")
else:
    print("NO")

```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();

        if ((g * 10 + b) % 4 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and then uses the `map` function to convert the input strings to integers. It then calculates the result of the expression `(g * 10 + b) % 4` and prints "YES" or "NO" depending on the result.</s>
