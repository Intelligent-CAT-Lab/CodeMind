import math
import sys

class InputReader:
    def __init__(self, stream):
        self.stream = stream
        self.tokenizer = None

    def next(self):
        while self.tokenizer is None or not self.tokenizer.has_more_tokens():
            try:
                self.tokenizer = iter(input().split())
            except EOFError:
                raise

        return next(self.tokenizer)

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

def solver(sc):
    n = sc.next_long()
    sqrt = int(math.sqrt(n))
    x, y = 0, 0
    for i in range(sqrt, 0, -1):
        if n % i == 0:
            x = i
            y = n // i
            break
    ans = 0
    if x != 0 and y != 0:
        ans = (x - 1) + (y - 1)
    else:
        ans = n - 1
    print(ans)

def main():
    in_stream = sys.stdin
    sc = InputReader(in_stream)
    solver(sc)

if __name__ == "__main__":
    main()