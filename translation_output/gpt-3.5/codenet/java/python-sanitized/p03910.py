import sys
from collections import defaultdict

class FastScanner:
    def __init__(self):
        self.input = sys.stdin.buffer
        self.buffer = b""
        self.pos = 0

    def read(self):
        while not self.buffer[self.pos:].isspace():
            self.buffer += self.input.read(1)
        start = self.pos
        self.pos = len(self.buffer) if self.buffer[self.pos:].isspace() else self.pos + 1
        return self.buffer[start:self.pos].decode()

    def read_int(self):
        return int(self.read())

    def read_long(self):
        return int(self.read())

    def read_double(self):
        return float(self.read())

def main():
    sc = FastScanner()
    out = sys.stdout

    N = sc.read_int()
    table = [0] * (N + 1)
    table[0] = 0
    M = 0
    for i in range(1, N + 1):
        table[i] = table[i - 1] + i
        if table[i] >= N:
            M = i
            break

    s = set()
    for i in range(1, M + 1):
        s.add(i)
    s.remove(table[M] - N)
    for a in s:
        out.write(str(a) + "\n")

    out.flush()

if __name__ == "__main__":
    main()