import sys

def solve(test_number, in, out):
    out.write(1 / (1 / in.doubles() + 1 / in.doubles()))
    out.write('\n')

def main():
    in = sys.stdin
    out = sys.stdout
    solver = AEquivalentResistance()
    solver.solve(1, in, out)

class AEquivalentResistance:
    def solve(self, test_number, in, out):
        out.write(1 / (1 / in.doubles() + 1 / in.doubles()))
        out.write('\n')

class LightWriter:
    def __init__(self, out):
        self.out = out

    def print(self, c):
        self.out.write(c)
        self.breaked = False

    def print(self, s):
        self.out.write(s)
        self.breaked = False

    def ans(self, x, n):
        if not self.breaked:
            self.print(' ')
        if x < 0:
            self.print('-')
            x = -x
        x += 1e-9
        self.print(str(int(x))) + '.'
        x -= int(x)
        for i in range(n):
            x *= 10
            self.print(chr(ord('0') + i))
            x -= int(x)
        self.breaked = True

    def ln(self):
        self.print('\n')
        self.breaked = True
        if self.autoflush:
            try:
                self.out.flush()
            except Exception as e:
                raise e

    def close(self):
        try:
            self.out.close()
        except Exception as e:
            raise e

class LightScanner:
    def __init__(self, in):
        self.reader = in

    def string(self):
        if self.tokenizer is None or not self.tokenizer.has_more_tokens():
            try:
                self.tokenizer = StringTokenizer(self.reader.readline())
            except Exception as e:
                raise e
        return self.tokenizer.next_token()

    def doubles(self):
        return float(self.string())

if __name__ == '__main__':
    main()