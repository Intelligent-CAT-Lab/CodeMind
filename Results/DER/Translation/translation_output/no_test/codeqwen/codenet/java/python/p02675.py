Here is the Python equivalent of the Java code you provided:

```python
N = int(input())

if N % 10 in [2, 4, 5, 7, 9]:
    print("hon")
elif N % 10 in [0, 1, 6, 8]:
    print("pon")
elif N % 10 == 3:
    print("bon")
```

This Python code does the same thing as the Java code: it reads an integer from the user, checks the last digit of the number, and prints "hon", "pon", or "bon" accordingly.
