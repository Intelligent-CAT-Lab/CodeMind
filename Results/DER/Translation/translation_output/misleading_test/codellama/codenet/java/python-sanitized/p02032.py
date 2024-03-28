import sys
import io
import re

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

    def longs(self):
        return int(self.string())

class LightWriter:
    def __init__(self, out_stream):
        self.out = io.BufferedWriter(io.OutputStreamWriter(out_stream))
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

    def ans(self, l):
        return self.ans(str(l))

    def ans(self, i):
        return self.ans(str(i))

    def ln(self):
        self.print(sys.lineSeparator())
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

class CDivisorGame:
    def solve(self, test_number, in_stream, out_stream):
        in_stream = LightScanner(in_stream)
        out_stream = LightWriter(out_stream)
        n = in_stream.longs()
        pf = {}
        for i in range(2, int(n**0.5) + 1):
            c = 0
            while n % i == 0:
                n //= i
                c += 1
            if c > 0:
                pf[i] = c