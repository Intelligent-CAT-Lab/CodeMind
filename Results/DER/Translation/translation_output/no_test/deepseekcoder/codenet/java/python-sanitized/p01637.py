import sys

class p01637:
    def __init__(self):
        self.sc = sys.stdin

    def run(self):
        self.M = int(self.sc.readline())
        self.rD = int(self.sc.readline())
        self.rR = int(self.sc.readline())
        self.cD = int(self.sc.readline())
        self.cR = int(self.sc.readline())
        self.solve()

    def solve(self):
        max_val = -1
        D0 = (100*self.cD+self.rD-1)//self.rD
        R0 = (100*self.cR+self.rR-1)//self.rR
        for i in range(100):
            for j in range(100):
                changeD = D0 + i
                changeR = R0 + j
                jpn = self.M - changeD - changeR
                if jpn < 0:
                    continue
                remD = changeD*self.rD//100 - self.cD
                remR = changeR*self.rR//100 - self.cR
                jpn += remD*100//self.rD + remR*100//self.rR
                max_val = max(max_val, jpn)
        self.println(str(max_val))

    def println(self, s):
        print(s)

if __name__ == "__main__":
    p01637().run()