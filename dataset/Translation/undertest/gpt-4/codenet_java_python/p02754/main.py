import sys

class FastScanner:
    def __init__(self, stream):
        self.stream = stream
    
    def next(self):
        while True:
            line = self.stream.readline()
            if not line:
                raise StopIteration
            for word in line.split():
                yield word

def main():
    sc = FastScanner(sys.stdin)
    n = int(next(sc.next()))
    a = int(next(sc.next()))
    b = int(next(sc.next()))
    
    ans = (n // (a + b)) * a + min(a, n % (a + b))
    print(ans)

if __name__ == '__main__':
    main()