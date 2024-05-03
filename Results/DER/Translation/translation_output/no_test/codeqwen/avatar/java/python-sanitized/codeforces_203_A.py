import sys

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
                if points == a - i * ta + b - j * tb or (points == 0) or points == a - ta * i or points == b - tb * j:
                    out.write("YES\n")
                    return
        out.write("NO\n")

class InputReader:
    def __init__(self, stream):
        self.reader = stream.readline
        self.tokenizer = None

    def next(self):
        while self.tokenizer is None or not self.tokenizer:
            try:
                self.tokenizer = self.reader().split()
            except:
                raise EOFError()
        return self.tokenizer.pop(0)

    def nextInt(self):
        return int(self.next())

if __name__ == "__main__":
    inp = InputReader(sys.stdin)
    out = sys.stdout
    solver = ATwoProblems()
    solver.solve(1, inp, out)
    out.close()