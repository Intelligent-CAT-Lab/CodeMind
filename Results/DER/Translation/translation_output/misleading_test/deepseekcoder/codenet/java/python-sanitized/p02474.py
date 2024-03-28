import sys

def solve(A, B):
    return (A * B) % (10**9 + 7)

if __name__ == "__main__":
    A, B = map(int, sys.stdin.readline().split())
    print(solve(A, B))