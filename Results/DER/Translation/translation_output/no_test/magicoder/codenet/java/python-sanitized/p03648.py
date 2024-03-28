import sys

class FastScanner:
    def __init__(self, inp=sys.stdin):
        self.inp = inp
        self.buf = ''

    def next(self):
        while self.buf == '':
            self.buf = self.inp.readline()
        ret = self.buf.split()[0]
        self.buf = self.buf[len(ret):]
        return ret

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return long(self.next())

    def next_double(self):
        return float(self.next())


def main():
    sc = FastScanner()
    K = sc.next_long()
    A = K // 50
    B = K % 50

    a = [i + A for i in range(50)]
    for i in range(49, 49 - B, -1):
        a[i] += 1

    print(50)
    print(' '.join(map(str, a)))


if __name__ == '__main__':
    main()