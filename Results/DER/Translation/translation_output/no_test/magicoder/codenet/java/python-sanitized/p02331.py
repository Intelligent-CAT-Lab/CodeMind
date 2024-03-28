import sys

class SC:
    def __init__(self, inp):
        self.inp = inp
        self.buf = inp.readline()

    def next(self):
        while self.buf.strip() == '':
            self.buf = self.inp.readline()
        return self.buf.strip()

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return long(self.next())

    def next_double(self):
        return float(self.next())

    def next_line(self):
        return self.next()

def pl(o):
    print(o)

def p(o):
    sys.stdout.write(str(o))

def main():
    sc = SC(sys.stdin)
    MOD = 1000000007
    n = sc.next_long()
    k = sc.next_long()
    ans = 1
    for i in range(n):
        ans = (ans * k) % MOD
    pl(ans)

if __name__ == '__main__':
    main()