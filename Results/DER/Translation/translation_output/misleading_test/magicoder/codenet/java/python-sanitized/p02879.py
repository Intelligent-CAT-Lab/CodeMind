import sys

def solve():
    A, B = map(int, sys.stdin.readline().split())
    if 9 < A or 9 < B:
        print(-1)
        return
    print(A * B)

if __name__ == "__main__":
    solve()