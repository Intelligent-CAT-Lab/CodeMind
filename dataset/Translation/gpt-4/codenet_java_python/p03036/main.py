import sys

class BAlgae:
    def solve(self, testNumber, r, d, x):
        for i in range(10):
            x = r * x - d
            print(x)

if __name__ == "__main__":
    r, d, x = map(int, sys.stdin.readline().split())
    solver = BAlgae()
    solver.solve(1, r, d, x)