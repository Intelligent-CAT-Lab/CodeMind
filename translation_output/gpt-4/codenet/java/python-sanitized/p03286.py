import sys
from functools import cmp_to_key

class FastScanner:
    def __init__(self):
        self.reader = sys.stdin
        self.buffer = ""
    
    def next(self):
        result = None
        while not result:
            # Read more data if necessary
            if not self.buffer:
                self.buffer = self.reader.readline()
            # Find the next token
            while self.buffer:
                # Find the end of the current token
                pos = 0
                while pos < len(self.buffer) and not self.buffer[pos].isspace():
                    pos += 1
                # Emit the token
                if pos > 0:
                    result = self.buffer[:pos]
                    self.buffer = self.buffer[pos:].lstrip()
                    break
                # No token found, so read more data
                self.buffer = self.reader.readline()
        return result
    
    def next_int(self):
        return int(self.next())
    
    def next_long(self):
        return int(self.next()) # Python uses int for long
    
    def next_float(self):
        return float(self.next())

MOD = 10**9 + 7

def q(a, b):
    return floor(a, b) if b > 0 else ceil(a, b)

def r(a, b):
    return a - q(a, b) * b

def floor(a, b):
    if b < 0:
        a, b = -a, -b
    if a > 0:
        return a // b
    else:
        return (a - b + 1) // b

def ceil(a, b):
    if b < 0:
        a, b = -a, -b
    if a > 0:
        return (a + b - 1) // b
    else:
        return a // b

def run():
    sc = FastScanner()
    N = sc.next_long()
    ans = '0' if N == 0 else ''
    while N != 0:
        N, rem = divmod(N, -2)
        ans = str(rem if rem >= 0 else rem + 2) + ans
    print(ans)

def cmp(a, b):
    return (a > b) - (a < b)

class TreeList(list):
    def __init__(self, comparator=cmp):
        super().__init__()
        self.comparator = comparator
    
    def add(self, e):
        low = 0
        high = len(self)
        
        while low < high:
            mid = (low + high) // 2
            if self.comparator(e, self[mid]) > 0:
                low = mid + 1
            else:
                high = mid
        
        self.insert(low, e)
        return True

if __name__ == "__main__":
    run()