Here is the equivalent Python code:

```python
X = int(input())
Y = int(input())
ans = 0
if X == 1 and Y == 1:
    ans = 1000000
else:
    if X == 1:
        ans += 300000
    if Y == 1:
        ans += 300000
    if X == 2:
        ans += 200000
    if Y == 2:
        ans += 200000
    if X == 3:
        ans += 100000
    if Y == 3:
        ans += 100000

print(ans)
```

The Java Scanner class is replaced with Python's built-in `input()` function for reading input from the user. In Python, the input is read as a string, so it is necessary to convert it to an integer with `int()`. Also, the `System.out.println` method is replaced by the `print` function in Python.
