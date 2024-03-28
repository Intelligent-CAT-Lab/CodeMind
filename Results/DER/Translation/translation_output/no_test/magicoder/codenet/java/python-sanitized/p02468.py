import sys

class InputReader:
    def __init__(self, inputStream):
        self.inp = inputStream
        self.tok = None

    def nextString(self):
        while not self.tok:
            self.tok = sys.stdin.readline().split()
        return self.tok.pop(0)

    def nextInt(self):
        return int(self.nextString())

    def nextLong(self):
        return long(self.nextString())

    def nextDouble(self):
        return float(self.nextString())

    def nextIntArray(self, n):
        return [self.nextInt() for _ in range(n)]

    def nextLongArray(self, n):
        return [self.nextLong() for _ in range(n)]

class TaskX:
    def solve(self, testNumber, inp, out):
        m = inp.nextInt()
        n = inp.nextInt()
        out.write(str(self.power(m, n, 1000000007)))

    def power(self, a, e, modP):
        ret = 1
        for _ in range(e):
            if e % 2 != 0:
                ret = (ret * a) % modP
            a = (a * a) % modP
        return ret

if __name__ == "__main__":
    inp = InputReader(sys.stdin)
    out = sys.stdout
    solver = TaskX()
    solver.solve(1, inp, out)
    out.close()