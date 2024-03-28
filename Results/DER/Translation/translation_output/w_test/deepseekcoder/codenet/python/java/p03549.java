<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 1

Expected output:
3800


```
def getN():
    return int(input())
def getNM():
    return map(int, input().split())
def getList():
    return list(map(int, input().split()))
def getArray(intn):
    return [int(input()) for i in range(intn)]
def input():
    return sys.stdin.readline().rstrip()

from collections import defaultdict, deque, Counter
from sys import exit
import heapq
import math
import fractions
import copy
from itertools import permutations
from operator import mul
from functools import reduce
from bisect import bisect_left, bisect_right

import sys
sys.setrecursionlimit(1000000000)
mod = 10 ** 9 + 7

from itertools import permutations
from math import factorial, hypot

N, M = getNM()
total = 1900 * M + 100 * (N - M)
print(total * (2 ** M))
```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int total = 1900 * M + 100 * (N - M);
        System.out.println(total * (int)Math.pow(2, M));
    }
}
```

This Java code does the same thing as the Python code you provided. It reads two integers from the standard input, calculates the total score based on the formula provided in the Python code, and then prints the result. The `Math.pow(2, M)` part is used to calculate 2 to the power of M.
<|EOT|>
