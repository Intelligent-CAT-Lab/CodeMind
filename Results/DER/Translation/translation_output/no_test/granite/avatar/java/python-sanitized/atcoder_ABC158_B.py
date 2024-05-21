import sys

N, A, B = map(int, sys.stdin.readline().split())
base = N // (A + B)
mod = N % (A + B)
if mod >= A:
    mod = A
print(base * A + mod)