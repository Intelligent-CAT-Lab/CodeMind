import sys

class FastScanner:
    def __init__(self, stream):
        self.reader = stream
        self.tokenizer = None

    def next(self):
        while self.tokenizer is None or not self.tokenizer:
            line = next(self.reader)
            self.tokenizer = line.strip().split()
        return self.tokenizer.pop(0)

    def next_line(self):
        if self.tokenizer is None or not self.tokenizer:
            return next(self.reader).strip()
        return self.tokenizer.pop(0)

    def next_long(self):
        return int(self.next())

    def next_int(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

    def next_int_array(self, n):
        return [self.next_int() for _ in range(n)]

    def next_long_array(self, n):
        return [self.next_long() for _ in range(n)]


def main():
    sc = FastScanner(sys.stdin)
    s = sc.next()
    unique_chars = set(s)
    if len(unique_chars) == 2:
        print("Yes")
    else:
        print("No")


if __name__ == '__main__':
    main()