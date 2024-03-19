import sys
import io
import math

class LightScanner:
    def __init__(self, in_stream):
        self.reader = io.BufferedReader(io.InputStreamReader(in_stream))
        self.tokenizer = None

    def string(self):
        if self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            try:
                self.tokenizer = io.StringTokenizer(self.reader.readLine())
            except io.UncheckedIOException as e:
                raise e
        return self.tokenizer.nextToken()

    def bigints(self):
        return math.BigInteger(self.string())

class LightWriter:
    def __init__(self, out_stream):
        self.out = io.BufferedWriter(io.OutputStreamWriter(out_stream, io.Charset.defaultCharset()))
        self.autoflush = False
        self.breaked = True

    def print(self, c):
        try:
            self.out.write(c)
            self.breaked = False
        except io.UncheckedIOException as e:
            raise e
        return self

    def print(self, s):
        try:
            self.out.write(s, 0, len(s))
            self.breaked = False
        except io.UncheckedIOException as e:
            raise e
        return self

    def ans(self, s):
        if not self.breaked:
            self.print(' ')
        return self.print(s)

    def ansln(self, *n):
        for n1 in n:
            self.ans(n1).ln()
        return self

    def ln(self):
        self.print(io.lineSeparator())
        self.breaked = True
        if self.autoflush:
            try:
                self.out.flush()
            except io.UncheckedIOException as e:
                raise e
        return self

    def close(self):
        try:
            self.out.close()
        except io.UncheckedIOException as e:
            raise e

class NTL_2_A:
    def solve(self, test_number, in_stream, out_stream):
        in_scanner = LightScanner(in_stream)
        out_writer = LightWriter(out_stream)
        out_writer.ansln(in_scanner.bigints().add(in_scanner.bigints()).toString())

if __name__ == '__main__':
    in_stream = sys.stdin
    out_stream = sys.stdout
    solver = NTL_2_A()
    solver.solve(1, in_stream, out_stream)
    out_stream.close()