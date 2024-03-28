import sys

class FastScanner:
    def __init__(self):
        self.inp = sys.stdin.read().split()
        self.idx = 0

    def next(self):
        val = self.inp[self.idx]
        self.idx += 1
        return val

    def nextInt(self):
        return int(self.next())

def main():
    sc = FastScanner()

    n = sc.nextInt()
    k = sc.nextInt()

    if n <= k:
        print(1)
    else:
        print(0)

if __name__ == "__main__":
    main()