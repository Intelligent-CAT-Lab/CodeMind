Here is the Java code translated into Python:

```python
def main():
    a, b = input().split()
    a = int(a)
    b = float(b)
    bb = int(b * 100 + 0.1)
    ans = (a * bb) // 100
    print(ans)

if __name__ == "__main__":
    main()
```

Please note that in Python, the `//` operator is used for floor division (like `(long)100` in the Java code) to ensure that the result is an integer, even if the operands are floats. The rest of the Python code uses similar logic to the Java version, but with a more straightforward syntax.
