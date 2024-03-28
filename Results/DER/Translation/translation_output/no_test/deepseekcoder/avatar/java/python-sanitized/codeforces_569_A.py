import sys
import math

class codeforces_569_A:
    def solve(self, testNumber, inp, out):
        t = inp.nextInt()
        s = inp.nextInt()
        q = inp.nextInt()
        sum = 0
        while s < t:
            s = s * q
            sum += 1
        out.write(str(sum))
        out.flush()

class InputReader:
    def __init__(self, stream):
        self.stream = stream
        self.tokenizer = None

    def hasNext(self):
        while self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            try:
                self.tokenizer = InputReader.StringTokenizer(self.stream.readline())
            except Exception:
                return False
        return True

    def next(self):
        while self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            try:
                self.tokenizer = InputReader.StringTokenizer(self.stream.readline())
            except Exception:
                raise StopIteration
        return self.tokenizer.nextToken()

    def nextInt(self):
        return int(self.next())

class OutputWriter:
    def __init__(self, stream):
        self.stream = stream

    def write(self, s):
        self.stream.write(s)
        self.stream.flush()

    def flush(self):
        self.stream.flush()

if __name__ == "__main__":
    inputStream = sys.stdin
    outputStream = sys.stdout
    inp = InputReader(inputStream)
    out = OutputWriter(outputStream)
    solver = codeforces_569_A()
    solver.solve(1, inp, out)
    out.flush()