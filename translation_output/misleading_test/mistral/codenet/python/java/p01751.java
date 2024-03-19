<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10 10 5

Expected output:
86

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
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int t = 0;
        for (int i = 0; i < 61; i++) {
            if (t % 60 <= c && t % 60 + a <= c) {
                System.out.println(t / 60 * 60 + c);
                break;
            }
            t += a + b;
        }
        if (t % 60 > c) {
            System.out.println(-1);
        }
    }
}
```</s>
