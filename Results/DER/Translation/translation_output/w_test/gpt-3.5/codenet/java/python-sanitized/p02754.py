import sys

class FastScanner:
    def __init__(self, stream):
        self.br = stream
        self.st = None

    def next(self):
        while not self.st or not self.st.hasMoreTokens():
            try:
                self.st = self.br.readline().split()
            except IOError as e:
                print(e)
        return self.st.pop(0)

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

if __name__ == "__main__":
    sc = FastScanner(sys.stdin)
    n = sc.nextLong()
    a = sc.nextLong()
    b = sc.nextLong()
    ans = 0
    ans = (n // (a + b)) * a + min(a, n % (a + b))
    print(ans)