<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2 1 1

Expected output:
2


```
a, b, c, d = map(int, input().split())
ans = -1000000000000000000
ans = max(ans, a * c, a * d, b * c, b * d)
print(ans)

```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int ans = -1000000000000000000;
        ans = Math.max(ans, a * c, a * d, b * c, b * d);
        System.out.println(ans);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `Math.max()` method to find the maximum of the four products. The `ans` variable is initialized to a very large negative number to ensure that it is always updated with the correct maximum value.</s>
