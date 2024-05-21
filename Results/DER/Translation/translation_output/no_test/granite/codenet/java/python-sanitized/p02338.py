import sys

class FastScanner:
    def __init__(self):
        self.stream = sys.stdin
        self.current = 0
        self.buffer = []

    def next(self):
        if self.current >= len(self.buffer):
            self.buffer = self.stream.read().split()
            self.current = 0
        val = self.buffer[self.current]
        self.current += 1
        return val

    def next_int(self):
        return int(self.next())

    def next_string(self):
        return str(self.next())

    def next_string_array(self, N):
        return [self.next_string() for _ in range(N)]

    def next_int_array(self, N):
        return [self.next_int() for _ in range(N)]

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