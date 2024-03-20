import sys

class InputReader:
    def __init__(self, stream):
        self.stream = stream
        self.buf = bytearray()
        self.curChar = 0
        self.numChars = 0

    def nextInt(self):
        c = self.read()
        while isspace(c):
            c = self.read()
        sgn = 1
        if c == '-':
            sgn = -1
            c = self.read()
        res = 0
        while isdigit(c):
            res = res * 10 + int(c)
            c = self.read()
        return res * sgn

    def nextLong(self):
        c = self.read()
        while isspace(c):
            c = self.read()
        sgn = 1
        if c == '-':
            sgn = -1
            c = self.read()
        res = 0
        while isdigit(c):
            res = res * 10 + int(c)
            c = self.read()
        return res * sgn

    def nextDouble(self):
        return float(self.nextToken())

    def nextToken(self):
        c = self.read()
        while isspace(c):
            c = self.read()
        res = []
        while not isspace(c):
            res.append(chr(c))
            c = self.read()
        return ''.join(res)

    def read(self):
        if self.numChars == -1:
            raise EOFError()
        if self.curChar >= self.numChars:
            self.curChar = 0
            try:
                self.numChars = self.stream.readinto(self.buf)
            except OSError:
                self.numChars = -1
                raise EOFError()
            if self.numChars <= 0:
                return -1
        c = self.buf[self.curChar]
        self.curChar += 1
        return c

    def isspace(self, c):
        return c == ord(' ') or c == ord('\n') or c == ord('\r') or c == ord('\t')

    def isdigit(self, c):
        return ord('0') <= c <= ord('9')

def debug(*o):
    print(*o, file=sys.stderr)

def main():
    in_ = InputReader(sys.stdin.buffer)
    out = sys.stdout

    r = in_.nextInt()
    c = in_.nextInt()
    h = in_.nextInt()
    w = in_.nextInt()

    if r % h == 0 and c % w == 0:
        out.write("No\n")
        out.flush()
        return

    mcnt = (r // h) * (c // w