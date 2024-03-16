import java.util.*;
import java.io.*;
import java.math.*;

class P:
    def __init__(self, x, d):
        self.x = x
        self.d = d

    def compareTo(self, p):
        return (self.d - p.d) > 0

class Reader:
    def __init__(self, in):
        self.x = BufferedReader(InputStreamReader(in))
        self.st = None

    def nextString(self):
        while self.st is None or not self.st.hasMoreTokens():
            self.st = StringTokenizer(self.x.readLine())
        return self.st.nextToken()

    def nextInt(self):
        return int(self.nextString())

    def nextLong(self):
        return long(self.nextString())

    def nextDouble(self):
        return float(self.nextString())

def main(args):
    sc = Reader(System.in)
    out = PrintWriter(System.out)
    n = sc.nextInt()
    d = [0] * 1000
    lis = ArrayList[P]()
    a = 9
    b = 10
    for i in range(1, 10):
        lis.add(P(i, -11 + i))
    lis.add(P(19, -1))
    for i in range(1, 15):
        for w in range(1, 1000):
            x = w * b + a
            y = x
            e = 0
            while x > 0:
                e += x % 10
                x //= 10
            lis.add(P(y, y / e))
        b *= 10
        a *= 10
        a += 9
    sort(lis)
    max = 0
    for w in range(0, len(lis)):
        if max < lis[w].x:
            max = lis[w].x
            out.println(max)
            n -= 1
            if n == 0:
                break
    out.flush()

if __name__ == "__main__":
    main(sys.argv[1:])