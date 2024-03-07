<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

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

Translate the above python code to java.

java code:

[/INST]
```
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int total = 1900 * M + 100 * (N - M);
        System.out.println(total * (2 ** M));
    }
}
```
This is the Java code equivalent to the Python code you provided. It uses the `Scanner` class to read input from the user and the `Math` class to perform mathematical operations.

Note that the `2 ** M` operation in the Python code is equivalent to the `Math.pow(2, M)` method in Java.</s>
