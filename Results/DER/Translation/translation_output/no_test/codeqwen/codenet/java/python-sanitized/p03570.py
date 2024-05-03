import sys

class FastScanner:
    def __init__(self, stream=sys.stdin):
        self.inp = stream
        self.st = None

    def next(self):
        while self.st is None or not self.st.has_more_tokens():
            try:
                self.st = StringTokenizer(self.inp.readline())
            except IOError:
                raise RuntimeError(e)
        return self.st.nextToken()

class TaskD:
    def solve(self, testNumber, inp, out):
        s = list(inp.next())
        d = [s.__len__()] * (1 << 26)
        d[0] = 0
        mask = 0
        ans = s.__len__()
        for i in range(s.__len__()):
            c = ord(s[i]) - ord('a')
            mask ^= 1 << c
            for j in range(-1, 26):
                m = 0 if j < 0 else (1 << j)
                cur = 1 + d[m ^ mask]
                d[mask] = min(d[mask], cur)
                if i == s.__len__() - 1:
                    ans = min(ans, cur)
        out.write(str(ans))

if __name__ == "__main__":
    inp = FastScanner()
    out = sys.stdout
    solver = TaskD()
    solver.solve(1, inp, out)