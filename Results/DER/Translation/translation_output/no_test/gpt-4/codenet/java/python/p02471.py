Here's the Python translation of the provided Java code. Note that in Python, we typically use the `input()` function for reading from standard input instead of the `Scanner` class from Java, and print output using the `print()` function. Additionally, the `gcd` function isn't translated because it's not used in the main program and Python has a built-in `math.gcd` function to compute the greatest common divisor if needed.

```python
def main():
    a = int(input())
    b = int(input())
    r1, x1, y1 = a, 1, 0
    r2, x2, y2 = b, 0, 1

    while r2 != 0:
        q = r1 // r2
        r3 = r1 % r2
        x3 = x1 - q * x2
        y3 = y1 - q * y2
        r1, x1, y1 = r2, x2, y2
        r2, x2, y2 = r3, x3, y3

    print(f"{x1} {y1}")

if __name__ == "__main__":
    main()
```

Please note that I've used a `main` function in Python to encapsulate the program's main logic, which is a common practice in Python for better code organization and to avoid polluting the global namespace. This is functionally equivalent to the `public static void main(String[] args)` method in Java. The `if __name__ == "__main__":` block ensures that `main()` is called only when this script is run as the main program.
