

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int s = 0;
        for (int b = K + 1; b <= N; b++) {
            int an = 0;
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

## 2. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007


```
import sys
import random

def rd():
        return sys.stdin.readline().rstrip()

def rdi():
        return [ int(x) for x in rd().split() ]

def rds():
        return rd().split()

def rdii():
        return [ int(x) for x in rds() ]

def rdiii():
        return [ int(x) for x in rds() ]

def rdiiii():
        return [ int(x) for x in rds() ]

def rdiiiii():
        return [ int(x) for x in rds() ]

def rdiiiiii():
        return [ int(x) for x in rds() ]

def rdiiiiiii():
        return [ int(x) for x in rds() ]

def rdiiiiiiii():
        return [ int(x) for x in rds() ]

def rdiiiiiiiii():
        return [ int(x) for x in rds() ]

def rdiiiiiiiiii():
        return [ int(x) for x in rds() ]

def rdiiiiiiiiiii():
        return [ int(x) for x in rds() ]

def rdiiiiiiiiiiii():
        return [ int(x) for x in rds() ]

def rdiiiiiiiiiiiii():
        return [ int(x) for x in rds() ]

def rdiiiiiiiiiiiiii():
        return [ int(x) for x in rds() ]

def rdiiiiiiiiiiiiiii():
        return [ int(x) for x in rds() ]

def rdiiiiiiiiiiiiiiii():
        return [ int(x) for x in rds() ]

def rdiiiiiiiiiiiiiiiii():
        return [ int(x) for x in rds() ]

def rdiiiiiiiiiiiiiiiiii():
        return [ int(x) for x in rds() ]

def rdiiiiiiiiiiiiiiiiiii():
        return [ int(x) for x in rds() ]

def rdiiiiiiiiiiiiiiiiiiii():
        return [ int(x) for x in rds() ]

def rdiiiiiiiiiiiiiiiiiiiii():
        return [ int(x) for x in rds() ]

def rdiiiiiiiiiiiiiiiiiiiiii():
        return [ int(x) for x in rds() ]

def rdiiiiiiiiiiiiiiiiiiiiiii():
        return [ int(x) for x in rds() ]

def rdiiiiiiiiiiiiiiiiiiiiiiii():
        return [ int(x) for x in rds() ]

def rdiiiiiiiiiiiiiiiiiiiiiiiii():
        return [ int(x) for x in rds() ]

def rdiiiiiiiiiiiiiiiiiiiiiiiiii():
        return [ int(x) for x in rds() ]

def rdiiiiiiiiiiiiiiiiiiiiiiiiiii():
        return [ int(x) for x in rds() ]

def rdiiiiiiiiiiiiiiiiiiiiiiiiiiii():
        return [ int(x) for x in rds() ]

def rdiiiiiiiiiiiiiiiiiiiiiiiiiiiii():
        return [ int(x) for x in rds() ]

def rdiiiiiiiiiiiiiiiiiiiiiiiiiiiiii():
        return [ int(x) for x in rds() ]

def rdiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii():
        return [ int(x) for x in rds() ]

def rdiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii():
        return [ int(x) for x in rds() ]

def rdiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii():
        return [ int(x) for x in rds() ]

def rdiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii():
        return [ int(x) for x in rds() ]

def rdiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii():
        return [ int(x) for x in rds() ]

def rdiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii():
        return [ int(x) for x in rds() ]

def rdiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii():
        return [ int(x) for x in rds() ]

def rdiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii():
        return [ int(x) for x in rds() ]

def rdiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii():
        return [ int(x) for x in rds() ]

def rdiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii():
        return [ int(x) for x in rds() ]

def rdiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii():
        return [ int(x) for x in rds() ]

def rdiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii():
        return [ int(x) for x in rds() ]

def rdiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii():
        return [ int(x) for x in rds() ]

def rdiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii():
        return [ int(x) for x in rds() ]

def rdiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii():
        return [ int(x) for x in rds() ]

def rdiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii():
        return [ int(x) for x in rds()
