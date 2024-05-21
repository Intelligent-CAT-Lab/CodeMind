import sys

MOD = 1000000007

def main():
    n, k = map(int, input().split())
    fact = [1] * (n + k)
    finv = [1] * (n + k)
    inv = [1] * (n + k)

    for i in range(1, n + k):
        fact[i] = fact[i - 1] * i % MOD
        inv[i] = MOD - inv[MOD % i] * (MOD // i) % MOD
        finv[i] = finv[i - 1] * inv[i] % MOD

    def comb(n, r):
        if n < r:
            return 0
        if n < 0 or r < 0:
            return 0
        return fact[n] * (finv[r] * finv[n - r] % MOD) % MOD

    print(comb(n + k - 1, k))

if __name__ == '__main__':
    input = sys.stdin.readline
    main()