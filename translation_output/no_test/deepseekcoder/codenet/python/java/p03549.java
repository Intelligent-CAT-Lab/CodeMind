<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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
import java.lang.*;

class Main {
    static Scanner in = new Scanner(System.in);

    static int getN() {
        return in.nextInt();
    }

    static int[] getNM() {
        int[] arr = new int[2];
        arr[0] = in.nextInt();
        arr[1] = in.nextInt();
        return arr;
    }

    static ArrayList<Integer> getList() {
        ArrayList<Integer> list = new ArrayList<>();
        while (in.hasNextInt()) {
            list.add(in.nextInt());
        }
        return list;
    }

    static int[] getArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        return arr;
    }

    public static void main (String[] args) {
        int[] nm = getNM();
        int N = nm[0], M = nm[1];
        int total = 1900 * M + 100 * (N - M);
        System.out.println(total * (int)Math.pow(2, M));
    }
}
```

Please note that Java does not have built-in support for dynamic resizing of arrays, unlike Python. Therefore, the `getArray` function in the Python code is not translated to Java. Also, Java does not have built-in support for list comprehension, so the equivalent code is written using a for loop.
<|EOT|>
