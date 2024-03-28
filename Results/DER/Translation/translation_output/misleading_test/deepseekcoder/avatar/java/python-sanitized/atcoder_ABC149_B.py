import sys

def solve(A, B, K):
    n = A - K

    if A + B <= K:
        return "0 0"
    elif n < 0:
        return "0 " + str(A + B - K)
    else:
        return str(n) + " " + str(B)

A, B, K = map(int, sys.stdin.readline().split())
print(solve(A, B, K))