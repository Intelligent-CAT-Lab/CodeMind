import sys

class Scanner:
    def __init__(self, input=sys.stdin):
        self.buffer = input
        self.offset = 0
        self.line = ""

    def has_next(self):
        return self.offset < len(self.buffer)

    def next(self):
        if not self.has_next():
            raise StopIteration
        c = self.buffer[self.offset]
        self.offset += 1
        return c

    def next_int(self):
        s = ""
        while self.has_next():
            c = self.next()
            if c in "0123456789":
                s += c
            else:
                self.offset -= 1
                break
        return int(s)

def count_bits(n):
    return bin(n).count("1")

def solve(n):
    if n == 1:
        return 1
    c = 1
    while 2 * c - 1 <= n:
        c *= 2
    c -= 1
    return count_bits(c)

def main():
    scanner = Scanner()
    n = scanner.next_int()
    print(solve(n))

if __name__ == "__main__":
    main()