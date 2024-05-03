```python
import sys

class p03291:

    def main(self):
        input_stream = sys.stdin
        output_stream = sys.stdout
        in_ = InputReader(input_stream)
        out = PrintWriter(output_stream)
        solver = TaskX()
        solver.solve(1, in_, out)
        out.close()

    INF = 1 << 30
    LINF = 1L << 55
    MOD = 1000000007
    mh4 = [0, -1, 1, 0]
    mw4 = [-1, 0, 0, 1]
    mh8 = [-1, -1, -1, 0, 0, 1, 1, 1]
    mw8 = [-1, 0, 1, -1, 1, -1, 0, 1]

    class TaskX:

        def solve(self, testNumber, in_, out):
            s = in_.nextString()
            n = len(s)
            ac = [0] * (n+1)
            bc = [0] * (n+1)
            cc = [0] * (n+1)
            xc = [0] * (n+1)
            for i in range(n):
                ac[i+1] = ac[i]
                bc[i+1] = bc[i]
                cc[i+1] = cc[i]
                xc[i+1] = xc[i]
                if s[i] == 'A':
                    ac[i+1] += 1
                if s[i] == 'B':
                    bc[i+1] += 1
                if s[i] == 'C':
                    cc[i+1] += 1
                if s[i] == '?':
                    xc[i+1] += 1

            ans = 0
            for i in range(n):
                if s[i] == 'B' or s[i] == '?':
                    a = ac[
