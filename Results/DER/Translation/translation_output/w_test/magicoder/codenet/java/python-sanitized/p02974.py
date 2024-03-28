import sys

def solve():
    n, K = map(int, input().split())
    if K % 2 == 1:
        print(0)
        return
    mod = 1000000007
    dp = [[0]*(2*n*n+1) for _ in range