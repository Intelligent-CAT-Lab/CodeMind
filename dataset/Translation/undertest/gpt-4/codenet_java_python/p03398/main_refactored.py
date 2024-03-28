class main:
    from typing import List
    from collections import defaultdict
    
    class TaskF:
        mod = 1000000007
        n = 0
        comb = []
        dp = []
        pp = set()
    
        def solve(self, testNumber: int, n: int):
            TaskF.n = n
            ps = [{"coeff": [1 if i == j else 0 for j in range(n)]} for i in range(n)]
            self.pp = set()
            TaskF.comb = self.get_comb(n + 10, self.mod)
            self.dp = [[-1 for _ in range(101)] for _ in range(n + 10)]
            result = (n * (self.dfs(n - 1, 0) + self.dfs(n - 1, 1))) % self.mod
            print(result)
    
        def dfs(self, left: int, excess: int):
            if self.dp[left][excess] != -1:
                return self.dp[left][excess]
            if left == 0:
                return 1 if excess == 0 else 0
            ret = 0
            for pos in range(left + 1):
                for neg in range(left - pos + 1):
                    if pos + neg == 0:
                        continue
                    take = pos + neg
                    if excess > take + 1:
                        continue
                    t = abs(excess + pos - neg)
                    if t % 2 != 0:
                        continue
                    ret += (self.dfs(left - pos - neg, t // 2) * self.comb[left][pos] % self.mod * self.comb[left - pos][neg]) % self.mod
                    ret %= self.mod
            self.dp[left][excess] = ret % self.mod
            return self.dp[left][excess]
    
        @staticmethod
        def get_comb(sz: int, mod: int):
            comb = [[0 for _ in range(sz)] for _ in range(sz)]
            for i in range(sz):
                comb[i][0] = 1
                for j in range(1, i + 1):
                    comb[i][j] = comb[i - 1][j] + comb[i - 1][j - 1]
                    if comb[i][j] >= mod:
                        comb[i][j] -= mod
            return comb
    
        @staticmethod
        def deep_fill(x: List, val: int):
            for y in x:
                if isinstance(y, list):
                    TaskF.deep_fill(y, val)
                else:
                    y = val
    
    
    if __name__ == "__main__":
        n = int(input().strip())
        solver = TaskF()
        solver.solve(1, n)