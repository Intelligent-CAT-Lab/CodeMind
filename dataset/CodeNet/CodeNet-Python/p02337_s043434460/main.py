N, K = map(int, input().split())
MOD = 10**9 + 7

D = [[0]*(K+1) for i in range(N+1)]
D[0][0] = 1

# nはn個のボールをいれるのを1から順番に考える
for n in range(1, N+1):
    D0 = D[n-1]
    # kはkこの箱にnこれいた場合の数
    for k in range(1, K+1):
        # 前回D[n-1][k-1]はk-1個の箱にn-1個入れてるので、それにn個めを新しい箱に入れるとD0[k-1]を足すことになる
        # 前回D[n-1][k-1]はk-1個の箱にn-1個入れてて、それぞれにn個めを1個足してくとそのパターンはk*D0[k]個ある
        # 頭ヨ
        D[n][k] = (D0[k-1] + k * D0[k]) % MOD
print(sum(D[N]) % MOD)
