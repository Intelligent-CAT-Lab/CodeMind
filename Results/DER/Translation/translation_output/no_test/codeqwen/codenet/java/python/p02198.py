Here is the Python equivalent of your Java code:

```python
import sys

def main():
    N = int(input())
    M = int(input())

    print(N * M)

if __name__ == "__main__":
    main()
```

In Python, we don't need to close the input stream as it is automatically closed when the program ends. Also, Python doesn't have a built-in system.in equivalent, so we use the input() function to read from the standard input.
