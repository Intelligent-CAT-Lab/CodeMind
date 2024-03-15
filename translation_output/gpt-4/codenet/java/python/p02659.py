Here's the equivalent code in Python:

```python
a = int(input())
b = float(input())
bb = int(b * 100 + 0.1)
ans = (a * bb) // 100
print(ans)
```

Note that in Python, the `//` operator is used for integer division (equivalent to `(long)` conversion in Java), and we don't need to import a Scanner class as we can use built-in `input()` for reading from stdin. Also, type casting to double and back to long is not required in Python due to its dynamic type system.
