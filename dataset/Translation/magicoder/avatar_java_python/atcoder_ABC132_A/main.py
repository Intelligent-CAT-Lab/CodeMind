import sys

class FastScanner:
    def __init__(self, inp=sys.stdin):
        self.tokens = None
        self.inp = inp

    def next(self):
        if self.tokens is None or not self.tokens:
            self.tokens = self.inp.readline().split()
        return self.tokens.pop(0)

    def next_int(self):
        return int(self.next())

    def next_line(self):
        return self.inp.readline().strip()

    def next_long(self):
        return long(self.next())

    def next_double(self):
        return float(self.next())

    def next_int_array(self, n):
        return [self.next_int() for _ in range(n)]

    def next_long_array(self, n):
        return [self.next_long() for _ in range(n)]

def main():
    sc = FastScanner()
    s = sc.next_line()
    chars = set(s.split())
    if len(chars) == 2:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()