import sys

MODULO = int(1e9 + 7)

def solve(zeroes, ones, k):
    depth = (zeroes + ones - 1) // (k - 1)
    ways = [0] * (ones + 1)
    ways[0] = 1
    res = 0
    nice = [False] * (ones + 1)
    for i in range(1, depth + 1):
        nice = [False] * (ones + 1)
        for extra in range(0, depth - i + 1):
            now = ones - extra * (k - 1)
            if now >= 0:
                nice[now] = True
        for old in range(ones, -1, -1):
            if ways[old] != 0:
                for cur in range(1, k):
                    if old + cur <= ones and nice[old + cur]:
                        res += ways[old]
                        if res >= MODULO:
                            res -= MODULO
                    ways[old + cur] += ways[old]
                    if ways[old + cur] >= MODULO:
                        ways[old + cur] -= MODULO
    return res

def main():
    input_stream = sys.stdin
    output_stream = sys.stdout
    inp = InputReader(input_stream)
    out = PrintWriter(output_stream)
    solver = TaskE()
    solver.solve(1, inp, out)
    out.close()

class TaskE:
    def solve(self, testNumber, inp, out):
        zeroes = inp.nextInt()
        ones = inp.nextInt()
        k = inp.nextInt()
        out.println(solve(zeroes, ones, k))

class InputReader:
    def __init__(self, stream):
        self.reader = stream.readline
        self.tokenizer = None

    def next(self):
        while self.tokenizer is None or not self.tokenizer:
            self.tokenizer = self.reader().split()