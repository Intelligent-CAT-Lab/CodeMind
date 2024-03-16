import math

class FastScanner:
    def __init__(self):
        self.tokens = []
    
    def read_tokens(self):
        line = input()
        self.tokens = line.split()
    
    def next(self):
        while not self.tokens:
            self.read_tokens()
        return self.tokens.pop(0)
    
    def next_int(self):
        return int(self.next())

    def read_array(self, n):
        return [self.next_int() for _ in range(n)]

    def next_long(self):
        return int(self.next())

if __name__ == "__main__":
    sc = FastScanner()
    s = sc.next()
    t = sc.next()
    mah = s + t
    a = int(mah)
    b = int(math.sqrt(a))
    if b * b == a:
        print("Yes")
    else:
        print("No")