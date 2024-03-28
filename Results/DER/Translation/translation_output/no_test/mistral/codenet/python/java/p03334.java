<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int N = 10;
        int D1 = 12;
        int D2 = 16;
        int[] j1 = new int[N * N];
        int[] j2 = new int[N * N];
        Arrays.fill(j1, 0);
        Arrays.fill(j2, 0);
        int cnt = 0;
        for (int i = 0; i < N * N; i++) {
            int x = i / N;
            int y = i % N;
            if (j1[x * N + y] && j2[x * N + y]) {
                System.out.println(x * N + y);
                cnt++;
                if (cnt >= N * N) {
                    break;
                }
            }
        }
    }
}
```</s>
