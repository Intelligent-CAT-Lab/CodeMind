Here is the Python equivalent of the Java code:

```python
def main():
    s = input()
    leng = len(s)
    print(s[0], leng-2, s[leng-1], sep='')

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code: it takes a string as input, calculates its length, and then prints the first and last characters, along with the length of the string minus 2. The `sep=''` argument in the `print` function is used to print the characters without any space in between.
