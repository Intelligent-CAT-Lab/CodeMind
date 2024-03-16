Here is the Java code from above translated into Python:

```python
# Importing sys to read from standard input (similar to Scanner in Java)
import sys

def main():
    # Reading two integers from input on the same line, separated by whitespace.
    x, y = map(int, sys.stdin.readline().split())
    # Calculating the number of cranes and turtles based on the equations.
    crane = -(y / 2) + 2 * x
    turtle = x - crane
    # Checking if either crane or turtle is negative or not a whole number.
    if turtle < 0 or crane < 0 or turtle % 1 != 0 or crane % 1 != 0:
        print("No")
    else:
        print("Yes")

if __name__ == "__main__":
    main()
```

Please note that in Python, the `input()` function could suffice for simple input reading in place of `sys.stdin.readline()`, but `sys.stdin.readline()` is closer to the Java Scanner's behavior, particularly for large inputs or competitive programming.

Moreover, I'm assuming that the comments were unintentionally included as garbled characters, and in Python, comments are written starting with `#`.
