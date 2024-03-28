<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
import sys
import random

def rd():
        return sys.stdin.readline().rstrip()

def rdi():
        return [ int(x) for x in rd().split() ]

N, K = rdi()

#N, K = 5, 2
#N, K = 10, 0
#N, K = 31415, 9265

s = 0
for b in range(K+1, N+1):
        an = 0
        j = N / b
        an = j * (b - K)
        #print b, an
        if N % b > 0:
                x1 = j * b + K
                if K == 0:
                        x1 += 1
                x2 = min(N, (j+1) * b - 1)
                #print b, x1, x2
                if x2 >= x1:
                        an += (x2 - x1 + 1)
        s += an
        #print b, an
print s

```

@@ Response
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        long s = 0;
        for (int b = K + 1; b <= N; b++) {
            long an = 0;
            int j = N / b;
            an = j * (b - K);
            if (N % b > 0) {
                int x1 = j * b + K;
                if (K == 0) {
                    x1 += 1;
                }
                int x2 = Math.min(N, (j + 1) * b - 1);
                if (x2 >= x1) {
                    an += (x2 - x1 + 1);
                }
            }
            s += an;
        }
        System.out.println(s);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, then calculates the sum of the numbers in the range from K+1 to N (inclusive) that can be divided evenly by each number in this range.<｜end▁of▁sentence｜>
