MOD = 1000000007

def main():
    n, m = map(int, input().split())
    res = m
    ans = 1
    i = 2
    while i * i <= res:
        if res % i == 0:
            cnt = 0
            while res % i == 0:
                cnt += 1
                res //= i
            ans *= calc_comb(cnt + n - 1, n - 1)
            ans %= MOD
        i += 1

    if res != 1:
        ans *= calc_comb(n, 1)
        ans %= MOD
    
    print(ans)

def calc_comb(n, k):
    if k > n - k:
        return calc_comb(n, n - k)
    
    ans_mul = 1
    ans_div = 1
    for i in range(k):
        ans_mul *= n - i
        ans_div *= i + 1
        ans_mul %= MOD
        ans_div %= MOD
    
    ans = (ans_mul * pow_func(ans_div, MOD - 2)) % MOD
    return ans

def pow_func(x, n):
    ans = 1
    while n > 0:
        if n & 1:
            ans = (ans * x) % MOD
        x = (x * x) % MOD
        n >>= 1
    return ans

if __name__ == "__main__":
    main()