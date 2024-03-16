import sys
import io

class LightScanner:
    def __init__(self, in_stream):
        self.reader = io.BufferedReader(in_stream)
        self.tokenizer = None

    def string(self):
        if self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            try:
                self.tokenizer = io.StringTokenizer(self.reader.readLine())
            except io.UncheckedIOException as e:
                raise e
        return self.tokenizer.nextToken()

    def ints(self):
        return int(self.string())

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

    def ans(self, i):
        return self.ans(str(i))

    def ln(self):
        self.print(io.lineSeparator())
        self.breaked = True
        if self