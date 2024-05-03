Here is the Python version of the Java code you provided:

```python
import sys
import io
import array
import bisect
import collections
import heapq
import itertools
import math
import operator
import os
import random
import re
import string
import sys
import threading
import time
import traceback

class p03483:
    def solve(self):
        s = self.ns()
        n = len(s)
        idx = [0] * 26
        
        for i in range(n):
            c = ord(s[i]) - ord('a')
            idx[c] += 1
        a = [[0] * idx[i] for i in range(26)]

        map = [-1] * n
        ptr = [0] * 26
        now = 0
        oddUsed = -1
        for i in range(n):
            c = ord(s[i]) - ord('a')
            
            odd = idx[c] % 2 == 1
            if odd and oddUsed >= 0 and oddUsed != c:
                print(-1)
                return
            
            p = ptr[c]
            if p < idx[c] // 2:
                map[i] = now
                now += 1
            elif odd and p == idx[c] // 2:
                map[i] = n // 2
                oddUsed = c
                
            else:
                inv = idx[c] - p - 1
                map[i] = n - a[c][inv] - 1
            a[c][p] = map[i]
            ptr[c] += 1
        array = [0] * n
        for i in range(n):
            array[map[i]] = i
        x = self.bubbleCount(array, 0, n)
        print(x)

    def bubbleCount(self, a, l, r):
        if r - l <= 1:
            return 0
        m = (l+r)//2
        ret = self.bubbleCount(a, l, m) +
