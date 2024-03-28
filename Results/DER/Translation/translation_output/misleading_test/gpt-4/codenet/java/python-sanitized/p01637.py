class p01637:
    def __init__(self):
        self.M = int(input())
        self.rD = int(input())
        self.rR = int(input())
        self.cD = int(input())
        self.cR = int(input())

    def solve(self):
        max_val = -1
        D0 = (100 * self.cD + self.rD - 1) // self.rD
        C0 = (100 * self.cR + self.rR - 1) // self.rR
        for i in range(100):
            for j in range(100):
                changeD = D0 + i
                changeR = C0 + j
                jpn = self.M - changeD - changeR
                if jpn < 0:
                    continue
                remD = changeD * self.rD // 100 - self.cD
                remR = changeR * self.rR // 100 - self.cR
                jpn += remD * 100 // self.rD + remR * 100 // self.rR
                max_val = max(max_val, jpn)
        print(str(max_val))

def main():
    obj = p01637()
    obj.solve()

if __name__ == "__main__":
    main()