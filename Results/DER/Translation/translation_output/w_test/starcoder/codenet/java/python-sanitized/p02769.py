import sys

def nCr(n, r):
    f = [1] * (n + 1)
    for i in range(1, n + 1):
        f[i] = f[i - 1] * i % 1000000007
    inv = [0] * (n + 1)
    inv[n] = pow(f[n], 1000000007 - 2, 1000000007)
    for i in range(n, 0, -1):
        inv[i - 1] = inv[i] * i % 1000000007
    return f[n] * inv[r] * inv[n - r] % 1000000007

def main():
    input = sys.stdin.readline
    MOD = 1000000007
    n, k = map(int, input().split())
    if k >= n:
        print(nCr(n + n - 1, n - 1) % MOD)
    else:
        ans = 0
        for i in range(k + 1):
            up = nCr(n, i) * nCr(n - 1, k - i) % MOD
            den1 = pow(i, MOD - 2, MOD)
            den2 = pow(n - i, MOD - 2, MOD)
            den = den1 * den2 % MOD
            ans += up * den % MOD
        print(ans % MOD)

if __name__ == '__main__':
    main()