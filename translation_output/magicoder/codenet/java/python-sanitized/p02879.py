import sys

class p02879:
    def __init__(self):
        self.A = 0
        self.B = 0

    def solve(self):
        self.A, self.B = map(int, sys.stdin.readline().split())
        if 9 < self.A or 9 < self.B:
            print(-1)
            return
        print(self.A * self.B)

if __name__ == "__main__":
    main = p02879()
    main.solve()