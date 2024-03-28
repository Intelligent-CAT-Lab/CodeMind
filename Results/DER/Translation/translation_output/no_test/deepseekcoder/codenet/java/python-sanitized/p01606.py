import sys
from array import array
from math import sqrt

EPS = 1e-12

def debug(*os):
    print(*os, file=sys.stderr)

def print(*os, end='\n'):
    sys.stdout.write(' '.join(map(str, os)) + end)

def run():
    global n, w
    n, w = map(int, sys.stdin.readline().split())
    solve()

def solve():
    global flag, count, sum, left, right
    flag = [False] * (n + 1)
    count = [0] * (n + 1)
    sum = 0
    left = 1
    right = w + 1
    for i in range(1, w):
        for k in range(1, int(sqrt(i)) + 1):
            if i % k == 0:
                count[k] += 1
                update(k)
                if i // k != k:
                    count[i // k] += 1
                    update(i // k)
    for i in range(n - w + 1):
        left = i + 1
        right = i + w + 1
        for k in range(1, int(sqrt(i)) + 1):
            if i % k == 0:
                count[k] -= 1
                update(k)
                if i // k != k:
                    count[i // k] -= 1
                    update(i // k)
        for k in range(1, int(sqrt(i + w)) + 1):
            if (i + w) % k == 0:
                count[k] += 1
                update(k)
                if (i + w) // k != k:
                    count[(i + w) // k] += 1
                    update((i + w) // k)
        update(left - 1)
        update(right - 1)
        print(sum + (i < n - w) * ' ', end='')
    print()

def update(i):
    global flag, sum, left, right
    det = left <= i < right
    if flag[i] and not det and count[i] < 2:
        flag[i] = False
        sum -= 1
    if not flag[i] and (det or count[i] >= 2):
        flag[i] = True
        sum += 1

if __name__ == '__main__':
    run()
    sys.stdout.flush()