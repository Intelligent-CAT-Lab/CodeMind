import sys

class p01829:
    def __init__(self):
        self.ch = None
        self.S = None
        self.use = [False]*10
        self.minDiff = float('inf')
        self.ansStr = None
        self.startStr = ""

    def dfs(self, n):
        if n == len(self.ch):
            self.ansStr = self.startStr
            return

        if n == 0:
            self.use[(ord(self.ch[n]) - ord('0') + 5) % 10] = True
            self.startStr += str((ord(self.ch[n]) - ord('0') + 5) % 10)
            self.dfs(n + 1)
            return

        if not self.use[ord(self.ch[n]) - ord('0')]:
            self.dfs2(n,"")
            self.use[ord(self.ch[n]) - ord('0')] = True
            self.startStr += self.ch[n]
            self.dfs(n + 1)
            return
        self.dfs2(n,"")

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
            self.dfs2(n + 1,s + str(i))
            self.use[i] = False

    def solve(self):
        self.S = sys.stdin.readline().strip()
        self.ch = list(self.S)
        self.dfs(0)
        print(self.ansStr)

if __name__ == "__main__":
    p01829().solve()