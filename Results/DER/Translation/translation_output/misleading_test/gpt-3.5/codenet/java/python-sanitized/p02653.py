class CRangeSet:
    def __init__(self):
        self.mod = 10**9 + 7
        self.a = 0
        self.b = 0
        self.f = []

    def solve(self, n, a, b):
        self.a = max(a, b)
        self.b = min(a, b)

        self.f = [-1] * self.a

        dp = [[[0, 0] for _ in range(self.a)] for _ in range(n + 1)]
        dp[0][0][0] = 1
        dp[0][0][1] = 1

        for i in range(1, n + 1):
            sum_val = [0, 0]
            for j in range(self.a):
                lend = 1 if j == i - 1 else 0
                sum_val[0] = (sum_val[0] + dp[i - 1][j][0] * self.f[j - 2 + lend]) % self.mod
            for j in range(self.b):
                sum_val[1] = (sum_val[1] + dp[i - 1][j][1]) % self.mod

            for k in range(1, self.a):
                if k == 1:
                    dp[i][k][0] = sum_val[1]
                else:
                    dp[i][k][0] = dp[i - 1][k - 1][0]
            
            for k in range(1, self.b):
                if k == 1:
                    dp[i][k][1] = sum_val[0]
                else:
                    dp[i][k][1] = dp[i - 1][k - 1][1]

        sum_total = [0, 0]
        for j in range(self.a):
            sum_total[0] = (sum_total[0] + dp[n][j][0] * self.f[j - 1]) % self.mod
        for j in range(self.b):
            sum_total[1] = (sum_total[1] + dp[n][j][1]) % self.mod

        invalid = (sum_total[0] + sum_total[1]) % self.mod
        total = pow(2, n, self.mod)
        valid = (total - invalid) % self.mod

        return valid

    def f(self, i):
        if i <= 0:
            return 1
        if self.f[i] == -1:
            self.f[i] = self.f(i - 1)
            for t in range(self.b, i + 1):
                self.f[i] = (self.f[i] + self.f(i - t - 1)) % self.mod
        return self.f[i]


# Test case
crange_set = CRangeSet()
result = crange_set.solve(4, 2, 3)
print(result)