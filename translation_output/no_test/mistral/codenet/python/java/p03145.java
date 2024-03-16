<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
import java.util.stream.Collectors;

public class Main {
    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
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

    static long factorial(int n) {
        long ans = 1;
        for (int i = 2; i <= n; i++) {
            ans *= i;
        }
        return ans;
    }

    static void bisect(int[] arr, int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == x) {
                break;
            } else if (arr[mid] < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        if (l <= r) {
            int k = l + (r - l) / 2;
            arr[k] = x;
            bisect(arr, x);
        } else if (l < r) {
            insort_right(arr, x);
            bisect(arr, x);
        }
    }

    static void copy(int[] arr) {
        int[] copy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
    }

    static void deepcopy(int[] arr) {
        int[] copy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            deepcopy(arr[i]);
        }
    }

    static int[] heappush(int[] arr, int x) {
        int n = arr.length;
        arr[n] = x;
        int k = n - 1;
        while (k > 0 && arr[k] < arr[k - 1]) {
            swap(arr, k, k - 1);
            k--;
        }
        return arr;
    }

    static int[] heappop(int[] arr) {
        int n = arr.length;
        int x = arr[0];
        int k = 0;
        int r = n - 1;
        while (k < r) {
            int l = 2 * k + 1;
            int r = 2 * k + 2;
            int m = r > l ? r : l;
            swap(arr, k, m);
            k = m;
        }
        return arr;
    }

    static void heapify(int[] arr, int k, int n) {
        int l = 2 * k + 1;
        int r = 2 * k + 2;
        int m = r > l ? r : l;
        if (l < n) {
            heapify(arr, l, n);
        }
        if (r < n) {
            heapify(arr, r, n);
        }
        if (m < n) {
            swap(arr, k, m);
            heapify(arr, m, n);
        }
    }

    static void permutations(int[] arr) {
        List<int[]> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    int[] temp = new int[arr.length];
                    copy(arr);
                    temp[i] = arr[j];
                    temp[j] = arr[k];
                    temp[k] = arr[i];
                    ans.add(temp);
                }
            }
        }
        Collections.sort(ans, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                int x = 0;
                for (int i = 0; i < a.length; i++) {
                    x = x * 10 + a[i];
                }
                int y = 0;
                for (int i = 0; i < b.length; i++) {
                    y = y * 10 + b[i];
                }
                return Integer.compare(x, y);
            }
        });
        for (int[] a : ans) {
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }

    static void accumulate(int[] arr, int func, int init) {
        int sum = init;
        for (int i = 0; i < arr.length; i++) {
            sum = func(sum, arr[i]);
        }
        System.out.println(sum);
    }

    static void combinations(int[] arr, int n) {
        List<int[]> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    int[] temp = new int[arr.length];
                    copy(arr);
                    temp[i] = arr[j];
                    temp[j] = arr[k];
                    temp[k] = arr[i];
                    ans.add(temp);
                }
            }
        }
        Collections.sort(ans, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                int x = 0;
                for (int i = 0; i < a.length; i++) {
                    x = x * 10 + a[i];
                }
                int y = 0;
                for (int i = 0; i < b.
