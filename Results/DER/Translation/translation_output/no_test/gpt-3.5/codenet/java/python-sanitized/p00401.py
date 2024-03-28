import sys
import io
import os

class FastScanner:
    def __init__(self, input_stream):
        self.reader = io.StringIO(input_stream)
        self.tokenizer = None

    def next(self):
        if self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            line = self.reader.readline()
            self.tokenizer = line.split()
        return self.tokenizer.pop(0)

    def nextLine(self):
        if self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            line = self.reader.readline()
            return line

        return self.tokenizer.pop(0)

    def nextLong(self):
        return int(self.next())

    def nextInt(self):
        return int(self.next())

if __name__ == "__main__":
    input_stream = sys.stdin.read()
    sc = FastScanner(input_stream)
    ans = 1
    input_val = sc.nextInt()
    while input_val >= ans*2:
        ans *= 2
    print(ans)