import sys

class FasterScanner:
    def __init__(self, is):
        self.mIs = is
        self.buf = bytearray(1024)
        self.curChar = 0
        self.numChars = 0

    def read(self):
        if self.numChars == -1:
            raise Exception("InputMismatchException")
        if self.curChar >= self.numChars:
            self.curChar = 0
            try:
                self.numChars = self.mIs.readinto(self.buf)
            except Exception as e:
                raise Exception("InputMismatchException")
            if self.numChars <= 0:
                return -1
        return self.buf[self.curChar]

    def nextLine(self):
        c = self.read()
        while self.isSpaceChar(c):
            c = self.read()
        res = []
        while not self.isEndOfLine(c):
            res.append(chr(c))
            c = self.read()
        return "".join(res)

    def nextString(self):
        c = self.read()
        while self.isSpaceChar(c):
            c = self.read()
        res = []
        while not self.isSpaceChar(c):
            res.append(chr(c))
            c = self.read()
        return "".join(res)

    def nextLong(self):
        c = self.read()
        while self.isSpaceChar(c):
            c = self.read()
        sgn = 1 if c != '-' else -1
        if c == '-' or c == '+':
            c = self.read()
        res = 0
        while not self.isSpaceChar(c):
            if '0' <= chr(c) <= '9':
                res = res * 10 + ord(chr(c)) - ord('0')
            else:
                raise Exception("InputMismatchException")
            c = self.read()
        return res * sgn

    def nextInt(self):
        return int(self.nextLong())

    def isSpaceChar(self, c):
        return c in [32, 10, 13, 9, -1]

    def isEndOfLine(self, c):
        return c in [10, 13, -1]

    def close(self):
        try:
            self.mIs.close()
        except Exception as e:
            e.printStackTrace()


def main():
    sc = FasterScanner(sys.stdin)
    k = sc.nextInt()
    list = [i for i in range(1, 10)]
    val = -1
    while k > 0:
        val = list.pop(0)
        if val % 10 != 0:
            list.append(10*val + val%10 - 1)
        list.append(10*val + val%10)
        if val % 10 != 9:
            list.append(10*val + val%10 + 1)
        k -= 1
    print(val)
    sc.close()

if __name__ == "__main__":
    main()