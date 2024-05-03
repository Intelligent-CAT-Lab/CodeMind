import math

class FastScanner:
    def __init__(self):
        self.br = open(0)
        self.st = ""

    def next(self):
        while not self.st:
            self.st = self.br.readline().strip()
        return self.st.split()[0]

    def nextInt(self):
        return int(self.next())

    def readArray(self, n):
        return [self.nextInt() for _ in range(n)]

    def nextLong(self):
        return int(self.next())

    def nextline(self):
        return self.br.readline().strip()


def main():
    sc = FastScanner()
    s = sc.next()
    t = sc.next()
    mah = s + t
    a = int(mah)
    b = int(math.sqrt(a))
    if b*b == a:
        print("Yes")
    else:
        print("No")


if __name__ == "__main__":
    main()