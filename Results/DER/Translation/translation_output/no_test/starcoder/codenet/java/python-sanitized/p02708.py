import sys

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
            val = pow(l, i / 2)
            return val * val % MOD
        else:
            return pow(l, i - 1) * l % MOD

def main():
    fs = FastScanner()
    n = fs.nextInt()
    k = fs.nextInt()
    ans = 0
    for i in range(k, n + 1):
        f = i * (i - 1) / 2
        l = (n * 2 - i + 1) * i / 2
        add = l - f + 1
        ans = (ans + add) % MOD
    print(ans)

class FastScanner:
    def __init__(self):
        self.buffer = sys.stdin.readline
        self.ptr = 0
        self.buflen = 0
        self.has_next_line = True

    def hasNext(self):
        while self.buflen <= self.ptr:
            if not self.has_next_line:
                return False
            self.buflen = len(self.buffer())
            self.ptr = 0
            if self.buflen <= 1:
                self.has_next_line = False
        return True

    def next(self):
        if not self.hasNext():
            return None
        self.ptr += 1
        return self.buffer[self.ptr - 1]

    def nextInt(self):
        if not self.hasNext():
            return None
        num = 0
        while self.hasNext() and self.buffer[self.ptr] >= '0' and self.buffer[self.ptr] <= '9':
            num = num * 10 + int(self.next())
        return num

    def nextLong(self):
        if not self.hasNext():
            return None
        num = 0
        while self.hasNext() and self.buffer[self.ptr] >= '0' and self.buffer[self.ptr] <= '9':
            num = num * 10 + int(self.next())
        return num

    def nextDouble(self):
        if not self.hasNext():
            return None
        num = 0
        dot = 0
        while self.hasNext():
            if self.buffer[self.ptr] >= '0' and self.buffer[self.ptr] <= '9':
                num = num * 10 + int(self.next())
            elif self.buffer[self.ptr] == '.':
                dot = 1
            else:
                break
        if not dot:
            return num
        else:
            return num *