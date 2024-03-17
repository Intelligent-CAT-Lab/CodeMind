<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 4 5

Expected output:
6


```
from collections import defaultdict, deque, Counter
from heapq import heappush, heappop, heapify
from itertools import permutations, accumulate, combinations, combinations_with_replacement
from math import sqrt, ceil, floor, factorial
from bisect import bisect_left, bisect_right, insort_left, insort_right
from copy import deepcopy
from operator import itemgetter
from functools import reduce
from fractions import gcd
import sys
def input(): return sys.stdin.readline().rstrip()
def I(): return int(input())
def Is(): return map(int, input().split())
def LI(): return list(map(int, input().split()))
def TI(): return tuple(map(int, input().split()))
def IR(n): return [I() for _ in range(n)]
def LIR(n): return [LI() for _ in range(n)]
def TIR(n): return [TI() for _ in range(n)]
def S(): return input()
def Ss(): return input().split()
def LS(): return list(input())
def SR(n): return [S() for _ in range(n)]
def SsR(n): return [Ss() for _ in range(n)]
def LSR(n): return [LS() for _ in range(n)]
sys.setrecursionlimit(10**6)
MOD = 10**9+7
INF = 10**18
# ----------------------------------------------------------- #

a, b, c = Is()
print(int(a*b/2))
```
[/INST]
```java
import java.util.*;

public class Main {
    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    static int sqrt(int n) {
        return (int) Math.sqrt(n);
    }

    static int ceil(double n) {
        return (int) Math.ceil(n);
    }

    static int floor(double n) {
        return (int) Math.floor(n);
    }

    static int bisect(int[] arr, int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr[m] == x) {
                return m;
            } else if (arr[m] < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    static void insert(int[] arr, int x, int idx) {
        for (int i = arr.length - 1; i >= idx; i--) {
            arr[i] = arr[i - 1];
        }
        arr[idx] = x;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void heapify(int[] arr, int idx, int len) {
        int l = 2 * idx + 1;
        int r = 2 * idx + 2;
        int largest = idx;
        if (l < len && arr[l] > arr[largest]) {
            largest = l;
        }
        if (r < len && arr[r] > arr[largest]) {
            largest = r;
        }
        if (largest != idx) {
            swap(arr, idx, largest);
            heapify(arr, largest, len);
        }
    }

    static void heappush(int[] arr, int x) {
        int len = arr.length;
        arr[len] = x;
        heapify(arr, len - 1, len);
    }

    static int heappop(int[] arr) {
        int len = arr.length;
        int x = arr[len - 1];
        swap(arr, len - 1, 0);
        heapify(arr, 0, len - 1);
        return x;
    }

    static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (int i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[m + 1 + j];
        }
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    static void sort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    static int[] permutations(int[] arr, int n) {
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = arr[i];
        }
        Arrays.sort(res);
        return res;
    }

    static int[] combinations(int[] arr, int n, int k) {
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = arr[i];
        }
        Arrays.sort(res);
        int count = factorial(n) / (factorial(n - k) * factorial(k));
        for (int i = 0; i < count; i++) {
            int j = 0;
            for (int l = 0; l < k; l++) {
                if (res[j] != res[l]) {
                    swap(res, j, l);
                    j++;
                }
            }
        }
        return res;
    }

    static int[] combinationsWithReplacement(int[] arr, int n, int k) {
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = arr[i];
        }
        Arrays.sort(res);
        int count = factorial(n) / (factorial(n - k) * factorial(k));
        for (int i = 0; i < count; i++) {
            int j = 0;
            for (int l = 0; l < k; l++) {
                if (res[j] != res[l]) {
                    swap(res, j, l);
                    j++;
                }
            }
        }
        return res;
    }

    static int[] accumulate(int[] arr, int func, int start, int end) {
        int[] res = new
