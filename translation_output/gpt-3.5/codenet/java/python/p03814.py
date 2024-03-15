```python
import sys

class Printer:
    def __init__(self, output_stream):
        self.output_stream = output_stream

    def println(self, msg):
        self.output_stream.write(str(msg) + '\n')

def solve():
    s = input().strip()
    n = len(s)

    from_idx = 0
    to_idx = n - 1
    for i in range(n):
        if s[i] == 'A':
            from_idx = i
            break
    for i in range(n - 1, -1, -1):
        if s[i] == 'Z':
            to_idx = i
            break

    pr.println(to_idx - from_idx + 1)

if __name__ == "__main__":
    pr = Printer(sys.stdout)
    
    solve()

```

This is the translated code from Java to Python. It is functionally equivalent to the original Java code provided.
