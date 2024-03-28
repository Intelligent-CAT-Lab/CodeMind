class main:
    from sys import stdin 
    import re
    
    def solve():
        N = int(input())
        if N == 0:
            return
    
        str_list = [input() for _ in range(N)]
    
        eq = [False] * N
        for i in range(N):
            if eq[i]:
                continue
            for j in range(N):
                if i != j and not eq[j] and re.match('.*?' + str_list[j] + '.*?', str_list[i]):
                    eq[j] = True
    
        str2 = []
        for i in range(N):
            if not eq[i]:
                str2.append(str_list[i])
        
        N2 = len(str2)
    
        len_arr = [[0] * N2 for _ in range(N2)]
        for i in range(N2):
            for j in range(N2):
                if i == j:
                    continue
                offset = 0
                l = len(str2[i])
                while offset < l:
                    if str2[j].startswith(str2[i][offset:]):
                        break
                    offset += 1
                len_arr[i][j] = len(str2[j]) - (l - offset)
        
        INF = 1 << 29
        dp = [[INF] * N2 for _ in range(1 << N2)]
        
        for i in range(N2):
            dp[1 << i][i] = len(str2[i])
        
        for i in range(1 << N2):
            for j in range(N2):
                if dp[i][j] >= INF:
                    continue
                for k in range(N2):
                    if i & (1 << k) > 0:
                        continue
                    newIdx = i | (1 << k)
                    dp[newIdx][k] = min(dp[newIdx][k], dp[i][j] + len_arr[j][k])
        
        ans = INF
        tmp = (1 << N2) - 1
        for i in range(N2):
            ans = min(ans, dp[tmp][i])
        
        print(ans)
    
    solve()