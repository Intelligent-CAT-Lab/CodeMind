Here is the Python equivalent of the Java code you provided:

```python
def main():
    tail = input()
    n = len(tail)  # length of the string
    tailsp = list(tail)  # convert string to list
    zero = "0"
    one = "1"
    count = 0
    for i in range(n):
        if i % 2 == 0 and tailsp[i] == zero:
            count += 1
        if i % 2 == 1 and tailsp[i] == one:
            count += 1
    n -= count
    if count > n:
        print(n)
    else:
        print(count)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the user, counts the number of zeros and ones in the string at even and odd indices respectively, and then prints the smaller of the two counts.
