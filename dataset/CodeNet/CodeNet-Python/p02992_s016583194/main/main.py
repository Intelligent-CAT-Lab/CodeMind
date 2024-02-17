from numpy import int_

mod = 10 ** 9 + 7

N, K = list(map(int, input().split()))

M = int(N ** 0.5)

T = [N // i - N // (i + 1) for i in range(1, M + 1)]
A = int_([1] * (N - sum(T)) + T[::-1])

dp = A[:]
for _ in range(K - 1):
    dp = A * dp.cumsum()[::-1] % mod

print((sum(dp) % mod))