import sys
import io

class AEquivalentResistance:
    def solve(self, test_number, in_stream, out_stream):
        r1, r2 = map(float, in_stream.readline().split())
        out_stream.write(f"{1 / (1 / r1 + 1 / r2):.10f}\n")

if __name__ == "__main__":
    in_stream = io.TextIOWrapper(sys.stdin.buffer, encoding="utf-8")
    out_stream = io.TextIOWrapper(sys.stdout.buffer, encoding="utf-8")
    solver = AEquivalentResistance()
    solver.solve(1, in_stream, out_stream)