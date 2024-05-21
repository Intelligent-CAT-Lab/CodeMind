import sys

MOD = 1000000007

def power(x, y):
    ans = 1
    while y > 0:
        if y % 2 == 1:
            ans = (ans * x) % MOD
        x = (x * x) % MOD
        y //= 2
    return ans

def main():
    n, m = map(int, input().split())
    fact = [1] * (m + 1)
    inv = [1] * (m + 1)
    for i in range(1, m + 1):
        fact[i] = (fact[i - 1] * i) % MOD
        inv[i] = power(fact[i], MOD - 2)
    ans1 = 1
    for i in range(1, n + 1):
        ans1 = (ans1 * i) % MOD
    ans2 = 0
    pos = 1
    for i in range(1, n + 1):
        prod = (fact[n] * inv[i]) % MOD
        prod = (prod * inv[n - i]) % MOD
        prod = (prod * fact[m - i]) % MOD
        prod = (prod * inv[m - n]) % MOD
        prod = (prod * pos) % MOD
        ans2 = (ans2 + prod) % MOD
        pos = -pos
    ans = (ans1 * ans1) % MOD
    ans = (ans - (ans2 * ans1) % MOD) % MOD
    print(ans)

if __name__ == "__main__":
    main()