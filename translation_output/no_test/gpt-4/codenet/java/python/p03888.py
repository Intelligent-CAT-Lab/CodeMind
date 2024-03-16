Here is the translated code from Java to Python:

```python
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
```

Several points to note regarding the translation:

1. Python's `print` function works differently from Java's `Writer` class, so `LightWriter` was adapted accordingly.
2. The `math.pow` function is used to add half of least significant digit for rounding purposes, similar to adding `Math.pow(10, -n) / 2` in Java.
3. Python does not have checked exceptions, and there's no need to convert `IOError` to an unchecked one.
4. Python's `with` statement is often used for managing resources, but I've kept the `close` method to stay in line with the original code structure.
5. For simplicity and to avoid over-complicating the token-reading logic, I've used the `readline()` method and assumed the inputs will be provided per line.
6. The main part of the solution involving the calculation of equivalent resistance remains the same.
7. I've added a check so the `LightWriter` doesn't attempt to close `sys.stdout` if it's used as an output stream.

