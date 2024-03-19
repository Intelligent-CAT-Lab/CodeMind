import sys

class AEquivalentResistance:
    def solve(self, test_number, in, out):
        r1 = in.doubles()
        r2 = in.doubles()
        out.ans(1 / (1 / r1 + 1 / r2), 10).ln()

class LightWriter:
    def __init__(self, out):
        self.out = out
        self.autoflush = False
        self.breaked = True

    def print(self, c):
        try:
            self.out.write(c)
            self.breaked = False
        except IOError as e:
            raise UncheckedIOException(e)
        return self

    def print(self, s):
        try:
            self.out.write(s, 0, len(s))
            self.breaked = False
        except IOError as e:
            raise UncheckedIOException(e)
        return self

    def ans(self, x, n):
        if not self.breaked:
            self.print(' ')
        if x < 0:
            self.print('-')
            x = -x
        x += pow(10, -n) / 2
        self.print(str(int(x))).print('.')
        x -= int(x)
        for i in range(n):
            x *= 10
            self.print(chr(ord('0') + int(x)))
            x -= int(x)
        return self

    def ln(self):
        self.print(sys.lineSeparator())
        self.breaked = True
        if self.autoflush:
            try:
                self.out.flush()
            except IOError as e:
                raise UncheckedIOException(e)
        return self

    def close(self):
        try:
            self.out.close()
        except IOError as e:
            raise UncheckedIOException(e)

class LightScanner:
    def __init__(self, in):
        self.reader = BufferedReader(InputStreamReader(in))

    def string(self):
        if self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            try:
                self.tokenizer = StringTokenizer(self.reader.readLine())
            except IOError as e:
                raise UncheckedIOException(e)
        return self.tokenizer.nextToken()

    def doubles(self):
        return float(self.string())

if __name__ == '__main__':
    in = LightScanner(sys.stdin)
    out = LightWriter(sys.stdout)
    solver = AEquivalentResistance()
    solver.solve(1, in, out)
    out.close()