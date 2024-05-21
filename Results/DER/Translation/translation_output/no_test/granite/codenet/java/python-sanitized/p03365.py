import sys

MOD = 1000000007

def comb(n, r):
    if r < 0 or r > n:
        return 0
    r = min(r, n - r)
    return g1[n] * g2[r] * g2[n - r] % MOD

def main():
    readline = sys.stdin.readline
    write = sys.stdout.write

    N = int(readline())
    ans = 0
    g1 = [1, 1]
    g2 = [1, 1]
    inv = [0, 1]

    for i in range(2, N + 1):
        g1.append((g1[-1] * i) % MOD)
        inv.append((-inv[MOD % i] * (MOD // i)) % MOD)
        g2.append((g2[-1] * inv[-1]) % MOD)

    for i in range(1, N):
        ans += comb(N - 2, i - 1) * i % MOD
    write(str(ans % MOD))

if __name__ == '__main__':
    main()