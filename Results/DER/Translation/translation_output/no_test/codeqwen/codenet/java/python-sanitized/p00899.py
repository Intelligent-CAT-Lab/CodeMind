import sys
import re

N = int(sys.stdin.readline())
while N != 0:
    str_list = [sys.stdin.readline().strip() for _ in range(N)]
    
    eq = [False] * N
    for i in range(N):
        if eq[i]:
            continue
        for j in range(N):
            if i != j and not eq[j] and re.match(f".*?{str_list[j]}.*?", str_list[i]):
                eq[j] = True
    str_list = [s for i, s in enumerate(str_list) if not eq[i]]
    N2 = len(str_list)
    
    len_matrix = [[0] * N2 for _ in range(N2)]
    for i in range(N2):
        for j in range(N2):
            if i == j:
                continue
            offset = 0
            l = len(str_list[i])
            while offset < l:
                if str_list[j].startswith(str_list[i][offset:]):
                    break
                offset += 1
            len_matrix[i][j] = len(str_list[j]) - (l - offset)
    
    dp = [[sys.maxsize] * N2 for _ in range(1 << N2)]
    for i in range(1 << N2):
        for j in range(N2):
            if dp[i][j] == sys.maxsize:
                continue
            for k in range(N2):
                if (i & (1 << k)) > 0:
                    continue
                new_idx = i | (1 << k)
                dp[new_idx][k] = min(dp[new_idx][k], dp[i][j] + len_matrix[j][k])
    
    ans = sys.maxsize
    for i in range(N2):
        ans = min(ans, dp[(1 << N2) - 1