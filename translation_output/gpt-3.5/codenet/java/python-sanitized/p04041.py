import sys
import math

class P04041:
    MOD = 1000000007
    inf = sys.maxsize // 2

    def solve(self):
        n = self.ni()
        x = self.ni()
        y = self.ni()
        z = self.ni()
        sum_val = x + y + z + 1
        mask = (1 << sum_val) - 1
        dp = [[0] * (mask + 1) for _ in range(n + 1)]
        ng = 0
        ng |= 1 << z
        ng |= 1 << (y + z)
        ng |= 1 << (x + y + z)
        dp[0][1] = 1
        
        for i in range(n):
            for state in range(mask + 1):
                for j in range(1, 11):
                    res = ((state << j) & mask) + 1
                    if (res & ng) == ng:
                        continue
                    dp[i + 1][res] += dp[i][state]
                    dp[i + 1][res] %= self.MOD

        ans = 1
        for i in range(n):
            ans *= 10
            ans %= self.MOD

        for i in range(mask + 1):
            ans -= dp[n][i]
            ans %= self.MOD
        
        print((ans + self.MOD) % self.MOD)

    def ni(self):
        return int(input())

    def run(self):
        self.solve()

if __name__ == "__main__":
    p = P04041()
    p.run()