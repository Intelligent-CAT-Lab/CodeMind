Here is the Python equivalent of the Java code:

```python
import math

def main():
    a = int(input())
    b = int(input())
    tmp1 = float(input())
    tmp2 = float(input())

    h = tmp1 / 6. * math.pi + tmp2 / 30. * math.pi / 12.
    m = tmp2 / 30. * math.pi + tmp1 / 6. * math.pi * 12.
    rad = h - m

    res = math.sqrt(math.pow(a, 2) + math.pow(b, 2) - (2. * a * b * math.cos(rad)))

    print(res)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads four integers and two doubles from the standard input, calculates the result, and prints it to the standard output.
