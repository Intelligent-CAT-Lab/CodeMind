import sys

def solve():
    A = int(input())
    B = int(input())
    if 9 < A or 9 < B:
        print(-1)
        return
    print(A * B)

if __name__ == "__main__":
    solve()