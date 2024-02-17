from fractions import gcd
MOD = 10**9 + 7
H, W, T = map(int, input().split())
ga, gb = gcd(H, T), gcd(W, T)
H //= ga
W //= gb
ans = (pow(2, H, MOD) + pow(2, W, MOD) - 1 + pow(2, gcd(H, W)) - 2) % MOD
print(pow(ans, ga*gb, MOD))
