import sys

class InputReader:
    def __init__(self, stream):
        self.stream = stream
        self.tokenizer = None

    def next(self):
        while self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            try:
                self.tokenizer = StringTokenizer(self.stream.readLine())
            except IOError:
                raise RuntimeError()
        return self.tokenizer.nextToken()

    def nextInt(self):
        return int(self.next())

class OutputWriter:
    def __init__(self, stream):
        self.stream = stream

    def close(self):
        self.stream.close()

    def println(self, value):
        print(value, file=self.stream)

class TaskD:
    def solve(self, testNumber, inp, out):
        n, K = inp.nextInt(), inp.nextInt()
        ans = 0
        for i in range(K + 1, n + 1):
            for j in range(n // i + 1):
                if i * (j + 1) - 1 <= n:
                    ans += i - K
                else:
                    ans += max(i - K - (i * (j + 1) - 1 - n), 0)
        if K == 0:
            ans -= n
        out.println(ans)

if __name__ == "__main__":
    inp = InputReader(sys.stdin)
    out = OutputWriter(sys.stdout)
    solver = TaskD()
    solver.solve(1, inp, out)
    out.close()