Here's the equivalent Python code for the Java code you've provided:

```python
import math
import sys

class P01741:
    def run(self, in_stream, out_stream):
        d = float(in_stream.readline())
        if d < 1:
            out_stream.write(str(d * math.sqrt(2)) + '\n')
        elif d < math.sqrt(2):
            out_stream.write("2\n")
        elif d < 2:
            out_stream.write(str(d * math.sqrt(2)) + '\n')
        elif d < math.sqrt(2) * 1.5:
            out_stream.write("3\n")
        else:
            out_stream.write(str(d * math.sqrt(2)) + '\n')

if __name__ == '__main__':
    p01741 = P01741()
    p01741.run(sys.stdin, sys.stdout)
```

A few notes about the translation:
- I've structured the `P01741` class in Python similarly to how it's structured in Java.
- In Python, you don`t need to import a Scanner-like class to handle input/output, but you can use the `sys.stdin` to read from the standard input and `sys.stdout` to write to the standard output. I've used the `readline` method to read from `stdin`.
- In Java, `System.out.println` is commonly used to write output followed by a newline character. In Python, `write` can be used in combination with `'\n'`.
- Math functions in Python are accessed through the `math` module.
- Inheriting from `object` in a class definition (`class P01741(object):`) is optional in Python 3, as all classes implicitly inherit from `object`.
