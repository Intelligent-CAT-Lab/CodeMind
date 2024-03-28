import sys
import math

def solve():
    s = sys.stdin.readline().strip()
    n = len(s)
    idx = [0] * 26
    for i in range(n):
        c = ord(s[i]) - ord('a')
        idx[c] += 1
    a = [[0] * idx[c] for c in range(26)]
    map = [-1] * n
    ptr = [0] * 26
    now = 0
    oddUsed = -1
    for i in range(n):
        c = ord(s[i]) - ord('a')
        p = ptr[c]
        if p < idx[c] // 2:
            map[i] = now
            now += 1
        elif p == idx[c] // 2:
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
    return bubbleCount(array, 0, n)

def bubbleCount(a, l, r):
    if r - l <= 1:
        return 0
    m = (l + r) // 2
    ret = bubbleCount(a, l, m) + bubbleCount(a, m, r)