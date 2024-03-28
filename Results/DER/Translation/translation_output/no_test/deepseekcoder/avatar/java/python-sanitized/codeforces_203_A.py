import sys
import io

class InputReader:
    def __init__(self, input_stream = sys.stdin):
        self.reader = io.BufferedReader(io.InputStreamReader(input_stream), 32768)
        self.tokenizer = None

    def next(self):
        while True:
            if self.tokenizer is None or not self.tokenizer.hasMoreTokens():
                try:
                    self.tokenizer = InputReader.StringTokenizer(self.reader.readLine())
                except Exception:
                    raise StopIteration
            return self.tokenizer.nextToken()

    def nextInt(self):
        return int(self.next())

class ATwoProblems:
    def solve(self, testNumber, inp, out):
        points = inp.nextInt()
        t = inp.nextInt()
        a = inp.nextInt()
        b = inp.nextInt()
        ta = inp.nextInt()
        tb = inp.nextInt()
        for i in range(t):
            for j in range(t):
                if points == a - i * ta + b - j * tb or points == 0 or points == a - ta * i or points == b - tb * j:
                    out.write("YES\n")
                    return
        out.write("NO\n")

def main():
    input_stream = sys.stdin
    output_stream = sys.stdout
    inp = InputReader(input_stream)
    out = io.PrintWriter(output_stream)
    solver = ATwoProblems()
    solver.solve(1, inp, out)
    out.close()

if __name__ == "__main__":
    main()