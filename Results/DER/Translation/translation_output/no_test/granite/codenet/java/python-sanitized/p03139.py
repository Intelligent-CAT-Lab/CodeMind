import sys

N, A, B = map(int, sys.stdin.readline().split())
print(min(A, B), max(0, A + B - N))