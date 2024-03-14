import sys

class FastScanner:
    def __init__(self, inp=sys.stdin):
        self.reader = inp
        self.tokenizer = None

    def next(self):
        if self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            try:
                self.tokenizer = FastScanner.StringTokenizer(self.reader.readline())
            except Exception:
                raise Exception
        return self.tokenizer.nextToken()

    def nextLine(self):
        if self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            try:
                return self.reader.readline().rstrip('\n')
            except Exception:
                raise Exception
        return self.tokenizer.nextToken("\n")

    def nextLong(self):
        return long(self.next())

    def nextInt(self):
        return int(self.next())

    class StringTokenizer:
        def __init__(self, string):
            self.string = string
            self.start = 0
            self.length = len(string)

        def hasMoreTokens(self):
            return self.start < self.length

        def nextToken(self, delimiter=None):
            if delimiter is None:
                end = self.length
            else:
                end = self.string.find(delimiter, self.start)
                if end == -1:
                    end = self.length

            token = self.string[self.start:end]
            self.start = end + 1
            return token


def main():
    sc = FastScanner()
    print(2**(sc.nextInt()//2))


if __name__ == "__main__":
    main()