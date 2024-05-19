System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D1 = sc.nextInt();
        int D2 = sc.nextInt();
        int n1 = 1;
        int n2 = 1;
        while (D1 % 4 == 0) {
            D1 /= 4;
            n1 *= 2;
        }
        while (D2 % 4 == 0) {
            D2 /= 4;
            n2 *= 2;
        }
        int[] x = new int[N * N];
        int[] y = new int[N * N];
        int cnt = 0;
        for (int i = 0; i < N * 2; i++) {
            for (int j = 0; j < N * 2; j++) {
                if (D1 % 2 == 1) {
                    if ((i / n1 + j / n1) % 2 == 0) {
                        x[cnt] = i;
                        y[cnt] = j;
                        cnt++;
                        if (cnt >= N * N) {
                            break;
                        }
                    }
                } else {
                    if (i / n1 % 2 == 0) {
                        x[cnt] = i;
                        y[cnt] = j;
                        cnt++;
                        if (cnt >= N * N) {
                            break;
                        }
                    }
                }
            }
            if (cnt >= N * N) {
                break;
            }
        }
        for (int i = 0; i < N * N; i++) {
            System.out.println(x[i] + " " + y[i]);
        }
    }
}
```<|endoftext|>
