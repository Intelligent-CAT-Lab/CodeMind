import sys

class FastScanner:
    def __init__(self, inp=sys.stdin):
        self.inp = inp
        self.tokens = None

    def next(self):
        self.tokens = self.inp.readline().split()
        return self.tokens[0]

    def next_int(self):
        return int(self.next())

    def next_line(self):
        return self.inp.readline().strip()

    def next_long(self):
        return long(self.next())

    def next_double(self):
        return float(self.next())

    def next_array(self, n):
        return [self.next_int() for _ in range(n)]

    def next_long_array(self, n):
        return [self.next_long() for _ in range(n)]

def main():
    sc = FastScanner()
    s = sc.next_line()
    words = set(s.split())
    if len(words) == 2:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()