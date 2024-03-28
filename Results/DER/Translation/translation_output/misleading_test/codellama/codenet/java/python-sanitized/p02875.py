import sys

class TaskC:
    def solve(self, test_number, in, out):
        n = in.nextInt() / 2
        res = 7
        p2 = 8
        num = 1
        den = 2
        for i in range(1, n):
            res *= 9
            if i > 1:
                inc = p2
                inc *= num
                inc %= mod
                inc *= IntegerUtils.pow((int) den, mod - 2, mod)
                inc %= mod
                res += inc
            res %= mod
            p2 = (p2 * 2) % mod
            k = i
            num *= 2 * k
            num %= mod
            num *= 2 * k + 1
            num %= mod
            if k > 1:
                den *= k - 1
            den %= mod
            den *= k + 2
            den %= mod
        out.printLine(res)

class IntegerUtils:
    def pow(x, y, mod):
        x %= mod
        res = 1
        while y > 0:
            if y % 2 == 1:
                y -= 1
                res = (res * x) % mod
            else:
                y //= 2
                x = (x * x) % mod
        return res

class OutputWriter:
    def __init__(self, output_stream):
        self.writer = PrintWriter(BufferedWriter(OutputStreamWriter(output_stream)))

    def print(self, *objects):
        for i in range(len(objects)):
            if i != 0:
                self.writer.print(' ')
            self.writer.print(objects[i])

    def printLine(self, *objects):
        self.print(objects)
        self.writer.println()

    def close(self):
        self.writer.close()

class InputReader:
    def __init__(self, input_stream):
        self.stream = input_stream
        self.buffer = bytearray(10000)
        self.cur = 0
        self.