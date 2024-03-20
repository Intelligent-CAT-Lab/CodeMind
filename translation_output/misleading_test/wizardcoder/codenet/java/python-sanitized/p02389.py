import sys

class Solution:
    def solve(self):
        a = int(input())
        b = int(input())
        print(a*b, 2*a+2*b)

class InputReader:
    def __init__(self, stream):
        self.br = sys.stdin if stream == sys.stdin else open(stream, 'r')
        self.st = None

    def close(self):
        if self.br!= sys.stdin:
            self.br.close()

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return long(self.next())

    def next(self):
        if self.st is None:
            self.st = self.br.readline().strip().split()
        return self.st.pop(0)

    def nextDouble(self):
        return float(self.next())

in_ = InputReader(sys.stdin)
out = sys.stdout
solver = Solution()
solver.solve()
in_.close()