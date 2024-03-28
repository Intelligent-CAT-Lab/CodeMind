class main:
    n = int(input())
    ans = n
    for a in range(2, n//2+1):
        b = n - a
        sum = 0
        while a > 0:
            sum += a % 10
            a //= 10
        while b > 0:
            sum += b % 10
            b //= 10
        ans = min(sum, ans)
    print(ans)