import sys
import io
from typing import Tuple

class LightScanner:
    def __init__(self, input_stream: io.TextIOBase):
        self.reader = input_stream

    def string(self) -> str:
        tokens = next(self.reader).strip().split()
        for token in tokens:
            yield token
        
    def bigints(self) -> str:
        return next(self.string())

class LightWriter:
    def __init__(self, output_stream: io.TextIOBase):
        self.out = output_stream
        self.autoflush = False
        self.breaked = True

    def print(self, s: str):
        self.out.write(s)
        self.out.write(' ')
        self.breaked = False
    
    def ans(self, s: str):
        if not self.breaked:
            self.print(' ')
        self.print(s)
    
    def ansln(self, *args):
        for n in args:
            self.ans(n)
        self.out.write('\n')
        self.breaked = True
    
    def close(self):
        self.out.close()

class NTL_2_A:
    def solve(self, testNumber: int, scanner: LightScanner, writer: LightWriter):
        a = scanner.bigints()
        b = scanner.bigints()
        result = - (int(a) ** 2 + int(b) ** 2)
        writer.ansln(str(result))

def main(input_line: str):
    input_stream = io.StringIO(input_line)
    output_stream = io.StringIO()
    in_scanner = LightScanner(input_stream)
    out_writer = LightWriter(output_stream)
    solver = NTL_2_A()
    solver.solve(1, in_scanner, out_writer)
    out_writer.close()
    return output_stream.getvalue()

if __name__ == "__main__":
    input_line = sys.stdin.readline()
    print(main(input_line))