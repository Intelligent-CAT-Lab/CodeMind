import sys

class FastScanner:
    def __init__(self):
        self.input_stream = sys.stdin
        self._load_next_line()

    def _load_next_line(self):
        try:
            self.line = self.input_stream.readline()
            self.tokens = self.line.strip().split()
            self.token_idx = 0
        except IOError as e:
            print(e)
            sys.exit(1)

    def next(self):
        while self.token_idx >= len(self.tokens):
            self._load_next_line()
        token = self.tokens[self.token_idx]
        self.token_idx += 1
        return token

    def next_int(self):
        return int(self.next())

    def read_array(self, n):
        a = []
        for _ in range(n):
            a.append(self.next_int())
        return a

    def next_long(self):
        return long(self.next())

# Usage example
fs = FastScanner()
x = fs.next_int()
if x >= 30:
    print("Yes")
else:
    print("No")