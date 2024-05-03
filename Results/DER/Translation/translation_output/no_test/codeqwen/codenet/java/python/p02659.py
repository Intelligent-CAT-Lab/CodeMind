Here is the Python equivalent of the Java code:

```python
def main():
    a = int(input())
    b = float(input())
    bb = int((b * 100) + 0.5)
    ans = (a * bb) // 100
    print(ans)

if __name__ == "__main__":
    main()
```

In Python, we use the `input()` function to get user input, and we use `int()` and `float()` to convert the input to integers and floating point numbers, respectively. We use the `//` operator for integer division, which is equivalent to `(long)` in Java.
