Here is the Python equivalent of the Java code:

```python
n = int(input())
minute = 12 * 60 * n / 360
print((minute // 60) + " " + str(minute % 60))
```

In Python, the `//` operator is used for integer division, which is equivalent to the `/` operator in Java but returns an integer result. The `%` operator is used for the modulo operation, which is equivalent to the `%` operator in Java but returns the remainder of the division. The `str()` function is used to convert the remainder to a string so that it can be concatenated with the hour value.
