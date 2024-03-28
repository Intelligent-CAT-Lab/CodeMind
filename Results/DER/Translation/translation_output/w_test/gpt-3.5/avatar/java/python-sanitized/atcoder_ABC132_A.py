import sys

class FastScanner:
    def __init__(self, reader):
        self.reader = reader
        self.tokenizer = None

    def next(self):
        if self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            try:
                self.tokenizer = iter(next(self.reader).strip().split())
            except StopIteration:
                raise RuntimeError
        return next(self.tokenizer)

    def nextLine(self):
        try:
            return next(self.reader).strip()
        except StopIteration:
            raise RuntimeError

    def nextInt(self):
        return int(self.next())

def main():
    sc = FastScanner(sys.stdin)
    s = sc.next()
    chars = set(s)
    if len(chars) == 2:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()