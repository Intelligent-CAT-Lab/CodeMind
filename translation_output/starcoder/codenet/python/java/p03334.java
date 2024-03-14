<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
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

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D1 = sc.nextInt();
        int D2 = sc.nextInt();
        int n = 1;
        while (D1 % 4 == 0) {
            n *= 2;
            D1 /= 4;
        }
        while (D2 % 4 == 0) {
            n *= 2;
            D2 /= 4;
        }
        int[][] h = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                h[i][j] = (i + j) % 2;
            }
        }
        int cnt = 0;
        for (int i = 0; i < n * 2; i++) {
            for (int j = 0; j < n * 2; j++) {
                if (h[i % n][j % n] == 1 && h[(i + D1) % n][(j + D2) % n] == 1) {
                    System.out.println(i + " " + j);
                    cnt++;
                    if (cnt >= N * N) {
                        return;
                    }
                }
            }
        }
    }
}
```
<|endoftext|>
