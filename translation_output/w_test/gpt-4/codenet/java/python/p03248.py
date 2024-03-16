Sure, here's the equivalent Python code for the given Java source:

```python
import sys
from math import gcd

class Reader:
    def __init__(self, in_stream):
        self.reader = sys.stdin if in_stream == sys.stdin else open(in_stream, 'r')
    
    def next_string(self):
        return next(self.reader).strip()
    
    def next_int(self):
        return int(self.next_string())
    
    def next_long(self):
        return int(self.next_string())
    
    def next_double(self):
        return float(self.next_string())

def main():
    mod = 10**9 + 7
    sc = Reader(sys.stdin)
    # Use input() and print() for input and output
    c = sc.next_string()
    l = len(c)

    if c[0] == '0' or c[l - 1] == '1':
        print(-1)
        return
    else:
        for i in range(l // 2):
            if c[i] != c[l - i - 2]:
                print(-1)
                return
    
    print(f"{1} {2}")
    
    s = 2
    for i in range(3, l + 1):
        print(f"{s} {i}")
        if c[i - 2] == '1':
            s = i

# Normally, you would invoke the main method here
# However, since we are using the script interactively, we'll comment this out
# main()
```

To use the main function with your own input/output, you should uncomment the `main()` call at the end of the script. However, when running this in an interactive Python environment, you can leave it commented out and call `main()` manually.

Lastly, note that the `Reader` class is simplified since Python natively handles file and standard input reading quite well with built-in functions like `input()`. Also, Python's `print` function is used to output the results to `stdout`. If you wish to have file output instead, you would need to set up a file writer similar to Java's `PrintWriter`.
