import sys

class TaskC:
    def __init__(self):
        self.d = {}
        self.d[0] = 1
        self.d[1] = 7
        self.d[2] = 19
        self.d[3] = 37
        self.d[4] = 61
        self.d[5] = 91

    def solve(self, testNumber, in, out):
        n = in.nextInt() / 2
        if n in self.d:
            out.printLine(self.d[n])
            return
        res = 7
        p2 = 8
        num = 1
        den = 2
        for i in range(1, n):
            res *= 9
            if i > 1:
                inc = p2
                inc *= num
                inc %= 998244353
                inc *= pow((den), 998244353 - 2, 998244353)
                inc %= 998244353
                res += inc
            res %= 998244353
            p2 = (p2 * 2) % 998244353
            k = i
            num *= 2 * k
            num %= 998244353
            num *= 2 * k + 1
            num %= 998244353
            if k > 1:
                den *= k - 1
            den %= 998244353
            den *= k + 2
            den %= 998244353
        out.printLine(res)

if __name__ == '__main__':
    t = TaskC()
    t.solve(1, InputReader(sys.stdin), OutputWriter(sys.stdout))