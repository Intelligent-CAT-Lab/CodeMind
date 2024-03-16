<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

### Response:
```java
import java.util.Scanner;

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

This Java code does the same thing as the Python code. It reads an integer `K` from the standard input, checks if `K` is even, and if it is, prints `-1` and exits. If `K` is odd, it then enters a loop that repeats up to `10^6` times. In each iteration of the loop, it increments `cnt`, updates `now` by appending `7` to the current value of `now` and taking the remainder when divided by `K`, and checks if `now` is `0`. If `now` is `0`, it prints `cnt` and exits. If the loop completes without finding a `now` of `0`, it prints `-1`.
<|EOT|>
