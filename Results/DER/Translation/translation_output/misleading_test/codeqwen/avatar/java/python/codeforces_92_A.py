Here is the Python equivalent of the Java code:

```python
def codeforces_92_A():
    n, k = map(int, input().split())
    i = 1
    req = 1

    while k - req >= 0:
        if k - req >= 0:
            k = k - req
        else:
            break
        i += 1
        if i % n != 0:
            req = i % n
        else:
            req = n

    print(k)

codeforces_92_A()
```

This Python code does the same thing as the Java code. It reads two integers from the user, calculates the result and prints it.
