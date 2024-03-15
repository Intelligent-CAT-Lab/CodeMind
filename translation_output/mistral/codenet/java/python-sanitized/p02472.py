import sys

def solve(test_number, in, out):
    out.write(in.bigints().add(in.bigints()).toString())

class LightWriter:
    def __init__(self, out):
        self.out = out

    def print(self, c):
        self.out.write(c)
        self.breaked = False

    def print(self, s):
        self.out.write(s)
        self.breaked = False

    def ans(self, s):
        if not self.breaked:
            self.print(' ')
        return self.print(s)

    def ansln(self, *n):
        for n1 in n:
            self.ans(n1).ln()
        return self

    def ln(self):
        self.print(sys.line_separator())
        self.breaked = True
        if self.autoflush:
            try:
                self.out.flush()
            except Exception as e:
                raise Exception(e)
        return self

    def close(self):
        try:
            self.out.close()
        except Exception as e:
            raise Exception(e)


class LightScanner:
    def __init__(self, in):
        self.reader = None
        self.tokenizer = None

    def string(self):
        if self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            try:
                self.tokenizer = StringTokenizer(self.reader.readline())
            except Exception as e:
                raise Exception(e)
        return self.tokenizer.nextToken()

    def bigints(self):
        return BigInteger(self.string())


if __name__ == '__main__':
    in = LightScanner(sys.stdin)
    out = LightWriter(sys.stdout)
    solver = NTL_2_A()
    solver.solve(1, in, out)
    out.close()