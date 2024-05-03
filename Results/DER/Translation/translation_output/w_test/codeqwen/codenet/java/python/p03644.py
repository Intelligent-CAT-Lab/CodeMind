Here is the Python equivalent of the Java code:

```python
def count(pnum):
    result = 0
    for i in range(31):
        if (2 ** i) <= pnum:
            result = 2 ** i
    return result

pnum = int(input())
print(count(pnum))
```

This Python code does the same thing as the Java code. It defines a function `count` that takes an integer `pnum` as input and returns the highest power of 2 that is less than or equal to `pnum`. It then reads an integer from the user, calls the `count` function with this integer, and prints the result.
