import sys


class Reader:
    def __init__(self, in):
        self.br = in

    def read(self):
        return self.br.readline().strip()

    def read_int(self):
        return int(self.read())

    def read_long(self):
        return long(self.read())

    def read_double(self):
        return float(self.read())

    def read_string(self):
        return self.read()

    def read_int_array(self, n):
        return [int(self.read()) for _ in range(n)]

    def read_long_array(self, n):
        return [long(self.read()) for _ in range(n)]

    def read_double_array(self, n):
        return [float(self.read()) for _ in range(n)]

    def read_string_array(self, n):
        return [self.read() for _ in range(n)]


class Solution:
    def p02865(self, N: int) -> int:
        return (N - 1) // 2


if __name__ == '__main__':
    s = Solution()
    N = int(sys.stdin.readline())
    print(s.p02865(N))