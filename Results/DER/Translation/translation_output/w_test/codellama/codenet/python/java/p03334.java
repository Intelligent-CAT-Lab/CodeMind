<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int D1 = scanner.nextInt();
        int D2 = scanner.nextInt();

        int n = 1;
        while (D1 % 4 == 0) {
            n *= 2;
            D1 /= 4;
        }

        int cnt = 0;
        for (int x = 0; x < N * 2; x++) {
            for (int y = 0; y < N * 2; y++) {
                if (judge(x, y, n, D1) && judge(x, y, n, D2)) {
                    System.out.println(x + " " + y);
                    cnt++;
                    if (cnt >= N * N) {
                        break;
                    }
                }
            }
        }
    }

    private static boolean judge(int x, int y, int n, int D) {
        if (D % 2 == 1) {
            return ~(x / n + y / n) % 2 == 0;
        } else {
            return ~(x / n) % 2 == 0;
        }
    }
}
```
This code uses the same logic as the Python code, but it is written in Java. It first reads the input from the user, and then it calculates the value of `n` based on the value of `D1`. It then uses a nested loop to iterate over all possible values of `x` and `y`, and it checks if the values of `x` and `y` satisfy the conditions of the problem. If they do, it prints the values of `x` and `y` to the console.

The `judge` method is used to determine if a given value of `x` and `y` satisfies the conditions of the problem. It takes four arguments: `x`, `y`, `n`, and `D`. It first checks if `D` is odd, and if it is, it returns the result of `~(x / n + y / n) % 2 == 0`. If `D` is even, it returns the result of `~(x / n) % 2 == 0`.

The `judge` method is used in the nested loop to check if the current values of `x` and `y` satisfy the conditions of the problem. If they do, the values of `x` and `y` are printed to the console.</s>
