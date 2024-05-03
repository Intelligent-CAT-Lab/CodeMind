Here is the Python equivalent of the Java code:

```python
import sys

if __name__ == "__main__":
    k = 360
    j = 1

    try:
        i = int(input())
    except ValueError:
        sys.stderr.write("Input is not an integer.\n")
        sys.exit(1)

    if 1 <= i <= 179:
        while not ((i * j) % k == 0):
            j += 1
        print(j)
    else:
        print("The input is out of range. It should be between 1 and 179.")
```

This Python code does the same thing as the Java code. It reads an integer from the user, checks if it's within the range 1 to 179, and if so, finds the smallest integer j such that i * j is divisible by 360. If the input is not an integer or is out of range, it prints an error message to stderr and exits with a non-zero status.
