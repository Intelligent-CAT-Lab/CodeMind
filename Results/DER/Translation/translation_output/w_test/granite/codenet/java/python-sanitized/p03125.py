import sys

def solve():
    a, b = map(int, sys.stdin.readline().split())
    return b - a if b % a else a + b

print(solve())