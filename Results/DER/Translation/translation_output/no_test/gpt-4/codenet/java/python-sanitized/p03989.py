import copy
from typing import List

MOD = 924844033

def solve(n: int, K: int):
    dp = [[[0 for _ in range(n+1)] for _ in range(2)] for _ in range(n+1)]
    dp[0][0][0] = 1
    for i in range(n):
        for j in range(n):
            if dp[i][0][j] == 0 and dp[i][0][j] == 1:
                continue
            #