Here is the equivalent code in Python:

```python
import sys

class AOnTheWay:
    def solve(self, testNumber, in_stream, out_stream):
        a, b, c = map(int, in_stream.readline().split())
        if (c >= a and c <= b) or (c >= b and c <= a):
            out_stream.write("Yes\n")
        else:
            out_stream.write("No\n")

def main():
    in_stream = sys.stdin
    out_stream = sys.stdout
    solver = AOnTheWay()
    solver.solve(1, in_stream, out_stream)
    out_stream.flush()

if __name__ == "__main__":
    main()
```

This Python code has been simplified significantly compared to the Java version due to Python's convenience in handling input and output streams. I used `sys.stdin` and `sys.stdout` to handle standard input and output. The `AOnTheWay` class is retained with the `solve` method, taking `in_stream` and `out_stream` as parameters for reading input and writing output, respectively. The rest of the program logic inside `solve` remains mostly unchanged, with modified syntax for conditional checks and output formatting.
