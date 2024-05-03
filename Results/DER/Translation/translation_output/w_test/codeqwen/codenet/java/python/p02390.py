Here is the Python equivalent of the Java code:

```python
def main():
    S = int(input())
    h = S // 3600
    hi = S % 3600
    m = hi // 60
    s = S % 60
    print(f"{h}:{m}:{s}")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code: it takes an integer input, calculates the hours, minutes, and seconds, and then prints them out in the format "hours:minutes:seconds". The `//` operator is used for integer division, which is necessary to get the whole number of hours, minutes, and seconds. The `%` operator is used for modulo division, which is necessary to get the remainder of the division. The `print` function is used to print the output. The `if __name__ == "__main__":` block is used to call the `main` function when the script is run directly.
