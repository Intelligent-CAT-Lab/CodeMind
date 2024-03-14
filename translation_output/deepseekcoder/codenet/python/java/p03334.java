<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int D1 = scanner.nextInt();
        int D2 = scanner.nextInt();
        scanner.close();

        Judge j1 = new Judge(D1);
        Judge j2 = new Judge(D2);

        int cnt = 0;
        for (int x = 0; x < 2 * N; x++) {
            for (int y = 0; y < 2 * N; y++) {
                if (j1.judge(x, y) && j2.judge(x, y)) {
                    System.out.println(x + " " + y);
                    cnt++;
                    if (cnt >= N * N) {
                        return;
                    }
                }
            }
        }
    }
}

class Judge {
    private int n;
    private int D;

    public Judge(int D) {
        this.n = 1;
        this.D = D;
        while (D % 4 == 0) {
            n *= 2;
            D /= 4;
        }
    }

    public boolean judge(int x, int y) {
        if (D % 2 == 1) {
            return (~(x / n + y / n) & 1) == 1;
        } else {
            return (~(x / n) & 1) == 1;
        }
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the standard input, creates two `Judge` objects, and then iterates over all pairs of integers from 0 to `2 * N`. For each pair, it checks if both `Judge` objects return true for the `judge` method. If they do, it prints the pair and increments a counter. If the counter reaches `N * N`, it stops.
<|EOT|>
