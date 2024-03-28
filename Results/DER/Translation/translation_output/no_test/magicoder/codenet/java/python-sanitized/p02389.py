import sys

class InputReader:
    def __init__(self):
        self.br = sys.stdin

    def next_int(self):
        return int(self.br.readline())

    def next_long(self):
        return long(self.br.readline())

    def next_string(self):
        return self.br.readline().strip()

    def next_double(self):
        return float(self.br.readline())

class Solution:
    def solve(self):
        inp = InputReader()
        a = inp.next_int()
        b = inp.next_int()
        print(a*b, 2*a+2*b)

if __name__ == "__main__":
    solver = Solution()
    solver.solve()