import sys

class InputReader:
    def __init__(self, input_stream = sys.stdin):
        self.input_stream = input_stream
        self.tokens = None

    def next_string(self):
        while True:
            try:
                self.tokens = self.input_stream.readline().split()
                if self.tokens:
                    return self.tokens[0]
            except EOFError:
                raise StopIteration

    def next_int(self):
        return int(self.next_string())

    def next_long(self):
        return long(self.next_string())

    def next_double(self):
        return float(self.next_string())

    def next_int_array(self, n):
        return [self.next_int() for _ in range(n)]

    def next_int_array_dec(self, n):
        return [self.next_int() - 1 for _ in range(n)]

    def next_long_array(self, n):
        return [self.next_long() for _ in range(n)]

    def next_long_array_dec(self, n):
        return [self.next_long() - 1 for _ in range(n)]


class TaskX:
    def __init__(self):
        self.INF = 1 << 30
        self.LINF = 1L << 55
        self.MOD = 1000000007
        self.mh4 = [0, -1, 1, 0]
        self.mw4 = [-1, 0, 0, 1]
        self.mh8 = [-1, -1, -1, 0, 0, 1, 1, 1]
        self