import sys

class p02331:
    def __init__(self):
        self.MOD = 1000000007

    def main(self):
        sc = self.SC(sys.stdin)
        n, k = map(int, sc.next().split())
        ans = 1
        for i in range(n):
            ans = (ans * k) % self.MOD
        self.pl(ans)

    def pl(self, o):
        print(o)

    def p(self, o):
        print(o, end='')

    class SC:
        def __init__(self, f):
            self.f = f
            self.buf = ''

        def next(self):
            while True:
                if '\n' in self.buf:
                    i = self.buf.index('\n')
                    r = self.buf[:i]
                    self.buf = self.buf[i+1:]
                    return r
                try:
                    self.buf += self.f.readline().strip()
                except:
                    return None

        def nextInt(self):
            return int(self.next())

        def nextLong(self):
            return long(self.next())

        def nextDouble(self):
            return float(self.next())

        def nextLine(self):
            return self.next()

if __name__ == '__main__':
    p02331().main()