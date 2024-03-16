import sys

class FastScanner:
    def __init__(self, in_stream):
        self.reader = in_stream
        self.tokenizer = None

    def next(self):
        if self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            try:
                self.tokenizer = iter(input().split())
            except EOFError:
                raise RuntimeError("End of file")
        return next(self.tokenizer)

    def next_line(self):
        if self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            try:
                return input()
            except EOFError:
                raise RuntimeError("End of file")
        return next(self.tokenizer, "\n")

    def next_int(self):
        return int(self.next())


if __name__ == "__main__":
    sc = FastScanner(sys.stdin)
    input_num = sc.next_int()
    ans = 1
    while input_num >= ans * 2:
        ans *= 2
    print(ans)