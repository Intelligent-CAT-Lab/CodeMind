import math
import sys

class P:
    def __init__(self, x, d):
        self.x = x
        self.d = d

    def __lt__(self, other):
        return self.d > other.d

class Reader:
    def __init__(self, inp):
        self.inp = inp
        self.st = None

    def next_string(self):
        while self.st is None or not self.st.hasMoreTokens():
            self.st = StringTokenizer(self.inp.readline())
        return self.st.nextToken()

    def next_int(self):
        return int(self.next_string())

    def next_long(self):
        return long(self.next_string())

    def next_double(self):
        return float(self.next_string())

def sort(lis):
    lis.sort(key=lambda x: x.d, reverse=True)

def validpos(x, y, r, c):
    return x < r and 0 <= x and y < c and 0 <= y

def bit(x, k):
    return (x >> k) & 1

def main():
    sc = Reader(sys.stdin)
    out = PrintWriter(sys.stdout)
    n = sc.next_int()
    d = [0] * 1000
    lis = []
    a = 9
    b = 10
    for i in range(1, 10):
        lis.append(P(i, -11 + i))
    lis.append(P(19, -1))
    for i in range(1, 15):
        for w in range(1, 1000):
            x = w * b + a
            y = x
            e = 0
            while x > 0:
                e += x % 10
                x //= 10
            lis.append(P(y, y / e))
        b *= 10
        a *= 10
        a += 9
    sort(lis)
    max = 0
    for w in range(len(lis)):
        if max < lis[w].x:
            max = lis[w].x
            out.println(max)
            n -= 1
            if n == 0:
                break
    out.flush()

if __name__ == "__main__":
    main()