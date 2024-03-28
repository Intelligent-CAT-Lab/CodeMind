from itertools import combinations_with_replacement

class TaskF:
    mod = 1000000007
    n = 0
    comb = []
    dp = []
    pp = set()
    
    @staticmethod
    def get_comb(sz, mod):
        comb = [[0 for _ in range(sz)] for _ in range(sz)]
        for i in range(sz):
            comb[i][0] = 1
            for j in range(1, i+1):
                comb[i][j] = comb[i-1][j] + comb[i-1][j-1]
                if comb[i][j] >= mod:
                    comb[i][j] -= mod
        return comb
    
    @staticmethod
    def deep_fill(x, val):
        for y in x:
            if isinstance(y, list):
                TaskF.deep_fill(y, val)
            else:
                y = val
    
    def solve(self, testNumber, in_stream, out_stream):
        TaskF.n = int(in_stream())
        ps = []
        for i in range(TaskF.n):
            p = TaskF.Point()
            p.coeff[i] = 1
            ps.append(p)
        self.pp = set()
        TaskF.comb = TaskF.get_comb(TaskF.n + 10, TaskF.mod)
        self.dp = [[-1 for _ in range(101)] for _ in range(TaskF.n + 10)]
        TaskF.deep_fill(self.dp, -1)
        out_stream.write(f"{(TaskF.n * (self.dfs(TaskF.n - 1, 0) + self.dfs(TaskF.n - 1, 1))) % TaskF.mod}\n")
    
    def dfs(self, left, excess):
        if self.dp[left][excess] != -1:
            return self.dp[left][excess]
        if left == 0:
            return 1 if excess == 0 else 0
        ret = 0
        for pos in range(left+1):
            for neg in range(left - pos + 1):
                if pos + neg == 0: 
                    continue
                take = pos + neg
                if excess > take + 1:
                    continue
                t = abs(excess + pos - neg)
                if t % 2 != 0:
                    continue
                ret = (ret + self.dfs(left - pos - neg, t // 2) * TaskF.comb[left][pos] % TaskF.mod * TaskF.comb[left - pos][neg]) % TaskF.mod
        self.dp[left][excess] = ret % TaskF.mod
        return self.dp[left][excess]

    class Point:
        coeff = []
        
        def __init__(self):
            self.coeff = [0 for _ in range(TaskF.n)]
        
        def __eq__(self, other):
            if not isinstance(other, TaskF.Point):
                return False
            return self.coeff == other.coeff
        
        def __hash__(self):
            return hash(tuple(self.coeff))
        
        def __str__(self):
            return f"Point{{coeff={self.coeff}}}"

def main():
    solver = TaskF()
    inf = input
    outf = print
    solver.solve(1, inf, outf)

if __name__ == "__main__":
    main()