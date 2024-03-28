import sys

class p01637:
    def __init__(self):
        self.M = int(sys.stdin.readline())
        self.rD, self.rR = map(int, sys.stdin.readline().split())
        self.cD, self.cR = map(int, sys.stdin.readline().split())

    def solve(self):
        max_jpn = -1
        D0 = (100*self.cD+self.rD-1)//self.rD
        C0 = (100*self.cR+self.rR-1)//self.rR
        for i in range(100):
            for j in range(100):
                change_D = D0 + i
                change_R = C0 + j
                jpn = self.M - change_D - change_R
                if jpn < 0:
                    continue
                rem_D = change_D*self.rD//100 - self.cD
                rem_R = change_R*self.rR//100 - self.cR
                jpn += rem_D*100//self.rD + rem_R*100//self.rR
                max_jpn = max(max_jpn, jpn)
        print(max_jpn)

if __name__ == "__main__":
    p01637().solve()