import sys

class FastScanner:
    def __init__(self, stream):
        self.reader = (line for line in stream)
        self.tokenizer = None

    def next(self):
        while self.tokenizer is None or not self.tokenizer:
            self.tokenizer = next(self.reader).split()
        return self.tokenizer.pop(0)

    def next_line(self):
        if self.tokenizer is None or not self.tokenizer:
            return next(self.reader)
        return " ".join(self.tokenizer)

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())  # Assuming we want to return an int in Python as well, for consistency.

def main():
    sc = FastScanner(sys.stdin)
    out = sys.stdout
    input_value = sc.next_int()
    ans = 1
    while input_value >= ans * 2:
        ans *= 2
    out.write(f"{ans}\n")
    out.flush()

if __name__ == "__main__":
    main()