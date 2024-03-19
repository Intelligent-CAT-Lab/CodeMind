import sys
import os
import math
import re
import itertools
import collections
import string
import functools
import operator
import heapq
import random
import bisect

def ni():
    return int(sys.stdin.readline())

def ns():
    return sys.stdin.readline().strip()

def out(s):
    sys.stdout.write(str(s) + '\n')

def solve(a, l):
    if a % 2 == 0:
        for i in range(1, a // 2 + 1):
            for j in range(i + 1, a // 2 + 1):
                l.append(str(i) + " " + str(j))
                l.append(str(i) + " " + str(a + 1 - j))
                l.append(str(a + 1 - i) + " " + str(j))
                l.append(str(a + 1 - i) + " " + str(a + 1 - j))
    else:
        solve(a - 1, l)
        for i in range(1, a):
            l.append(str(a) + " " + str(i))

def main():
    a = ni()
    l = []
    solve(a, l)
    out(len(l))
    for s in l:
        out(s)

if __name__ == '__main__':
    main()