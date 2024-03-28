import sys

class FasterScanner:
    def __init__(self, input_stream=sys.stdin):
        self.mIs = input_stream
        self.buf = bytearray(1024)
        self.curChar = 0
        self.numChars = 0

    def read(self):
        if self.numChars == -1:
            raise InputMismatchException()
        if self.curChar >= self.numChars:
            self.curChar = 0
            self.numChars = self.mIs.readinto(self.buf)
            if self.numChars <= 0:
                return -1
        result = self.buf[self.curChar]
        self.curChar += 1
        return result

    def nextLine(self):
        c = self.read()
        while c != -1 and c <= 32:
            c = self.read()
        res = bytearray()
        while c != -1 and c != 10 and c != 13:
            res.append(c)
            c = self.read()
        return res.decode('utf-8')

    def nextString(self):
        c = self.read()
        while c != -1 and c <= 32:
            c = self.read()
        res = bytearray()
        while c != -1 and c > 32:
            res.append(c)
            c = self.read()
        return res.decode('utf-8')

    def nextLong(self):
        c = self.read()
        while c != -1 and c <= 32:
            c = self.read()
        sgn = 1
        if c == 45:  # '-'
            sgn = -1
            c = self.read()
        result = 0
        while c != -1 and 48 <= c <= 57:
            result = result * 10 + c - 48
            c = self.read()
        return result * sgn

    def nextInt(self):
        return int(self.nextString())
        
def p02720():
    sc = FasterScanner()
    
    k = sc.nextInt()
    list = []
    for i in range(1, 10):
        list.append(i)
    val = -1
    while k > 0:
        val = list[0]
        list.pop(0)
        if val % 10 != 0:
            list.append(10*val + val % 10 - 1)
        list.append(10*val + val % 10)
        if val % 10 != 9:
            list.append(10*val + val % 10 + 1)
        k -= 1
    
    print(val)

    sc.close()

if __name__ == "__main__":
    p02720()