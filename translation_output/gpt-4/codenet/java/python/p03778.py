Here's the code translated from Java to Python:

```python
import sys

class FastScanner:
    def __init__(self):
        self.buffer = ""
        self.position = 0
    
    def next_token(self):
        while True:
            if self.position >= len(self.buffer):
                self.buffer = sys.stdin.readline()
                if not self.buffer:
                    return None
                self.position = 0
            while self.position < len(self.buffer) and self.buffer[self.position].isspace():
                self.position += 1
            if self.position < len(self.buffer):
                start_pos = self.position
                while self.position < len(self.buffer) and not self.buffer[self.position].isspace():
                    self.position += 1
                return self.buffer[start_pos:self.position]

    def next_int(self):
        token = self.next_token()
        if token is None:
            raise ValueError("No more input")
        return int(token)

def main():
    fsc = FastScanner()
    w = fsc.next_int()
    a = fsc.next_int()
    b = fsc.next_int()
    if a <= b and b <= a + w:
        print(0)
    elif a <= b + w and b + w <= a + w:
        print(0)
    elif a + w <= b:
        print(b - a - w)
    else:
        print(a - b - w)

if __name__ == "__main__":
    main()
```

I've replaced the FastScanner class with a simplified version suitable for Python, which reads from standard input (`sys.stdin`). The `next_token` method retrieves the next token from the input, and the `next_int` method converts this token to an integer. The rest of the logic is a direct translation from the Java code. Note that methods for floating-point numbers (e.g., `nextDouble`) were omitted since they are not used in the original code.
