import java.io.*;
import java.util.*;

class p01872:
    def solve(self):
        s = self.next()
        if s[-1] == '?':
            sum = 0
            for i in range(len(s)-1):
                n = 11 - i
                q = 0
                p = ord(s[i]) - ord('0')
                if n <= 6 and n >= 1:
                    q = n + 1
                else: #if(n >= 7 && n <= 11)
                    q = n - 5
                sum += q * p
            sum %= 11
            if sum <= 1:
                sum = 0
            else:
                sum = 11 - sum
            print(sum)
        else:
            check = ord(s[-1]) - ord('0')
            cnt = 0
            ans = 0
            for j in range(10):
                sum = 0
                for i in range(len(s)-1):
                    n = 11 - i
                    q = 0
                    p = 0
                    if s[i] == '?':
                        p = j
                    else:
                        p = ord(s[i]) - ord('0')
                    if n <= 6 and n >= 1:
                        q = n + 1
                    else: #if(n >= 7 && n <= 11)
                        q = n - 5
                    sum += q * p
                sum %= 11
                if sum <= 1:
                    sum = 0
                else:
                    sum = 11 - sum
                if check == sum:
                    cnt += 1
                    ans = j
            if cnt == 1:
                print(ans)
            else:
                print("MULTIPLE")

    def main(self):
        out.flush()
        p01872().solve()
        out.close()

    def __init__(self):
        self.in_ = System.in
        self.out_ = PrintWriter(System.out)
        self.buffer = bytearray(2048)
        self.p = 0
        self.buflen = 0

    def hasNextByte(self):
        if self.p < self.buflen:
            return True
        self.p = 0
        try:
            self.buflen = self.in_.read(self.buffer)
        except IOException as e:
            e.printStackTrace()
        if self.buflen <= 0:
            return False
        return True

    def hasNext(self):
        while self.hasNextByte() and not self.isPrint(self.buffer[self.p]):
            self.p += 1
        return self.hasNextByte()

    def isPrint(self, ch):
        if ch >= ord('!') and ch <= ord('~'):
            return True
        return False

    def nextByte(self):
        if not self.hasNextByte():
            return -1
        return self.buffer[self.p]

    def next(self):
        if not self.hasNext():
            raise NoSuchElementException()
        sb = StringBuilder()
        b = -1
        while self.isPrint((b = self.nextByte())):
            sb.appendCodePoint(b)
        return sb.toString()

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return long(self.next())

    def nextDouble(self):
        return float(self.next())

out = PrintWriter(System.out)
p01872().main()
out.close()