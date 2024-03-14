import sys
import io

class FastScanner:
    def __init__(self, stream):
        self.stream = stream
        self.buffer = io.StringIO()
        self.eof = False

    def next(self):
        if not self.eof:
            try:
                return self.buffer.readline().strip()
            except:
                self.eof = True
                return ""
        else:
            return ""

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return long(self.next())

def main():
    sc = FastScanner(sys.stdin)
    n = sc.next_long()
    a = sc.next_long()
    b = sc.next_long()
    ans = 0
    ans = (n // (a + b)) * a + min(a, n % (a + b))
    print(ans)

if __name__ == "__main__":
    main()