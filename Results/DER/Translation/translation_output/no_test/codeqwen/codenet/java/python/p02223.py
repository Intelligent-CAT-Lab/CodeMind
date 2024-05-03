Here is the Python equivalent of the Java code:

```python
N = int(input())
if N == 1:
    print(1)
    print("0")
elif N == 2:
    print(2)
    print("0")
    print("11")
else:
    print(N - 1)
    for i in range(2, N + 1):
        s = '1' * i
        s = s[0] + s[i - 1] + s[1:-1] + s[-1]
        print(s)
```

This Python code does the same thing as the Java code. It reads an integer from the user, and then prints out the appropriate sequence based on the value of the integer.
