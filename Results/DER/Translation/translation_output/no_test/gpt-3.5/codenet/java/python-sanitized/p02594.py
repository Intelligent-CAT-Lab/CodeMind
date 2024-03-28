import sys

class FastScanner:
    def __init__(self):
        self.input = sys.stdin.readline
        self.token = None
    
    def next(self):
        if not self.token:
            self.token = next(self.input().split())
        return self.token
    
    def nextInt(self):
        return int(self.next())
    
    def readArray(self, n):
        return [int(x) for x in self.input().split()]
    
    def nextLong(self):
        return int(self.next())


def main():
    fs = FastScanner()
    x = fs.nextInt()
    if x >= 30:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()