import sys

class FastScanner:
    def __init__(self, input=sys.stdin):
        self.input = input
        self.buffer = []

    def next(self):
        if not self.buffer:
            self.buffer = self.input.readline().split()
        return self.buffer.pop(0)

    def next_int(self):
        return int(self.next())

    def next_line(self):
        return self.input.readline().rstrip('\n')


class p03079:
    def solve(self):
        fs = FastScanner()
        a = fs.next_int()
        b = fs.next_int()
        c = fs.next_int()

        if a == b == c:
            print("Yes")
        else:
            print("No")


if __name__ == "__main__":
    main_obj = p03079()
    main_obj.solve()