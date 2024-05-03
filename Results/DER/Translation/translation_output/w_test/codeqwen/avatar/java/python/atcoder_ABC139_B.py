Here is the Python equivalent of the Java code:

```python
def main():
    a, b = map(int, input().split())
    kuti = 1
    tap = 0
    
    while kuti < b:
        kuti = kuti - 1 + a
        tap += 1
    
    print(tap)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the user, calculates the number of times the sum of `a` and `kuti` is less than `b`, and prints the result.
