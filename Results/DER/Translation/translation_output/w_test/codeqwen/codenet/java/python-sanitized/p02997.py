class p02997:
    def main(self):
        self.solve()
        self.out.close()

    # ======================================================================
    def solve(self):
        N = self.ni()
        K = self.ni()
        if N == 2:
            if K == 0:
                self.out.write(str(1) + "\n")
                self.out.write("1 2\n")
            else:
                self.out.write(str(-1) + "\n")
            return
        max_ = self.combination(N-1,2)
        if K > max_:
            self.out.write(str(-1) + "\n")
            return
        M = N - 1 + (max_ - K)
        self.out.write(str(M) + "\n")
        for i in range(2, N+1):
            self.out.write(str(1) + " " + str(i) + "\n")
        cnt = max_ - K
        if cnt > 0:
            for i in range(2, N-1+1):
                for j in range(i+1, N+1):
                    self.out.write(str(i) + " " + str(j) + "\n")
                    cnt -= 1
                    if cnt <= 0:
                        return

    # ãã¹ã«ã«ã®ä¸è§å½¢ãä½ã
    dp = []
    def make_comb_dp(self, n):
        self.dp = [[0 for _ in range(n+1)] for _ in range(n+1)]
        for i in range(n+1):
            self.dp[i][0] = 1
            self.dp[i][i] = 1
        for i in range(2, n+1):
            for j in range(1, i):
                self.dp[i][j] = self.dp[i-1][j-1] + self.dp[