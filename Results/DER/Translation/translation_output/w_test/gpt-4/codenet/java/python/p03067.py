Here's the Python code equivalent to the provided Java code:

```python
def is_on_the_way(a, b, c):
    return ((c >= a and c <= b) or (c >= b and c <= a))

def main():
    a, b, c = map(int, input().split())
    if is_on_the_way(a, b, c):
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```

Here I translated the main functionality of the Java code, including reading from standard input and printing to the standard output.

When using Python, the input/output handling is more straightforward, allowing for a more concise implementation. The `is_on_the_way` function replaces the `solve` method of the `AOnTheWay` class from the Java version and `main` replaces the `main` method, encapsulating the core logic. Note that the `OutputWriter` and `InputReader` helper classes are unnecessary in Python due to its built-in `input()` function and straightforward `print()` functionality.
