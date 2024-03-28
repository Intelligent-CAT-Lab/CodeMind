class main:
    import sys
    from itertools import combinations
    
    def solve():
        N = int(sys.stdin.readline().strip())
        if N == 0:
            return
        strs = [sys.stdin.readline().strip() for _ in range(N)]
        eq = [False]*N
        for i, j in combinations(range(N), 2):
            if strs[i] in strs[j]:
                eq[j] = True
        strs = [s for i, s in enumerate(strs) if not eq[i]]
        N2 = len(strs)
        len_table = [[0]*N2 for _ in range(N2)]
        for i, j in combinations(range(N2), 2):
            offset = 0
            l = len(strs[i])
            while True:
                if strs[j].startswith(strs[i][offset:]):
                    len_table[i][j] = len(strs[j]) - (l - offset)
                    break
                offset += 1
        dp = [[float('inf')]*N2 for _ in range(1 << N2)]
        for i in range(N2):
            dp[1 << i][i] = len(strs[i])
        for i in range(1 << N2):
            for j in range(N2):
                if dp[i][j] == float('inf'):
                    continue
                for k in range(N2):
                    if (i & (1 << k)) > 0:
                        continue
                    new_idx = i | (1 << k)
                    dp[new_idx][k] = min(dp[new_idx][k], dp[i][j] + len_table[j][k])
        ans = min(dp[(1 << N2) - 1])
        print(ans)
    
    def main():
        while True:
            solve()
            if sys.stdin.readline().strip() == '0':
                break
    
    if __name__ == "__main__":
        main()