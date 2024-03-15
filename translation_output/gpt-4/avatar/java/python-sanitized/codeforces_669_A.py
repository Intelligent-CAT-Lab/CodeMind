import sys

class FastReader:
    def __init__(self):
        self.input_stream = sys.stdin

    def _read_line(self):
        return self.input_stream.readline()

    def next_token(self):
        while True:
            self.tokens = list(input().split())
            if self.tokens:
                break

    def next_int(self):
        if not hasattr(self, 'tokens') or not self.tokens:
            self.next_token()
        return int(self.tokens.pop(0))

def codeforces_669_a():
    fr = FastReader()
    n = fr.next_int()
    total = 0
    if n == 2:
        print(1)
        return
    while n > 0:
        n -= 1
        if n > 0:
            if n >= 2:
                total += 1
            n -= 2
        total += 1
    print(total)

if __name__ == "__main__":
    codeforces_669_a()