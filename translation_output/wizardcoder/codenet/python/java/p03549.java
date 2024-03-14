Below is an instruction that describes a task. Write a response that appropriately completes the request.

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

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = getN();
        int M = getN();
        int total = 1900 * M + 100 * (N - M);
        System.out.println(total * (int) Math.pow(2, M));
    }

    public static int getN() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static int[] getNM() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[2];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        return arr;
    }

    public static List<Integer> getList() {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (sc.hasNextInt()) {
            list.add(sc.nextInt());
        }
        return list;
    }

    public static int[] getArray(int n) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static String input() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine().trim();
    }
}
```<|endoftext|>
