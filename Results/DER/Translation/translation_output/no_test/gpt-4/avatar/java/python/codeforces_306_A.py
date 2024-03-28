Here's the translated Java code into equivalent Python code:

```python
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
        return o1.y - o2.y

if __name__ == "__main__":
    fr = FastReader()
    n, m = fr.next_double(), fr.next_double()
    
    # Python print automatically adds spaces between arguments
    for i in range(int(m - (n % m))):
        print(int(n // m), end=" ")
    
    for i in range(int(m - (n % m)), int(m)):
        print(int(math.ceil(n / m)), end=" ")
    
    # Print a new line at the end
    print()
```

Note that in the Python code above, I replaced Java's `BufferedReader` and `StringTokenizer` with Python's `sys.stdin` and `StringIO`. The iteration and printing are straightforward translations. Python's print function automatically includes spaces between the supplied arguments, so there's no need to add them manually as in Java's `PrintWriter`. Lastly, since Python does not require explicit closing of the standard output stream (unlike the PrintWriter in Java), there is no close statement at the end for printing.
