<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
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
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D1 = sc.nextInt();
        int D2 = sc.nextInt();
        int cnt = 0;
        for (int x = 0; x < N * 2; x++) {
            for (int y = 0; y < N * 2; y++) {
                if (judge(D1, x, y) && judge(D2, x, y)) {
                    System.out.println(x + " " + y);
                    cnt++;
                    if (cnt >= N * N) {
                        break;
                    }
                }
            }
        }
    }

    public static int judge(int D, int x, int y) {
        int n = 1;
        while (D % 4 == 0) {
            n *= 2;
            D /= 4;
        }
        int h1 = (x / n + y / n) % 2 == 0 ? 1 : 0;
        int h2 = (x / n) % 2 == 0 ? 1 : 0;
        return D % 2 == 1 ? h1 : h2;
    }
}
```</s>
