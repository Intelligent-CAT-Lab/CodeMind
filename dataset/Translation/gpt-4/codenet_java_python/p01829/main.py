import sys
from itertools import permutations

class p01829:
    def __init__(self):
        self.S = None
        self.use = [False] * 10
        self.minDiff = float('inf')
        self.ansStr = ""
        self.startStr = ""

    def dfs(self, n):
        if n == len(self.ch):
            self.ansStr = self.startStr
            return

        if n == 0:
            digit = (int(self.ch[n]) + 5) % 10
            self.use[digit] = True
            self.startStr += str(digit)
            self.dfs(n + 1)
            return

        if not self.use[int(self.ch[n])]:
            self.dfs2(n, "")
            self.use[int(self.ch[n])] = True
            self.startStr += self.ch[n]
            self.dfs(n + 1)
            return
        self.dfs2(n, "")

    def dfs2(self, n, s):
        if n == len(self.ch):
            a = int(self.S[len(self.startStr):])
            b = int(s)
            diff = abs(a - b)
            if self.minDiff > diff:
                self.ansStr = self.startStr + s
                self.minDiff = diff
            return

        for i in range(10):
            if self.use[i]:
                continue
            self.use[i] = True
            self.dfs2(n + 1, s + str(i))
            self.use[i] = False

    def solve(self):
        self.S = next(sys.stdin).strip()
        self.ch = list(self.S)
        self.startStr = ""
        self.ansStr = ""
        self.dfs(0)
        print(self.ansStr)

def main():
    p = p01829()
    p.solve()

if __name__ == "__main__":
    main()