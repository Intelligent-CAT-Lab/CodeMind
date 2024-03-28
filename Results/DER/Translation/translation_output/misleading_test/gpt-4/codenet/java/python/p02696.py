Here's the translation of the Java code into Python:

```python
a, b, n = map(int, input().split())
if n >= b:
    print(a * (b - 1) // b)
else:
    print(a * n // b)
```

In Python, the `//` operator is used for integer (floor) division. The `map(int, input().split())` is the Python way of reading several space-separated integers from the input. The rest of the logic remains pretty much the same as the Java version, leveraging Python's conditional expressions. 

You can test this code with the given test input:

Test input:
```
5 7 4
```

Expected output:
```
-58
```
