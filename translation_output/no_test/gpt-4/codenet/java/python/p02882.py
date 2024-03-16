Here is the equivalent Python code for the provided Java code.

```python
import math

def main():
    A = int(input())
    B = int(input())
    X = int(input())

    if X * 2 >= A * A * B:
        z = (A * A * B - X) / (A * A) * 2
        d = math.atan(z / A) * 180 / math.pi
    else:
        z = (X) / (A * B) * 2 
        d = math.atan(B / z) * 180 / math.pi

    print(d)

if __name__ == "__main__":
    main()
```

Please note that Python uses indentation to delimit blocks of code, unlike Java, which uses braces `{}`. Also, Python's built-in `math.atan` function is equivalent to Java's `Math.atan`, and for converting radians to degrees, Python's `math.pi` is used instead of Java's `Math.PI`. The `Scanner` class is not available in Python; input is read using the `input()` function, which reads a string from standard input. We then convert this input to an integer using the `int()` function.
