class FastScanner:
    import sys
    import string
    import _io

    def __init__(self, inp=sys.stdin):
        self.ip = inp
        self.st = ""

    def next(self):
        while True:
            if self.st == "":
                self.st = self.ip.readline()
            res = ""
            for ch in self.st:
                if ch in string.whitespace:
                    if res != "":
                        self.st = self.st[len(res) + 1 :]
                        return res
                else:
                    res += ch
            self.st = ""

    def nextInt(self):
        return int(self.next())

    def readArray(self, n):
        a = [0] * n
        for i in range(n):
            a[i] = self.nextInt()
        return a

    def nextLong(self):
        return long(self.next())


def main():
    fs = FastScanner()
    x = fs.nextInt()
    if x >= 30:
        print("Yes")
    else:
        print("No")


if __name__ == "__main__":
    main()