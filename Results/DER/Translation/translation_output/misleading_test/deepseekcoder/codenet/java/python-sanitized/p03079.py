import sys

class FastScanner:
    def __init__(self, input=sys.stdin):
        self.input = input
        self.st = None

    def next(self):
        if self.st is None or not self.st.strip():
            self.st = self.input.readline()
        return self.st

    def next_int(self):
        return int(self.next())

    def next_line(self):
        self.st = None
        return self.input.readline().strip()

    def next_int_arr(self, n):
        return [self.next_int() for _ in range(n)]

    def next_long_arr(self, n):
        return [self.next_long() for _ in range(n)]

    def next_long(self):
        return long(self.next())


def solve():
    fs = FastScanner()
    a = fs.next_int()
    b = fs.next_int()
    c = fs.next_int()

    if a == b == c:
        print("Yes")
    else:
        print("No")


if __name__ == "__main__":
    solve()