import java.io.*;
import java.util.*;

class p03421:
    def __init__(self):
        self.output = ""

    def run(self):
        scanner = BetterScanner(System.in)

        n = scanner.nextInt()
        a = scanner.nextInt()
        b = scanner.nextInt()

        self.calc(n, a, b)

    def calc(self, n, a, b):
        for i in range(n - a + 1, n + 1):
            self.output += str(i) + " "
        rest = n - a - b + 1
        if rest < 0:
            print(-1)
            return
        elif rest >= 1:
            if not self.calcInner(rest, a - 1, b - 1):
                print(-1)
                return
        for i in range(n - a, rest, -1):
            self.output += str(i) + " "
        self.output = self.output[:-1]
        print(self.output)

    def calcInner(self, n, a, b):
        first = ""
        second = ""
        while True:
            if a <= 0 or b <= 0:
                return False
            firstI = max(n - a + 1, 1)
            for i in range(firstI, n + 1):
                first += str(i) + " "
            rest = n - a - b + 1
            endI = max(rest + 1, 1)
            subSecond = ""
            for i in range(firstI - 1, endI - 1, -1):
                subSecond += str(i) + " "
            second = subSecond + second
            if rest <= 0:
                self.output += first + second
                return True
            else:
                n = rest
                a -= 1
                b -= 1

class BetterScanner:
    def __init__(self, stream):
        self.stream = stream
        self.buffer = bytearray(1024)
        self.pointer = 0
        self.bufferLength = 0

    def updateBuffer(self):
        if self.pointer >= self.bufferLength:
            self.pointer = 0
            try:
                self.bufferLength = self.stream.read(self.buffer)
            except Exception as e:
                print(e)
                return False
            return self.bufferLength > 0
        else:
            return True

    def read(self):
        if self.updateBuffer():
            return self.buffer[self.pointer]
        else:
            return -1

    def hasNext(self):
        self.skipUnprintable()
        return self.updateBuffer()

    def skipUnprintable(self):
        while self.updateBuffer() and not self.isPrintableChar(self.buffer[self.pointer]):
            self.pointer += 1

    def next(self):
        if self.hasNext():
            builder = ""
            codePoint = self.read()
            while self.isPrintableChar(codePoint):
                builder += chr(codePoint)
                codePoint = self.read()
            return builder
        else:
            raise NoSuchElementException()

    def nextLong(self):
        if self.hasNext():
            number = 0
            minus = False
            codePoint = self.read()
            if codePoint == '-':
                minus = True
                codePoint = self.read()
            if codePoint >= '0' and codePoint <= '9':
                while True:
                    if codePoint >= '0' and codePoint <= '9':
                        number *= 10
                        number += codePoint - '0'
                    elif codePoint < 0 or not self.isPrintableChar