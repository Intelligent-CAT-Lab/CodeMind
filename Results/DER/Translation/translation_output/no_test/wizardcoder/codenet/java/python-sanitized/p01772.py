import java.io.IOException;
import java.util.InputMismatchException;

class p01772:
    def run(self):
        sc = MyScanner()

        c = sc.next().toCharArray()
        n = len(c)
        s = ''
        for i in range(n):
            if c[i] == 'A' or c[i] == 'Z':
                s += c[i]
        c = s.toCharArray()
        n = len(c)
        s = ''
        for i in range(n):
            if len(s) == 0 or s[-1]!= c[i]:
                s += c[i]
        if len(s) > 0 and s[0] == 'Z':
            s = s[1:]
        if len(s) > 0 and s[-1] == 'A':
            s = s[:-1]
        if len(s) > 0:
            print(s)
        else:
            print(-1)

    def mapDebug(self, a):
        print("--------map display---------")
        for i in range(len(a)):
            for j in range(len(a[i])):
                print("{:3d}".format(a[i][j]), end=' ')
            print()
        print("----------------------------\n")

class MyScanner:
    def read(self):
        try:
            return System.in.read()
        except IOException as e:
            raise InputMismatchException()

    def isSpaceChar(self, c):
        return c =='' or c == '\n' or c == '\r' or c == '\t' or c == -1

    def isEndline(self, c):
        return c == '\n' or c == '\r' or c == -1

    def nextInt(self):
        return int(self.next())

    def nextIntArray(self, n):
        array = [0] * n
        for i in range(n):
            array[i] = self.nextInt()
        return array

    def nextLong(self):
        return long(self.next())

    def nextLongArray(self, n):
        array = [0] * n
        for i in range(n):
            array[i] = self.nextLong()
        return array

    def nextDouble(self):
        return float(self.next())

    def nextDoubleArray(self, n):
        array = [0.0] * n
        for i in range(n):
            array[i] = self.nextDouble()
        return array

    def next(self):
        c = self.read()
        while self.isSpaceChar(c):
            c = self.read()
        res = ''
        while not self.isSpaceChar(c):
            res += chr(c)
            c = self.read()
        return res

    def nextStringArray(self, n):
        array = [''] * n
        for i in range(n):
            array[i] = self.next()
        return array

    def nextLine(self):
        c = self.read()
        while self.isEndline(c):
            c = self.read()
        res = ''
        while not self.isEndline(c):
            res += chr(c)
            c = self.read()
        return res

if __name__ == '__main__':
    p01772().run()