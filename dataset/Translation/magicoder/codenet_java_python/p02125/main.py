import sys

class Scanner:
    def __init__(self, inp=sys.stdin):
        self.inp = inp
        self.buf = inp.readline().split()

    def next(self):
        if len(self.buf) == 0:
            self.buf = self.inp.readline().split()
        return self.buf.pop(0)

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return long(self.next())

    def next_double(self):
        return float(self.next())

    def next_line(self):
        return self.inp.readline().rstrip('\r\n')

def main():
    sc = Scanner()
    N = sc.next_int()
    if N == 1:
        print(1)
        return
    c = 1
    while 2 * c - 1 <= N:
        c *= 2
    c -= 1
    print(bin(c).count('1'))

if __name__ == '__main__':
    main()