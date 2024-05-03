Here is the Python equivalent of the Java code:

```python
def main():
    a, b, c = map(int, input().split())
    min_val = min(a, b)
    max_val = max(a, b)
    print(min(min_val, c), max(max_val, c))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the user, finds the minimum and maximum of the first two numbers, and then prints the minimum of the minimum and the third number, and the maximum of the maximum and the third number.
