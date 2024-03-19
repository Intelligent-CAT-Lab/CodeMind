import sys

def solve():
    n, K = map(int, sys.stdin.readline().split())
    if K % 2 == 1:
        print(0)
        return
    mod = 1000000007
    dp = [[0 for _