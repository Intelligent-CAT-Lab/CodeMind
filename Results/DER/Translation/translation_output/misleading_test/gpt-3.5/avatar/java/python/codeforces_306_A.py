```python
import sys

class FastReader:
    def __init__(self):
        self.lines = sys.stdin.readlines()
        self.pointer = 0

    def next_int(self):
        self.pointer += 1
        return int(self.lines[self.pointer - 1])

    def next_double(self):
        self.pointer += 1
        return float(self.lines[self.pointer - 1])

if __name__ == '__main__':
    fr = FastReader()
    n = fr.next_double()
    m = fr.next_double()
    
    for i in range(0, int(m - (n % m))):
        print(int(n // m), end=' ')
    
    for i in range(int(m - (n % m)), int(m)):
        print(int(-(-n // m)), end=' ')
```
```python
# Test Input: 
# 87 34

# Expected Output:
# 94 -94 43 12 56 -8 101 21 92 -19 68 -19 -89 -66 30 79 92 -53 -88 -65 -88 -23 -38 -62 -66 69 -30 -28 -46 -81 -79 49 -51 76
```
