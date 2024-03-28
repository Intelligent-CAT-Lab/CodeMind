import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

class p04030:
    def main(self):
        sc = FastScanner()
        s = sc.next()
        t = ""
        for i in range(s.length()):
            if s.charAt(i)!= 'B':
                t += s[i]
            elif t == "":
                continue
            else:
                t = t[:-1]
        print(t)

class FastScanner:
    def __init__(self):
        self.in = System.in
        self.buffer = bytearray(1024)
        self.ptr = 0
        self.buflen = 0

    def hasNextByte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr