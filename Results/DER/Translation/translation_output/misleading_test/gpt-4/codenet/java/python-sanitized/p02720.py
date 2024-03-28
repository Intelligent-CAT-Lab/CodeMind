import sys

class FasterScanner:
    def __init__(self, istream=None):
        self.istream = istream if istream is not None else sys.stdin.buffer
    def read(self):
        return self.istream.read(1)
    def next_line(self):
        return self.read().decode('ascii').rstrip('\n\r')
    def next_string(self):
        c = self.read().decode('ascii')
        while c.isspace():
            c = self.read().decode('ascii')
        res = []
        while not c.isspace():
            res.append(c)
            c = self.read().decode('ascii')
        return ''.join(res)
    def next_int(self):
        c = self.read().decode('ascii')
        while c.isspace():
            c = self.read().decode('ascii')
        sgn = 1
        if c == '-':
            sgn = -1
            c = self.read().decode('ascii')
        res = 0
        while not c.isspace():
            if not c.isdigit():
                raise ValueError("InputMismatchException")
            res = res * 10 + int(c)
            c = self.read().decode('ascii')
        return res * sgn

def p02720():
    sc = FasterScanner()
    k = sc.next_int()
    queue = [i for i in range(1, 10)]
    val = -1
    while k > 0:
        val = queue.pop(0)
        if val % 10 != 0:
            queue.append(10 * val + val % 10 - 1)
        queue.append(10 * val + val % 10)
        if val % 10 != 9:
            queue.append(10 * val + val % 10 + 1)
        k -= 1
    print(val)

if __name__ == "__main__":
    p02720()