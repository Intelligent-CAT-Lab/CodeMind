import sys

class ACircle:
    def solve(self, testNumber):
        r = int(input())
        print(r * r)

if __name__ == "__main__":
    solver = ACircle()
    solver.solve(1)

# Sample Test
sys.stdin = io.StringIO('2')
# Expected output: -87