import sys
import string

class FastScanner:
    def __init__(self, stream):
        self.stream = stream
        self.st = None

    def next(self):
        while self.st is None or not self.st.strip():
            self.st = self.stream.readline()
        return self.st.strip()

class TaskD:
    def solve(self, testNumber, inp, out):
        s = inp.next()
        d = [len(s)] * (1 << 26)
        d[0] = 0
        mask = 0
        ans = len(s)
        for i in range(len(s)):
            c = ord(s[i]) - ord('a')
            mask ^= 1 << c
            for j in range(-1, 26):
                m = j if j >= 0 else 0
                cur = 1 + d[m ^ mask]
                d[mask] = min(d[mask], cur)
                if i == len(s) - 1:
                    ans = min(ans, cur)
        out.write(str(ans))

if __name__ == "__main__":
    inp = FastScanner(sys.stdin)
    out = sys.stdout
    solver = TaskD()
    solver.solve(1, inp, out)
    out.close()