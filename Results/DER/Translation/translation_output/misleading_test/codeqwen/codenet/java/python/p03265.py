Here is the Python equivalent of the Java code:

```python
def main():
    x1, y1, x2, y2 = map(int, input().split())

    a = x2 - x1
    b = y2 - y1
    x3 = x2 - b
    y3 = y2 + a
    x4 = x3 - a
    y4 = y3 - b

    print(f"{x3} {y3} {x4} {y4}")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads four integers from the user, calculates the coordinates of the other two points, and then prints them out. The `map` function is used to convert the input string into a list of integers, and the `input().split()` function is used to split the input string into a list of words, which are then converted into integers. The `f-string` is used to format the output string.
