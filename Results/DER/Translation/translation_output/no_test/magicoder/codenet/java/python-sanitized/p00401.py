import sys

class FastScanner:
    def __init__(self, inp):
        self.inp = inp
        self.tokens = None

    def next(self):
        while self.tokens is None or not self.tokens.hasMoreTokens():
            self.tokens = self.inp.readline().split()
        return self.tokens.nextToken()

    def nextLine(self):
        while self.tokens is None or not self.tokens.hasMoreTokens():
            self.tokens = self.inp.readline().split()
        return self.tokens.nextToken("\n")

    def nextLong(self):
        return long(self.next())

    def nextInt(self):
        return int(self.next())


def main():
    sc = FastScanner(sys.stdin)
    input = sc.nextInt()
    ans = 1
    while input >= ans * 2:
        ans *= 2
    print(ans)


if __name__ == "__main__":
    main()