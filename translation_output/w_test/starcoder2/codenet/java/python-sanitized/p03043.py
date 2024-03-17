import sys

def calc(n, st):
    ans = 1
    val = st
    while val < n:
        val *= 2
        ans *= 2
    return ans

def main():
    N, K = map(int, sys.stdin.readline().split())
    ans = 0
    for i in range(1, N+1):
        cnt = calc(K, i)
        wk =