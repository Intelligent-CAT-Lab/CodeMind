<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
import sys, re, os
from collections import deque, defaultdict, Counter
from math import ceil, sqrt, hypot, factorial, pi, sin, cos, radians
# from fractions import gcd
from itertools import permutations, combinations, product, accumulate
from operator import itemgetter, mul
from copy import deepcopy
from string import ascii_lowercase, ascii_uppercase, digits
from functools import reduce
from bisect import bisect_left, insort_left
from heapq import heapify, heappush, heappop

INPUT = lambda: sys.stdin.readline().rstrip()
INT = lambda: int(INPUT())
MAP = lambda: map(int, INPUT().split())
S_MAP = lambda: map(str, INPUT().split())
LIST = lambda: list(map(int, INPUT().split()))
S_LIST = lambda: list(map(str, INPUT().split()))

sys.setrecursionlimit(10 ** 9)
INF = float('inf')
mod = 10 ** 9 + 7


def main():
    H, W = MAP()
    print(ceil(H*W/2) if H != 1 and W != 1 else 1)


if __name__ == '__main__':
    main()

```

@@ Response
```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        System.out.println((int)Math.ceil((double)H*W/2) * (H != 1 && W != 1 ? 1 : 0));
    }
}
```

Please note that Java does not have a direct equivalent to Python's `ceil` function. Instead, we use the `Math.ceil` method from the `java.lang.Math` class, which returns the smallest (closest to negative infinity) double value that is greater than or equal to the argument and is equal to a mathematical integer. We cast the result to an integer using the `(int)` operator.

Also, Java does not have a direct equivalent to Python's `sys.stdin.readline().rstrip()`. Instead, we use the `Scanner` class from the `java.util` package to read input from the console.

Finally, Java does not have a direct equivalent to Python's `lambda` functions. Instead, we use the `Scanner` class to read input from the console and use the `nextInt()` method to read integers.<｜end▁of▁sentence｜>
