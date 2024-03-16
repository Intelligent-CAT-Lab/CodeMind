Below is the translated code from Java to Python. It reads an integer from standard input and outputs the nth digit in a string that consists of concatenated integers from 1 up to n:

```python
def main():
    n = int(input().strip())
    s = " "
    for i in range(1, n + 1):
        s += str(i)
    print(s[n])

if __name__ == "__main__":
    main()
```

You can test it with the provided test input:

Test input:
```
952
```

Expected output:
```
3
```

To run the test case, you would execute the above Python code and provide `952` as the input either through the command line or any Python interpreter, and expect to see `3` printed as the output.
