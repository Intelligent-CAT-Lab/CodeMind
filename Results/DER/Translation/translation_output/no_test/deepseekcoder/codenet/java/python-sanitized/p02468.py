import sys

class InputReader:
    def __init__(self, input_stream = sys.stdin):
        self.input_stream = input_stream
        self.tokens = None

    def next_string(self):
        while True:
            if not self.tokens:
                self.tokens = self.input_stream.readline().split()
            if self.tokens:
                return self.tokens.pop(0)

    def next_int(self):
        return int(self.next_string())

    def next_long(self):
        return long(self.next_string())

    def next_double(self):
        return float(self.next_string())

    def next_int_array(self, n):
        return [self.next_int() for _ in range(n)]

    def next_long_array(self, n):
        return [self.next_long() for _ in range(n)]


class TaskX:
    def solve(self, test_number, in_reader, out_writer):
        m = in_reader.next_int()
        n = in_reader.next_int()
        out_writer.write(str(self.power(m, n, 1000000007)) + '\n')

    @staticmethod
    def power(a, e, mod):
        ret = 1
        for _ in range(e):
            if e % 2 != 0:
                ret = (ret * a) % mod
            a = (a * a) % mod
        return ret


def main():
    input_reader = InputReader()
    out_writer = sys.stdout
    TaskX().solve(1, input_reader, out_writer)
    out_writer.close()


if __name__ == '__main__':
    main()