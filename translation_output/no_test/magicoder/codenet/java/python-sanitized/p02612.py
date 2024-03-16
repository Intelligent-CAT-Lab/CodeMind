import sys

class TaskA:
    def solve(self, testNumber, inp, out):
        n = int(inp.readline())
        x = n // 1000
        y = n % 1000
        if y == 0:
            out.write('0\n')
        else:
            ans = 1000 * (x + 1) - n
            out.write(str(ans) + '\n')


if __name__ == "__main__":
    inp = sys.stdin
    out = sys.stdout
    solver = TaskA()
    solver.solve(1, inp, out)
    out.close()