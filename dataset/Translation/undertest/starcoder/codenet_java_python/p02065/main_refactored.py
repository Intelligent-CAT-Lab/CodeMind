class main:
    import sys
    
    def solve(N, K, M):
        if N < K:
            return 1
        dp = [[[0] * (1 << K) for _ in range(K + 1)] for _ in range(2)]
        for i in range(1 << K):
            c = 0
            ok = True
            for j in range(K):
                if (i & (1 << (K - 1 - j))) == 0:
                    c -= 1
                else:
                    c += 1
                if c < 0:
                    ok = False
                    break
            if not ok: continue
            u = bin(i).count('1')
            l = K - u
            if u < l: continue
            dp[0][u - l][i] = 1
        t = 1
        for i in range(K, 2 * N):
            for a in dp[t]:
                a[:] = [0] * (1 << K)
            for j in range(i % 2, K + 1, 2):
                l = (i - j) // 2
                u = l + j
                for k in range(1 << K):
                    uc = bin(k).count('1')
                    if 0 < j and j <= uc and (l == 0 or k!= (1 << K) - 1): # put lower row
                        dp[t][j - 1][(k << 1) & (1 << K) - 1] += dp[1 - t][j][k]
                        dp[t][j - 1][(k << 1) & (1 << K) - 1] %= M
                    if u < N and j < K and k!= 0: # put upper row
                        dp[t][j + 1][((k << 1) + 1) & (1 << K) - 1] += dp[1 - t][j][k]
                        dp[t][j + 1][((k << 1) + 1) & (1 << K) - 1] %= M
            t = 1 - t
        ans = 0
        for v in dp[1 - t][0]:
            ans += v
        return ans % M
    
    def main():
        N, K, M = map(int, sys.stdin.readline().strip().split())
        print(solve(N, K, M))
    
    if __name__ == '__main__':
        main()