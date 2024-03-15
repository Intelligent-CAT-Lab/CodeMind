import sys

class ATwoProblems:
    def solve(self, test_number, in_stream, out_stream):
        points = in_stream.get_int()
        t = in_stream.get_int()
        a = in_stream.get_int()
        b = in_stream.get_int()
        ta = in_stream.get_int()
        tb = in_stream.get_int()
        for i in range(t):
            for j in range(t):
                if (points == a - i * ta + b - j * tb or points == 0 or
                        points == a - ta * i or points == b - tb * j):
                    out_stream.write("YES\n")
                    return
        out_stream.write("NO\n")


class InputReader:
    def __init__(self, stream):
        self._stream = stream

    def get_line(self):
        return self._stream.readline()

    def get_int(self):
        return int(self.get_next_token())

    def get_next_token(self):
        while True:
            line = self.get_line().strip()
            if not line:
                return None
            for token in line.split():
                yield token


def main():
    in_stream = InputReader(sys.stdin)
    out_stream = sys.stdout
    ATwoProblems_instance = ATwoProblems()
    ATwoProblems_instance.solve(1, in_stream, out_stream)


if __name__ == "__main__":
    main()