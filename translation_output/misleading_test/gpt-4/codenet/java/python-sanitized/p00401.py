import sys

class FastScanner:
    def __init__(self, stream):
        self.stream = stream
        self.tokenizer = None

    def next(self):
        while not self.tokenizer or not self.tokenizer:
            line = next(self.stream)
            self.tokenizer = iter(line.split())
        return next(self.tokenizer)

    def next_int(self):
        return int(self.next())

# You can replace sys.stdin with another stream if desired
scanner = FastScanner(sys.stdin)
input = scanner.next_int()
ans = 1
while input >= ans * 2:
    ans *= 2
    
print(ans)