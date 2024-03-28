import sys

class p02331:
    def __init__(self):
        self.MOD = 1000000007
        self.n = int(sys.stdin.readline())
        self.k = int(sys.stdin.readline())
        self.ans = 1
        for i in range(self.n):
            self.ans = (self.ans * self.k) % self.MOD
        print(self.ans)

if __name__ == '__main__':
    p02331()