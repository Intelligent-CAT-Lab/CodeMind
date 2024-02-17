import sys
input = sys.stdin.readline

import numpy as np

MOD = 10 ** 9 + 7

N,M = list(map(int,input().split()))

# 1度は赤が0個になるような初期状態だけを考える
# 箱の状態、0個を経由したか否か
dp_T = np.zeros(N+1, dtype=np.int64)
dp_F = np.ones_like(dp_T)
dp_T[0] = 1
dp_F[0] = 0

for _ in range(M):
    prev_T = dp_T
    prev_F = dp_F
    dp_T = np.zeros_like(prev_T)
    dp_F = np.zeros_like(prev_F)
    # 赤赤
    dp_T[0:-1] += prev_T[1:]
    dp_F[1:-1] += prev_F[2:]
    dp_T[0] += prev_F[1]
    # 赤青
    dp_T[1:] += prev_T[1:]
    dp_F[2:] += prev_F[2:]
    dp_T[1] += prev_F[1]
    # 青赤
    dp_T[:-1] += prev_T[:-1]
    dp_F[:-1] += prev_F[:-1]
    # 青青
    dp_T[1:] += prev_T[:-1]
    dp_F[1:] += prev_F[:-1]
    
    dp_T %= MOD
    dp_F %= MOD

answer = dp_T.sum() % MOD
print(answer)