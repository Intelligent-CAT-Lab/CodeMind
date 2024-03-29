class Task:
    mod = 998244353
    
    def solve(self, input_str):
        cc = list(input_str)
        n = len(cc)
        r = b = 0
        dp = [[0 for _ in range(n + 1)] for _ in range(n + 1)]
        dp[0][0] = 1
        for i in range(n):
            if cc[i] == '0':
                r += 2
            elif cc[i] == '1':
                r += 1
                b += 1
            else:
                b += 2
            for prev_use_red in range(i + 1):
                if prev_use_red + 1 <= r:
                    dp[i + 1][prev_use_red + 1] += dp[i][prev_use_red]
                    dp[i + 1][prev_use_red + 1] %= self.mod
                prev_use_blue = i - prev_use_red
                if prev_use_blue + 1 <= b:
                    dp[i + 1][prev_use_red] += dp[i][prev_use_red]
                    dp[i + 1][prev_use_red] %= self.mod
        combin = [[0 for _ in range(n + 1)] for _ in range(n + 1)]
        for i in range(n + 1):
            combin[i][0] = combin[i][i] = 1
        for i in range(2, n + 1):
            for j in range(1, i):
                combin[i][j] = (combin[i - 1][j - 1] + combin[i - 1][j]) % self.mod
        tto = 0
        for i in range(min(r, n) + 1):
            ways = dp[n][i]
            lr = r - i
            lb = b - (n - i)
            if lb < 0:
                continue
            ways *= combin[n][lr]
            ways %= self.mod
            tto = (tto + ways) % self.mod
        return tto

# Test input
input_str = "02"

task = Task()
output = task.solve(input_str)
print(output)

# Expected output: 51