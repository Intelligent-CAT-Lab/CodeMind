import sys
input = sys.stdin.readline

MOD = 10 ** 9 + 7

def main():
    N, A, B, C = map(int, input().split())
    if B % 2 == 1:
        print(0)
        sys.exit()
    fact = [1] * (N + 1)
    for i in range(1, N + 1):
        fact[i] = fact[i - 1] * i % MOD
    fact_inv = [pow(fact[i], MOD - 2, MOD) for i in range(N + 1)]

    def comb(n, r):
        if n < 0 or r < 0 or r > n:
            return 0
        return fact[n] * fact_inv[r] * fact_inv[n - r] % MOD

    ans = 0
    for x in range(A + 1):
        y = A - x
        z = C - y
        if z < 0:
            break
        if B == 0:
            if z % 3 == 0:
                ans += comb(x + y + z, z // 3) * comb(x + y, x) % MOD
        else:
            for w in range(z // 3 + 1):
                ans += comb(B // 2 - 1, w - 1) * comb(B // 2 - 1, z // 3 - w) % MOD * comb(x + y + z, z // 3 - w) * comb(x + y, x) % MOD
    print(ans % MOD)

if __name__ == '__main__':
    main()