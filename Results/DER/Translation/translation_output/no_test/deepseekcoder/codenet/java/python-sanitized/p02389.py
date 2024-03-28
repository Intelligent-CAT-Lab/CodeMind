import sys

class InputReader:
    def __init__(self, stream):
        self.stream = stream
        self.buffer = []

    def next(self):
        if not self.buffer:
            self.buffer = self.stream.readline().split()
        return self.buffer.pop(0)

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return long(self.next())

    def next_double(self):
        return float(self.next())


class Solution:
    def solve(self):
        a = inp.next_int()
        b = inp.next_int()
        print(a*b, 2*a + 2*b)


inp = InputReader(sys.stdin)
solver = Solution()
solver.solve()