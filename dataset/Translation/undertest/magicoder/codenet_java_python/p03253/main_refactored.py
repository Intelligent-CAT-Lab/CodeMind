class main:
    def calc_comb(n, k):
        if k > n - k:
            return calc_comb(n, n - k)
        ans_mul = 1
        ans_div = 1
        for i in range(k):
            ans_mul = (ans_mul * (n - i)) % MOD
            ans_div = (ans_div * (i + 1)) % MOD
        ans = (ans_mul * pow(ans_div, MOD - 2, MOD)) % MOD
        return ans
    
    def pow(x, n, mod):
        ans = 1
        while n > 0:
            if n & 1:
                ans = (ans * x) % mod
            x = (x * x) % mod
            n >>= 1
        return ans
    
    MOD = 1000000007
    n, m = map(int, input().split())
    res = m
    ans = 1
    for i in range(2, int(res**0.5) + 1):
        cnt = 0
        while res % i == 0:
            cnt += 1
            res //= i
        ans = (ans * calc_comb(cnt + n - 1, n - 1)) % MOD
    if res != 1:
        ans = (ans * calc_comb(n, 1)) % MOD
    print(ans)