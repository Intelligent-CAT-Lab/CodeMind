import sys

def solve(N, A, B):
    base = N // (A + B)
    mod = N % (A + B)
    if mod >= A:
        mod = A
    return base * A + mod

if __name__ == "__main__":
    N, A, B = map(int, sys.stdin.readline().split())
    print(solve(N, A, B))