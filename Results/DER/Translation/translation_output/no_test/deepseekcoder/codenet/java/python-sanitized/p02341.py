import sys

class FastScanner:
    def __init__(self, inp=sys.stdin):
        self.queue = []
        self.space = []
        self.inp = inp

    def read(self):
        if self.space:
            return self.space.pop()
        else:
            raise StopIteration

    def has_next(self):
        while not self.queue:
            line = self.inp.readline()
            if line:
                self.space.extend(line.split())
            else:
                return False
        return True

    def next(self):
        if self.has_next():
            return self.queue.pop(0)
        else:
            raise StopIteration

    def next_int(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

    def next_long(self):
        return long(self.next())

    def next_line(self):
        if self.has_next():
            return self.inp.readline().rstrip('\n')
        else:
            raise StopIteration


def main():
    sc = FastScanner()
    n = sc.next_int()
    k = sc.next_int()
    if n <= k:
        print(1)
    else:
        print(0)


if __name__ == "__main__":
    main()