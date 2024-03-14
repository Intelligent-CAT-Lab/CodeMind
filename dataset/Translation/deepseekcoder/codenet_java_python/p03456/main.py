import sys
import math

class FastScanner:
    def __init__(self, input=sys.stdin):
        self.buffer = input.readline().strip().split()

    def next(self):
        if len(self.buffer) == 0:
            self.buffer = sys.stdin.readline().strip().split()
        return self.buffer.pop(0)

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return long(self.next())

    def next_line(self):
        return sys.stdin.readline().strip()

def main():
    sc = FastScanner()
    s = sc.next()
    t = sc.next()
    mah = s + t
    a = int(mah)
    b = int(math.sqrt(a))
    if b * b == a:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()