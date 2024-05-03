Here is the Python equivalent of the Java code:

```python
import math

def run(in_stream, out_stream):
    sc = in_stream.readline()
    a, b, cc = map(float, sc.split())
    cc = math.radians(cc)

    s = a * b * math.sin(cc) / 2.0
    l = a + b + math.sqrt(a * a + b * b - 2.0 * a * b * math.cos(cc))
    h = b * math.sin(cc)

    out_stream.write(str(s) + '\n')
    out_stream.write(str(l) + '\n')
    out_stream.write(str(h) + '\n')

if __name__ == "__main__":
    run(sys.stdin, sys.stdout)
```

Please note that in Python, we don't have a direct equivalent of Java's `java.util.Scanner` for reading from the console. Instead, we use the `input()` function which reads a line from the console. Also, Python doesn't have a direct equivalent of Java's `java.io.PrintStream` for writing to the console. Instead, we use the `print()` function which writes to the console.
