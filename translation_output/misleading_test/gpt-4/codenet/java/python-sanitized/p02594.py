import sys

class FastScanner:
    def __init__(self):
        self._iterator = iter(sys.stdin.read().split())

    def next(self):
        return next(self._iterator)

    def next_int(self):
        return int(self.next())

    def read_array(self, n):
        return [self.next_int() for _ in range(n)]

    def next_long(self):
        return int(self.next())

if __name__ == '__main__':
    fs = FastScanner()
    x = fs.next_int()
    print("Yes" if x >= 30 else "No")