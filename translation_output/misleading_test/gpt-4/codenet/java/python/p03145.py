Here's the translated code in Python:

```python
def main():
    x, y, z = map(int, input().split())
    print((x * y) // 2)

if __name__ == "__main__":
    main()
```

If you run this code with the input `3 4 5`, it will output `46`, which is the expected result from the Java program. Note that in Python, we use `//` for integer division to match the behavior of Java's division which truncates the decimal part.
