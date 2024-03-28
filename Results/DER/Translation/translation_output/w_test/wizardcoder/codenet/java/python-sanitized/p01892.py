import sys

class p01892:
    def __init__(self):
        self.A = 0
        self.B = 0
        self.N = 0

    def solve(self):
        self.A = int(self.nextLong())
        self.B = int(self.nextLong())
        self.N = int(self.nextInt())

        ans = abs(self.A - self.B)
        for i in range(1, self.N+1):
            for j in range(1, self.N+1):
                if i*self.B % j!= 0:
                    continue
                ans = min(ans, abs(self.A - i*self.B//j))

        self.out.write(str(ans))

    def main(self):
        self.out = sys.stdout
        self.solve()
        self.out.close()

    def next(self):
        return self.in_.readline().strip()

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return long(self.next())

    def nextDouble(self):
        return float(self.next())

    def hasNext(self):
        while self.in_.tell() < len(self.in_str):
            if self.in_str[self.in_.tell()]!= '\n':
                return True
            self.in_.readline()
        return False

    def __init__(self):
        self.in_ = sys.stdin
        self.in_str = self.in_.read()
        self.in_.seek(0)

p01892().main()