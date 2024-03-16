import sys

class FScanner:
    def __init__(self):
        self.sc = sys.stdin

    def has_next_line(self):
        return self.sc.readline() != ''

    def read_int(self):
        return int(self.sc.readline())

    def read_long(self):
        return long(self.sc.readline())

    def read_int_l(self):
        return list(map(int, self.sc.readline().split()))

    def read_string(self):
        return self.sc.readline().strip()

    def read_string_l(self, dlm):
        return self.sc.readline().split(dlm)


def main():
    sc = FScanner()

    n = sc.read_int()

    o = 0
    e = 0

    for i in range(1, n + 1):
        if i % 2 == 1:
            o += 1
        else:
            e += 1

    print(o * e)


if __name__ == "__main__":
    main()