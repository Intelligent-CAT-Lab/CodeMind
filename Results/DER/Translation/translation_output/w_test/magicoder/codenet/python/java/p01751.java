<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10 10 5

Expected output:
5


```
a, b, c = map(int, raw_input().split())
t = 0
for loop in xrange(61):
    if t % 60 <= c <= t % 60 + a:
        print t / 60 * 60 + c
        break
    t += a + b
else:
    print -1
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int t = 0;
        for (int loop = 0; loop < 61; loop++) {
            if (t % 60 <= c && c <= (t % 60 + a)) {
                System.out.println(t / 60 * 60 + c);
                break;
            }
            t += a + b;
        } else {
            System.out.println(-1);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the standard input, then iterates over a range of 61. If the current time (`t`) is within the range of `c` and `c + a`, it prints the current time plus `c` and breaks the loop. If the loop completes without finding a suitable time, it prints `-1`.<｜end▁of▁sentence｜>
