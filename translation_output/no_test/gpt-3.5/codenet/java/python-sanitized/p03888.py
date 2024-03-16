import sys
import math

class LightWriter:
    def __init__(self, out=sys.stdout):
        self.out = out
        self.autoflush = False
        self.breaked = True

    def print(self, c):
        try:
            self.out.write(str(c))
            self.breaked = False
        except IOError as ex:
            raise UncheckedIOException(ex)

    def ans(self, x, n):
        if not self.breaked:
            self.print(' ')
        if x < 0:
            self.print('-')
            x = -x
        x += 10**-n / 2
        self.print(str(int(x)))
        self.print('.')
        x -= int(x)
        for i in range(n):
            x *= 10
            self.print(chr(ord('0') + int(x)))
            x -= int(x)
        return self

    def ln(self):
        self.print('\n')
        self.breaked = True
        if self.autoflush:
            self.out.flush()
        return self

    def close(self):
        try:
            self.out.close()
        except IOError as ex:
            raise UncheckedIOException(ex)

class LightScanner:
    def __init__(self, input=''):
        self.reader = input.split()
        self.index = 0

    def string(self):
        if self.index >= len(self.reader):
            raise IOError("No more input available")
        result = self.reader[self.index]
        self.index += 1
        return result

    def doubles(self):
        return float(self.string())

class AEquivalentResistance:
    def solve(self, test_number, in_stream, out_stream):
        r1 = in_stream.doubles()
        r2 = in_stream.doubles()
        out_stream.ans(1 / (1 / r1 + 1 / r2), 10).ln()

def main():
    inputStream = sys.stdin
    outputStream = sys.stdout
    in_stream = LightScanner(inputStream.read())
    out_stream = LightWriter(outputStream)
    solver = AEquivalentResistance()
    solver.solve(1, in_stream, out_stream)
    out_stream.close()

if __name__ == "__main__":
    main()