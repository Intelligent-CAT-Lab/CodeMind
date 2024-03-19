import sys

class Task:
    def solve(self, inp, out):
        N, d = map(int, inp.readline().split())

        if d == 1:
            out.write(str(N * (N - 1) // 2))
        elif d == 2:
            out.write(str(N * (N - 1) // 2 - 1))
        else:
            m = N - d
            ans = m * (m - 1) // 2 + 2 * m + (d - 2)
            out.write(str(ans))

if __name__ == "__main__":
    inp = sys.stdin
    out = sys.stdout
    solver = Task()
    solver.solve(inp, out)