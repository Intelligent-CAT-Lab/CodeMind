Here is the Python equivalent of the Java code:

```python
import math

def run(in_stream, out_stream):
    a, b, cc = map(float, in_stream.readline().split())
    cc = math.radians(cc)

    s = a * b * math.sin(cc) / 2.0
    l = a + b + math.sqrt(a * a + b * b - 2.0 * a * b * math.cos(cc))
    h = b * math.sin(cc)

    out_stream.write(f"{s}\n")
    out_stream.write(f"{l}\n")
    out_stream.write(f"{h}\n")

if __name__ == "__main__":
    run(sys.stdin, sys.stdout)
```

This Python code does the same thing as the Java code. It reads three floating-point numbers from the standard input, converts the third number to radians, calculates the area, perimeter, and height of a triangle, and writes the results to the standard output.
