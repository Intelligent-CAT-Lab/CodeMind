import sys

class TaskC:
    mod = 998244353

    def solve(self, testNumber, inp, out):
        # d = {}
        # for n in range(1, 6):
        #     p3 = 1
        #     for _ in range(n):
        #         p3 *= 9
        #     a = [0] * (2 * n)
        #     cur = self.calc(0, 2 * n)
        #     out.print_line(n, cur, (p3 - cur) // 2)

        n = inp.next_int() // 2
        res = 7
        p2 = 8
        num = 1
        den = 2
        for i in range(1, n):
            res *= 9
            if i > 1:
                inc = p2
                inc *= num
                inc %= self.mod
                inc *= pow(den, self.mod - 2, self.mod)
                inc %= self.mod
                res += inc
            res %= self.mod
            p2 = (p2 * 2) % self.mod
            num *= 2 * i
            num %= self.mod
            num *= 2 * i + 1
            num %= self.mod
            if i > 1:
                den *= i - 1
            den %= self.mod
            den *= i + 2
            den %= self.mod
        out.print_line(res)

class OutputWriter:
    def __init__(self, stream):
        self.writer = stream

    def print(self, *objects):
        for i in range(len(objects)):
            if i != 0:
                self.writer.write(' ')
            self.writer.write(str(objects[i]))

    def print_line(self, *objects):
        self.print(*objects)
        self.writer.write('\n')

    def close(self):
        self.writer.close