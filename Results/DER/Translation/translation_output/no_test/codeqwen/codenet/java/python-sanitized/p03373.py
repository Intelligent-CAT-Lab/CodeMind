import sys

class p03373:

    def solve(self):
        a = int(sys.stdin.readline())
        b = int(sys.stdin.readline())
        c = int(sys.stdin.readline())
        x = int(sys.stdin.readline())
        y = int(sys.stdin.readline())

        min_val = float('inf')
        for i in range(max(x, y) + 1):
            tmp = a * max(0, x - i) + b * max(0, y - i) + c * i * 2
            min_val = min(min_val, tmp)

        print(min_val)

    def main(self):
        self.solve()

p03373().main()