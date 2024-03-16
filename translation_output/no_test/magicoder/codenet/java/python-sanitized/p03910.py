import sys

class FastScanner:
    def __init__(self, inp=sys.stdin):
        self.inp = inp
        self.buf = inp.readline().split()

    def next(self):
        if len(self.buf) == 0:
            self.buf = self.inp.readline().split()
        return self.buf.pop(0)

    def next_int(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

    def next_long(self):
        return long(self.next())


def main():
    sc = FastScanner()
    N = sc.next_int()
    table = [0] * (N + 1)
    M = 0
    for i in range(1, N + 1):
        table[i] = table[i - 1] + i
        if table[i] >= N:
            M = i
            break
    s = set(range(1, M + 1))
    s.remove(table[M] - N)
    for a in s:
        print(a)


if __name__ == "__main__":
    main()