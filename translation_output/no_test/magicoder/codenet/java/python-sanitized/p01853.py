import sys

class FastScanner:
    def __init__(self, inp=sys.stdin):
        self.inp = inp
        self.buf = self.inp.read(1024)
        self.cur = 0
        self.has_next = True

    def next(self):
        while self.cur < len(self.buf) and not self.buf[self.cur].isalnum():
            self.cur += 1
        res = ""
        while self.cur < len(self.buf) and self.buf[self.cur].isalnum():
            res += self.buf[self.cur]
            self.cur += 1
        if not res:
            self.has_next = False
        return res

    def has_next(self):
        while self.cur < len(self.buf) and not self.buf[self.cur].isalnum():
            self.cur += 1
        return self.cur < len(self.buf)

    def next_int(self):
        res = 0
        minus = False
        ch = self.next()
        if ch == "-":
            minus = True
            ch = self.next()
        while ch.isdigit():
            res = res * 10 + ord(ch) - ord("0")
            ch = self.next()
        if minus:
            return -res
        else:
            return res


def main():
    sc = FastScanner()
    n = sc.next_int()
    m = sc.next_int()
    if n % 2 == 0:
        print(0, end="")
        for i in range(1, n // 2):
            print(" 0", end="")
        for i in range(n // 2, n):
            print(" " + str(m), end="")
    else:
        print(0, end="")
        for i in range(1, n // 2):
            print(" 0", end="")
        for i in range(n // 2, n):
            print(" " + str(m), end="")
    print()


if __name__ == "__main__":
    main()