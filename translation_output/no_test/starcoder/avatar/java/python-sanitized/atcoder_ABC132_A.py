import sys

class FastScanner:
    def __init__(self, stream):
        self.reader = stream
        self.tokenizer = None

    def next(self):
        if self.tokenizer == None:
            self.tokenizer = self.reader.readline().split()
        return self.tokenizer.pop(0)

    def nextLine(self):
        return self.reader.readline()

    def nextLong(self):
        return int(self.next())

    def nextInt(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

    def nextIntArray(self, n):
        return [int(self.next()) for i in range(n)]

    def nextLongArray(self, n):
        return [long(self.next()) for i in range(n)]

def main():
    sc = FastScanner(sys.stdin)
    s = sc.next()
    chars = set(s.split(" "))
    if len(chars) == 2:
        print("Yes")
    else:
        print("No")

if __name__ == '__main__':
    main()