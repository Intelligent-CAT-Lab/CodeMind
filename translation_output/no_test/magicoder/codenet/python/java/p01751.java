<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
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

Please note that Java does not have a built-in `xrange` function like Python. Instead, we use a standard for loop. Also, Java does not have a `raw_input()` function like Python. Instead, we use `Scanner` class to get user input.<｜end▁of▁sentence｜>
