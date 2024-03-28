def solve():
    n = int(input())
    ans = 0
    # 25 cents
    ans += n // 25
    n %= 25
    # 10 cents
    ans += n // 10
    n %= 10
    # 5 cents
    ans += n // 5
    n %= 5
    # 1 cent
    ans += n
    print(ans)

if __name__ == "__main__":
    solve()