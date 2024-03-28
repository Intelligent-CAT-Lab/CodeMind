class main:
    n, m = map(int, input().split())
    if n == 2 or m == 2:
        print(0)
    else:
        ans = max(1, n - 2) * max(1, m - 2)
        print(ans)