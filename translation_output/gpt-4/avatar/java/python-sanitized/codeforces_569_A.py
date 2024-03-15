import sys
from io import BufferedReader, StringIO
from typing import Iterator, List

class InputReader:
    def __init__(self, file):
        self.reader = BufferedReader(file)
        self.tokenizer = None

    def _tokenize(self):
        self.tokenizer = self.reader.readline().strip().split()

    def has_next(self):
        if not self.tokenizer:
            self._tokenize()
        while not self.tokenizer:
            self._tokenize()
        return len(self.tokenizer) != 0

    def next(self) -> str:
        while not self.tokenizer or not self.tokenizer:
            self._tokenize()
        return self.tokenizer.pop(0)

    def next_line(self) -> str:
        return self.reader.readline().strip()

    def next_int(self) -> int:
        return int(self.next())

    def next_double(self) -> float:
        return float(self.next())

    def next_long(self) -> int:
        return int(self.next())

    def next_big_int(self) -> int:
        return int(self.next())

    def next_big_decimal(self) -> float:
        return float(self.next())

class TaskA:
    def solve(self, test_number: int, in_reader: InputReader, out_writer: sys.stdout):
        t = in_reader.next_int()
        s = in_reader.next_int()
        q = in_reader.next_int()
        sum = 0
        while s < t:
            s *= q
            sum += 1
        print(sum, file=out_writer)

def main():
    input_stream = sys.stdin
    output_stream = sys.stdout
    in_reader = InputReader(input_stream)
    solver = TaskA()
    solver.solve(1, in_reader, output_stream)

if __name__ == "__main__":
    main()