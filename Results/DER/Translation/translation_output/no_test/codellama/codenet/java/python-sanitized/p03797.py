import sys

N, M = map(int, sys.stdin.readline().split())
sum = 0

if N * 2 > M:
    sum = M // 2
elif M > N * 2:
    sum = N
    sum += (M - N * 2) // 4

print(sum)