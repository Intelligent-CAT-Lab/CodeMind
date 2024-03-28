class main:
    import sys
    
    def solve(N, str):
        eq = [False] * N
        for i in range(N):
            if eq[i]:
                continue
            for j in range(N):
                if i != j and not eq[j]:
                    if str[i].find(str[j]) != -1:
                        eq[j] = True
        str2 = [s for s in str if not eq[str.index(s)]]
        N2 = len(str2)
    
        len = [[0] * N2 for _ in range(N2)]
        for i in range(N2):
            for j in range(N2):
                if i == j:
                    continue
                offset = 0
                l = len(str2[i])
                for offset in range(l):
                    if str2[j].startswith(str2[i][offset:]):
                        break
                len[i][j] = len(str2[j]) - l + offset
    
        dp = [[sys.maxsize] * N2 for _ in range(1 << N2)]
        for i in range(1 << N2):
            for j in range(N2):
                dp[i][j] = sys.maxsize
        for i in range(N2):
            dp[1 << i][i] = len(str2[i])
    
        for i in range(1 << N2):
            for j in range(N2):
                if dp[i][j] >= sys.maxsize:
                    continue
                for k in range(N2):
                    if (i & (1 << k)) > 0:
                        continue
                    new_idx = i | (1 << k)
                    dp[new_idx][k] = min(dp[new_idx][k], dp[i][j] + len[j][k])
    
        ans = sys.maxsize
        for i in range(N2):
            ans = min(ans, dp[(1 << N2) - 1][i])
    
        return ans
    
    
    if __name__ == "__main__":
        N = int(input())
        str = [input() for _ in range(N)]
        print(solve(N, str))