import sys

def solve():
    M, D = map(int, input().split())
    ans = 0
    for m in range(1, M+1):
        for d in range(1, D+1):
            d1, d2 = d % 10, d // 10
            if 2 <= d1 and 2 <= d2 and d1 * d2 == m:
                ans += 1
    print(ans)

if __name__ == "__main__":
    solve()