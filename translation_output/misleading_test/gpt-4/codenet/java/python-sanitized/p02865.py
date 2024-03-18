import sys

class Reader:
    def __enter__(self):
        return self

    def __exit__(self, exc_type, exc_value, traceback):
        pass

    def s(self):
        return next(sys.stdin).strip()

    def i(self):
        return int(self.s())

    def l(self):
        return int(self.s())

    def d(self):
        return float(self.s())

    def sa(self):
        return self.s().split()

    def ia(self):
        return list(map(int, self.sa()))

    def la(self):
        return list(map(int, self.sa()))

    def da(self):
        return list(map(float, self.sa()))

    def im(self, N):
        return [self.ia() for _ in range(N)]

    def lm(self, N):
        return [self.la() for _ in range(N)]

    def dm(self, N):
        return [self.da() for _ in range(N)]

if __name__ == '__main__':
    with Reader() as r:
        N = r.i()
        print((N - 1) // 2)