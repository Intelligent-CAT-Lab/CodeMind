解析


import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

class p01916:
    def solve():
        s = next().toCharArray()

        a = [0] * 26
        b = [0] * 1111

        for i in range(len(s)):
            a[ord(s[i]) - ord('a')] += 1

        for i in range(26):
            b[a[i]] += 1

        for i in range(999, 0, -2):
            if b[i] > 0:
                b[i] -= 1
                break

        m = 0

        for i in range(1, 1000, 2):
            m += b[i]

        if m % 2 == 0:
            out.println(m // 2)
        else:
            out.println(m // 2 + 1)

    def main():
        new Thread(None, p01916(), "", 64 * 1024 * 1024).start()

    def next():
        while not hasNextByte() or not isPrint(nextByte()):
            pass
        return nextByte()

    def nextInt():
        return int(next())

    def nextLong():
        return long(next())

    def nextDouble():
        return float(next())

    def hasNext():
        while not hasNextByte() or not isPrint(nextByte()):
            pass
        return True

    def hasNextByte():
        if p < buflen:
            return True
        p = 0
        try:
            buflen = in.read(buffer)
        except IOError:
            return False
        if buflen <= 0:
            return False
        return True

    def nextByte():
        if not hasNextByte():
            return -1
        return buffer[p++]

    def out:
        return sys.stdout

    def in:
        return sys.stdin

    def buflen:
        return len(buffer)

    def p:
        return p

    def buffer:
        return buffer

    def isPrint(ch):
        if ch >= '!' and ch <= '~':
            return True
        return False