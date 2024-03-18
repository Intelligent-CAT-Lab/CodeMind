Here's the Java code translated to Python:

```python
import math

class FastScanner:
    def __init__(self):
        self.buffer = []
    
    def next(self):
        while not self.buffer:
            self.buffer = input().split()
        return self.buffer.pop(0)
    
    def next_int(self):
        return int(self.next())
    
    def read_array(self, n):
        array = []
        for _ in range(n):
            array.append(self.next_int())
        return array
    
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

# Test case input
# Enter the following line when the program waits for input: 1 21

# Expected output
# Yes
```

Please note, the Python code assumes that inputs will be given as standard input, so you will need to manually type or paste the test input `1 21` when the program prompts for input. Also, the original Java method `nextline()` is not used in the Python translation, so it's removed from the `FastScanner` class.
