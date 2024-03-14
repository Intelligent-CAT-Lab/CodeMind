import sys

class ATwoCoins:
    def solve(self, testNumber):
        a, b, c = map(int, sys.stdin.readline().split())
        print("Yes" if a + b >= c else "No")

if __name__ == "__main__":
    solver = ATwoCoins()
    solver.solve(1)