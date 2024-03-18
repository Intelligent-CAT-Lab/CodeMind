import sys

class FastScanner:
    def __init__(self):
        self.stream = sys.stdin
        self.buffer = []

    def next(self):
        if not self.buffer:
            self.buffer = self.stream.readline().strip().split()
        return self.buffer.pop(0)

    def nextInt(self):
        return int(self.next())

    def nextline(self):
        return self.stream.readline().strip()

def main():
    sc = FastScanner()
    s = sc.next()
    t = sc.next()
    mah = s + t
    a = int(mah)
    b = int(a ** 0.5)
    if b * b == a:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()