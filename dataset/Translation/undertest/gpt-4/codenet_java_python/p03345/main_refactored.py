class main:
    a, b, c, k = map(int, input().split())
    ans = a - b
    if abs(ans) > pow(10, 18):
        print("Unfair")
    else:
        print(ans if k % 2 == 0 else -ans)