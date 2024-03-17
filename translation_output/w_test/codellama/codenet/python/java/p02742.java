<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 5

Expected output:
10


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
[/INST]
```java
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        System.out.println(ceil(H*W/2) == 1 ? 1 : ceil(H*W/2));
    }

    public static double ceil(double x) {
        return Math.ceil(x);
    }
}
```
Note: The `ceil` method is used to round up the result to the nearest integer. The `Math.ceil` method is used to round up the result to the nearest integer.

Also, the `Scanner` class is used to read input from the standard input stream. The `nextInt` method is used to read an integer from the input stream. The `println` method is used to print the result to the standard output stream.</s>
