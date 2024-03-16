Below is the translated Java code to Python:

```python
import sys

# Static variables
MIN = float('-inf')
MAX = float('inf')

# Equivalent print and println functions
def print_(*args, end=' '):
    sys.stdout.write(" ".join(map(str, args)) + end)

def println(*args):
    print_(*args, end='\n')

# Equivalent array reading functions
def read_int_array(N):
    return [int(input()) for _ in range(N)]

def read_long_array(N):
    return [int(input()) for _ in range(N)]

def read_string_array(N):
    return [input() for _ in range(N)]

# Debug function
def debug(*args):
    print(*args, file=sys.stderr)

# Main function
def main():
    S = input()
    if all(S[0] == S[i] for i in range(1, len(S))):
        println("No")
    else:
        println("Yes")

# Python equivalent of Java's `public static void main`
if __name__ == "__main__":
    main()
```

Some notes on the translation:

1. In Python, the `Reader` class and related functions are not necessary as Python has built-in functions for IO operations.
2. The `print` function in Python by default behaves like Java's `println`. For this reason, the custom `println` and `print_` functions were written.
3. The `read_int_array`, `read_long_array`, and `read_string_array` functions have been simplified to Python list comprehensions.
4. Static class variables `MIN` and `MAX` have been converted to Python module-level variables with the equivalent `float('-inf')` and `float('inf')` for infinity representation.
5. Python does not have a dedicated array data type; it uses lists instead, which can hold any data type.
6. Python's `if __name__ == "__main__"` idiom is used as the entry point of the program, similar to Java's `public static void main` method.
7. Unlike Java's strict type system, Python uses dynamic typing, eliminating the need for many of Java's boilerplate instructions.
