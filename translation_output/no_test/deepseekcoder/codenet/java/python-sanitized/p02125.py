import sys

class Scanner:
    def __init__(self):
        self.buffer = sys.stdin.read().splitlines()
        self.ptr = 0

    def has_next(self):
        return self.ptr < len(self.buffer)

    def next(self):
        if not self.has_next():
            raise StopIteration
        self.ptr += 1
        return self.buffer[self.ptr - 1]

    def next_int(self):
        return int(self.next())

class p02125:
    def __init__(self):
        self.sc = Scanner()

    def run(self):
        N = self.sc.next_int()
        if N == 1:
            print(1)
            return
        c = 1
        while 2 * c - 1 <= N:
            c *= 2
        c -= 1
        print(bin(c).count('1'))

if __name__ == "__main__":
    p02125().run()