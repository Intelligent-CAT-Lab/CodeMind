import sys

def solve(N, M):
    sum = 0
    if N * 2 > M:
        sum = M // 2
    elif M > N * 2:
        sum = N
        sum += ((M - N * 2) // 4)
    return sum

N, M = map(int, sys.stdin.readline().split())
print(solve(N, M))