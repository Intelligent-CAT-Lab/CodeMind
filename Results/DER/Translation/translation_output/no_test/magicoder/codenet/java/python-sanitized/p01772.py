import sys

class MyScanner:
    def read(self):
        try:
            return sys.stdin.read(1)
        except EOFError:
            raise EOFError()

    def isSpaceChar(self, c):
        return c == ' ' or c == '\n' or c == '\r' or c == '\t' or c == ''

    def isEndline(self, c):
        return c == '\n' or c == '\r' or c == ''

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return long(self.next())

    def nextDouble(self):
        return float(self.next())

    def next(self):
        c = self.read()
        while self.isSpaceChar(c):
            c = self.read()
        res = ''
        while not self.isSpaceChar(c):
            res += c
            c = self.read()
        return res

    def nextLine(self):
        c = self.read()
        while self.isEndline(c):
            c = self.read()
        res = ''
        while not self.isEndline(c):
            res += c
            c = self.read()
        return res

class p01772:
    def run(self):
        sc = MyScanner()

        c = list(sc.next())
        n = len(c)
        s = []
        for i in range(n):
            if c[i] == 'A' or c[i] == 'Z':
                s.append(c[i])
        c = s
        n = len(c)
        s = []
        for i in range(n):
            if len(s) == 0 or s[-1] != c[i]:
                s.append(c[i])
        if 0 < len(s) and s[0] == 'Z':
            s.pop(0)
        if 0 < len(s) and s[-1] == 'A':
            s.pop()
        if 0 < len(s):
            print(''.join(s))
        else:
            print(-1)

    def main(self):
        self.run()

if __name__ == '__main__':
    p01772().main()