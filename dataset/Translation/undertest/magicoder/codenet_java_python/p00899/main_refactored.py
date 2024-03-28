class main:
    import sys
    import re
    
    def solve(N, str):
        eq = [False] * N
        str2 = []
        for i in range(N):
            if eq[i]:
                continue
            for j in range(N):
                if i != j and not eq[j] and re.search(str[j], str[i]):
                    eq[j] = True
        for i in range(N):
            if not eq[i]:
                str2.append(str[i])
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
                len[i][j] = len(str2[j]) - (l - offset)
    
        dp = [[float('inf')] * N2 for _ in range(1 << N2)]
        for i in range(N2):
            dp[1 << i][i] = len(str2[i])
        for i in range(1 << N2):
            for j in range(N2):
                if dp[i][j] == float('inf'):
                    continue
                for k in range(N2):
                    if (i & (1 << k)) > 0:
                        continue
                    newIdx = i | (1 << k)
                    dp[newIdx][k] = min(dp[newIdx][k], dp[i][j] + len[j][k])
    
        ans = float('inf')
        tmp = (1 << N2) - 1
        for i in range(N2):
            ans = min(ans, dp[tmp][i])
        return ans
    
    def main():
        N = int(sys.stdin.readline())
        str = [sys.stdin.readline().strip() for _ in range(N)]
        print(solve(N, str))
    
    if __name__ == "__main__":
        main()