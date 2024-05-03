import sys

class p02468:

    def main(self):
        input_stream = sys.stdin
        output_stream = sys.stdout
        inp = InputReader(input_stream)
        out = PrintWriter(output_stream)
        solver = TaskX()
        solver.solve(1, inp, out)
        out.close()

    INF = 1 << 30
    modP = 1000000007

    class TaskX:
        def solve(self, testNumber, inp, out):
            m = inp.nextInt()
            n = inp.nextInt()
            out.println(self.power(m, n, self.modP))

        def power(self, a, e, modP):
            ret = 1
            for _ in range(e):
                ret = (ret * a) % modP
                a = (a * a) % modP
            return ret

    class InputReader:
        def __init__(self, input_stream):
            self.inp = BufferedReader(input_stream)
            self.tok = StringTokenizer("")

        def nextString(self):
            while not self.tok.hasMoreTokens():
                try:
                    self.tok = StringTokenizer(self.inp.readLine(), " ")
                except IOError:
                    raise InputMismatchException()
            return self.tok.nextToken()

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

class PrintWriter:
    def __init__(self, output_stream):
        self.out = output_stream
        self.buffer = []

    def print(self, *args, sep=' ', end='\n'):
        self