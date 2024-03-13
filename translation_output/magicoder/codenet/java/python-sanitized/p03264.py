class FScanner:
    def __init__(self):
        self.sc = input()

    def has_next_line(self):
        return self.sc.has_next_line()

    def read_int(self):
        return int(self.sc.next_int())

    def read_long(self):
        return long(self.sc.next_line())

    def read_int_l(self):
        buf = self.sc.next_line().split(" ")
        num = [int(i) for i in buf]
        return num

    def read_string(self):
        return self.sc.next_line()

    def read_string_l(self, dlm):
        return self.sc.next_line().split(dlm)


def solve():
    pass


def disp(data):
    for i in data:
        print(i, end=" ")
    print()


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