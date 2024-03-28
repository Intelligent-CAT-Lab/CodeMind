def run():
    sc = MyScanner()
    c = sc.next().tochar()
    n = len(c)
    s = ""
    for i in range(n):
        if c[i] == 'A' or c[i] == 'Z':
            s += c[i]
    c = s.tochar()
    n = len(c)
    s = ""
    for i in range(n):
        if s == "" or s[-1] != c[i]:
            s += c[i]
    if len(s) > 0 and s[0] == 'Z':
        s = s[1:]
    if len(s) > 0 and s[-1] == 'A':
        s = s[:-1]
    if len(s) > 0:
        print(s)
    else:
        print(-1)


def main():
    run()


class MyScanner:
    def read(self):
        try:
            return sys.stdin.read()
        except IOError:
            raise InputMismatchException()

    def isspacechar(self, c):
        return c == ' ' or c == '\n' or c == '\r' or c == '\t' or c == -1

    def isendline(self, c):
        return c == '\n' or c == '\r' or c == -1

    def nextint(self):
        return int(self.next())

    def nextintarray(self, n):
        array = [0] * n
        for i in range(n):
            array[i] = self.nextint()
        return array

    def nextlong(self):
        return long(self.next())

    def nextlongarray(self, n):
        array = [0] * n
        for i in range(n):
            array[i] = self.nextlong()
        return array

    def nextdouble(self):
        return float(self.next())

    def nextdoublearray(self, n):
        array = [0] * n
        for i in range(n):
            array[i] = self.nextdouble()
        return array

    def next(self):
        c = self.read()
        while self.isspacechar(c):
            c = self.read()
        res = ""
        do:
            res += chr(c)
            c = self.read()
        while not self.isspacechar(c)
        return res

    def nextstringarray(self, n):
        array = []
        for i in range(n):
            array.append(self.next())
        return array

    def nextline(self):
        c = self.read()
        while self.isendline(c):
            c = self.read()
        res = ""
        do:
            res += chr(c)
            c = self.read()