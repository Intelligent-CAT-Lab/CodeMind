import sys

class FastScanner:
    def __init__(self):
        self.stream = sys.stdin
        self.buffer = []
        self.pos = 0

    def next(self):
        while self.pos >= len(self.buffer):
            self.buffer = self.stream.read().split()
            self.pos = 0
        self.pos += 1
        return self.buffer[self.pos - 1]

    def next_int(self):
        return int(self.next())

    def next_line(self):
        if self.pos >= len(self.buffer):
            self.buffer = self.stream.readlines()
            self.pos = 0
        self.pos += 1
        return self.buffer[self.pos - 1].rstrip('\r\n')

    def next_integer_array(self, n):
        return [self.next_int() for _ in range(n)]

def main():
    sc = FastScanner()
    n = sc.next_int()
    k = sc.next_int()
    if n <= k:
        print(1)
    else:
        print(0)

if __name__ == '__main__':
    main()