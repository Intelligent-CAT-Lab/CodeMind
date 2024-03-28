<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
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

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int t = 0;
        for (int loop = 0; loop < 61; loop++) {
            if (t % 60 <= c && c <= t % 60 + a) {
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
'''
<|endoftext|>
