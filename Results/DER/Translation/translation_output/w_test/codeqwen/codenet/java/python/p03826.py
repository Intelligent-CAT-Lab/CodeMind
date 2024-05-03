Here is the Python equivalent of the Java code:

```python
def main():
    a, b, c, d = map(int, input().split())
    a = a * b
    b = c * d
    print(b if a < b else a)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads four integers from the user, multiplies the first two and the last two, and then prints the larger of the two results.
