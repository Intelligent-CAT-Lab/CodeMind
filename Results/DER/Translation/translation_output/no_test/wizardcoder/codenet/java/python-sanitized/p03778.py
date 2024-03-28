import java.util.*;
import java.io.*;

class p03778:
    def main(self):
        fsc=FastScanner()
        w=fsc.nextInt()
        a=fsc.nextInt()
        b=fsc.nextInt()
        fsc.close()
        if a<=b and b<=a+w:
            print(0)
        elif a<=b+w and b+w<=a+w:
            print(0)
        elif a+w<=b:
            print(b-a-w)
        else:
            print(a-b-w)
    class FastScanner:
        def __init__(self):
            self.instream = System.in
            self.buffer = bytearray(1024)
            self.bufferlen = 0
            self.bufferptr = 0
        def hasNextByte(self):
            if self.bufferptr<self.bufferlen:
                return True
            else:
                self.bufferptr = 0
                try:
                    self.bufferlen = self.instream.read(self.buffer)
                except:
                    pass
                if self.bufferlen<=0:
                    return False
                else:
                    return True
        def readByte(self):
            if self.hasNextByte():
                return self.buffer[self.bufferptr]
            else:
                return -1
        def isPrintableChar(self, c):
            return 33 <= c and c <= 126
        def hasNext(self):
            while self.hasNextByte() and not self.isPrintableChar(self.buffer[self.bufferptr]):
                self.bufferptr += 1
            return self.hasNextByte()
        def next(self):
            if not self.hasNext():
                raise NoSuchElementException()
            sb = StringBuilder()
            b = self.readByte()
            while self.isPrintableChar(b):
                sb.appendCodePoint(b)
                b = self.readByte()
            return sb.toString()
        def nextLong(self):
            if not self.hasNext():
                raise NoSuchElementException()
            n = 0
            minus = False
            b = self.readByte()
            if b == '-':
                minus = True
                b = self.readByte()
            if b < '0' or '9' < b:
                raise NumberFormatException()
            while True:
                if '0' <= b and b <= '9':
                    n *= 10
                    n += b - '0'
                elif b == -1 or not self.isPrintableChar(b):
                    return minus and -n or n
                else:
                    raise NumberFormatException()
                b = self.readByte()
        def nextInt(self):
            nl = self.nextLong()
            if nl < Integer.MIN_VALUE or nl > Integer.MAX_VALUE:
                raise NumberFormatException()
            return int(nl)
        def nextDouble(self):
            return float(self.next())
        def close(self):
            try:
                self.instream.close()
            except:
                pass

p03778().main()