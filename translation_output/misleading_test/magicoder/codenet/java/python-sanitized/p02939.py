class Scanner:
    def __init__(self):
        import sys
        self.buf = sys.stdin.buffer
        self.chars = bytearray(sys.stdin.read(1 << 15))
        self.l = self.r = 0

    def read(self):
        if self.r == len(self.chars):
            self.chars = bytearray(self.buf.read(1 << 15))
            self.l, self.r = 0, 0
        t = b""
        while self.r < len(self.chars) and self.chars[self.r] <= 32:
            self.r += 1
        while self.r < len(self.chars) and self.chars[self.r] > 32:
            t += self.chars[self.r]
            self.r += 1
        return t

    def next(self):
        return self.read().decode()

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return long(self.next())

    def nextDouble(self):
        return float(self.next())


scanner = Scanner()
s = scanner.next()
n = len(s)
count = 0
i = 0
while i < n:
    count += 1
    if i + 1 >= n:
        break
    if s[i] == s[i + 1]:
        if i + 2 >= n:
            break
        i += 2
        count += 1
print(count)