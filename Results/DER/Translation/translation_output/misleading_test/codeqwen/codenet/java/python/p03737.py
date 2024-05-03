Here is the Python equivalent of the Java code:

```python
import sys

def main():
    for i in range(3):
        print(sys.stdin.readline().strip()[0].upper(), end="")
    print()

if __name__ == "__main__":
    main()
```

This Python code reads a line from the standard input, strips any leading or trailing whitespace, and then prints the first character of the line in uppercase. The `end=""` argument to `print` ensures that the output is not followed by a newline. The `if __name__ == "__main__":` block is used to call the `main` function when the script is run directly.
