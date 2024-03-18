Below you'll find the Java code translated into Python. The Python equivalent uses Python's Standard Input (stdin) to receive input values and encapsulates the GCD logic inside a function definition. It then prints out the result following the GCD computation.

```python
import sys

def gcd(a, b):
    if a < b:
        a, b = b, a
    if a % b == 0:
        return b
    else:
        return gcd(b, a % b)

if __name__ == "__main__":
    input_values = input().split()
    a = int(input_values[0])
    b = int(input_values[1])

    print(gcd(a, b))
```

This script assumes that the input is given in the same line, separated by a space, similar to what you would expect from Java's `BufferedReader`. If you run this Python script and give it the same "54 20" input, it should produce the expected output of "27".

Note: Unlike Java, Python does not require you to declare exceptions to be thrown, and there is no need for a main class definition. Also, Python has a built-in `gcd` function in the `math` module, but in this translation, we implemented the GCD logic manually, as in the Java code provided.
