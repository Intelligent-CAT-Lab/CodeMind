<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 7

Expected output:
4


```
import sys
import itertools
# import numpy as np
import time
import math
import heapq
from collections import defaultdict
sys.setrecursionlimit(10 ** 7)
 
INF = 10 ** 18
MOD = 10 ** 9 + 7
read = sys.stdin.buffer.read
readline = sys.stdin.buffer.readline
readlines = sys.stdin.buffer.readlines

# map(int, input().split())

N, X = map(int, input().split())

l = [0] * 51
l[0] = 1
p = [0] * 51
p[0] = 1
for i in range(1, 51):
    l[i] = l[i - 1] * 2 + 3
    p[i] = p[i - 1] * 2 + 1

ans = 0
for i in range(N, -1, -1):
    if i == 0 and X >= 1:
        ans += 1
        break

    if X <= 1:
        break
    elif X <= l[i - 1] + 1:
        X -= 1
        continue 
    elif X == l[i - 1] + 2:
        ans += 1
        X -= 2
    else:
        ans += p[i - 1] + 1
        X -= l[i - 1] + 2
print(ans)
```

### Response:
Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();

        long[] l = new long[51];
        long[] p = new long[51];
        l[0] = 1;
        p[0] = 1;
        for (int i = 1; i <= 50; i++) {
            l[i] = l[i - 1] * 2 + 3;
            p[i] = p[i - 1] * 2 + 1;
        }

        long ans = 0;
        for (int i = N; i >= 0; i--) {
            if (i == 0 && X >= 1) {
                ans++;
                break;
            }

            if (X <= 1) {
                break;
            } else if (X == l[i - 1] + 1) {
                X--;
                continue;
            } else if (X == l[i - 1] + 2) {
                ans++;
                X -= 2;
            } else {
                ans += p[i - 1] + 1;
                X -= l[i - 1] + 2;
            }
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the standard input, calculates the values of `l` and `p` arrays, and then uses these values to calculate the answer. The answer is then printed to the standard output.
<|EOT|>
