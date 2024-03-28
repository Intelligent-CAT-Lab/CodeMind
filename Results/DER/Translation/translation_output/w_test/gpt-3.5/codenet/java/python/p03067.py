```python
import sys
from io import BytesIO, IOBase

class InputReader:
    def __init__(self, file):
        self.raw = file.read(1 << 20)
        self.ptr = 0
        self.buf = []
 
    def read(self):
        while not self.buf:
            self.buf = self.raw.split()
            self.ptr = 0
        self.ptr += 1
        return self.buf[self.ptr - 1]
 
    def ni(self):
        return int(self.read())
 
    def isSpaceChar(self, ch):
        return ch in b" " + b"\r" + b"\n" + b"\t"
 
class OutputWriter:
    def __init__(self, file):
        self.output = file
 
    def print(self, *args, end=' '):
        self.output.write(' '.join(map(str, args)) + end)
 
    def println(self, *args):
        self.print(*args, end='\n')
 
def solve():
    a, b, c = map(int, input_file.read().split())
    if (c >= a and c <= b) or (c >= b and c <= a):
        out.println("Yes")
    else:
        out.println("No")
 
input_file = InputReader(sys.stdin)
output_file = OutputWriter(sys.stdout)
out = output_file
 
solve()
output_file.close()
```

