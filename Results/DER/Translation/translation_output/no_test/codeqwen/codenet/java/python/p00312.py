Here is the Python equivalent of the Java code:

```python
def main():
    str1 = input()
    s = str1.split(" ")
    i1 = int(s[0])
    i2 = int(s[1])

    count = i1 // i2
    count += i1 % i2
    print(count)

if __name__ == "__main__":
    main()
```

In Python, we use `input()` to read a line of text from the user, `split(" ")` to split the string into a list of words, `int()` to convert a string to an integer, `//` for integer division, and `%` for modulo division. The `if __name__ == "__main__":` block is used to call the `main()` function when the script is run directly.
