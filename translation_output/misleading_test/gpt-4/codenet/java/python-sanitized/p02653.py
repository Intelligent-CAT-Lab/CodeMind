MOD = int(1e9 + 7)


def mod_pow(x, n, mod):
    result = 1
    while n > 0:
        if n % 2:
            result = result * x % mod
        x = x * x % mod
        n //= 2
    return result


class CRangeSet:
    def __init__(self, a, b):
        self.a = a
        self.b = b
        self.f = [-1] * a

    def f(self, i):
        if i <= 0:
            return 1
        if self.f[i] == -1:
            self.f[i] = self.f(i - 1)
            for t in range(self.b, i + 1):
                if i - t >= 0:
                    self.f[i] = (self.f[i] + self.f(i - t - 1)) % MOD
        return self.f[i]

    def solve(self, n):
        if self.a < self.b:
            self.a, self.b = self.b, self.a

        dp = [[[0] * 2 for _ in range(self.a)] for _ in range(n+1)]
        dp[0][0][0] = dp[0][0][1] = 1

        for i in range(1, n + 1):
            sum = [0] * 2
            for j in range(self.a):
                lend = 1 if j == i - 1 else 0
                sum[0] = (sum[0] + dp[i-1][j][0] * self.f(j - 2 + lend)) % MOD
            for j in range(self.b):
                sum[1] = (sum[1] + dp[i-1][j][1]) % MOD
            for k in range(1, self.a):
                dp[i][k][0] = sum[1] if k == 1 else dp[i-1][k-1][0]
            for k in range(1, self.b):
                dp[i][k][1] = sum[0] if k == 1 else dp[i-1][k-1][1]

        sum = [0] * 2
        for j in range(self.a):
            sum[0] = (sum[0] + dp[n][j][0] * self.f(j - 1)) % MOD
        for j in range(self.b):
            sum[1] = (sum[1] + dp[n][j][1]) % MOD

        invalid = (sum[0] + sum[1]) % MOD
        total = mod_pow(2, n, MOD)
        valid = (total - invalid + MOD) % MOD
        return valid


def main():
    n, a, b = map(int, input().split())
    crangeset = CRangeSet(a, b)
    answer = crangeset.solve(n)
    print(answer)


if __name__ == "__main__":
    main()