import sys

class p02930:
    def __init__(self):
        self.n = None
        self.ret = None
        self.dfs_left = None
        self.dfs_right = None
        self.dfs_level = None
        self.dfs_ret = None

    def solve(self):
        self.n = int(input())
        self.ret = [[0] * self.n for _ in range(self.n)]
        self.dfs(0, self.n, 1, self.ret)
        for i in range(self.n - 1):
            sb = []
            for j in range(i + 1, self.n):
                sb.append(str(self.ret[i][j]))
            print(" ".join(sb))

    def dfs(self, left, right, level, ret):
        if left + 1 >= right:
            return
        center = (left + right) // 2
        for i in range(left, center):
            for j in range(center, right):
                ret[i][j] = level
                ret[j][j] = level
        self.dfs(left, center, level + 1, ret)
        self.dfs(center, right, level + 1, ret)

    def main(self):
        if len(sys.argv) > 1:
            with open(sys.argv[1], "r") as f:
                self.is = f.read()
        else:
            self.is = sys.stdin.read()
        self.reader = self.is.split("\n")
        self.solve()

    def next(self):
        if self.tokenizer is None or not self.tokenizer:
            self.tokenizer = self.reader.pop(0).split()
        return self.tokenizer.pop(0)

    def nd(self):
        return float(self.next())

    def nl(self):
        return int(self.next())

    def na(self, n):
        return [int(self.next()) for _ in range(n)]

    def ns(self):
        return self.next().strip().encode("utf-8")

    def nal(self, n):
        return [int(self.next()) for _ in range(n)]

    def ntable(self, n, m):
        return [[int(self.next()) for _ in range(m)] for _ in range(n)]

    def nlist(self, n, m):
        return [[int(self.next()) for _ in range(n)] for _ in range(m)]

    def ni(self):
        return int(self.next())

    def tr(self, *o):
        pass

p02930().main()