<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
260522

Expected output:
-1


```
import sys
from collections import defaultdict
K = int ( input ( ) )
cnt = 0
now = 0
if K % 2 == 0 :
    print ( - 1 )
    sys . exit ( 0 )
for i in range ( 10 ** 6 ) :
    cnt += 1
    now = ( now * 10 + 7 ) % K
    if now == 0 :
        print ( cnt )
        sys . exit ( 0 )
print ( - 1 )


```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int cnt = 0;
        int now = 0;
        if (K % 2 == 0) {
            System.out.println(-1);
            System.exit(0);
        }
        for (int i = 0; i < Math.pow(10, 6); i++) {
            cnt += 1;
            now = (now * 10 + 7) % K;
            if (now == 0) {
                System.out.println(cnt);
                System.exit(0);
            }
        }
        System.out.println(-1);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, checks if it's divisible by 2, and if it is, it prints -1 and exits. If it's not, it iterates over a range of 10^6 and for each iteration, it increments the counter, calculates the remainder of the current number divided by K, and checks if it's 0. If it is, it prints the counter and exits. If it doesn't find a 0 remainder after 10^6 iterations, it prints -1.<｜end▁of▁sentence｜>
