import sys

def solve(a, b):
    return max(1, (b+a-1)//a)

a, b = map(int, sys.stdin.readline().split())
print(solve(a, b))