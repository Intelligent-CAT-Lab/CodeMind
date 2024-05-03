Here is the Python equivalent of the Java code:

```python
import sys

#?Python??????°??????
def main():
    n = int(sys.stdin.readline())
    print(n, end=":")
    i = 2
    while n >= i * i:
        if n % i == 0:
            n = n / i
            print(" " + str(i), end="")
        else:
            i += 1
    print(" " + str(n))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a number from the standard input, prints it, and then prints all of its factors. The `end` parameter in the `print` function is used to prevent a newline after each factor. The `if __name__ == "__main__":` block is used to call the `main` function when the script is run directly.
