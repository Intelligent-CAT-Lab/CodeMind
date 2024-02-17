N, K = map(int, input().split())
LARGE = 10 ** 9 + 7

# SQRT
R = 1
while (R + 1) ** 2 < N:
    R += 1

square = False
if (R + 1) ** 2 == N:
    square = True


DP_S = [1] * R
DP_L = [1] * R
N_L = [1] * R
DP_M = 0
L = R
if square:
    DP_M = 1
    L += 1


for i in range(R, 0, -1):
    Q = N // i
    DP_L[i - 1] = Q - L
    N_L[i - 1] = Q - L
    L = Q

for _ in range(K - 1):
    S = 0
    L = sum(DP_L) + DP_M
    SS = sum(DP_S)
    for i in range(R):
        S = (S + DP_S[i]) % LARGE
        DP_S[i] = (L + SS) % LARGE
        L = (L - DP_L[i]) % LARGE
        DP_L[i] = (S * N_L[i]) % LARGE

    if square:
        DP_M = (DP_M + SS) % LARGE

print((sum(DP_L) + sum(DP_S) + DP_M) % LARGE)
