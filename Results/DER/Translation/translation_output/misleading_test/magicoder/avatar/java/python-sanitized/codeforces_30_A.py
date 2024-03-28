import sys

def solve(A, B, N):
    for x in range(-1000, 1001):
        if pow(x, N) * A == B:
            return x
    return "No solution"

if __name__ == "__main__":
    A, B, N = map(int, sys.stdin.readline().split())
    print(solve(A, B, N))