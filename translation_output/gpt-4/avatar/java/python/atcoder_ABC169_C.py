Here's the translated Java code into Python:

```python
import math

def atcoder_ABC169_C():
    a = int(input())
    b = float(input())
    c = round(b * 100)
    d = a * c
    print(d // 100)

if __name__ == '__main__':
    atcoder_ABC169_C()
```

In Python, `input()` is used instead of `Scanner` to read input from the standard input. `int(input())` and `float(input())` are used to read an integer and floating-point number respectively, similar to `sc.nextLong()` and `sc.nextDouble()` in Java. The operations involving `long` in Java are replaced with `int` in Python, as Python 3's `int` type can handle arbitrarily large integers. `math.round()` function in Python is used to replicate `Math.round()` in Java, and integer division `//` is used instead of `/` to get an integer division result.
