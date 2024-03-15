Here's the translated code from Java to Python:

```python
def solve(a, b):
    return (a + b + 1) // 2

def main():
    a = int(input())
    b = int(input())
    print(solve(a, b))

if __name__ == "__main__":
    main()
```

The Python code does not use a separate `Scanner` class for input but uses the built-in `input()` function. Also, in Python, integer division is performed using `//` instead of `/` to ensure an integer result is returned, replicating Java's integer division behavior.
