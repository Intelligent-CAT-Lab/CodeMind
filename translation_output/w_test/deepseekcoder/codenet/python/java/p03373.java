<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1500 2000 1600 3 2

Expected output:
7900


```
from sys import stdin, stdout


a, b, c, x, y = map(int, stdin.readline().split())

ans = 0
if 2 * c <= a + b:
    ans += min(x, y) * 2 * c
    q = min(x, y)
    x -= q
    y -= q
    
    if x and 2 * c <= a:
        ans += 2 * c * x
    elif x:
        ans += a * x
    elif y and 2 * c <= b:
        ans += 2 * c * y
    else:
        ans += b * y
    
else:
    ans = x * a + y * b

stdout.write(str(ans))
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int ans = 0;
        if (2 * c <= a + b) {
            ans += Math.min(x, y) * 2 * c;
            int q = Math.min(x, y);
            x -= q;
            y -= q;

            if (x > 0 && 2 * c <= a) {
                ans += 2 * c * x;
            } else if (x > 0) {
                ans += a * x;
            } else if (y > 0 && 2 * c <= b) {
                ans += 2 * c * y;
            } else {
                ans += b * y;
            }
        } else {
            ans = x * a + y * b;
        }

        System.out.println(ans);
    }
}
```
<|EOT|>
