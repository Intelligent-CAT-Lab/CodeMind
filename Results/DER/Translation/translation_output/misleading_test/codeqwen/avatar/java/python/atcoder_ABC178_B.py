Here is the Python equivalent of the Java code:

```python
def main():
    a, b, c, d = map(int, input().split())
    print(max(max(max(a * c, b * d), a * d), b * c))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code: it reads four integers from the standard input, multiplies them in all possible ways, and prints the maximum result. The `map` function is used to convert the input strings to integers, and the `max` function is used to find the maximum value among the four possible products. The `if __name__ == "__main__":` block is used to call the `main` function when the script is run directly.
