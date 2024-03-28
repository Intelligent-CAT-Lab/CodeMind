import sys

class FastScanner:
    def __init__(self, inp=sys.stdin):
        self.inp = inp
        self.advance()

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

    def nextLine(self):
        ans = self.line
        self.advance()
        return ans

    def next(self):
        ans = self.current_line[self.pos]
        self.pos += 1
        return ans

    def hasNext(self):
        return self.pos < len(self.current_line)

    def advance(self):
        self.line = self.inp.readline().strip()
        self.current_line = self.line
        self.pos = 0

    def isPrintableChar(self, c):
        return 33 <= c and c <= 126

    def skipUnprintable(self):
        while self.hasNext() and not self.isPrintableChar(ord(self.current_line[self.pos])):
            self.pos += 1

MOD = 1000000007

def pow(l, i):
    if i == 0:
        return 1
    else:
        if i % 2 == 0:
            val = pow(l, i // 2)
            return val * val % 2019
        else:
            return pow(l, i - 1) * l % 2019

def main():
    fs = FastScanner()
    n = fs.nextInt()
    k = fs.nextInt()
    ans = 0
    for i in range(k, n + 2):
        f = i * (i - 1) // 2
        l = (n * 2 - i + 1) * i // 2
        add = l - f + 1
        ans = (ans + add) % MOD
    print(ans)

if __name__ == "__main__":
    main()