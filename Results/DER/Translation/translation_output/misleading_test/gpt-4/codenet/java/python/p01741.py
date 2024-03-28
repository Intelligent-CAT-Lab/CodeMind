Here's the translated code in Python:

```python
import math
import sys

def run(input_stream):
    d = float(input_stream.readline().strip())
    if d < 1:
        print(d * math.sqrt(2))
    elif d < math.sqrt(2):
        print("2")
    elif d < 2:
        print(d * math.sqrt(2))
    elif d < math.sqrt(2) * 1.5:
        print("3")
    else:
        print(d * math.sqrt(2))

# Assuming `sys.stdin` as a source of input, similar to `System.in` in Java
if __name__ == "__main__":
    run(sys.stdin)
```

To match the Java program's functionality as closely as possible, I've assumed that the input will be coming from `sys.stdin`. You can call the `run()` function with a different input stream if needed (e.g., a file or a `StringIO` object for testing). For the given test input:

Test input (assuming it's being given via the command line or a file):
```
1.000
```

Expected output:
```
-5.585596663525607
```
