import sys

def main():
    sc = sys.stdin
    out = sys.stdout
    input = int(sc.readline())
    ans = 1
    while input >= ans*2:
        ans *= 2
    out.write(str(ans))
    out.flush()


class FastScanner:
    def __init__(self, inp):
        self.inp = inp
        self.tokenizer = None

    def next(self):
        if self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            try:
                self.tokenizer = tokenizer(self.inp.readline())
            except Exception as e:
                raise Exception(e)
        return self.tokenizer.nextToken()

    def nextLine(self):
        if self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            try:
                return self.inp.readline()
            except Exception as e:
                raise Exception(e)
        return self.tokenizer.nextToken("\n")

    def nextLong(self):
        return long(self.next())

    def nextInt(self):
        return int(self.next())


if __name__ == "__main__":
    main()