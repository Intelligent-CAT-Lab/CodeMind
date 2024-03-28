class main:
    class FastScanner:
        import sys
        import string
        import _io
    
        def __init__(self, inp=sys.stdin):
            self.ip = inp
            self.st = ""
    
        def next(self):
            while not self.st:
                self.st = self.ip.readline().split()
            return self.st.pop(0)
    
        def nextInt(self):
            return int(self.next())
    
        def nextLong(self):
            return long(self.next())
    
    
    fs = FastScanner()
    x = fs.nextInt()
    if x >= 30:
        print("Yes")
    else:
        print("No")