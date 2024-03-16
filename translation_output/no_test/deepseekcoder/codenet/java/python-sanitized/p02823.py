import sys
from functools import reduce

class In:
    def __init__(self):
        self.reader = sys.stdin

    def next(self):
        return self.reader.readline().strip()

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return long(self.next())

class Out:
    def __init__(self):
        self.out = sys.stdout

    def println(self, *a):
        print(*a, file=self.out)

    def flush(self):
        self.out.flush()

inp = In()
out = Out()

def solve():
    n = inp.next_long()
    a = inp.next_long()
    b = inp.next_long()
    if a > b:
        a, b = b, a
    if (b - a) % 2 == 1:
        ans1 = a - 1 + (b - a + 1) // 2
        a = n - a + 1
        b = n - b + 1
        if a > b:
            a, b = b, a
        ans2 = a - 1 + (b - a + 1) // 2
        out.println(min(ans1, ans2))
    else:
        out.println((b - a) // 2)

def main():
    solve()
    out.flush()

if __name__ == "__main__":
    main()