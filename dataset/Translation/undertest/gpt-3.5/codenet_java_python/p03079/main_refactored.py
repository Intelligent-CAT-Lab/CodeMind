class main:
    import sys
    
    class FastScanner:
        def __init__(self):
            self.st = None
    
        def next(self):
            if self.st is None or not self.st:
                self.st = input().split()
            return self.st.pop(0)
    
        def nextInt(self):
            return int(self.next())
    
    def solve():
        fs = FastScanner()
        a = fs.nextInt()
        b = fs.nextInt()
        c = fs.nextInt()
    
        if a == b and b == c:
            print("Yes")
        else:
            print("No")
    
    if __name__ == "__main__":
        solve()