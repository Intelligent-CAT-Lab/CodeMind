<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 1 10

Expected output:
Hom


```
# -*- coding: utf-8 -*-
import sys
from operator import itemgetter
from fractions import gcd
from math import ceil, floor, sqrt
from copy import deepcopy
from collections import Counter, deque
import heapq
from functools import reduce
# local only
# if not __debug__:
#     fin = open('in_1.txt', 'r')
#     sys.stdin = fin
# local only
sys.setrecursionlimit(200000)
input = sys.stdin.readline
def ii(): return int(input())
def mi(): return map(int, input().rstrip().split())
def lmi(): return list(map(int, input().rstrip().split()))
def li(): return list(input().rstrip())
def debug(*args, sep=" ", end="\n"): print("debug:", *args, file=sys.stderr, sep=sep, end=end) if not __debug__ else None
def exit(*arg): print(*arg); sys.exit()
# template




def main():
    A, B, C = mi()
    if (A * B) % 2 == 0 and (B * C) % 2 == 0 and (C * A) % 2 == 0:
        print('Tem')
    else:
        print('Hom')

if __name__ == '__main__':
    main()


```

java code:<fim_suffix><fim_middle>
```java

```

'''
<|endoftext|>
