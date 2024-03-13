import sys

class FastScanner:
    def __init__(self):
        self.inp = sys.stdin.buffer.read()
        self.n = len(self.inp)
        self.i = 0

    def next(self):
        while self.i < self.n and not self.inp[self.i].isprint():
            self.i += 1
        j = self.i
        while self.i < self.n and self.inp[self.i].isprint():
            self.i += 1
        return self.inp[j:self.i].decode()

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

MOD = 1000000007

class Mas:
    def __init__(self, x, y, step):
        self.x = x
        self.y = y
        self.step = step

def pow(l, i):
    if i == 0:
        return 1
    else:
        if i % 2 == 0:
            val = pow(l, i // 2)
            return val * val % 2019
        else:
            return pow(l, i - 1) * l % 2019

vX = [1, 0, 0, -1]
vY = [0, 1, -1, 0]

def main():
    fs = FastScanner()
    n = fs.next_int()
    k = fs.next_int()
    ans = 0
    for i in range(k, n + 2):
        f = i * (i - 1) // 2
        l = (n * 2 - i + 1) * i // 2
        add = l - f + 1
        ans = (ans + add) % MOD
    print(ans)

if __name__ == "__main__":
    main()