import sys

def solve(inp, out, ms):
    n = inp.nextInt()
    k = inp.nextInt()

    for bit in range(1 << n):
        if bin(bit).count('1') != k:
            continue
        out.write(f"{bit}:")
        for j in range(n):
            if ((bit >> j) & 1) == 1:
                out.write(f" {j}")
        out.write("\n")


class Methods:

    def print(self, *ar):
        print(ar)

    def yesno(self, out, b):
        out.write(b, "\n")

    def YESNO(self, out, b):
        out.write("YES\n" if b else "NO\n")

    def max(self, *ar):
        return max(ar)

    def min(self, *ar):
        return min(ar)


class FastScanner:

    def __init__(self, inp):
        self.inp = inp

    def next(self):
        return self.inp.readline().rstrip()

    def nextInt(self):
        return int(self.next())

    def nextIntArray(self, n):
        return [self.nextInt() for _ in range(n)]

    def nextLong(self):
        return int(self.next())

    def nextLongArray(self, n):
        return [self.nextLong() for _ in range(n)]

    def nextDouble(self):
        return float(self.next())

    def nextDoubleArray(self, n):
        return [self.nextDouble() for _ in range(n)]


if __name__ == "__main__":
    main = p02430()
    inp = FastScanner(sys.stdin)
    out = sys.stdout
    ms = Methods()
    main.solve(inp, out, ms)