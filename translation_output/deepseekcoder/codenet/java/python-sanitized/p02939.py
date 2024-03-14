import sys

class Scanner:
    def __init__(self):
        self.buf = sys.stdin.read().split()
        self.i = 0

    def next(self):
        if self.i < len(self.buf):
            res = self.buf[self.i]
            self.i += 1
            return res
        raise EOFError

    def next_int(self):
        return int(self.next())

    def next_char(self):
        return self.next()[0]


def solve():
    scanner = Scanner()
    s = scanner.next_char()
    n = len(s)
    count = 0
    i = 0
    while i < n:
        count += 1
        if i + 1 >= n:
            break
        if s[i] == s[i + 1]:
            if i + 2 >= n:
                break
            i += 2
            count += 1
        i += 1
    print(count)


if __name__ == "__main__":
    solve()