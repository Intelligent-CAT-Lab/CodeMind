<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

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


Translate the above python code to java.

java code:

[/INST]
```
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        System.out.println(Math.ceil(H * W / 2));
    }
}
```
This is a basic implementation of the code in Java. It uses the `Scanner` class to read input from the user, and the `Math` class to perform mathematical operations. The `Math.ceil()` method is used to round up the result of the division to the nearest integer.

Note that the `Math.ceil()` method returns a `double` value, so we need to cast it to an `int` to print it as an integer.

Also, the `Math.ceil()` method is not available in Java 8, so you need to use the `Math.round()` method instead.
```
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        System.out.println((int) Math.round(H * W / 2));
    }
}
```</s>
