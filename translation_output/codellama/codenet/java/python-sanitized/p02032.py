import sys
import io
import re

class LightScanner:
    def __init__(self, inp):
        self.reader = io.BufferedReader(io.InputStreamReader(inp))
        self.tokenizer = None

    def string(self):
        if self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            try:
                self.tokenizer = io.StringTokenizer(self.reader.readLine())
            except io.IOException as e:
                raise io.UncheckedIOException(e)
        return self.tokenizer.nextToken()

    def longs(self):
        return int(self.string())

class LightWriter:
    def __init__(self, out):
        self.out = out
        self.autoflush = False
        self.breaked = True

    def print(self, c):
        try:
            self.out.write(c)
            self.breaked = False
        except io.IOException as e:
            raise io.UncheckedIOException(e)
        return self

    def print(self, s):
        try:
            self.out.write(s, 0, len(s))
            self.breaked = False
        except io.IOException as e:
            raise io.UncheckedIOException(e)
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
            except io.IOException as e:
                raise io.UncheckedIOException(e)
        return self

    def close(self):
        try:
            self.out.close()
        except io.IOException as e:
            raise io.UncheckedIOException(e)

class CDivisorGame:
    def solve(self, testNumber, inp, out):
        Debug.enable("src")
        n = inp.longs()
        pf = {}
        for i in range(2, int(n**0.5) + 1):
            c = 0
            while n % i == 0:
                n //= i
                c += 1
            if c > 0:
                pf[i] = c
        if n > 1:
            pf[n] = 1

        ans = 1
        for i, c in pf.items():
            ans *= c + 1
        out.ans(len(pf)).ans(ans - 1).ln()