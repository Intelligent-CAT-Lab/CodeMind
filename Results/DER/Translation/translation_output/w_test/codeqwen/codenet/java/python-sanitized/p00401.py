class FastScanner:
    def __init__(self, inp):
        self.reader = inp.readline
        self.tokenizer = None

    def next(self):
        if self.tokenizer is None or not self.tokenizer:
            self.tokenizer = self.reader().split()
        return self.tokenizer.pop(0)

    def next_int(self):
        return int(self.next())

    def next_line(self):
        if self.tokenizer is None or not self.tokenizer:
            return self.reader()

        return self.tokenizer.pop(0)


def main():
    inp = FastScanner(sys.stdin)
    out = sys.stdout

    input = inp.next_int()
    ans = 1
    while input >= ans * 2:
        ans *= 2

    out.write(str(ans))
    out.flush()


if __name__ == "__main__":
    main()