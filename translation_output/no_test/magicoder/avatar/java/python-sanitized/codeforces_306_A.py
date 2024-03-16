import sys
import math

class FastReader:
    def __init__(self):
        self.br = sys.stdin

    def next(self):
        return self.br.readline().strip()

    def next_int(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

    def next_line(self):
        return self.next()

    def next_int_list(self):
        return list(map(int, self.next().split()))

    def next_double_list(self):
        return list(map(float, self.next().split()))

    def next_char_list(self):
        return list(self.next())


def main():
    fr = FastReader()
    n, m = fr.next_double(), fr.next_double()
    for i in range(int(m - (n % m))):
        print(int(n / m), end=" ")
    for i in range(int(m - (n % m)), int(m)):
        print(math.ceil(n / m), end=" ")


if __name__ == "__main__":
    main()