MOD = 1000000007

def main():
    n, m = map(int, input().split())
    res = m
    ans = 1
    for i in range(2, int(res ** 0.5) + 1):
        cnt = 0
        while res % i == 0:
            cnt += 1
            res //= i
        ans *= calcComb(cnt + n - 1, n - 1)
        ans %= MOD
    if res != 1:
        ans *= calcComb(n, 1)
        ans %= MOD
    print(ans)

def calcComb(n, k):
    if k > n - k:
        return calcComb(n, n - k)
    ansMul = 1
    ansDiv = 1
    for i in range(k):
        ansMul *= n - i
        ansDiv *= i + 1
        ansMul %= MOD
        ansDiv %= MOD
    ans = ansMul * pow_mod(ansDiv, MOD - 2)
    ans %= MOD
    return ans

def pow_mod(x, n):
    ans = 1
    while n > 0:
        if (n & 1) == 1:
            ans = ans * x % MOD
        x = x * x % MOD
        n >>= 1
    return ans

if __name__ == "__main__":
    main()