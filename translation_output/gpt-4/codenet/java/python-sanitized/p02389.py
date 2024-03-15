import sys

class InputReader:
    def __init__(self, stream):
        self.generator = self._token_generator(stream)

    def _token_generator(self, stream):
        for line in stream:
            for token in line.split():
                yield token
        self.stream.close()

    def next_int(self):
        return int(next(self.generator))

    def next_long(self):
        return int(next(self.generator))  # Assuming long can be handled by Python's int

    def next(self):
        return next(self.generator)

    def next_double(self):
        return float(next(self.generator))

class Solution:
    def solve(self, in_reader):
        a = in_reader.next_int()
        b = in_reader.next_int()
        sys.stdout.write(f"{a * b} {2 * a + 2 * b}\n")

if __name__ == "__main__":
    in_reader = InputReader(sys.stdin)
    solution = Solution()
    solution.solve(in_reader)