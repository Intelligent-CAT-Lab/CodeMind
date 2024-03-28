<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.Scanner;
import java.util.Collections;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        scanner.close();

        if (K % 2 == 0) {
            System.out.println(-1);
            return;
        }

        int cnt = 0;
        int now = 0;
        for (int i = 0; i < 1000000; i++) {
            cnt++;
            now = (now * 10 + 7) % K;
            if (now == 0) {
                System.out.println(cnt);
                return;
            }
        }
        System.out.println(-1);
    }
}
```
This code uses the same logic as the Python code, but it is written in Java. It first reads an integer `K` from the input, and then checks if `K` is even. If it is, it prints `-1` and exits the program. Otherwise, it initializes two variables `cnt` and `now` to `0` and `0`, respectively, and starts a loop that runs for 1 million iterations. In each iteration, it increments `cnt` by 1, multiplies `now` by 10, adds 7 to it, and then takes the remainder of the result when divided by `K`. If the result is `0`, it prints `cnt` and exits the program. If the loop completes without finding a solution, it prints `-1`.</s>
