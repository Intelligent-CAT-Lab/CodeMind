import sys

class ATwoCoins:
    def solve(self, testNumber, in_stream, out_stream):
        a, b, c = map(int, in_stream.readline().split())
        out_stream.write("Yes" if a + b >= c else "No")

if __name__ == "__main__":
    solver = ATwoCoins()
    solver.solve(1, sys.stdin, sys.stdout)



We then create an instance of `ATwoCoins`, call its `solve` method with `1` as the test number, `sys.stdin` as the input stream, and `sys.stdout` as the output stream.