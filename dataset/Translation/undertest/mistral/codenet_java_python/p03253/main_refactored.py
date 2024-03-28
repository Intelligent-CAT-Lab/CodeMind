class main:
    import sys
    
    def calcComb(n, k):
        if k > n - k:
            return calcComb(n, n - k)
        ansMul = 1
        ansDiv = 1
        for i in range(k):
            ansMul *= (n - i)
            ansDiv *= (i + 1)
            ansMul %= 1000000007
            ansDiv %= 1000000007
        ans = ansMul * pow(ansDiv, 1000000006)
        ans %= 1000000007
        return ans
    
    def pow(x, n):
        ans = 1
        while n > 0:
            if (n & 1) == 1:
                ans = ans * x % 1000000007
            x = x * x % 1000000007
            n >>= 1
        return ans
    
    n, m = map(int, sys.stdin.readline().strip().split())
    res = m
    ans = 1
    for i in range(2, int(res ** 0.5) + 1):
        cnt = 0
        while res % i == 0:
            cnt += 1
            res //= i
        ans *= calcComb(cnt + n - 1, n - 1)
        ans %= 1000000007
    if res != 1:
        ans *= calcComb(n, 1)
        ans %= 1000000007
    print(ans)