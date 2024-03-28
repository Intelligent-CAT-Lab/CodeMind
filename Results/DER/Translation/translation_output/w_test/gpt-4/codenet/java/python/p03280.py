Here is the Python code equivalent to the provided Java code:

```python
import sys

class FastInput:
    def __init__(self):
        self.bs = sys.stdin.read()
        self.idx = 0

    def next(self):
        while self.bs[self.idx].isspace():
            self.idx += 1
        start = self.idx
        while self.idx < len(self.bs) and not self.bs[self.idx].isspace():
            self.idx += 1
        return self.bs[start:self.idx]

    def next_int(self):
        return int(self.next())

def main():
    sc = FastInput()
    k = sc.next_int() - 1
    b = sc.next_int() - 1
    print(k * b)

if __name__ == "__main__":
    main()
```

And here’s how you would invoke it for a test input:

```python
from io import StringIO
import sys

# Sample Test Case
test_input = "2 2"

# Set up the test input and run the script
sys.stdin = StringIO(test_input)
main()
# Remember to reset sys.stdin if you need to use it further
sys.stdin = sys.__stdin__
```

In this Python code, we're using the `sys.stdin.read()` method to read the entire standard input at once for efficiency. This is somewhat akin to the `BufferedReader` in Java for high-performance input reading. Note, however, that this approach is better suited for competitive programming environments or scripted inputs, and not for interactive usage. For general purposes, Python's `input()` function or other methods should be more suitable.
