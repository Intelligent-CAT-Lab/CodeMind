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

This Python code does the same thing as the Java code: it reads two integers from the user, calculates the quotient and remainder of the first integer divided by the second, and then prints the sum of the quotient and remainder.
