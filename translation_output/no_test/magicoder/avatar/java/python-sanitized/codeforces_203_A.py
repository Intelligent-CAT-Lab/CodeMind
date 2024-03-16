import sys

class ATwoProblems:
    def solve(self, testNumber, inp, out):
        points = inp.readInt()
        t = inp.readInt()
        a = inp.readInt()
        b = inp.readInt()
        ta = inp.readInt()
        tb = inp.readInt()
        for i in range(t):
            for j in range(t):
                if points == a - i * ta + b - j * tb or points == 0 or points == a - ta * i or points == b - tb * j:
                    out.write("YES\n")
                    return
        out.write("NO\n")

class InputReader:
    def __init__(self, stream):
        self.stream = stream

    def readInt(self):
        return int(self.stream.readline())

if __name__ == "__main__":
    inp = InputReader(sys.stdin)
    out = sys.stdout
    solver = ATwoProblems()
    solver.solve(1, inp, out)
    out.close()