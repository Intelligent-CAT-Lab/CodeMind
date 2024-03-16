import sys
import io

DEBUG = False

def main():
    global DEBUG
    DEBUG = len(sys.argv) > 1 and sys.argv[1] == "-DEBUG"
    solver = Solver()
    solver.solve()
    solver.exit()

class FastScanner:
    def __init__(self):
        self._stdin = io.BytesIO(sys.stdin.buffer.read())

    def _read_bytes(self, n):
        return self._stdin.read(n)

    def next(self):
        return self._read_bytes(1000).decode().rstrip().split()[0]

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

class Solver:
    def __init__(self):
        self.sc = FastScanner()
        self.out = []

    def solve(self):
        a = self.sc.next_int()
        b = self.sc.next_int()
        a -= 1
        b -= 1
        num = 100
        ans = [[(j < num // 2) for j in range(num)] for i in range(num)]
        for i in range(0, num, 2):
            for j in range(0, num // 2, 2):
                if a <= 0:
                    break
                ans[i][j] = not ans[i][j]
                a -= 1
            for j in range(num // 2 + 1, num, 2):
                if b <= 0:
                    break
                ans[i][j] = not ans[i][j]
                b -= 1

        self.print_out(num, num)
        for i in range(num):
            self.print_out("".join(['#' if ans[i][j] else '.' for j in range(num)]))

    def print_out(self, *args):
        self.out.append(" ".join(map(str, args)))

    def flush(self):
        sys.stdout.write("\n".join(self.out))

    def exit(self):
        self.flush()
        sys.exit(0)

if __name__ == '__main__':
    main()