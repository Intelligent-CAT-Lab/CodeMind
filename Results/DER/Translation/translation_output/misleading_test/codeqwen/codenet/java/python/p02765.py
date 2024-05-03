Here is the Python equivalent of the Java code:

```python
def main():
    n = int(input())
    r = int(input())
    if n < 10:
        print(r + (10 - n) * 100)
    else:
        print(r)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the user, checks if the first integer is less than 10, and if it is, it prints the second integer plus 100 times the difference between 10 and the first integer. If the first integer is not less than 10, it simply prints the second integer.
