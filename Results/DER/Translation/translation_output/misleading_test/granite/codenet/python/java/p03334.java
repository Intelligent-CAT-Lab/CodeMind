System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
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
        int[] dx = {0, 0, 1, 1, 1, 1, 2, 2};
        int[] dy = {0, 1, 0, 1, 2, 2, 0, 1};
        int[] dx2 = {0, 0, 1, 1};
        int[] dy2 = {0, 1, 0, 1};
        int[] dx3 = {0, 1};
        int[] dy3 = {0, 0};
        int[] dx4 = {0, 1, 2, 2};
        int[] dy4 = {0, 1, 0, 1};
        int[] dx5 = {0, 1};
        int[] dy5 = {0, 0};
        int[] dx6 = {0, 1, 2, 2};
        int[] dy6 = {0, 1, 0, 1};
        int[] dx7 = {0, 1};
        int[] dy7 = {0, 0};
        int[] dx8 = {0, 1, 2, 2};
        int[] dy8 = {0, 1, 0, 1};
        int cnt = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (D1 % 2 == 1) {
                    if (i < 4) {
                        for (int x = 0; x < N * 2; x++) {
                            for (int y = 0; y < N * 2; y++) {
                                if ((x / n1 + y / n1) % 2 == dx2[i] && (x / n1) % 2 == dx2[j] && (y / n1) % 2 == dy2[j]) {
                                    System.out.println(x + " " + y);
                                    cnt++;
                                    if (cnt >= N * N) {
                                        return;
                                    }
                                }
                            }
                        }
                    } else {
                        for (int x = 0; x < N * 2; x++) {
                            for (int y = 0; y < N * 2; y++) {
                                if ((x / n1) % 2 == dx3[i] && (y / n1) % 2 == dy3[j]) {
                                    System.out.println(x + " " + y);
                                    cnt++;
                                    if (cnt >= N * N) {
                                        return;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (i < 4) {
                        for (int x = 0; x < N * 2; x++) {
                            for (int y = 0; y < N * 2; y++) {
                                if ((x / n1 + y / n1) % 2 == dx4[i] && (x / n1) % 2 == dx4[j] && (y / n1) % 2 == dy4[j]) {
                                    System.out.println(x + " " + y);
                                    cnt++;
                                    if (cnt >= N * N) {
                                        return;
                                    }
                                }
                            }
                        }
                    } else {
                        for (int x = 0; x < N * 2; x++) {
                            for (int y = 0; y < N * 2; y++) {
                                if ((x / n1) % 2 == dx5[i] && (y / n1) % 2 == dy5[j]) {
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
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (D2 % 2 == 1) {
                    if (i < 4) {
                        for (int x = 0; x < N * 2; x++) {
                            for (int y = 0; y < N * 2; y++) {
                                if ((x / n2 + y / n2) % 2 == dx6[i] && (x / n2) % 2 == dx6[j] && (y / n2) % 2 == dy6[j]) {
                                    System.out.println(x + " " + y);
                                    cnt++;
                                    if (cnt >= N * N) {
                                        return;
                                    }
                                }
                            }
                        }
                    } else {
                        for (int x = 0; x < N * 2; x++) {
                            for (int y = 0; y < N * 2; y++) {
                                if ((x / n2) % 2 == dx7[i] && (y / n2) % 2 == dy7[j]) {
                                    System.out.println(x + " " + y);
                                    cnt++;
                                    if (cnt >= N * N) {
                                        return;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (i < 4) {
                        for (int x = 0; x < N * 2; x++) {
                            for (int y = 0; y < N * 2; y++) {
                                if ((x / n2 + y / n2) % 2 == dx8[i] && (x / n2) % 2 == dx8[j] && (y / n2) % 2 == dy8[j]) {
                                    System.out.println(x + " " + y);
                                    cnt++;
                                    if (cnt >= N * N) {
                                        return;
                                    }
                                }
                            }
                        }
                    } else {
                        for (int x = 0; x < N * 2; x++) {
                            for (int y = 0; y < N * 2; y++) {
                                if ((x / n2) % 2 == dx5[i] && (y / n2) % 2 == dy5[j]) {
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
            }
        }
    }
}
```<|endoftext|>
