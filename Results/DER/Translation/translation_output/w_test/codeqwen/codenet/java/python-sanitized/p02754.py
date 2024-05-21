class FastScanner:
    def __init__(self, stream):
        self.br = stream.readline
        self.st = None

    def next(self):
        while self.st is None or not self.st:
            self.st = self.br().split()
        return self.st.pop(0)

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

def main():
    sc = FastScanner(sys.stdin)
    n = sc.nextLong()
    a = sc.nextLong()
    b = sc.nextLong()
    ans = 0
    ans = (n // (a + b)) * a + min(a, n % (a + b))
    print(ans)

if __name__ == "__main__":
    main()