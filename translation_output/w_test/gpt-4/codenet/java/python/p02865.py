```python
import sys

class Reader:
    def __init__(self, in_stream):
        self.in_stream = in_stream
        self.buf = []
        self.bufidx = -1
    
    def close(self):
        # Assuming 'in_stream' is sys.stdin, we usually don't need to close it manually in Python.
        pass
    
    def read_buf(self):
        if self.bufidx == -1 or self.bufidx == len(self.buf):
            self.buf = self.in_stream.readline().strip().split()
            self.bufidx = 0
    
    def s(self):
        self.read_buf()
        s = self.buf[self.bufidx]
        self.bufidx += 1
        return s
    
    def i(self):
        return int(self.s())
    
    def l(self):
        return int(self.s())
    
    def d(self):
        return float(self.s())
    
    def sa(self):
        self.read_buf()
        if self.bufidx != 0:
            raise Exception("illegal read")
        self.bufidx = -1
        return self.buf
    
    def ia(self):
        return [int(x) for x in self.sa()]
    
    def la(self):
        return [int(x) for x in self.sa()]
    
    def da(self):
        return [float(x) for x in self.sa()]
    
    def im(self, N):
        return [self.ia() for _ in range(N)]
    
    def lm(self, N):
        return [self.la() for _ in range(N)]
    
    def dm(self, N):
        return [self.da() for _ in range(N)]

if __name__ == "__main__":
    with Reader(sys.stdin) as r:
        N = r.i()
        print((N - 1) // 2)
```

To test the above Python code you can use the following test case. This is an equivalent python code snippet to create an input stream from a string (mimicking the test input '4') and use it to instantiate the Reader object.

```python
from io import StringIO

# Test case
test_input = '4\n'
expected_output = '1\n'

# Temporary override `sys.stdin` to simulate input
sys.stdin = StringIO(test_input)

if __name__ == "__main__":
    with Reader(sys.stdin) as r:
        N = r.i()
        output = (N - 1) // 2
        print(output)

# Reset sys.stdin to its original state
sys.stdin = sys.__stdin__

# Check if the generated output matches the expected output
print('Passed' if str(output) == expected_output.strip() else 'Failed')
```

Place the test code after your main code block to verify that the implementation works as expected. The test code emulates passing '4' to stdin and should print '1' as the result, followed by 'Passed' if the output is correct.
