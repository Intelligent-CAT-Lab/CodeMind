The following Python code achieves the desired logic presented in the Java code. This code accepts input from the user and prints the output. In Python, reading input is much simpler compared to the Java code with a custom `FastScanner` class. We can just use `input()` and `split()` to parse the inputs.

```python
def main():
    n, m = map(int, input().split())
    result = []

    if n % 2 == 0:
        result.append(0)
        result.extend([0] * (n // 2 - 1))
        result.extend([m] * (n // 2))
    else:
        result.append(0)
        result.extend([0] * (n // 2))
        result.extend([m] * (n // 2))

    print(' '.join(map(str, result)))


if __name__ == "__main__":
    main()
```

Note that in Python, you don't have to check if standard input is ready to be read from or to handle byte arrays as you do in Java. The `input` function will handle that for you, blocking until there's input available and then reading an entire line as a string.

To use the test input "3 100" and get the expected output "-5 89 153", you would run the Python code and input those values. However, the original Java code doesn't seem to produce the output given in the Expected output. The output from the Java code seems to produce "0 0 m" or "0 0 0 m" depending on whether `n` is odd or even, which doesn't match the provided Expected output. Please check if there was a mistake or a mix-up with the expected output.
