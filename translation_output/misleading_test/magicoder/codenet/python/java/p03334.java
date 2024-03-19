<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 1 2

Expected output:
0 0
0 2
2 0
2 2


```
from math import sqrt
from itertools import product

import numpy as np

def judge(D):
  n = 1
  while D%4==0:
    n *= 2
    D //= 4

  def h1(x,y):
    return ~(x//n+y//n)%2
  def h2(x,y):
    return ~(x//n)%2

  return h1 if D%2==1 else h2

N,D1,D2 = map(int,input().split())
j1,j2 = judge(D1),judge(D2)
cnt = 0
for x,y in product(range(N*2),repeat=2):
  if j1(x,y) and j2(x,y):
    print(x,y)
    cnt += 1
    if cnt >= N*N:
      break

```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int D1 = scanner.nextInt();
        int D2 = scanner.nextInt();
        scanner.close();

        int n1 = getN(D1);
        int n2 = getN(D2);

        int cnt = 0;
        for (int x = 0; x < N * 2; x++) {
            for (int y = 0; y < N * 2; y++) {
                if (judge(x, y, n1, D1) && judge(x, y, n2, D2)) {
                    System.out.println(x + " " + y);
                    cnt++;
                    if (cnt >= N * N) {
                        break;
                    }
                }
            }
        }
    }

    private static int getN(int D) {
        int n = 1;
        while (D % 4 == 0) {
            n *= 2;
            D /= 4;
        }
        return n;
    }

    private static boolean judge(int x, int y, int n, int D) {
        if (D % 2 == 1) {
            return (x / n + y / n) % 2 == 0;
        } else {
            return (x / n) % 2 == 0;
        }
    }
}
```

This Java code does the same thing as the Python code. It reads the input, calculates the values of `n1` and `n2`, and then iterates over the range of `N*2` for both `x` and `y`. For each pair of `x` and `y`, it checks if the conditions in the `judge` function are met, and if so, it prints the pair and increments the counter. If the counter reaches `N*N`, it breaks the loop.<｜end▁of▁sentence｜>
