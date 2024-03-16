import sys

class FastReader:
    def __init__(self):
        self.br = sys.stdin

    def next(self):
        return self.br.readline().strip()

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return long(self.next())

    def next_double(self):
        return float(self.next())

    def next_line(self):
        return self.next()


def main():
    sc = FastReader()
    k = sc.next_int() - 1
    b = sc.next_int() - 1
    print(k * b)


if __name__ == "__main__":
    main()