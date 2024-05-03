Here is the Python equivalent of the Java code:

```python
def main():
    n = int(input())

    if n == 1:
        print('a')
    elif n == 2:
        print("ab")
    elif n == 3:
        print("abc")
    else:
        for i in range(n // 4):
            print("abcd", end="")
        t = n % 4
        if t == 1:
            print('a')
        elif t == 2:
            print("ab")
        elif t == 3:
            print("abc")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the user, and then prints out a string of 'abcd' characters repeated n/4 times, followed by a string of 'a', 'ab', or 'abc' characters depending on the remainder of n divided by 4.
