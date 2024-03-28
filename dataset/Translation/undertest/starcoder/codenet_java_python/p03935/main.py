import sys

def solve():
    n, m = map(int, sys.stdin.readline().split())
    f = [1, 1]
    for i in range(2, 2*n+1):
        f.append((f[i-1] + f