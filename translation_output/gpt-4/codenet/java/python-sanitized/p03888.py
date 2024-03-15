import sys
import math

def main():
    in_stream = sys.stdin
    out_stream = sys.stdout
    in_reader = LightScanner(in_stream)
    out_writer = LightWriter(out_stream)
    AEquivalentResistance_solver = AEquivalentResistance()
    AEquivalentResistance_solver.solve(1, in_reader, out_writer)
    out_writer.close()


class AEquivalentResistance:
    def solve(self, testNumber, in_scan, out_writer):
        # out_writer.setBoolLabel(LightWriter.BoolLabel.YES_NO_FIRST_UP)
        r1 = in_scan.doubles()
        r2 = in_scan.doubles()
        out_writer.ans(1 / (1 / r1 + 1 / r2), 10).ln()


class LightWriter:
    def __init__(self, out):
        self.out = out
        self.autoflush = False
        self.breaked = True

    def print(self, c):
        try:
            self.out.write(str(c))
            self.breaked = False
        except IOError as ex:
            raise RuntimeError("IOError encountered") from ex
        return self

    def ans(self, x, n):
        if not self.breaked:
            self.print(' ')
        if x < 0:
            self.print('-')
            x = -x
        x += math.pow(10, -n) / 2
        self.print(str(int(x)))
        self.print('.')
        x -= int(x)
        for i in range(n):
            x *= 10
            self.print(chr(ord('0') + int(x)))
            x -= int(x)
        return self

    def ln(self):
        self.print("\n")
        self.breaked = True
        if self.autoflush:
            try:
                self.out.flush()
            except IOError as ex:
                raise RuntimeError("IOError encountered") from ex
        return self

    def close(self):
        try:
            if not isinstance(self.out, type(sys.stdout)):
                self.out.close()
        except IOError as ex:
            raise RuntimeError("IOError encountered") from ex


class LightScanner:
    def __init__(self, in_stream):
        self.reader = in_stream

    def string(self):
        return self.reader.readline().strip()

    def doubles(self):
        return float(self.string())


if __name__ == "__main__":
    main()