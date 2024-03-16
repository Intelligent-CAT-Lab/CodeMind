import sys

class p03373:

    def __init__(self):
        self.sc = sys.stdin
        self.pr = sys.stdout

    def solve(self):
        a = int(self.sc.readline())
        b = int(self.sc.readline())
        c = int(self.sc.readline())
        x = int(self.sc.readline())
        y = int(self.sc.readline())

        min_val = float('inf')
        for i in range(max(x, y) + 1):
            tmp = a * max(0, x - i) + b * max(0, y - i) + c * i * 2
            min_val = min(min_val, tmp)

        self.pr.write(str(min_val) + '\n')

    def main(self):
        self.solve()
        self.pr.flush()

if __name__ == "__main__":
    p03373().main()