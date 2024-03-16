```python
from io import BufferedReader
import sys
from typing import List, Dict

# LightScanner class
class LightScanner:
    def __init__(self, stream: BufferedReader):
        self.stream = stream
        self.tokenizer = None

    def string(self) -> str:
        if self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            try:
                self.tokenizer = self.stream.readline().split()
            except ValueError as ex:
                raise UncheckedIOException(ex)
        return self.tokenizer.pop(0)

    def longs(self) -> int:
        return int(self.string())

# LightWriter class
class LightWriter:
    def __init__(self, out):
        self.out = out
        self.autoflush = False
        self.breaked = True

    def print(self, value):
        try:
            self.out.write(value)
            self.breaked = False
        except IOError as ex:
            raise UncheckedIOException(ex)

    def ans(self, value):
        if not self.breaked:
            self.print(' ')
        self.print(str(value))

    def ln(self):
        self.print('\n')
        self.breaked = True
        if self.autoflush:
            try:
                self.out.flush()
            except IOError as ex:
                raise UncheckedIOException(ex)

    def close(self):
        try:
            self.out.close()
        except IOError as ex:
            raise UncheckedIOException(ex)

# CDivisorGame class
class CDivisorGame:
    def solve(self, test_number: int, scanner: LightScanner, writer: LightWriter):
        n = scanner.longs()
        pf: Dict[int, int] = {}
        i = 2
        while i * i <= n:
            c = 0
            while n % i == 0:
                n //= i
                c += 1
            if c > 0:
                pf[i] = c
            i += 1

        if n > 1:
            pf[n] = 1

        ans = 1
        for k, v in pf.items():
            ans *= (v + 1)

        writer.ans(len(pf)).ans(ans - 1).ln()

def main():
    inputStream = sys.stdin.buffer
    outputStream = sys.stdout
    in_stream = LightScanner(inputStream)
    out_stream = LightWriter(outputStream)
    solver = CDivisorGame()
    solver.solve(1, in_stream, out_stream)
    out_stream.close()

if __name__ == "__main__":
    main()
```

