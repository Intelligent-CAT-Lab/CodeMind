import sys

def solve(N, d):
    if d == 1:
        return (N * (N - 1)) // 2
    elif d