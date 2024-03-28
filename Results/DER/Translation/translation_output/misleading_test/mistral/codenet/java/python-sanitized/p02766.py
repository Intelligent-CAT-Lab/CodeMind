import sys

def solve():
    N, K = map(int, input().split())
    base = 1
    cnt = 0
    while base <= N:
        cnt += 1
        base *= K
    print(cnt)

if __name__ == "__main__":
    solve()