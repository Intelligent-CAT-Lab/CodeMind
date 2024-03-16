import sys
import math
from collections import defaultdict

def main():
    # Python uses sys.stdin to read from standard input and sys.stdout for standard output
    sc = Scanner(sys.stdin)
    out = sys.stdout

    n, x, y = sc.nextInt(), sc.nextInt() - 1, sc.nextInt() - 1
    edges = defaultdict(int)

    for i in range(n):
        for j in range(i + 1, n):
            edge = min(j - i, min(abs(x - i) + abs(j - y), abs(y - i) + abs(j - x)) + 1)
            edges[edge] += 1

    for i in range(1, n):
        out.write(str(edges[i]) + '\n')

    out.flush()

class Scanner:
    def __init__(self, in_stream):
        self.br = in_stream
        self.st = None

    def next(self):
        while self.st is None or not self.st:
            self.st = self.br.readline().strip().split()
        return self.st.pop(0)

    def nextLine(self):
        return self.br.readline().strip()

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

    def inArr(self, n):
        arr = list(map(int, self.br.readline().strip().split()))
        return arr

if __name__ == "__main__":
    main()