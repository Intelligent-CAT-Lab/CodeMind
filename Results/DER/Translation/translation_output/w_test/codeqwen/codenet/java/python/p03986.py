Here is the Python equivalent of the Java code:

```python
def main():
    x = input()
    c = 0
    len = 0
    for i in range(len(x)):
        if x[i] == 'T':
            c -= 1
        else:
            if c < 0:
                len -= c
                c = 1
            else:
                c += 1
    len += abs(c)
    print(len)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the user, then iterates over each character in the string. If the character is 'T', it decrements the counter `c`. If the character is not 'T', it checks if `c` is less than 0. If it is, it subtracts `c` from `len` and sets `c` to 1. If `c` is not less than 0, it increments `c`. After the loop, it adds the absolute value of `c` to `len` and prints the result.
