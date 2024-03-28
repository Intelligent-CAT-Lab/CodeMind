<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
103

Expected output:
62

```
import math
x = int(input())

y = 100
ans = 0
while y < x:
    ans += 1
    y = math.floor(y*1.01)

print(ans)
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = 100;
        int ans = 0;
        while (y < x) {
            ans++;
            y = (int) Math.floor(y * 1.01);
        }
        System.out.println(ans);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `Math.floor()` method to round the value of `y` to the nearest integer. The `while` loop continues until `y` is greater than or equal to `x`, and the `ans` variable is incremented each time the loop executes. Finally, the `System.out.println()` method is used to print the value of `ans` to the console.</s>
