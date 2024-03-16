Here is the Java code converted to Python, making use of Python's standard input and built-in `math` module for GCD calculation:

```python
import math

def main():
    input_str = input().split(" ")
    a = int(input_str[0])
    b = int(input_str[1])

    print(gcd(a, b))

def gcd(a, b):
    while b:
        a, b = b, a % b
    return a

if __name__ == "__main__":
    main()
```

I chose to implement the GCD function manually instead of using `math.gcd` for a direct translation of the logic from the Java method to Python. If you want to use Python's built-in function, you could replace the custom `gcd` function with `math.gcd`.
