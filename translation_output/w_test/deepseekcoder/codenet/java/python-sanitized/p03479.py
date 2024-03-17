import sys

def solve():
    x, y = map(int, sys.stdin.readline().split())
    ans = 0
    for i in range(x, y+1):
        if i & (i-1) == 0:
            ans += 1
    print(ans)

if __name__ == "__main__":
    solve()