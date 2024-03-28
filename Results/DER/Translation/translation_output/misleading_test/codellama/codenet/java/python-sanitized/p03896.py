import sys

class LightScanner:
    def __init__(self, in_stream):
        self.reader = in_stream
        self.tokenizer = None

    def string(self):
        if self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            try:
                self.tokenizer = StringTokenizer(self.reader.readLine())
            except UncheckedIOException as e:
                raise e
        return self.tokenizer.nextToken()

    def ints(self):
        return int(self.string())

class LightWriter:
    def __init__(self, out_stream):
        self.out = out_stream
        self.autoflush = False
        self.breaked = True

    def print(self, c):
        try:
            self.out.write(c)
            self.breaked = False
        except UncheckedIOException as e:
            raise e
        return self

    def print(self, s):
        try:
            self.out.write(s, 0, len(s))
            self.breaked = False
        except UncheckedIOException as e:
            raise e
        return self

    def ans(self, s):
        if not self.breaked:
            self.print(' ')
        return self.print(s)

    def ans(self, i):
        return self.ans(str(i))

    def ans(self, *n):
        for n1 in n:
            self.ans(n1)
        return self

    def ln(self):
        self.print(sys.lineSeparator())
        self.breaked = True
        if self.autoflush:
            try:
                self.out.flush()
            except UncheckedIOException as e:
                raise e
        return self

    def close(self):
        try:
            self.out.close()
        except UncheckedIOException as e:
            raise e

class I3y3sChallenge:
    def solve(self, test_number, in_stream, out_stream):
        in_scanner = LightScanner(in_stream)
        out_writer = LightWriter(out_stream)
        n = in_scanner.ints()
        if n == 2:
            out_writer.ans(-1).ln()
            return
        ans = [[0] * (n - 1) for _ in range(n)]
        for i in range(n - 1):
            for j in range(n - 1):
                if i == j:
                    ans[i][j] = n
                else:
                    ans[i][j] = j + 1
        for i in range(n - 1):
            ans[