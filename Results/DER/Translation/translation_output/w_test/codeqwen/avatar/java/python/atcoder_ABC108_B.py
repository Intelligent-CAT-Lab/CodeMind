Here is the Python equivalent of the Java code:

```python
def main():
    x1, y1, x2, y2 = map(int, input().split())
    x3 = x2 + (y1 - y2)
    y3 = y2 - (x1 - x2)
    x4 = x1 - (y2 - y1)
    y4 = y1 + (x2 - x1)
    print(x3, y3, x4, y4)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads four integers from the user, calculates the coordinates of the other two points, and then prints them out. The `map` function is used to convert the input string into a list of integers. The `input().split()` function is used to split the input string into a list of words, and then `map(int, ...)` is used to convert each word into an integer. The `if __name__ == "__main__":` block is used to call the `main` function when the script is run directly.
