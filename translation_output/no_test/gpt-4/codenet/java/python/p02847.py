Below is the translated Python code from the given Java code:

```python
import sys

class MScanner:
    def __init__(self, input_stream):
        self.br = input_stream
    
    def next(self):
        while True:
            token = self.br.readline().split()
            if token:
                for t in token:
                    yield t
    
    def next_line(self):
        return self.br.readline().strip()
    
    def next_int(self):
        return int(self.next())

    def take_array(self, n, value_type=int):
        return [value_type(x) for x in self.next().split()[:n]]

# Usage of MScanner with sys.stdin
sc = MScanner(sys.stdin)

def main():
    days = ["MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"]
    input_day = sc.next_line()

    # Find the index of the input day in the days list
    idx = days.index(input_day)
    
    # Calculate the days until Sunday
    ans = (6 - idx + 7) % 7
    if ans == 0:
        print(7)
    else:
        print(ans)

# Call the main function
if __name__ == "__main__":
    main()
```

Some key points about the implementation:
- The MScanner class is directly using `sys.stdin`, which is the Python equivalent of `System.in`.
- The `next`, `next_line`, `next_int`, and `take_array` methods are provided in the MScanner class equivalent to those in the Java code, adapted to Python syntax.
- In Python, the index of an item in a list can be found directly using the `.index()` method, so there's no need for the loop present in Java for this purpose.
- The built-in `print` function is used for output instead of `PrintWriter`.
- There's no explicit flushing required for `stdout` in this Python code because the `print` function flushes by default when a newline is printed.
