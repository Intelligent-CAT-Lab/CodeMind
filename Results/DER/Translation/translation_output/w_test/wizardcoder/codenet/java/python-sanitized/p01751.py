import sys

class Reader:
    def __init__(self):
        self.buf = sys.stdin.buffer
        self.tokenizer = None

    def close(self):
        pass

    def readline(self):
        return self.buf.readline().decode()

    def read(self):
        return self.readline().strip()

    def readint(self):
        return int(self.read())

    def readints(self):
        return list(map(int, self.read().split()))

    def readlong(self):
        return int(self.read())

    def readlongs(self):
        return list(map(int, self.read().split()))

    def readfloat(self):
        return float(self.read())

    def readfloats(self):
        return list(map(float, self.read().split()))

    def readchar(self):
        return self.read()

    def readchars(self):
        return list(self.read())

    def readtokens(self):
        if self.tokenizer is None:
            self.tokenizer = self.read().split()
        if not self.tokenizer:
            return None
        return self.tokenizer.pop(0)

    def hasnext(self):
        return bool(self.read())

    def hasnexttoken(self):
        return bool(self.readtokens())

def main():
    reader = Reader()
    a, b, c = reader.readints()
    d = a + b
    e = -1
    for i in range(1000):
        if 0 <= (60 * i + c) % d <= a:
            e = i
            break
    if e == -1:
        print(-1)
    else:
        print(60 * e + c)
    reader.close()

if __name__ == '__main__':
    main()