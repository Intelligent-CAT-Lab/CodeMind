import sys

class FastScanner:
    def __init__(self, stream):
        self.stream = stream
        self.buffer = []
    
    def next(self):
        while not self.buffer:
            self.buffer = input().split()
        return self.buffer.pop(0)
    
    def next_int(self):
        return int(self.next())
    
    def next_long(self):
        return int(self.next())

def main():
    sc = FastScanner(sys.stdin)
    n = sc.next_long()
    a = sc.next_long()
    b = sc.next_long()
    ans = (n // (a + b)) * a + min(a, n % (a + b))
    print(ans)

if __name__ == "__main__":
    main()