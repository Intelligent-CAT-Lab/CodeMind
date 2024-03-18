```python
import sys

class FastScanner:
    def __init__(self):
        self.inp = sys.stdin.buffer.read()
        self.idx = 0
        self.n = len(self.inp)

    def read_byte(self):
        if self.idx < self.n:
            val = self.inp[self.idx]
            self.idx += 1
            return val
        else:
            return -1

    def is_printable_char(self, c):
        return 33 <= c <= 126

    def has_next(self):
        while self.idx < self.n and not self.is_printable_char(self.inp[self.idx]):
            self.idx += 1
        return self.idx < self.n

    def next(self):
        if not self.has_next():
            raise StopIteration("No more elements to read")
        
        result = []
        b = self.read_byte()
        while self.is_printable_char(b):
            result.append(b)
            b = self.read_byte()
        
        return bytes(result).decode('utf-8')

    def next_int(self):
        num_str = self.next()
        return int(num_str)

def main():
    fsc = FastScanner()
    w = fsc.next_int()
    a = fsc.next_int()
    b = fsc.next_int()
    
    if a <= b <= a + w:
        print(0)
    elif a <= b + w <= a + w:
        print(0)
    elif a + w <= b:
        print(b - a - w)
    else:
        print(a - b - w)

if __name__ == "__main__":
    main()
```

