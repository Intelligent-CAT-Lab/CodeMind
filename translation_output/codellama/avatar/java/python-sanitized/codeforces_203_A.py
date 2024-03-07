import sys

class InputReader:
    def __init__(self, stream):
        self.reader = sys.stdin
        self.tokenizer = None

    def next(self):
        while self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            try:
                self.tokenizer = sys.stdin.readline()
            except Exception as e:
                raise RuntimeError(e)
        return self.tokenizer.nextToken()

    def nextInt(self):
        return int(self.next())

class ATwoProblems:
    def solve(self, testNumber, in, out):
        points = in.nextInt()
        t = in.nextInt()
        a = in.nextInt()
        b = in.nextInt()
        ta = in.nextInt()
        tb = in.nextInt()
        for i in range(t):
            for j in range(t):
                if points == a - i * ta + b - j * tb or points == 0 or points == a - ta * i or points == b - tb * j:
                    out.println("YES")
                    return
        out.println("NO")

if __name__ == "__main__":
    inputStream = sys.stdin
    outputStream = sys.stdout
    in = InputReader(inputStream)
    out = PrintWriter(outputStream)
    solver = ATwoProblems()
    solver.solve(1, in, out)
    out.close()