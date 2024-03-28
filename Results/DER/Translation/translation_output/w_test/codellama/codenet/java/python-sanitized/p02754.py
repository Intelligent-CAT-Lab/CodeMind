import sys

class FastScanner:
    def __init__(self, stream):
        self.br = sys.stdin
        self.st = None

    def next(self):
        while self.st is None or not self.st.hasMoreTokens():
            try:
                self.st = sys.stdin.readline()
            except Exception as e:
                print(e)
        return self.st.nextToken()

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return long(self.next())

def main():
    sc = FastScanner(sys.stdin)
    n = sc.nextLong()
    a = sc.nextLong()
    b = sc.nextLong()
    ans = 0
    ans = (n / (a + b)) * a + min(a, n % (a + b))
    print(ans)

if __name__ == "__main__":
    main()