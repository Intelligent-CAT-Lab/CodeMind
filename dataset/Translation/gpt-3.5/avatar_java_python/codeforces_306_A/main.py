import sys
from io import StringIO
import math

class FastReader:
    def __init__(self):
        self.input_str = sys.stdin.read()
        self.tokenizer = iter(self.input_str.split())
    
    def next(self):
        return next(self.tokenizer)
    
    def next_line(self):
        return input()
    
    def next_int(self):
        return int(self.next())
    
    def next_long(self):
        return int(self.next())
    
    def next_double(self):
        return float(self.next())

n, m = map(float, input().split())

osr = StringIO()
o = sys.stdout

for i in range(int(m - (n % m))):
    osr.write(str(int(n / m)) + " ")

for i in range(int(m - (n % m)), int(m)):
    osr.write(str(math.ceil(n / m)) + " ")

o.write(osr.getvalue())
o.flush()