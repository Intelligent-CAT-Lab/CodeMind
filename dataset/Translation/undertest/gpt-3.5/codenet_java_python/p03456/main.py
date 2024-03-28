import sys

class FastScanner:
    def __init__(self):
        self.st = []
    
    def next(self):
        if not self.st:
            self.st = sys.stdin.readline().split()
        return self.st.pop(0)
    
    def nextInt(self):
        return int(self.next())
    
    def readArray(self, n):
        a = [self.nextInt() for _ in range(n)]
        return a
    
    def nextLong(self):
        return int(self.next())

def main():
    sc = FastScanner()
    s = sc.next()
    t = sc.next()
    mah = s + t
    a = int(mah)
    b = int(a ** 0.5)
    if b*b == a:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()