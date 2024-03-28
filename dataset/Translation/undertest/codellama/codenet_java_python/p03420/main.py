import sys

class InputReader:
    def __init__(self, stream):
        self.reader = stream
        self.tokenizer = None

    def next(self):
        while self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            try:
                self.tokenizer = StringTokenizer(self.reader.readLine())
            except IOException as e:
                raise RuntimeError(e)
        return self.tokenizer.nextToken()

    def nextInt(self):
        return int(self.next())

class OutputWriter(PrintWriter):
    def __init__(self, out):
        super().__init__(out)

    def close(self):
        super().close()

class TaskD:
    def solve(self, testNumber, in, out):
        n = in.nextInt()
        K = in.nextInt()
        ans = 0
        for i in range(K + 1, n + 1):
            for j in range(0, n // i + 1):
                if i * (j + 1) - 1 <= n:
                    ans += i - K
                else:
                    ans += max(i - K - (i * (j + 1) - 1 - n), 0)
        if K == 0:
            ans -= n
        out.println(ans)

if __name__ == "__main__":
    inputStream = sys.stdin
    outputStream = sys.stdout
    in = InputReader(inputStream)
    out = OutputWriter(outputStream)
    solver = TaskD()
    solver.solve(1, in, out)
    out.close()