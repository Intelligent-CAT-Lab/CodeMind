import sys

class p01772:
    def run(self):
        sc = self.MyScanner()

        c = sc.next()
        n = len(c)
        s = []
        for i in range(n):
            if c[i] == 'A' or c[i] == 'Z':
                s.append(c[i])
        c = "".join(s)
        n = len(c)
        s = []
        for i in range(n):
            if not s or s[-1] != c[i]:
                s.append(c[i])
        if s and s[0] == 'Z':
            s.pop(0)
        if s and s[-1] == 'A':
            s.pop()
        if s:
            print("".join(s))
        else:
            print(-1)

    def main(self):
        self.run()

    def mapDebug(self, a):
        print("--------map display---------")
        for i in range(len(a)):
            for j in range(len(a[i])):
                print("%3d " % a[i][j], end="")
            print()
        print("----------------------------\n")

    class MyScanner:
        def read(self):
            try:
                return sys.stdin.read(1)
            except:
                raise Exception("InputMismatchException")

        def isSpaceChar(self, c):
            return c == ' ' or c == '\n' or c == '\r' or c == '\t' or c == -1

        def isEndline(self, c):
            return c == '\n' or c == '\r' or c == -1

        def nextInt(self):
            return int(self.next())

        def nextIntArray(self, n):
            array = [0]*n
            for i in range(n):
                array[i] = self.nextInt()
            return array

        def nextLong(self):
            return long(self.next())

        def nextLongArray(self, n):
            array = [0]*n
            for i in range(n):
                array[i] = self.nextLong()
            return array

        def nextDouble(self):
            return float(self.next())

        def nextDoubleArray(self, n):
            array = [0.0]*n
            for i in range(n):
                array[i] = self.nextDouble()
            return array

        def next(self):
            c = self.read()
            while self.isSpaceChar(ord(c[0])):
                c = self.read()
            res = []
            while not self.isSpaceChar(ord(c[0])):
                res.append(c)
                c = self.read()
            return "".join(res)

        def nextStringArray(self, n):
            array = [""]*n
            for i in range(n):
                array[i] = self.next()
            return array

        def nextLine(self):
            c = self.read()
            while self.isEndline(ord(c[0])):
                c = self.read()
            res = []
            while not self.isEndline(ord(c[0])):
                res.append(c)
                c = self.read()
            return "".join(res)

if __name__ == "__main__":
    p01772().main()