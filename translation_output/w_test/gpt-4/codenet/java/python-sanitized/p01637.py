import math

class P01637:
    def __init__(self):
        self.M = int(input())
        self.rD = int(input())
        self.rR = int(input())
        self.cD = int(input())
        self.cR = int(input())

    def run(self):
        self.solve()

    def solve(self):
        max_value = -1
        D0 = math.ceil((100 * self.cD + self.rD - 1) / self.rD)
        C0 = math.ceil((100 * self.cR + self.rR - 1) / self.rR)
        for i in range(100):
            for j in range(100):
                changeD = D0 + i
                changeR = C0 + j
                jpn = self.M - changeD - changeR
                if jpn < 0:
                    continue
                remD = changeD * self.rD // 100 - self.cD
                remR = changeR * self.rR // 100 - self.cR
                jpn += (remD * 100 // self.rD) + (remR * 100 // self.rR)
                max_value = max(max_value, jpn)
        print(max_value)

if __name__ == '__main__':
    p01637 = P01637()
    p01637.run()