import sys
import math
from io import StringIO

# Fast I/O in Python
class FastReader:
    def __init__(self):
        self.reader = sys.stdin
        self.st = None
    
    def next(self):
        while not self.st or not self.st.qsize():
            self.st = StringIO(self.reader.readline().strip())
        return self.st.getvalue()
    
    def next_line(self):
        return self.reader.readline().strip()
    
    def next_int(self):
        return int(self.next())
    
    def next_long(self):
        return int(self.next())
    
    def next_double(self):
        return float(self.next())
    
    def int_array(self, size):
        arr = list(map(int, self.next_line().split()))
        return arr[:size]
    
    def char_array(self):
        return list(self.next_line())

class Pair:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    @staticmethod
    def compare(o1, o2):
        return o