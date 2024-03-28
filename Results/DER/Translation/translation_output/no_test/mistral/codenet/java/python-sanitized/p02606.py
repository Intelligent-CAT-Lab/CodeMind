import sys

class p02606:
    def __init__(self):
        self.L = int(input())
        self.R = int(input())
        self.d = int(input())
        self.Ans = 0
        for i in range(self.L, self.R+1):
            if i % self.d == 0:
                self.Ans += 1
        print(self.Ans)

if __name__ == "__main__":
    p02606()